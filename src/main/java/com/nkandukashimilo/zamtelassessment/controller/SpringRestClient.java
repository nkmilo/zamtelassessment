package com.nkandukashimilo.zamtelassessment.controller;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.nkandukashimilo.zamtelassessment.model.SimCard;

public class SpringRestClient {

    private static final String GET_SIMCARD_DATA_ENDPOINT_URL = "https://apps.zamtel.co.zm/zamtelAssessment";
    private static RestTemplate restTemplate = new RestTemplate();

    public static void main(String[] args) {
        SpringRestClient springRestClient = new SpringRestClient();

        // Step3: get all employees
        springRestClient.getEmployees();

    }

    private void getEmployees() {

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity < String > entity = new HttpEntity < String > ("parameters", headers);

        ResponseEntity < String > result = restTemplate.exchange(GET_SIMCARD_DATA_ENDPOINT_URL, HttpMethod.GET, entity,
                String.class);

        /*ResponseEntity < SimCard > result = restTemplate.exchange(GET_SIMCARD_DATA_ENDPOINT_URL, HttpMethod.GET, entity,
                SimCard.class);*/

        System.out.println(result);
    }


}
