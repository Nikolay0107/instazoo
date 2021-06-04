package com.nikolaybondarenko.web.instazoo.payload.response;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JWTokenSuccessResponse {
    private boolean success;
    private String token;

}
