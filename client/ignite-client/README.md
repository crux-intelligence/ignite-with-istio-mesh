**Prerequisites:**

1. Install Java 8
2. Install MVN 3


**Steps to build the project**

1. Go to ignite-client folder cd client/ignite-client
2. Run below mvn command to build the project
```
mvn clean install -T 1C  -U  -DskipTests=true
```
3. Check if sample-ignite-client-1.0.1-SNAPSHOT.jar created under target folder.


**Steps to create docker image**

1. Go to ignite-client folder cd client/ignite-client
2. Ensure that you have build the project and jar file has been created in target folder.
3. Run below command to create the docker image:

```
sudo docker build -t sample-ignite-client:1.0.1-SNAPSHOT -f src/main/resources/Dockerfile .
sudo docker push sample-ignite-client:1.0.1-SNAPSHOT
```
