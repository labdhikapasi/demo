FROM openjdk:8
COPY ./target/mycalculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "mycalculator-devops-1.0-SNAPSHOT-jar-with-dependencies.jar","Calculator"]