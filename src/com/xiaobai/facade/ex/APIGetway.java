package com.xiaobai.facade.ex;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class APIGetway {
    private Map<String, Service> services = new HashMap<>(8);

    public void addService(String name, Service service) {
        services.put(name, service);
    }

    public void forward(String request) throws IOException {
        if (services.containsKey(request)) {
            services.get(request).server();
        } else {
            throw new IOException("No Such Service!");
        }
    }
}
