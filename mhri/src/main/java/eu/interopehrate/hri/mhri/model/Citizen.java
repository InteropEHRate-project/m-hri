package eu.interopehrate.hri.mhri.model;

import com.google.gson.annotations.SerializedName;

public class Citizen {
    private String citizenId;
    private String citizenUsername;
    private String cloudUri;

    public Citizen() { }

    public String getCitizenId() {
        return citizenId;
    }

    public String getCitizenUsername() {
        return citizenUsername;
    }

    public String getCloudUri() {
        return cloudUri;
    }

    public void setCitizenId(String citizenId) {
        this.citizenId = citizenId;
    }

    public void setCitizenUsername(String citizenUsername) {
        this.citizenUsername = citizenUsername;
    }

    public void setCloudUrl(String cloudUri) {
        this.cloudUri = cloudUri;
    }
}
