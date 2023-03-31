# alticci-sequece-value-calc

This project is an API Rest (back-end), implemented using Quarkus Java framework, that servers the calculation of Alticci Sequence Value.

## Running the application

Prerequisite:

- To have Quarkus installed.

### Using docker

Prerequisite:

- To have Docker installed.

Two ways to run this project using Docker: 1st) Creating your local docker image; and 2nd) Run one existent from [Docker Hub](https://hub.docker.com/repository/docker/flauberjp/alticci-sequence-value-calc-jvm/general).

1st way)

Before building the container image run the following command in order to generate the packages from the source code (check target folder if curious):

> ./mvn clean package

Then, build the image with:

> docker build -f src/main/docker/Dockerfile.jvm -t flauberjp/alticci-sequence-value-calc-jvm .

2nd way)

Pull the image available from Docker Hub:

> docker pull flauberjp/alticci-sequence-value-calc-jvm:latest

With the image, then run the container using:

> docker run -i --rm -p 8080:8080 flauberjp/alticci-sequence-value-calc-jvm

You can check it is running (in prod mode by default) using this cURL command:

> curl http://localhost:8080/alticci/9 -i

Or, to get an error, try:

> curl http://localhost:8080/alticci/-11 -i

### In dev mode

You can run your application in dev mode that enables live coding using:

> ./mvn compile quarkus:dev

## Checking documentation

In order to be able to consume this REST API, try it live, or check its documentation, with its running access its [Open API UI](http://localhost:8080/q/swagger-ui) link.

Quarkus ships with a Dev UI, so you can explorer to see others details of this application( **available in dev mode only**) at http://localhost:8080/q/dev/.

## Performing automated testing

You can run all automated test cases created to test this API using:

> ./mvn compile quarkus:test

## References

1. [Quarkus Get Started](https://quarkus.io/get-started/)
1. [Using OpenAPI and Swagger UI](https://quarkus.io/guides/openapi-swaggerui)
1. [Read JSON Response Body using Rest Assured](https://www.toolsqa.com/rest-assured/read-json-response-body-using-rest-assured/)
1. [How do I measure request and response times at once using cURL?](https://stackoverflow.com/a/22625150/6771132)
