# kubernetes-spring-boot

## Minikube (After all the PODS are up and communicating)
1. minikube service <service-name>  eg "minikube service kubernetes-learning" (this will start tunnel from minukube to browser)

## Project
1. Create spring boot app with mysql dependency
2. build its image using Dockerfile
3. PUSH to the docker registry
4. Get the deployement yaml for mysql that will use secrets and configMaps
5. kubectl apply -f . (this will create secret, configMap, deployments)
