package org.blog.jaxrs.resources;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/v1")
public class welcome {

		public welcome() {
			// TODO Auto-generated constructor stub
		}
	@GET
	@Path("/greet")
	@Produces(MediaType.APPLICATION_JSON	)
	public String hello() {
		 
		System.out.println("inside hello()");
		
		return "hi sandeep";
	}
}
