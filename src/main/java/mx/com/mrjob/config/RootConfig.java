package mx.com.mrjob.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages= {"com.mx.mex"}, //PAQUETE PRINCIPAL EN DONDE SPRING BUSCARA NUESTRAS CLASES CON ANOTACIONES
excludeFilters={
	@ComponentScan.Filter(type= FilterType.ANNOTATION, value= EnableWebMvc.class) 
})//FILTRO PARA SPRING TOME AQUELLAS CLASES QUE LLEVEN ANOTACIONES O LA ANOTACION @EnableWebMvc
public class RootConfig {

}
