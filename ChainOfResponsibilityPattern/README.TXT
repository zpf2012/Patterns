责任链模式
	在这种模式中，通常每个接收者都包含对另一个接收者的引用。
	如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。

具体实现：
1. 新建抽象类AbstractLogger
2. 新建抽象类AbstractLogger的实现类ConsoleLogger、ErrorLogger、FileLogger。
3. 测试

实现原理：
	抽象类中定义责任链的关系，在其实现类使用的时候，如果有nextLogger，那么责任链就会进行传递，直到nextLogger为null为止