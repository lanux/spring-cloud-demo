
### 使用nacos作为配置中心

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
</dependency>
```

创建配置文件名为`bootstrap.yml`,注意不是application或者其他。原因如下

>Nacos同springcloud-config一样，在项目初始化时，要保证先从配置中心进行配置拉取，拉取配置之后，才能保证项目的正常启动。springboot中配置文件的加载是存在优先级顺序的，bootstrap优先级高于application


