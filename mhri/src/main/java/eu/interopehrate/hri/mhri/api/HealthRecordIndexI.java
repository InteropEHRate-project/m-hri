package eu.interopehrate.hri.mhri.api;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import eu.interopehrate.hri.mhri.model.Citizen;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface HealthRecordIndexI {

//    @Headers({"citizenUsername", "cloudUri"})
    @POST("citizen/createCitizen")
    Call<JsonObject> createCitizen(@Header("emergencyToken") String emergencyToken, @Header("citizenUsername") String citizenUsername, @Header("cloudUri") String cloudUri);

    @GET("citizen/findCitizen")
    Call<JsonObject> findCitizen(@Header("Authorization") String auth, @Header("citizenUsername") String citizenUsername, @Header("cloudUri") String cloudUri);

    @GET("citizen/getCloud")
    Call<JsonObject> findById(@Header("Authorization") String auth, @Header("citizenId") String citizenId);

    @PUT("citizen/removeData")
    Call<JsonObject> deleteCitizen(@Header("Authorization") String auth, @Header("citizenId") String citizenId);


    @PUT("citizen/updateCitizen")
    Call<JsonObject> updateCitizen(@Header("Authorization") String auth, @Header("citizenId") String citizenId, @Header("emergencyToken") String emergencyToken, @Header("citizenUsername") String citizenUsername, @Header("cloudUri") String cloudUri);

}
