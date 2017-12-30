## Run application
Run the compiled `org.amuji.hello.Hello` or run from Gradle 
```bash
./gradlew bootRun
```

## Notes
### The Stub Runner config
In `src\main\resources\application.properties` file
```properties
#stubrunner.work-offline=false #(1)
stubrunner.repositoryRoot=http://localhost:8081/repository/maven-snapshots/     #(2)
stubrunner.ids=org.amuji:http-server-producer:+:stubs:8095      #(3)
server.port=0   #(4)
```

(1) 当`true`的时候，使用本地Maven Repo的stub，默认为`false`。不能和（2）同时使用

(2) 使于存在与远程Maven Repo的stub；值为stubs的repo URL

(3) stub 的名字，8095为WireMock Server的端口

(4) Spring Boot Server 的端口，这里我们并不使用，只使用（3）中的端口，所以选择随机端口

### @AutoConfigureStubRunner 无效
直接在`org.amuji.hello.Application`里配置该注解无效的，原因没有再去追查……
