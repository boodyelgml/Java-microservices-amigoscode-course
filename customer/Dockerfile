FROM openjdk
VOLUME /tmp
EXPOSE 8080
ADD /target/customer.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]