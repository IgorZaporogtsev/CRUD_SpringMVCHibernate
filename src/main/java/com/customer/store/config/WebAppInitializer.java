package com.customer.store.config;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


// AbstractAnnotationConfigDispatcherServletInitializer - для настройки SpringMVC конфигурации
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	// Этот метод должен содержать конфигурации которые инициализируют Beans
	// для инициализации бинов у нас использовалась аннотация @Bean
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {
				AppConfig.class
		};
	}

	// Тут добавляем конфигурацию, в которой инициализируем ViewResolver в классе AppConfig.class
	@Override
	protected Class<?>[] getServletConfigClasses() {
		//return null;
		return new Class[] {
				AppConfig.class
		};
	}
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
