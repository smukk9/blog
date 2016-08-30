package org.blog.jaxrs.resources;

import javax.ws.rs.ApplicationPath;

import org.apache.log4j.Logger;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("api")
public class jaxrsApplication extends ResourceConfig{
	
	final static Logger logger = Logger.getLogger(jaxrsApplication.class);
	public jaxrsApplication(){
		
		super();
	
		packages("org.blog.jaxrs.resources");
		logger.debug("JaxRS is Initilized");
	}

}
