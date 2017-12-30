package hello

import org.springframework.cloud.contract.spec.Contract

[
        Contract.make {
            name('Should get a product.')
            request {
                method GET()
                url '/products/2'
            }
            response {
                status 200
                body("""
                    {
                        "id": 2,
                        "name": "Dummy Product"
                    }
                """)
            }
        },

        Contract.make {
            name('list the products')
            request {
                method GET()
                url ('/products') {
                    queryParameters {
                        parameter('c1', 'red')
                    }
                }
            }
            response {
                status 200
                body(
                    total: anyNumber(),
                    content: []
                )
                testMatchers {
                    jsonPath('$.content', byType {
                        minOccurrence(1)
                        maxOccurrence(20)
                    })
                    jsonPath('$.content[1].id', byRegex('\\d+'))
                    jsonPath('$.content[1].name', byRegex('.+'))
                }
            }
        }
]
