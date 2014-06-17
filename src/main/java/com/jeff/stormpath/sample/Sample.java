/*
 * Copyright (c) 2014, Stormpath, Inc.
 * All rights reserved.
 */
package com.jeff.stormpath.sample;

import com.stormpath.sdk.api.ApiKey;
import com.stormpath.sdk.api.ApiKeys;
import com.stormpath.sdk.client.Client;
import com.stormpath.sdk.client.Clients;

/**
 * @author Jeff Wysong
 * @since 6/17/14 4:46 PM
 */
public class Sample {

    public static void main(String[] args) {
        String path = System.getProperty("user.home")+"/.stormpath/apiKey_sdk.properties";
        ApiKey apiKey = ApiKeys.builder().setFileLocation(path).build();
        Client client = Clients.builder().setApiKey(apiKey).build();
        System.out.println(client.getCurrentTenant());
    }
}
