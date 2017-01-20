享元模式：
	用于减少创建对象的数量，以减少内存占用和提高性能。
实现原理：
1. 新建一个接口Shape
2. 新建接口的实现类Circle，使用有参构造函数（利用参数color将circle进行分类，放入到hashmap中）
3. 新建ShapeFactory类，类有一个属性为circleMap，用于存放circle类，在创建circle的时候，如果已经有相似的对象（color相同），
        就利用已有的对象进行改造使用
4. 测试