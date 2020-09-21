FROM registry.cn-hangzhou.aliyuncs.com/acs/maven:3-jdk-8
# 作者
MAINTAINER ayang
## VOLUME，VOLUME指向了一个/tmp的目录，由于Spring Boot使用内置的Tomcat容器，Tomcat默认使用/tmp作为工作目录。
## 这个命令的效果是：在宿主机的/var/lib/docker目录下创建一个临时文件并把它链接到容器中的/tmp目录
VOLUME /tmp
# WORKDIR /server-config
## ADD，拷贝文件并且重命名
ADD target/docker-demo-0.0.1-SNAPSHOT.jar app.jar
## ENTRYPOINT，为了缩短Tomcat的启动时间，添加java.security.egd的系统属性指向/dev/urandom作为ENTRYPOINT
# RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-jar","/app.jar"]
# 指定容器需要映射到主机的端口
EXPOSE 8888