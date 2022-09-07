# 基于SprinBoot的外卖点餐平台

#### 介绍
本项目为中南大学21级软件工程Java实训项目，有兴趣的朋友可以拿这个项目练练手，同时本项目还有一个Flink实时数仓的模块，后续可能会上传

#### 软件架构
前端：

1.前端基于vue2.0框架

2.基于Element UI桌面端组件库开发UI界面

3.使用基于promise的网络请求库axios实现网络请求

后端：

1.整体项目基于SpringBoot框架开发

2.数据库Mysql部署多台虚拟机实现主从复制，基于Sharding-jdbc读写分离 

3.基于knife4j框架实现Swagger接口调试文档 

4.配置nginx实现负载均衡(须在本机上单独配置)

5.Spring Cache基于redis实现数据缓存

6.手机验证码实现阿里云短信服务(测试环境需在控制台中获取验证码)

7.基于MyBatis框架实现数据持久 

8.建立Durid数据库连接池，监控 DB 池连接和 SQL 的执行情况 

9.实现Filter接口配置Login过滤器和拦截器 

10.利用@ControllerAdvice实现统一异常处理，从而优雅地处理异常 

11.基于@TableField注解实现MyBatis Plus公共字段自动填充 



#### 使用说明

1.application.yml中的redis和两个mysql数据库中的配置需要更换为本机配置，其中两个mysql需配置主从复制

2.在mysql主库中创建railway的schame，并在该schame中运行/resources/sql/railway.sql


#### 参与贡献
- 程广浩 
- 叶卓维
- 幸俊杰
- 吕卓俊