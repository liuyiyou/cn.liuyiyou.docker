package cn.liuyiyou.docker;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@RestController
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@GetMapping("hello")
	public String hello(){
	    log.info("这是新的");
        jdbcTemplate.execute("CREATE  TABLE  t_test( NAME VARCHAR(20)) ");
		return "Hello";
	}
}
