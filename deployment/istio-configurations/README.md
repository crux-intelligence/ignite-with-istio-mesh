
### **Istio Deployment steps:**

1. Go to ignite-with-istio folder using `cd ignite-with-istio-mesh`
2. Update values.yaml as per requirement.
3. Deploy Istio-configurations using helm chart:

 ```shell script
helm install istio-configurations deployment/istio-configurations -f deployment/istio-configurations/values.yaml -n default
```
4. Upgrade deployment
```
helm upgrade istio-configurations deployment/istio-configurations -f deployment/istio-configurations/values.yaml -n default
```
