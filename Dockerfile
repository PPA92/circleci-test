FROM adoptopenjdk/openjdk8
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/demo.jar
ENTRYPOINT exec java $JAVA_OPTS -jar demo.jar
