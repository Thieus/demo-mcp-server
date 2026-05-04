package com.mla.mcp.demo.service;

import org.springframework.ai.mcp.annotation.McpTool;
import org.springframework.stereotype.Service;

@Service
public class McpService {

    public record WeatherResponse(String location, int temperature, String conditions) {
    }

    @McpTool(name = "get_weather", description = "Get the weather for a given location")
    public WeatherResponse getWeather(String location) {
        return new WeatherResponse(location, 22, "Sunny");
    }

}
