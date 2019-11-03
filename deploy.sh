#!/bin/sh
mvn clean package
& minikube docker-env | Invoke-Expression
docker build -f src/main/docker/Dockerfile.jvm -t enterprise-flows-repository/api-properties-quarkus:jvm .
kubectl apply -f src/main/k8s