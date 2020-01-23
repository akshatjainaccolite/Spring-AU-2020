package com.example.demo;

import java.awt.PageAttributes.MediaType;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/apis")
public class empll{
 @GET
 @Produces("application/json")
 public String[] getuser() {
	 String str[]= {"AKSHAT","JAin"};
	return str;
	 
 }

 @PUT
 @Produces("application/json")
 @Path("/put/{name}")
 public String putuser(@PathParam("name")String name) {
	return name;
 }
 @DELETE
 @Path("/delete/{x}")
 @Produces("application/json")
 public String[] deluser(@PathParam("x") int in) {
	
	 String str[]= {"AKSHAT","JAin","Accolite"};
	 str[in]="";
		return str;
 }
@POST
@Produces("application/json")

@Path("/post/{id}")
public String postuser(@PathParam("id") String Id,String EmpName) {
	String str="";
	str="ID:   "+Id+ "Employeename  " +EmpName;
	return str;
	 
 }

 
}