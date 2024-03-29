package com.WebProject.Member;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
@Getter
public class UpdateRequest {
    @ApiModelProperty(example = "이메일")
    private String email;
    @ApiModelProperty(example = "이름")
    private String name;
    @ApiModelProperty(example = "비밀번호")
    private String password;
    @ApiModelProperty(example = "주민등록번호 앞자리")
    private String frontRrn;
    @ApiModelProperty(example = "주민등록번호 뒷자리")
    private String backRrn;
    @ApiModelProperty(example = "연락처")
    private String number;
}