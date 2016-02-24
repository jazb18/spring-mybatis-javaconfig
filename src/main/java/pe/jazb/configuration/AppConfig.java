package pe.jazb.configuration;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "pe.jazb")
public class AppConfig extends WebMvcConfigurerAdapter {

	@Bean
	public UrlBasedViewResolver setupViewResolver() {

		UrlBasedViewResolver resolver = new UrlBasedViewResolver();

		resolver.setPrefix("WEB-INF/views/");
		resolver.setSuffix(".jsp");
		resolver.setViewClass(JstlView.class);
		return resolver;
	}
	
	// Configuración para los Json y resources
	
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
	
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(mappingJackson2HttpMessageConverter());
		converters.add(new StringHttpMessageConverter(Charset.forName("UTF-8")));
	}
	
	@Bean
	public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(
				new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false));
		return converter;
	}
		
}
