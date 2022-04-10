package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * A service class to calculate the revenue and related information.
 */
@Service
public class ThirdPartyService {

    public HashMap<String, String> activity() {
        HashMap<String, String> activities = new HashMap<>();
        activities.put("likes", "3");
        activities.put("laughs", "4");
        activities.put("sad", "10");
        return activities;
    }
}
