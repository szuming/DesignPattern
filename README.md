# DesignerPattern
设计模式学习笔记

## 行为型模式
|  #  |      Title     |   详细信息   |  笔记                 
|-----|----------------|---------------|-------------
|1-37|策略模式|[src](https://github.com/szuming/DesignPattern/blob/master/src/%E8%A1%8C%E4%B8%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F/%E7%AD%96%E7%95%A5%E6%A8%A1%E5%BC%8F.md)|将变化的功能代码抽象为一个接口并实现为各个功能，子类继承超类时选择对应的实现类
|38-73|观察者模式|[src](https://github.com/szuming/DesignPattern/blob/master/src/%E8%A1%8C%E4%B8%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F/%E8%A7%82%E5%AF%9F%E8%80%85%E6%A8%A1%E5%BC%8F.md)|实现一对多的消息发布，主题对应多个观察者，主题中有观察者队列并有对应的管理方法，观察者实现update提供给主题调用更新数据
|225-233|命令模式|[src](https://github.com/szuming/DesignPattern/blob/master/src/%E8%A1%8C%E4%B8%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F/%E5%91%BD%E4%BB%A4%E6%A8%A1%E5%BC%8F.md)|将动作的申请者与动作的实施者解耦


## 结构型模式
|  #  |      Title     |   详细信息   |  笔记                 
|-----|----------------|---------------|-------------
|73-108|装饰者模式|[src](https://github.com/szuming/DesignPattern/blob/master/src/%E7%BB%93%E6%9E%84%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E8%A3%85%E9%A5%B0%E8%80%85%E6%A8%A1%E5%BC%8F/%E8%A3%85%E9%A5%B0%E8%80%85%E6%A8%A1%E5%BC%8F.md)|装饰者将被装饰者当作初始化变量注入，从而结合自身与被装饰者方法，形成一个新的包装类


## 创建者模式
|  #  |      Title     |   详细信息   |  笔记                 
|-----|----------------|---------------|-------------
|109-117|简单工厂模式|[src](https://github.com/szuming/DesignPattern/blob/master/src/%E5%88%9B%E5%BB%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82.md)|将具体的生产方法交给一个新的类
|117-136|工厂方法模式|[src](https://github.com/szuming/DesignPattern/blob/master/src/%E5%88%9B%E5%BB%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F/%E5%B7%A5%E5%8E%82%E6%96%B9%E6%B3%95%E6%A8%A1%E5%BC%8F.md)|定义一个创建对象的接口由继承的子类去具体实现
|136-168|抽象工厂模式|[src](https://github.com/szuming/DesignPattern/blob/master/src/%E5%88%9B%E5%BB%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F/%E6%8A%BD%E8%B1%A1%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F.md)|提供一个接口创建一系列相关的对象的家族
|169-190|单例模式|[src](https://github.com/szuming/DesignPattern/blob/master/src/%E5%88%9B%E5%BB%BA%E5%9E%8B%E6%A8%A1%E5%BC%8F/%E5%8D%95%E4%BB%B6%E6%A8%A1%E5%BC%8F/%E5%8D%95%E4%BB%B6%E6%A8%A1%E5%BC%8F.md)|确保一个类只有一个实例对象，注意多线程情况



## 参考资料：
* 《Head First 设计模式》
* [Graphic Design Patterns](https://design-patterns.readthedocs.io/zh_CN/latest/read_uml.html)
