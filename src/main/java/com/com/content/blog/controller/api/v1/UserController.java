package com.com.content.blog.controller.api.v1;

import com.com.content.blog.constant.Common;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ycd63
 * @packageName : com.com.content.blog.controller.api.v1
 * @date : 2021-08-09
 * @Time : 오후 2:26
 * @description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2021-08-09           ycd63                 최초 생성
 */
//@RequiredArgsConstructor
@Tag(name = "user", description = "사용자 API")
@RequestMapping(value = Common.SUPPORT_VERSION+"/users")
@RestController
public class UserController {
}
