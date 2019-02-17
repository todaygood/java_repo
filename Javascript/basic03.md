# Javascript程序的运行方法

1. 将Javascript程序代码嵌入在html文件中，使用浏览器执行。
   特点：文件是.html后缀的文件，内容是html和Javascript混杂，

   
2. 写Javascript程序，保存到*.js文件，使用node程序来运行
   特点: .js文件中全部都是Javascript代码
        node程序就是node.js,因此要提前安装。 

# 用Visual Studio Code搭建Node.js开发环境

参见视频 https://www.bilibili.com/video/av5827351/

VS Code以文件夹作为工程目录（Workspace Dir），所有的JavaScript文件都存放在该目录下。此外，VS Code在工程目录下还需要一个.vscode的配置目录，里面存放里VS Code需要的配置文件。

假设我们在C:\Work\目录下创建了一个hello目录作为工程目录，并编写了一个hello.js文件，则该工程目录的结构如下：

hello/ <-- workspace dir
|
+- hello.js <-- JavaScript file
|
+- .vscode/  <-- VS Code config
   |
   +- launch.json <-- VS Code config file for JavaScript
可以用VS Code快速创建launch.json
{
    // Use IntelliSense to learn about possible attributes.
    // Hover to view descriptions of existing attributes.
    // For more information, visit: https://go.microsoft.com/fwlink/?linkid=830387
    "version": "0.2.0",
    "configurations": [
        {
            "type": "node",
            "request": "launch",
            "name": "Launch Program",
            "program": "${workspaceFolder}/hello.js"
        }
    ]
}
        
JavaScript的语法和Java语言类似，每个语句以;结束，语句块用{...}




