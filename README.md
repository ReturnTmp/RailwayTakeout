# 基于SprinBoot的外卖点餐平台

#### 介绍
#### 软件架构
前端：

1.前端基于vue2.0框架

2.基于Element UI桌面端组件库开发UI界面

3.使用基于promise的网络请求库axios实现网络请求

后端：

1.整体项目基于SpringBoot框架开发

2.数据库Mysql部署多台虚拟机实现主从复制，基于Sharding-jdbc读写分离 

3.基于knife4j框架实现Swagger接口调试文档 

4.配置nginx实现负载均衡 

5.Spring Cache基于redis实现数据缓存 

5.用户下单对接支付宝接口 

6.手机验证码实现阿里云短信服务 

7.基于MyBatis框架实现数据持久 

8.建立Durid数据库连接池，监控 DB 池连接和 SQL 的执行情况 

9.实现Filter接口配置Login过滤器和拦截器 

10.利用@ControllerAdvice实现统一异常处理，从而优雅地处理异常 

11.基于@TableField注解实现MyBatis Plus公共字段自动填充 

#### 安装教程


#### 使用说明

1.将reggle模块下的application.yml中的mysql数据库和redis缓存模块修改为本机配置 

2.需要将application.yml中的reggie.path修改成自己的路径 

3.本项目中的测试环境验证码部分使用log.info("code={}",code)日志打印
，用户可以在控制台查看登录，生产环境才使用阿里云短信服务 

#### 参与贡献