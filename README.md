# API Infrastructure

[![Build Status](https://travis-ci.org/EnterpriseFlowsRepository/api-infrastructure-quarkus.svg?branch=dev)](https://travis-ci.org/EnterpriseFlowsRepository/api-infrastructure-quarkus)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=EnterpriseFlowsRepository_api-infrastructure-quarkus&metric=alert_status)](https://sonarcloud.io/api-infrastructure-quarkus?id=EnterpriseFlowsRepository_api-infrastructure-quarkus)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=EnterpriseFlowsRepository_api-infrastructure-quarkus&metric=coverage)](https://sonarcloud.io/api-infrastructure-quarkus?id=EnterpriseFlowsRepository_api-infrastructure-quarkus)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=EnterpriseFlowsRepository_api-infrastructure-quarkus&metric=security_rating)](https://sonarcloud.io/api-infrastructure-quarkus?id=EnterpriseFlowsRepository_api-infrastructure-quarkus)
![Licence](https://img.shields.io/github/license/EnterpriseFlowsRepository/api-infrastructure-quarkus)
![Last commit](https://img.shields.io/github/last-commit/EnterpriseFlowsRepository/api-infrastructure-quarkus)

Service implementation for the EFR Infrastructure module.

## Getting started

To start working on the project:

1. Clone the project with `git clone git@github.com:EnterpriseFlowsRepository/api-infrastructure-quarkus.git`
2. Install the Maven dependencies with `./mvnw install`
3. Start the development server with `./mvnw compile quarkus:dev`

### Prerequisites

- Install JDK (i.e. `openjdk-11-jdk` on Ubuntu)

> Maven is already included within the scripts `mvnw`, you do not need to install it

### Installing

In order to start with the project, first install a JDK then install the project dependencies:

```bash
➜  api-infrastructure-quarkus git:(dev) ✗ ./mvnw install
[...]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  5.441 s
[INFO] Finished at: 2019-11-26T11:11:07+01:00
[INFO] ------------------------------------------------------------------------
```

## Running the tests

Unit tests are integrated within the project. [We are use JUnit 5](https://junit.org/junit5). Start them with:

```bash
./mvnw clean verify
```

Several tools integrated to the continuous deployment are used to automatically & proactively ensure the quality of our binaries (functional, security, code quality):

1. Application of **unit tests** on the application
2. Binaries generation [as a **native GraalVM** (C language) executable](https://www.graalvm.org/docs/reference-manual/native-image/)
3. **Container** generation
4. Testing the containerized application [following OWASP ZAP **security tests**](https://github.com/zaproxy/zaproxy)

## Deployment

Enterprise Flows Repisitory is straightforward: [each build is published to Docker Hub](https://hub.docker.com/r/enterpriseflowsrepository/api-infrastructure-quarkus).

This allow our app to start in less than 500 milliseconds.

### Development environement

Start the container to your own environement (work well with 50 MiB RAM & 0.05 CPU):

```bash
docker run -t --memory="50m" --cpus=".05" -p 8080:8080 enterpriseflowsrepository/api-infrastructure-quarkus
```

### Production environement

We advise the usage of Kubernetes as the orchestrator of the application. Thanks to its stateless behavior, you can easily integrate it. See the k8s deployement files included for more info about it (path `src/main/k8s`).

## Built With

- [Quarkus](https://quarkus.io) - Kubernetes Native Java EE stack tailored for OpenJDK HotSpot & GraalVM
- [RESTEasy](https://resteasy.github.io) - Helper librairies to built RESTful applications
- [JUnit 5](https://junit.org/junit5) - Unitary tests platform for Java
- [REST-assured](http://rest-assured.io) - REST library validator
- [SmallRye OpenAPI](https://github.com/smallrye/smallrye-open-api) - Implementation of OpenAPI v3 specifications for JEE
- [SmallRye Health](https://github.com/smallrye/smallrye-health) - REST healthcheck library for Java EE
- [SmallRye Fault Tolerance](https://github.com/smallrye/smallrye-fault-tolerance) - Caching & retry requests automations library for Java EE
- [Swagger UI](https://swagger.io/tools/swagger-ui) - OpenAPI v3 UI
- [README-template.md](https://gist.github.com/PurpleBooth/109311bb0361f32d87a2) - An awesome README template from @PurpleBooth
- [OWASP Zed Attack Proxy](https://github.com/zaproxy/zaproxy) - Security tools to find security vulnerabilities in web applications
- [Alpine Linux distribution](https://alpinelinux.org/)

## Contributing

Please read [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for details on our code of conduct, & the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/EnterpriseFlowsRepository/api-infrastructure-quarkus/tags).

## Authors

- **Emmanuel Lesné** - *Project creator & maintainer* - [Emmanuel35](https://github.com/Emmanuel35)
- **Adrien Simon** - *Maintainer* - [AdrienSimon](https://github.com/AdrienSimon)
- **Inès Rekik** - *Maintainer* - [inesrk](https://github.com/inesrk)
- **Yanis Meghraoua** - *Maintainer* - [MeghraouaY](https://github.com/MeghraouaY)
- **Clément Lesné** - *Maintainer* - [clementlesne](https://github.com/clementlesne)

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE.md](LICENSE.md) file for details.
