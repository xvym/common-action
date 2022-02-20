package cn.com.xvym.commonaction.web.configuration;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Xv
 * @Date: 2022/2/21 0:31
 * @Description:
 */
@Configuration
@MapperScan("cn.com.xvym.**.mapper")
public class MyBatisConfiguration {
}
