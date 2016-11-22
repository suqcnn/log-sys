package cn.yunyichina.log.service.collectionNode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/14 18:13
 * @Description:
 */
@EnableWebMvc
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"cn.yunyichina.log.service.collectionNode"})
public class Bootstrap {

    public static void main(String[] args) {
        SpringApplication.run(Bootstrap.class, args);
    }
}
