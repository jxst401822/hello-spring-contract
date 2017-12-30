## Modules
### producer
服务提供者，契约在这里定义。生成的契约可以发布到maven的远程repo上，供其他消费方使用。
### consumer
一个典型的消费方，通过HTTP的方式调用producer里的服务。这里，测试中使用stubs，而不是真正地调用producer的服务。
### stub-runner
有时候我们可能之启动一个stub server／mock server，调用其以便提供一些producer的服务供调试（测试用）。典型的例子就是前端开发者可能会启动一个mock server，以便调试前端。

## Before run demo
### start up the Sonatype Nexus
```
docker run -d -p 8081:8081 --name nexus sonatype/nexus3
```

### 顺序
1. 允许producer里的发布stubs task
1. 允许consumer的测试，或者启动stub-runner。任选其一或者同时。
