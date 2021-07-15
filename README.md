Steps to reproduce the problem
1. Set API key in env variable `POLYGON_API_KEY` or replace this line `String polygonKey = System.getenv("POLYGON_API_KEY");` in `./src/main/java/com/example/demo/Controller`
2. mvn clean package (build the service with maven)
3. java -jar target/demo-0.0.1-SNAPSHOT.jar (run the project with java)
4. open http://localhost:8080/test (hit the endpoint to trigger polygon call)
