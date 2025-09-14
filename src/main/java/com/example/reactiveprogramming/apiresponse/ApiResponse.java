package com.example.reactiveprogramming.apiresponse;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse<T> {
   @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("message")
    private String messsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("StatusCode")
    private Integer statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("Data")
    private T data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("ListData")
    private List<T> listData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("AccessToken")
    private String accessToken;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("RefreshToken")
    private String refreshToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("role")
    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("imageUrl")
    private String imageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("OTP")
    private String otp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("fcmToken")
    private String fcmToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("userId")
    private Integer userId;

       @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("unitPrice")
    private Float unitPrice;
    
}
