package com.example.better_together;

import org.json.JSONObject;

/**
 * Created by ssdd on 10/18/14.
 */
public interface IApiHelper {
    public JSONObject execute(String apiCommand,JSONObject args);
}
