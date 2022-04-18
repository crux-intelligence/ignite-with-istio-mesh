[comment]: <> (**To update and push cache image to cuddle repository**)

[comment]: <> (1. `docker pull gridgain/community:8.8.10`)

[comment]: <> (2. `docker tag gridgain/community:8.8.10 cuddle/cache:8.8.10`)

[comment]: <> (3. `docker push cuddle/cache:8.8.10`)

[comment]: <> (Repository Link: https://hub.docker.com/repository/docker/cuddle/cache)

**Deployment Steps:**

1. Create a namespace
   `kubectl create namespace ignite`
2. Enable Istio
   `kubectl label ns ignite istio-injection=enabled`
3. Helm deployment
   `helm install ignite ignite-with-istio/deployment/ignite-cluster -f values.yaml -n ignite`
4. Upgrade deployment
   `helm upgrade ignite ignite-with-istio/deployment/ignite-cluster -f values.yaml -n ignite`

**Scaling ignite cluster:**

Scale down: `kubectl scale statefulset.apps/ignite-cluster --replicas=0 -n ignite`

Scale up: `kubectl scale statefulset.apps/ignite-cluster --replicas=3 -n ignite`

**Activation of Ignite cluster**


Status check: `https://URL/ignite/?cmd=state`

Activate: `https://URL/ignite/?cmd=activate`


**Recovery Steps for all nodes:**

If you want to delete all the volumes and recreate new ones, whenever the disk gets corrupted follow the below steps:
1. Scale down the pods `kubectl scale statefulset.apps/ignite-cluster --replicas=0 -n ignite` (wait for the pods to scale down,check status using `kubectl get pods -n ignite`)
2. Delete the stateful set `kubectl delete statefulset.apps/ignite-cluster --cascade=orphan -n ignite`
3. Delete the volumes `kubectl delete pvc --all -n ignite`
4. Run a helm upgrade to create new pods and volumes `helm upgrade ignite ignite-with-istio/deployment/ignite-cluster -f values.yaml -n ignite`
5. Activate ignite cluster: `https://URL/ignite/?cmd=activate`


**Recovery Steps for failed nodes:**

If you want to delete a single pod and its respective volume, follow the below  steps:
1. Detach the volumes from the pods `kubectl delete statefulset.apps/ignite-cluster --cascade=orphan -n ignite`
2. Delete the particular pod whose volume you want to delete `kubectl delete <pod/pod-name> -n ignite`
3. List all the volumes `kubectl get pvc -n ignite` 
4. Delete the volume of the deleted pod `kubectl delete pvc <pvc-name> -n ignite`
5. Run a helm upgrade to create new pods and volumes `helm upgrade ignite ignite-with-istio/deployment/ignite-cluster -f values.yaml -n ignite`


**To Check logs of ignite-cluster**

Console logs : `kubectl logs -f <pod-name>  -n ignite`

Detailed logs from inside the pod : 
1. SSH into the pod/container using `kubectl exec -it <pod-name>  /bin/bash -n ignite`
2. Go to `cd /gridgain/work/log`
3. Do `ls -ltr` and you can see the list of log files

**To check baseline nodes status**

_Note: Check for all  ignite cluster pods_
1. SSH into the pod/container using `kubectl exec -it <pod-name>  /bin/bash -n ignite`
2. Go to `cd /opt/gridgain/bin`
3. Run `./control.sh --baseline`


**To enable Istio**

kubectl label ns ignite istio-injection=enabled 

**To disable Istio**

kubectl label ns ignite istio-injection=disabled 