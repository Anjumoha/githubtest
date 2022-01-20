package com.student;

import org.apache.coyote.http11.AbstractHttp11Protocol;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainCode extends SpringBootServletInitializer {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			SpringApplication.run(MainCode.class, args);
			System.out.println("\n\n\nSUCCESS");
		}
		
		@Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(MainCode.class);
	    }
		
		 @Bean
		    public TomcatEmbeddedServletContainerFactory tomcatEmbedded() {

		        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();

		        tomcat.addConnectorCustomizers((TomcatConnectorCustomizer) connector -> {
		            if ((connector.getProtocolHandler() instanceof AbstractHttp11Protocol<?>)) {
		                //-1 means unlimited
		                ((AbstractHttp11Protocol<?>) connector.getProtocolHandler()).setMaxSwallowSize(-1);
		            }
		        });

		        return tomcat;

		    }

	}



