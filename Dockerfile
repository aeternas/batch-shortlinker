FROM openjdk:12-alpine
ARG SW_HOSTNAME
ENV HOSTNAME $SW_HOSTNAME
WORKDIR /home/circleci/repo/
COPY target/uberjar/batch-shortlinker-0.1.0-SNAPSHOT-standalone.jar .
CMD ["java", "-jar", "batch-shortlinker-0.1.0-SNAPSHOT-standalone.jar"]
