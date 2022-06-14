**Deployment Steps:**

1. Create a namespace
   `kubectl create namespace gridgain`
2. Enable Istio
   `kubectl label ns gridgain istio-injection=enabled`
3. Go to ignite-with-istio folder using `cd ignite-with-istio-mesh`   
4. Update path of local directory if your using local storage as volume mount.
   Update local.path in deployment/gridgain-cluster/values.yaml
5. Helm deployment
   `helm install gridgain deployment/gridgain-cluster -f deployment/gridgain-cluster/values.yaml -n gridgain`
6. Upgrade deployment
   `helm upgrade gridgain deployment/gridgain-cluster -f deployment/gridgain-cluster/values.yaml -n gridgain`

**Scaling ignite cluster:**

Scale down: `kubectl scale statefulset.apps/ignite-cluster --replicas=0 -n gridgain`

Scale up: `kubectl scale statefulset.apps/ignite-cluster --replicas=3 -n gridgain`

**Activation of Ignite cluster**


Status check: `https://URL/ignite/?cmd=state`

Activate: `https://URL/ignite/?cmd=activate`


**To Check logs of ignite-cluster**

Console logs : `kubectl logs -f <pod-name>  -n gridgain`

Detailed logs from inside the pod : 
1. SSH into the pod/container using `kubectl exec -it <pod-name>  /bin/bash -n gridgain`
2. Go to `cd /gridgain/work/log`
3. Do `ls -ltr` and you can see the list of log files

**To check baseline nodes status**

_Note: Check for all  ignite cluster pods_
1. SSH into the pod/container using `kubectl exec -it <pod-name>  /bin/bash -n gridgain`
2. Go to `cd /opt/gridgain/bin`
3. Run `./control.sh --baseline`

