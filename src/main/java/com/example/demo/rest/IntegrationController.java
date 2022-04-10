package com.example.demo.rest;

import com.example.demo.service.SuggestionService;
import com.example.demo.service.ThirdPartyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class IntegrationController {

    @Autowired
    ThirdPartyService thirdPartyService;

    @Autowired
    SuggestionService suggestionService;


    /**
     * Our suggestion service api for suggesting user based on their mood.
     * @return
     */
    @GetMapping("/suggestion")
    List<String> result() {
        try {
            return suggestionService.suggestions();
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.singletonList(e.getMessage());
        }
    }

    /**
     * This will represent the third party api which our backend will call to show suggestion.
     * @return
     */
    @GetMapping("/third_party_api")
    HashMap<String, String> activityData() {
        return thirdPartyService.activity();
    }
}