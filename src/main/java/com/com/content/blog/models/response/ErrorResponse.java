package com.com.content.blog.models.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * @author : ycd63
 * @packageName : com.com.content.blog.model
 * @date : 2021-08-09
 * @Time : 오후 1:30
 * @description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2021-08-09           ycd63                 최초 생성
 */
@Schema(description = "에러 Response")
@Getter
@Setter
public class ErrorResponse extends BasicResponse {

    @Schema(description = "에러 메시지", defaultValue = "")
    private String errorMessage;

    @Schema(description = "에러코드", allowableValues = {"404", "500"})
    private String errorCode;

    public ErrorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
        this.errorCode = "404";
    }
    public ErrorResponse(String errorMessage, String errorCode) {
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }
}
