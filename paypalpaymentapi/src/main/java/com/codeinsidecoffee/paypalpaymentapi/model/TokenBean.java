
package com.codeinsidecoffee.paypalpaymentapi.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class TokenBean {

    @SerializedName("access_token")
    private String accessToken;
    @SerializedName("app_id")
    private String appId;
    @SerializedName("expires_in")
    private Long expiresIn;
    @Expose
    private String nonce;
    @Expose
    private String scope;
    @SerializedName("token_type")
    private String tokenType;


    @Expose
    private String error;

    @Expose
    private String error_description;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getError_description() {
        return error_description;
    }

    public void setError_description(String error_description) {
        this.error_description = error_description;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public String toString() {
        return "TokenBean{" +
                "accessToken='" + accessToken + '\'' +
                ", appId='" + appId + '\'' +
                ", expiresIn=" + expiresIn +
                ", nonce='" + nonce + '\'' +
                ", scope='" + scope + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", error='" + error + '\'' +
                ", error_description='" + error_description + '\'' +
                '}';
    }
}
