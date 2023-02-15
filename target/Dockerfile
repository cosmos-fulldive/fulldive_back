FROM appinair/jdk11-maven

WORKDIR /app

COPY cosimg cosimg

COPY back-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]