# 简介
这是我学习Spring框架的repo, 参考资料为尚硅谷在B站提供的[课程](https://www.bilibili.com/video/BV1AP411s7D7/) 及
配套的[文档学习资料](https://www.wolai.com/oacbJpH1wPzGNoMAVnoELR).

Spring框架的[官方文档链接](https://spring.io/projects/spring-framework#learn).


# 学习思路
**先看尚硅谷提供的文档, 再看尚硅谷的视频**. 
注意尚硅谷提供的文档不足以纯自学,  因此需要看尚硅谷的配套视频, 并且该视频中讲到的东西多于文档所提供的内容. 
如果有不懂的可以去搜索引擎查找, 查看Spring的官方文档, 查看Chatgpt等.

# 学习总结
Spring的核心关键词是 IoC，DI，AOP。

第一、Spring是一个IoC容器，它负责**创建**组件，程序员只负责**使用**组件，所谓的IoC(控制反转)简单来说就是组件的创建部分交给了Spring，可以这样说，**Spring实现了组件的创建和使用的解耦**；

第二、DI是IoC的体现，如果类A依赖于类B，它并不是在类A内部直接创建一个类B对象，而是通过注入从IoC容器中获取；

第三、AOP(面向切面编程)是将业务分为了核心业务和非核心业务两个部分，程序员专注于核心业务的开发，而通过配置适时的插入非核心业务。这里的非核心业务包括日志，事务等等。Spring对Aop的实现采用的是动态代理，根据被代理类是否实现接口，将采取JDK原生动态代理(被代理类实现了接口)或Cglib(被代理类未实现接口)。**AOP的核心就是核心业务和非核心业务的解耦**。

另外，尚硅谷还讲述了**事务管理部分**，这部分实际上是Spring对事务的进一步简化：首先编程式事务很麻烦，其次我们或许可以采用AOP完成事务管理，但这样也麻烦，那么不如对事务的逻辑进一步简化，最后的简化结果是仅仅在你的方法上添加一个`@Transactional`注解就可以完成事务管理。

# 模块对应学习顺序

IOC部分
- spring-ioc-xml-bean
- spring-ioc-xml-practice
- spring-ioc-annotation-bean
- spring-ioc-annotation-practice
- spring-ioc-java-bean
- spring-ioc-java-practice

AOP部分
- spring-aop-annotation-quickstart
- spring-aop-annotation-course

事务管理部分
- spring-tx-annotation-course


