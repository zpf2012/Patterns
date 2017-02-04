命令模式：
	请求以命令的形式包裹在对象中，并传给调用对象。
	调用对象寻找可以处理该命令的合适的对象，并把该命令传给相应的对象，该对象执行命令。

具体实现：
	1. 新建接口Order
	2. 新建类Stock，包含两个方法buy和sell
	3. 新建类BuyStock和SellStock继承Order接口，在每个类中执行不同的buy或sell操作
	4. 测试，实例化BuyStock和SellStock，但是sell和buy方法的执行通过broker（经纪人）进行。