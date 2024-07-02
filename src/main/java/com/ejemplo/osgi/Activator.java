package com.ejemplo.osgi;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
    private HelloService helloService;

    public void start(BundleContext context) {
        helloService = new HelloServiceImpl();
        helloService.sayHello();
    }

    public void stop(BundleContext context) {
        helloService = null;
    }
}
