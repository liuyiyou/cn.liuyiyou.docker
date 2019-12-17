FROM freshworks/oraclejdk8
MAINTAINER liuyiyou <admin@liuyiyou.cn>
VOLUME /tmp
ENV PROJECT_NAME="@project.build.finalName@.@project.packaging@" JAVA_OPTS=""
ADD $PROJECT_NAME app.jar
EXPOSE 8080:8080
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]