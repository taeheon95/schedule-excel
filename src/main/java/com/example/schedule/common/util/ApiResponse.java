package com.example.schedule.common.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponse<T> {
    private int resultCode;
    private String resultMsg;
    private T resultData;

    private ApiResponse() {

    }

    public ApiResponse(int code, String msg, T data) {
        this.resultCode = code;
        this.resultMsg = msg;
        this.resultData = data;
    }
}
