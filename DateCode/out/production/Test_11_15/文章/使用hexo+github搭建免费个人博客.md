# 使用hexo+github搭建免费个人博客

---



[TOC]

### 1.前言 

------

**github pages介绍：**

1.一般多用于托管个人的静态网站

2.省去了购买服务器、域名等等一系列复杂的操作

**github pages好处：**

1.全是静态文件，访问速度快

2.免费方便，不用花一分钱就可以搭建一个自由的个人博客，不需要服务器不需要后台

3.数据绝对安全，基于github的版本管理，想恢复到哪个历史版本都行

4.博客内容可以轻松打包、转移、发布到其它平台

5.等



### 2.准备工作

------

1.注册一个github账号（已有不用）

2.安装了node.js、npm，并了解相关基础知识；

3.安装了git for windows（或者其它git客户端）



### 3.开始搭建github博客

------

**github中创建仓库**

仓库名为**用户名.github.io（必须与用户名一致），**网站访问地址是 [http://用户名.github.io](http://test.github.io/) 了创建成功后，默认会在你这个仓库里生成一些示例页面，以后你的网站所有代码都是放在这个仓库里。



### 4.配置SSH key

------

配置原因：因为提交代码肯定要拥有你的github权限才可以，但是直接使用用户名和密码太不安全了，所以我们使用ssh key来解决本地和服务器的连接问题

**用git bash执行如下命令：**

```java
1.$ cd~/.ssh   #检查本机已存在的ssh密钥 
```

（如果提示：No such file or directory 说明你是第一次使用git。）

```java
2.$ ssh-keygen -t rsa -C "邮件地址"
```

（然后连续3次回车，最终会生成一个文件在用户目录下，打开用户目录，到.ssh\id_rsa.pub文件，记事本打开并复制里面的内容，打开你的github主页，进入个人设置 -> SSH and GPG keys -> New SSH key：）

（id_rsa和id_rsa.pub,分别表示私钥和公钥文件, 私钥文件自己使用, 公钥文件需要上传到Github上.）

3.**测试是否成功**

```java
$ ssh -Tgit@github.com   #注意邮箱地址不用改
```

（如果提示Are you sure you want to continue connecting (yes/no)?，输入yes，然后会看到：Hi QzzBL You’ve successfully authenticated, but GitHub does not provide shell access.）

说明SSH已配置成功！

4.继续配置**设置用户信息**：

```java
$ git config --global user.name "liuxianan"// 你的github用户名，非昵称
```

```java
$ git config --global user.email "xxx@qq.com"// 填写你的github注册邮箱
```



### 5.hexo写博客

------

**5.1** 安装

```java
$ npm install-g hexo
```

**5.2** 初始化

```java
$ cd/f/Workspaces/hexo/

$ hexo init

```

**5.3**

```java
$ hexo g   # 生成（静态页面）
```

```java
$ hexo s   # 启动服务
```

（开启本地预览服务，打开浏览器访问 [http://localhost:4000](http://localhost:4000/) 即可看到内容）

（执行以上命令之后，hexo就会在public文件夹生成相关html文件，这些文件将来都是要提交到github去的：）



### 6.上传到github

------

首先，ssh key肯定要配置好。

其次，配置_config.yml中有关deploy的部分：

```java
- 正确写法：

        deploy:  type: git  

        repository:git@github.com:liuxianan/liuxianan.github.io.git  

        branch: master

- 错误写法：

        deploy:  type: github  

        repository:https://github.com/liuxianan/liuxianan.github.io.git

        branch: master

```

**（**后面一种写法是hexo2.x的写法，现在已经不行了，无论是哪种写法，此时直接执行hexo d的话一般会报如下错误：

Deployer not found: github 或者 Deployer not found: git

**原因是还需要安装一个插件：**

```java
npm install hexo-deployer-git --save   
```

（hexo-deployer-git 会存在于node_modules文件夹中）

**）**

**打开你的git bash，输入hexo d就会将本次有改动的代码全部提交**



### 7.常见hexo命令及上传步骤

------

常见命令

```java
hexo new "postName" #新建文章

hexo new page "pageName" #新建页面

hexo generate #生成静态页面至public目录

hexo server #开启预览访问端口（默认端口4000，'ctrl + c'关闭server）

hexo deploy #部署到GitHub

hexo help  # 查看帮助

hexo version  #查看Hexo的版本

hexo new page 'postName'命令和hexo new 'postName'有区别：

hexo new page "my-second-blog"

```

**生成如下：**

最终部署时生成：hexo\public\my-second-blog\index.html，但是它不会作为文章出现在博文目录。

缩写：

```java
hexo n == hexo new

hexo g == hexo generate（此三步骤完成上传）

hexo s == hexo server

hexo d == hexo deploy

```

**组合命令：**

```java
hexo s -g #生成并本地预览

hexo d -g #生成并上传

```



### 8.个人安装时问题

------

1.访问username.github.io时出现404错误（可能与没有分支 git init 等安装分支）

2.主题修改本地可看，github上看不了

3.等等



### 9.参考文章

------

[http://blog.haoji.me/build-blog-website-by-hexo-github.html?from=xa](http://blog.haoji.me/build-blog-website-by-hexo-github.html?from=xa)

[https://www.jianshu.com/p/380290deb8f0](https://www.jianshu.com/p/380290deb8f0)

[https://blog.csdn.net/zxy987872674/article/details/72491066](https://blog.csdn.net/zxy987872674/article/details/72491066)

 