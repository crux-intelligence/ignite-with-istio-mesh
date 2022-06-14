
### **Ignite Client Deployment steps:**

1. Enable Istio on default namespace using
   
   `kubectl label ns default istio-injection=enabled `
   
2. Go to ignite-with-istio folder using `cd ignite-with-istio-mesh`  

3. Update deployment/client/values.yaml as per requirement.
   
4. Deploy Ignite Client using helm chart:

```shell script
    helm install gridgain-client deployment/client -f deployment/client/values.yaml -n default
```
5. Upgrade Ignite Client helm chart:

```shell script
    helm upgrade gridgain-client deployment/client -f deployment/client/values.yaml -n default
```
