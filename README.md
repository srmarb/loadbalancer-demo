# loadbalancer-demo

This is a loadbalancer example with two springboot applications, sending 10% of requests to service1 and 90% of requests to service2. 
Execute these commands to run the docer containers:

- mvn clean install
- docker-compose build
- docker-compose up -d

### postman curl:
curl --location --request GET 'http://localhost:9090'