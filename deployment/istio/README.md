
### **Istio Deployment steps:**

1. Create a namespace for istio deployment using `kubectl create namespace istio-system`
2. Go to ignite-with-istio folder using `cd ignite-with-istio`
3. Deploy Istio using helm chart:

 ```shell script
helm install istio-base deployment/istio/base -f deployment/istio/base/values.yaml -n istio-system
helm install istiod deployment/istio/istio-control/istio-discovery -f deployment/istio/istio-control/istio-discovery/values.yaml -n istio-system
helm install istio-ingress deployment/istio/gateways/istio-ingress -f deployment/istio/gateways/istio-ingress/values.yaml -n istio-system
helm install istio-egress deployment/istio/gateways/istio-egress -f deployment/istio/gateways/istio-egress/values.yaml -n istio-system
```
