package com.sing;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author songbo
 * @since 2022-08-23
 */
@SpringBootApplication
@ServletComponentScan
public class SpringbootWebApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebApplication.class, args);
	}
	/* 或者启动如下方式，SpringbootWebApplication、servlet上不需要添加注解
    @Bean
    public ServletRegistrationBean<MyServlet> getServletRegistrationBean(){
        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<>(new MyServlet());
         ArrayList<String> url = new ArrayList<>();
        url.add("/myServlet");
        bean.setUrlMappings(url);
        bean.setLoadOnStartup(1);
        return bean;
    }
    */
}
