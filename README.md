# CaptureScreenByPythonOnPhone
使用python的opencv模块以视频的方式直接读取手机屏幕

***
## 简介

本功能由Android端（APP） + 服务端（RTMP服务器软件） + python语言调用（直接使用opencv模块即可）

***
## 一、进行开发
1. 安装环境

    + [python3](https://www.python.org/)
    
    + [Android Sutdio](http://www.android-studio.org/) 或者去Google下载
    
    + [opencv-python](https://pypi.org/project/opencv-python/)
    
    + [Android APP](PyAScreenCap/app/release/app-release.apk) 下载
        
        需要在Android手机端使用本APP
    
    + [RTMP服务器端](https://github.com/illuspas/nginx-rtmp-win32)
        
        使用的是开源快速搭建的RTMP服务器。
    
    注意：可在任何能够安装上述两个环境的系统中运行。
    
2. git clone项目

    + 在命令行中安装git后执行如下操作。

            git clone https://github.com/Yaque/Micro-Expression-with-Deep-Learning.git

    + 直接[点击](https://github.com/Yaque/Micro-Expression-with-Deep-Learning/archive/master.zip)此处下载
         
***
##二、快速开始
1. 在一台电脑或其他计算机平台安装服务器软件

    + 搭建服务端软件环境
    
        本系统需要服务器端支持
        
    注意：目前支持Windows系统
    
2. 在手机上安装此[Android APP](PyAScreenCap/app/release/app-release.apk)

    打开后如下图所示：
    
    ![]()

    输入相应的服务器地址（使用[RTMP](https://baike.baidu.com/item/rtmp/6113614?fr=aladdin) 协议）

##三、参考
1. Android 端

    + Android项目原型
    
        [MediaProjectionDemo](https://github.com/deepsadness/MediaProjectionDemo) by [deepsadness](https://github.com/deepsadness)

2. 服务端
    
    + 服务端（直接使用）
        
        [nginx-rtmp-win32](https://github.com/illuspas/nginx-rtmp-win32) by [illuspas](https://github.com/illuspas)
        
    注意：理论上所有支持rtmp协议的视频流都可以被接收。
***
##四、联系
1. 邮箱

    yaquepeng@outlook.com
    
***
+ 声明：

    不喜勿喷，写这么啰嗦纯粹为了学习Markdown
