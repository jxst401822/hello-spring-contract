## Publish the stubs to Maven Repo
In simple terms, use Gradle task
```bash
./gradlew :publishStubsPublicationToMavenRepository
```

This is related with the configuration in build.gradle
```groovy
publishing {
    repositories {
        maven {
            url 'http://localhost:8081/repository/maven-snapshots/'
            credentials {
                username = 'admin'
                password = 'admin123'
            }
        }
    }
}
```

Before using publish in Gradle, the maven-publish plugin must be applied on.
```groovy
apply plugin: 'maven-publish'
```