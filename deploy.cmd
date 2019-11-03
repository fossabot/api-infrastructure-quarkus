rem & minikube docker-env | Invoke-Expression

call mvn package

call docker build -f src/main/docker/Dockerfile.jvm -t enterprise-flows-repository/api-infrastructure-quarkus:jvm .

call kubectl apply -f src/main/k8s