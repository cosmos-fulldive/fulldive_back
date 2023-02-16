FROM appinair/jdk11-maven

COPY back-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]

WORKDIR /app

COPY cosimg cosimg

