FROM openjdk:8
COPY ./target/mycalculator-devops-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "mycalculator-devops-1.0-SNAPSHOT.jar","Calculator"]