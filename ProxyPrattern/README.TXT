代理模式：
	一个类代表另一个类的功能。
	在代理模式中，我们创建具有现有对象的对象，以便向外界提供功能接口。

实现过程：
1. 新建接口Image
2. 新建接口Image的实现类RealImage，
3. 新建接口Image的实现类ProxyImage，在代理类中有属性RealImage, 新建ProxyImage的时候会创建被代理的类
4. 测试