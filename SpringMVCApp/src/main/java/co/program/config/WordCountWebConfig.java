package co.program.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WordCountWebConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		XmlWebApplicationContext webAC= new XmlWebApplicationContext();
		webAC.setConfigLocation("classpath:appcofig.xml");
		DispatcherServlet ds= new DispatcherServlet(webAC);
		
		ServletRegistration.Dynamic servlet= servletContext.addServlet("MyDS",ds);
		servlet.setLoadOnStartup(1);
		//servlet.addMapping("/wordcount.com/");
	}

}
