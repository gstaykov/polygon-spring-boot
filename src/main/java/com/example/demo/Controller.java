package com.example.demo;

import io.polygon.kotlin.sdk.rest.PolygonRestClient;
import io.polygon.kotlin.sdk.rest.reference.MarketsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{
    @GetMapping("/test")
    public String testPolygon()
    {
        String polygonKey = System.getenv("POLYGON_API_KEY");
        PolygonRestClient client = new PolygonRestClient(polygonKey);
        MarketsDTO markets = client.getReferenceClient().getSupportedMarketsBlocking();
        System.out.println("Got markets synchronously: " + markets.toString());

        return "ok.";
    }
}
