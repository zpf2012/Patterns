装饰器模式：
	允许向一个现有的对象添加新的功能，同时又不改变其结构。

实现方式：
1. 新建接口Shape
2. 新建Shape的实现类Circle， Rectangle，重写draw方法
3. 新建装饰器ShapeDecorator, 实现Shape，包含构造方法，和属性Shape
4. 新建类RedShapeDecorator继承ShapeDecorator， 继承构造方法，重写draw方法，新定义SetRedBorder方法
5. 测试