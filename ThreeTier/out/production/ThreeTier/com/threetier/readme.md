#dao
    dao层 是一个连接数据库 并且处理数据库交互
#service
    service层  处理一些业务逻辑
#web
    web层 界面层 处理界面的一些东西
        web层中有有mvc
            M: model模型层 javaBean 封装数据
            V: view视图层  jsp 单纯显示页面
            C: Controller控制器 servlet 获取数据 对数据进行封装传递和指派什么页面来显示
#util
    工具类