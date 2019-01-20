# struts2处理表单提交

模型驱动方法

    1.struts的Action要实现 ModelDriven<T> 
    2.实例化一个对象
    3.重写 ModelDriven中的getModel方法return上面实例化的对象