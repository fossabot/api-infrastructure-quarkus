#!/bin/sh
APIMODULE=infrastructure

mvn package -Dnative -Dquarkus.native.container-build=true
docker build -f src/main/docker/Dockerfile.jvm -t enterprise-flows-repository/api-$APIMODULE-quarkus:jvm .
kubectl apply -f src/main/k8s