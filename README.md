# loadbalancer-demo

This is a loadbalancer example with two springboot applications, sending 10% of requests to service1 and 90% of requests to service2. 


![lb drawio](https://user-images.githubusercontent.com/109630016/211205200-ccd8c71d-a0a9-41d1-b4c7-4b3f7fe2b134.png)

Execute these commands to run the docer containers:

- mvn clean install
- docker-compose build
- docker-compose up -d
- for i in {1..30}; do curl http://localhost:9090; done
