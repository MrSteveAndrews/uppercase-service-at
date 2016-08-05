package com.blueagility.strings.service.at.steps;


import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple REST client for accessing a REST service
 */
public class UpperCaseServiceClient {

    private static final String URI_OPERATION = "/uppercase-service/";
    private static final String INPUT = "{input}";
    private static String URI_HOST = null;

    public UpperCaseServiceClient() {
        restTemplate = new RestTemplate();
        URI_HOST = System.getProperty("host");
    }

    private RestTemplate restTemplate;

    /**
     * Gets the upper case value of an input string.
     * @param input
     * @return
     */
    public String upperCase(String input) {
        String uri = URI_HOST + URI_OPERATION + INPUT;

        Map<String, String> params = new HashMap<String, String>();
        params.put("input", input);

        String output = restTemplate.getForObject(uri, String.class, params);

        return output;
    }

    /**
     * See if we can get a response
     * @return
     */
    public boolean ping() {
        String uri = URI_HOST + URI_OPERATION + "ping";

        try {
            restTemplate.getForObject(uri, String.class);
        }
        catch(Throwable t) {
            return false;
        }

        return true;
    }

}

