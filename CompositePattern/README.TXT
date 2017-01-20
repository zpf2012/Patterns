组合模式：
	用于把一组相似的对象当作一个单一的对象。
实现方式：
1. 新建一个Employee,注意在Employee的属性中含有List，List中的元素也为Employee类型
2. 进行组合测试，在Employee的属性subordinates中添加Employee的List，组成一个树状结构