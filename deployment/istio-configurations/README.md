
### **Istio Deployment steps:**

1. Go to ignite-with-istio folder using `cd ignite-with-istio-mesh`
2. Deploy Istio-configurations using helm chart:

 ```shell script
helm install istio-configurations deployment/istio-configurations -f deployment/istio-configurations/values.yaml -n default
```
3. Upgrade deployment
```
helm upgrade istio-configurations deployment/istio-configurations -f deployment/istio-configurations/values.yaml -n default
```
