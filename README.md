# API-PRODUTOS-KUBERNETES

### First example about communication between 2 services on Kubernetes Deployments

### [Step 1] Instructions Before(minikube/kubernetes)

- install: https://minikube.sigs.k8s.io/docs/start/
```
sudo usermod -aG docker $USER && newgrp docker
minikube start
minikube dashboard
curl -LO "https://storage.googleapis.com/kubernetes-release/release/$(curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt)/bin/linux/amd64/kubectl"
chmod +x ./kubectl
sudo mv ./kubectl /usr/local/bin/kubectl
kubectl get all
kubectl get pod -w
kubectl get services
```

### [Step 2] Instructions Before (skaffold)

- install: https://skaffold.dev/

### [Step 3] Build API-PRODUTOS
```
git clone https://github.com/thiagohernandes/api-produtos-kubernetes.git
cd api-produtos-kubernetes
mvn clean package
docker build -t api-produtos .
skaffold run
```

### [Step 4] Open API-PRODUTOS
```
minikube service api-produtos
open on browser: http://[ip-service]:30000/api/v1/produtos
```
