FROM appinair/jdk11-maven

WORKDIR /app

COPY back-0.0.1-SNAPSHOT.jar app.jar

COPY cosimg cosimg

ENTRYPOINT ["java","-jar","app.jar"]