# MicroserviceV2
### Ports Standardization
| Application | Port |
| :----- | :-----|
| Limits Service | 8080, 8081, ... |
| Spring Cloud Config Server | 8888 |
| Currency Exchange Service | 8100, 8101, ... |
| Currency Conversion Service | 8200. 8201, ... |
### spring-cloud-config-server
* default: http://localhost:8888/limits-service/default
* dev: http://localhost:8888/limits-service/dev
* qa: http://localhost:8888/limits-service/qa
### limits-service
* http://localhost:8080/limits
