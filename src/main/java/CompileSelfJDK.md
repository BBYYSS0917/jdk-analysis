# 编译自己的JDK

## 环境
Centos7.6 2核4G

## OpenJDK8 源码
源码地址：https://download.java.net/openjdk/jdk8u41/ri/openjdk-8u41-src-b04-14_jan_2020.zip

## JDK1.7 安装包
下载地址：https://mirrors.huaweicloud.com/java/jdk/7u80-b15/  jdk-7u80-linux-x64.tar.gz

## 依赖工具

```
# 安装 c 语言开发相关编译器及调试器
yum install -y gcc
yum install -y gcc-c++
yum install -y gdb

# 安装编译 JVM 相关依赖
yum install -y cups
yum install -y cups-devel
yum groupinstall -y "Development Tools"
yum install -y libXtst-devel libXt-devel libXrender-devel
yum install -y freetype
yum install -y freetype-devel
yum install -y alsa-lib-devel
yum install -y fontconfig-devel
```

## 编译环境
统一在`/data`目录下操作

```
解压JDK7安装包和OpenJDK8的源码
tar -zxvf /data/jdk-7u80-linux-x64.tar.gz
unzip /data/openjdk-8u41-src-b04-14_jan_2020.zip

设置 configure 为可执行文件，再执行预编译
cd /data/openjdk
chmod +x ./configure
./configure --with-boot-jdk=/data/jdk1.7.0_80/ --with-target-bits=64 --with-debug-level=release
```

## 最后

```
make all 
编译时长20分钟，其中出现警告不需要处理。

自己编译好的 JDK 就在/data/openjdk/build/linux-x86_64-normal-server-release/jdk目录下
```
