桥接模式：
	用于把抽象化与实现化解耦，使得二者可以独立变化。
	
实现过程：
1. 新建接口DrawAPI;
2. 新建DrawAPI的实现类GreenCircle, RedCircle;
3. 新建抽象类Shape
4. 新建派生类Circle继承Shape
5. 测试类