package com.com.content.blog.models.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

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
@Schema(description = "일반 Response")
@Getter
@Setter
public class  CommonResponse<T> extends BasicResponse {
    @Schema(description = "조회 결과 개수", defaultValue = "0")
    private int count;

    @Schema(description = "조회 결과")
    private T data;

    public CommonResponse(T data) {
        this.data = data;
        if(data instanceof List) {
            this.count = ((List<?>)data).size();
        } else {
            this.count = 1;
        }
    }

}
