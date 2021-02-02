package com.ly;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(SpringBoot03LoggingApplicationTests.class);
	@Test
	void contextLoads() {

//		日志级别 又低到高
//		trace<debug<info<warn<error
		logger.trace("trace日志");
		logger.debug("debug");
//		springBoot 默认设置的是info级别的
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
	}

}
