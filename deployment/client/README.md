
### **Ignite Client Deployment steps:**

1. Enable Istio on default namespace using
   
   `kubectl label ns default istio-injection=enabled `
   
2. Go to ignite-with-istio folder using `cd ignite-with-istio`   
   
3. Deploy Ignite Client using helm chart:

 ```shell script
helm install ignite-client deployment/client -f deployment/client/values.yaml -n istio-system
```
