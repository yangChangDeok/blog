package com.com.content.blog.filter;

import com.navercorp.lucy.security.xss.servletfilter.XssEscapeServletFilter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : ycd63
 * @packageName : com.com.content.blog.filter
 * @date : 2021-08-02
 * @Time : 오전 10:14
 * @description :
 * ===========================================================
 * DATE                  AUTHOR                  NOTE
 * -----------------------------------------------------------
 * 2021-08-02           ycd63                 최초 생성
 */
@Schema(description = "Xss Filter")
@Component
public class XssFilter {

    @Bean
    public FilterRegistrationBean xssEscapeServletFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new XssEscapeServletFilter());
        registrationBean.setOrder(1);
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

}
