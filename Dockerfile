FROM java:8
MAINTAINER JianJang
LABEL name="docker-demo" version="1.0.0" author="JianJang"
VOLUME /tmp
ADD ${JAR_FILE} /docker-demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-demo.jar"]
ENV TZ=Asia/Shanghai
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
EXPOSE 8080
