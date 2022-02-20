package cn.com.xvym.commonaction.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author: Xv
 * @Date: 2022/2/21 0:34
 * @Description:
 */
@SpringBootApplication(scanBasePackages = "cn.com.xvym.commonaction")
public class CommonActionApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CommonActionApplication.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CommonActionApplication.class);
    }

}
