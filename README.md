# loadbalancer-demo

Execute these commands:
- mvn clean install
- docker-compose build
- docker-compose up -d
- for i in {1..30}; do curl http://localhost:9090; done
