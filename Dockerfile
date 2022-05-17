FROM java:openjdk-8-jre-alpine

COPY ./build/libs/spring-app.jar /root/workspace/spring-app.jar

CMD ["java", "-jar", "./spring-app.jar"]


