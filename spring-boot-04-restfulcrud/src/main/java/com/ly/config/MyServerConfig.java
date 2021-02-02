package com.ly.config;

import com.ly.filter.MyFilter;
import com.ly.listener.MyListener;
import com.ly.serverlet.MyServerlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyServerConfig {

    //配置嵌入式的servlet容器
//    EmbeddedServletContainCustomizer

    //注册三大组件
    //注册servlet
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean servletRegistrationBean =
                new ServletRegistrationBean<>(new MyServerlet(),"/myServlet");
        return servletRegistrationBean;
    }
    //注册Filter
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet","/hello"));
        return filterRegistrationBean;
    }

    //注册listener
    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean<MyListener> myListenerServletListenerRegistrationBean =
                new ServletListenerRegistrationBean<>(new MyListener());
        return myListenerServletListenerRegistrationBean;
    }
}
