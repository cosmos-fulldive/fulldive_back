FROM appinair/jdk11-maven

RUN mkdir /src

WORKDIR /src

VOLUME /src

COPY back-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","/app.jar"]