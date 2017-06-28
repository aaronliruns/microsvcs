mvnw clean package (*nix/mac)
mvnw.cmd clean package (windows)

java -jar target/microservice-demo-0.0.1-SNAPSHOT.jar

curl http://localhost:8080/accounts/123456789
{"id":0,"number":"123456789","owner":"Keri Lee","balance":49376.12}

curl http://localhost:8080/accounts/owner/Aaron%20Li
[{"id":18,"number":"123456018","owner":"Aaron Li","balance":3897.89}]