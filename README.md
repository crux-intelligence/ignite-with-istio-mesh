# ignite-with-istio

This is a sample project to demonstrate , how we can create a persisted Ignite Cluster in Kubernetes along with Istio.
It also contains a sample Ignite client which can connect to the cluster and perform some cache operations.

### Kubernetes

[Kubernetes](https://kubernetes.io/), also known as K8s, is an open-source system for automating deployment, scaling,
and management of containerized applications.

### Istio

[Istio](https://istio.io/latest/about/service-mesh/#:~:text=Istio%20is%20an%20open%20source,%2C%20connect%2C%20and%20monitor%20services)
is an open source service mesh that layers transparently onto existing distributed applications. Istio’s powerful
features provide a uniform and more efficient way to secure, connect, and monitor services.

### GridGain

[GridGain](https://github.com/gridgain/gridgain) Community Edition (GCE) is a hardened, high performance, open source
in-memory computing platform. Built on [Apache® Ignite™](https://ignite.apache.org/), it includes additional
functionality, tuning and patches developed by GridGain to deliver optimal performance.

### Getting started

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## Prerequisite

1. Install minikube or Docker Desktop from https://minikube.sigs.k8s.io/docs/start/ or https://www.docker.com/products/docker-desktop/
2. Install kubectl CLI from https://kubernetes.io/docs/tasks/tools/
3. Install helm from https://helm.sh/docs/intro/install/#helm


### Steps for Deployment
1. Install Istio using deployment/istio/README.md
2. Install Istio configurations using deployment/istio-configurations/README.md
3. Install Gridgain cluster using deployment/gridgain-cluster/README.md
4. Install Gridgain client using deployment/client/README.md
