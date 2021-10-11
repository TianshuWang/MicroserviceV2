# MicroserviceV2
### Ports Standardization
| Application | Port |
| :----- | :-----|
| Limits Service | 8080, 8081, ... |
| Spring Cloud Config Server | 8888 |
| Currency Exchange Service | 8100, 8101, ... |
| Currency Conversion Service | 8200. 8201, ... |
| Eureka Naming Server | 8761 |
| Api Gateway| 8765 |

### Arquitectura
![Cow4](https://raw.githubusercontent.com/TianshuWang/MicroserviceV2/master/arquitectura.png?token=AI7Y4WAV4BVYZI47UFSGRPDBMMGRU "Cow4")

### spring-cloud-config-server
* default: http://localhost:8888/limits-service/default
* dev: http://localhost:8888/limits-service/dev
* qa: http://localhost:8888/limits-service/qa
### limits-service
* http://localhost:8080/limits
### H2 database console
* http://localhost:8100/h2-console
### currency-exchange-service
* http://localhost:8100/currency-exchange
### currency-conversion-service
* http://localhost:8200/currency-conversion
### eureka-naming-server
* http://localhost:8761
### api-gateway
* http://localhost:8765/currency-exchange-service/currency-exchange
* http://localhost:8765/currency-conversion-service/currency-conversion
##Spring Cloud Gateway
* Simple, yet effective way to route to APIs
* Provide cross-cutting concerns
    - Security
    - Monitoring/metrics
* Built on top of Spring Webflux(Reactive Approach)
* Features:
    - Match routes on any request attribute
    - Define predicates and filters
    - Integrates with Spring Cloud Discovery Client(Load Balancing)
    - Path rewriting

