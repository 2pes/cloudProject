# spring cloud框架练习
1. cloud-study-atguigu：框架、6个组件入门    
    eureka、ribbon/feign、hystrix、zuul、config
2. cloud-weather：天气项目练习
    - 基础单体应用`weather-basic`，包括quartz、redis、thymeleaf、httpClient。
    - 服务拆分`weather-microservice`    
        - `*-server`是没有整合cloud，从单体应用拆分后的包。
        - `eureka-*-client`是整合了cloud、feign后的包。