外观模式：
	隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。

实现方式：
1. 新建接口Shape
2. 新建Shape的实现类Circle， Rectangle，Square
3. 新建ShapeMarket类，属性中将Circle， Rectangle，Square注入，在构造函数中实例化，对每一个实例化对象调用其draw方法
5. 测试