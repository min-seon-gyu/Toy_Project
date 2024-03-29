package com.WebProject.jwt;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class TokenResponse {
    @ApiModelProperty(example = "Access Token")
    private final String atk;
    @ApiModelProperty(example = "Refresh Token")
    private final String rtk;
}
