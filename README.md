# TomcatSourceAnalysis
Tomcat7源码启动说明
第一步：<br/>
进入TomcatSourceAnalysis目录运行ant命令，前提条件系统已经安装ANT工具<br/>
运行结果必须是BUILD SUCCESSFUL会在当前目录生成output目录<br/>
第二步：将TomcatSourceAnalysis导入IDEA IntelliJ <br/>
配置Run Configuration 搜索Bootstrap类运行main方法<br/>
VM OPTION添加如下配置项：<br/>
-Dcatalina.home="D:\GitTomcat\TomcatSourceAnalysis\output\build" <br/>
-Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager <br/>
-Djava.util.logging.config.file="D:\GitTomcat\TomcatSourceAnalysis\output\build\conf\logging.properties" <br/>
