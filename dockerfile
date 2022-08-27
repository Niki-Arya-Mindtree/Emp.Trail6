FROM maven:3.8.6-openjdk-18 as maven

COPY ./pom.xml ./pom.xml

COPY ./src ./src

COPY /target/*.jar ./app.jar

CMD java -jar app.jar



