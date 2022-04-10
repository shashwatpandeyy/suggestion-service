package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * This service is used for providing the formatted data that is used for plotting graphs and maps.
 */
@Service
public class SuggestionService {


    public List<String> suggestions() {
        String url = "http://localhost:8080/api/third_party_api";
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> activityData = (Map<String, String>) restTemplate.getForObject(url, Map.class);
        if (activityData!=null) {
            return suggestionModel(activityData);
        }
        return new ArrayList<>();
    }

    /**
     * This is a sample method which represents the machine learning model used for suggestions.
     * @return
     * @param activityData
     */
    private List<String> suggestionModel(Map<String, String> activityData) {
        if (Integer.parseInt(activityData.get("sad"))>7) {
            return List.of("Would you want try chocolate, it is healthy for brain.",
                    "Its been a several week since you have called you parents.");
        }
       return new ArrayList<>();
    }
}
