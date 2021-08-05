package org.sangeeta.belong.telephone;

import org.sangeeta.belong.telephone.service.CustomerService;
import org.sangeeta.belong.telephone.service.CustomerServiceImpl;

import com.google.gson.Gson;

import jakarta.annotation.Resource;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * Root resource (exposed at "numberresource" path)
 */
@Path("numberresource")
@Resource
public class NumberResource {
	
	
	private final CustomerService customerService;
	
	/*
	 * @Inject public NumberResource(CustomerService customerService) {
	 * this.customerService = customerService; }
	 */
	
	public NumberResource() {
		customerService = new CustomerServiceImpl();
	}
    /**
     * Method to get all telephone numbers request. The returned object will be sent
     * to the client as "application/json" media type.
     *
     * @return String that will be returned as application/json response.
     */
    @GET
    @Path("numbers")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllNumbers() {
    	Gson gson = new Gson();	
    	
		String jsonString = gson.toJson(customerService.getAllPhoneNmubers());
		return Response.status(Response.Status.OK).entity(jsonString).build();
    }
    
    @GET
    @Path("numbersbyid")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllNumbers(@HeaderParam(value = "id") String id) {
    	Gson gson = new Gson();	
    	
		String jsonString = gson.toJson(customerService.getCustPhoneNums(id));
		return Response.status(Response.Status.OK).entity(jsonString).build();
    }
    
    @PUT
    @Path("activate")
    @Produces(MediaType.APPLICATION_JSON)
    public Response activateNumber(@HeaderParam(value = "id") String id,
    		@HeaderParam(value = "num") String teleNum) {
    	Gson gson = new Gson();	
    	String jsonString;
    	if (customerService.activateNumber(id, teleNum) == 1)
    		jsonString = gson.toJson("Success");
    	else 
    		jsonString = gson.toJson("Failed");
		return Response.status(Response.Status.OK).entity(jsonString).build();
    }
    
    
}
