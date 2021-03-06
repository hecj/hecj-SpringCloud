
# hecj-SpringCloud
SpringCloud2.x集成  
spring-boot-starter-parent 2.3.1.RELEASE  
spring-cloud-dependencies Hoxton.SR8

## 功能
#### 1.Eureka注册中心
  新包：  
  spring-cloud-starter-netflix-eureka-server  
  spring-cloud-starter-netflix-eureka-client  
  旧包：  
  spring-cloud-starter-eureka-server  
  spring-cloud-starter-eureka  
  项目：hecj-eureka
  
#### 2.Feign服务调用
  新包：  
  spring-cloud-starter-openfeign   
  spring-cloud-starter-hystrix 熔断器  
  旧包：  
  spring-cloud-starter-feign  
  
#### 3.系统监控
  spring-boot-starter-actuator
  
#### 4.Web安全认证
  spring-boot-starter-security
  
#### 5.网关
  新网关1：  
  spring-cloud-starter-gateway  
  新网关2：  
  spring-cloud-starter-netflix-zuul  
  旧包：  
  spring-cloud-starter-zuul  
 
#### 6.SpringBootAdmin监控管理
  spring-boot-admin-starter-server 2.3.1  
  spring-boot-admin-starter-client 2.3.1   
  项目：hecj-springboot-admin  
  
#### 7.SpringCloud配置中心  
   spring-cloud-config-server   
   项目：hecj-config-server  

## 项目结构
| 编号 | 项目| 备注|
| :-----:| :---- | :---- |
| 1 | hecj-cloud | 父模块 |
| 2 | hecj-eureka | 注册中心 |
| 3 | hecj-gateway | 网关 |
| 4 | hecj-gateway-zuul | zuul网关 |
| 5 | hecj-config-server | 配置中心 |
| 6 | springcloud-config-repo | 配置文件 |
| 7 | hecj-springboot-admin | 监控管理 |
| 8 | hecj-user-model | 用户模型 |
| 9 | hecj-user-service | 用户服务 |
| 10 | hecj-article-service | 文章服务 |

