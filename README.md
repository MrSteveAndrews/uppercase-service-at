# uppercase-service-at
Acceptance tests for the upper case service

To run tests:

     mvn test -D<uppercase.service.host>

Where <uppercase.service.host> = the host URL of the service endpoint.  Examples:

* If the service URL is http://localhost:8080/uppercase/service, <uppercase.service.host> = http://localhost:8080
* If the service URL is http://test.strings.blue-agility.com/uppercase/service, <uppercase.service.host> = http://test.strings.blue-agility.com


