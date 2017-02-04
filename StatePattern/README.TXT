状态模式：
	类的行为是基于它的状态改变的。
	
实现原理：
	对象中有一个方法doAction，但是，针对不同的状态，doAction执行的结果不一样。
	那么doAction就是一个抽象方法，context被不同的doAction调用，不同的对象的doAction不同，因此context得到的结果也不同