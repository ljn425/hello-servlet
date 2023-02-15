package hello.servlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan // 서블릿 자동 Bean 등록
@SpringBootApplication
public class ServletApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication.class, args);
	}

	// spring.mvc.view.prefix=/WEB-INF/views/
	// spring.mvc.view.suffix=.jsp properties 에 등록시 아래 메소드 자동 등록후 호출
	//	@Bean
	//	ViewResolver internalResourceViewResolver() {
	//		return new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
	//	}
}
