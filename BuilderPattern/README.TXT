建造者模式：
概念：使用多个简单的对象一步一步构建一个复杂的对象。
主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；由于需求的变化，
		    这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
使用场景：一个基本部件不会变，而其组合会经常变化


这个例子中的设计原理：
点餐提供的服务：
1. 四种item：ChikenBurger, Coke, Pepsi, VegBurger
2. 两种Packing: Bottle, Wrapper

实现方式：
1. 创建Packding接口
2. 创建Item接口，包含三个抽象方法：name, packing, price
3. 创建Bottle和Wrapper类，实现Packing 
4. 创建ColdDrink, Burger类，实现Item
5. 创建 Coke, Pepsi类，继承ColdDrink
6. 创建ChikenBurger, VegBurger类，继承Burger
7. 创建Meal类
8. 创建MealBuilder类
9. Main测试
