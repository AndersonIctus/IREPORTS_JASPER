package com.aulas.reports;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.web.support.servlet.SpringBootServletInitializer;

/**
 * 	Classe responsavel por inicializar o CONTEXTO do Servlet no Servidor !!
 * @author Anderson
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ReportsApplication.class);
	}
}
