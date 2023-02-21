package com.shark.aio;

import com.shark.aio.video.MediaUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan(basePackages = {"com.shark.aio.users.mapper", "com.shark.aio.project.mapper", "com.shark.aio.base.mapper"})
public class AioApplication {

    public static void main(String[] args) {
        SpringApplication.run(AioApplication.class, args);
    }

}
