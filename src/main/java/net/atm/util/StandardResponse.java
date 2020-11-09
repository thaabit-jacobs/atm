package net.atm.util;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import net.atm.types.StatusResponse;
import spark.ResponseTransformer;

public class StandardResponse {

    private StatusResponse status;
    private String message;
    private JsonElement data;

    public StandardResponse(StatusResponse status) {
        this.status = status;
    }
    public StandardResponse(StatusResponse status, String message) {
       this.status = status;
       this.message = message;
    }
    public StandardResponse(StatusResponse status, JsonElement data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public StandardResponse(JsonElement data) {
        this.data = data;
    }

    public StatusResponse getStatus() {
        return status;
    }

    public void setStatus(StatusResponse status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }
}