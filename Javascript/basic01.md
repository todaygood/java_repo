
前端开发中提到的“脚手架”到底指什么，CLI？gulp 和 gulp-cli有什么区别

https://www.zhihu.com/question/47731497



脚手架的意思是帮你快速开始一个vue的项目，也就是给你一套vue的结构，包含基础的依赖库，只需要 npm install就可以安装，让我们不需要为了编辑或者一些其他事情浪费时间大笑  总而言之，就是快速搭建项目的，让我们可以早点去写代码


Scaffolding is a meta-programming method of building database-backed software applications. It is a technique supported by some model-view-controller frameworks, in which the programmer may write a specification that describes how the application database may be used. The compiler uses this specification to generate code that the application can use to create, read, update and delete database entries, effectively treating the template as a "scaffold" on which to build a more powerful application.


gulp可以理解成一个综合工具，可以通过插件将很多前端工具集合起来，快速的构建出来。（和gulp相提并论的还有grunt）。现在比较流行的方法是基于node来搭建前端预编译的环境，这个就区别于以前直接在浏览器中直接以引入js文件的形式引入一个工具插件（比如sea.js，require.js，甚至jquery.js）。

作者：Mukti
链接：https://www.zhihu.com/question/47731497/answer/147672677
来源：知乎
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

脚手架，那就离不开webpack glup 这样的构建工具。有了脚手架，就直接开始写业务逻辑，不用操心压缩文件，混淆代码，编译sass less stylus等这样的工作


# 使用vue-cli 脚手架

https://segmentfault.com/a/1190000015145474

vue init webpack vue-test


serve with hot reload at localhost:8080
`npm run dev`


