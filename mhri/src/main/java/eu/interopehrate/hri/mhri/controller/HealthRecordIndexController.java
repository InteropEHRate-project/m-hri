package eu.interopehrate.hri.mhri.controller;

import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

import org.json.JSONObject;

import java.io.IOException;

import eu.interopehrate.hri.mhri.api.HealthRecordIndexI;
import eu.interopehrate.hri.mhri.model.Citizen;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HealthRecordIndexController {
    private HealthRecordIndexI healthRecordIndexI;
    private String BASE_URL = "http://10.0.2.2:8080/";

    public HealthRecordIndexController() {
        healthRecordIndexI = retrofit.create(HealthRecordIndexI.class);
    }

    OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();


    public JsonObject findCitizen(String auth, String citizenUsername, String cloudUri) {
        try {
            final Response<JsonObject> response = healthRecordIndexI.findCitizen(auth, citizenUsername, cloudUri).execute();
            if (response.body() != null) {
                JsonObject jsonResponse = response.body();
                System.out.println("IF\t" +jsonResponse);
                return jsonResponse;
            }else{
                JsonParser parser = new JsonParser();
                JsonObject jsonResponse = parser.parse(response.errorBody().string()).getAsJsonObject();
                System.out.println("ELSE\t"+jsonResponse);
                return jsonResponse;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    public JsonObject createCitizen(String emergencyToken, String citizenUsername, String cloudUri) {

        try {
            final Response<JsonObject> response = healthRecordIndexI.createCitizen(emergencyToken, citizenUsername, cloudUri).execute();
            if (response.body() != null) {
                JsonObject jsonResponse = response.body();
                System.out.println("IF\t" +jsonResponse);
                return jsonResponse;
            }else{
                JsonParser parser = new JsonParser();
                JsonObject jsonResponse = parser.parse(response.errorBody().string()).getAsJsonObject();
                System.out.println("ELSE\t"+jsonResponse);
                return jsonResponse;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public JsonObject findById(String auth, String citizenId) throws JsonIOException, JsonParseException, JsonSyntaxException {
        try {
            final Response<JsonObject> response = healthRecordIndexI.findById(auth, citizenId).execute();
            if (response.body() != null) {
                JsonObject jsonResponse = response.body();
                System.out.println("IF\t" +jsonResponse);
                return jsonResponse;
            }
            else {
                JsonParser parser = new JsonParser();
                JsonObject jsonResponse = parser.parse(response.errorBody().string()).getAsJsonObject();
                System.out.println("ELSE\t"+jsonResponse);
                return jsonResponse;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JsonObject deleteCitizen(String auth, String citizenId) {
        try {
            final Response<JsonObject> response = healthRecordIndexI.deleteCitizen(auth, citizenId).execute();
            if (response.body() != null) {
                JsonObject jsonResponse = response.body();
                System.out.println("IF\t" +jsonResponse);
                return jsonResponse;
            }
            else {
                JsonParser parser = new JsonParser();
                JsonObject jsonResponse = parser.parse(response.errorBody().string()).getAsJsonObject();
                System.out.println("ELSE\t"+jsonResponse);
                return jsonResponse;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public JsonObject updateCitizen(String auth, String citizenId, String emergencyToken, String citizenUsername, String cloudUri ) {
        try {
            final Response<JsonObject> response = healthRecordIndexI.updateCitizen(auth, citizenId, emergencyToken, citizenUsername, cloudUri).execute();
            if (response.body() != null) {
                JsonObject jsonResponse = response.body();
                System.out.println("IF\t" +jsonResponse);
                return jsonResponse;
            }
            else {
                JsonParser parser = new JsonParser();
                JsonObject jsonResponse = parser.parse(response.errorBody().string()).getAsJsonObject();
                System.out.println("ELSE\t"+jsonResponse);
                return jsonResponse;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
