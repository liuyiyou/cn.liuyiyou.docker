FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER liuyiyou <admin@liuyiyou.cn>
VOLUME /tmp
ADD cn.liuyiyou.docker-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
# CMD ["sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=${ACTIVE:-docker1} -jar /app.jar"]
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]