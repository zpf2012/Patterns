原型模式：
	用于创建重复的对象，同时又能保证性能。
	实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式
	原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口
实现过程：
1. 创建抽象类Shape实现Cloneable接口
2. 创建Circle, Rectangle, Square类继承Shape类
3. 创建ShapeCache类，用于创建实体，加载到缓存中
4. Main测试