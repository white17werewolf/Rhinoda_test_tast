package com.rhinoda.marina.rhinoda_test_tast.model.forJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("response")
    @Expose
    private List<DataExample> response;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<DataExample> getResponse() {
        return response;
    }

    public void setResponse(List<DataExample> response) {
        this.response = response;
    }

}

