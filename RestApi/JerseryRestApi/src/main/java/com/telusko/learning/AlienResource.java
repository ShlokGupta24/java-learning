package com.telusko.learning;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.Arrays;
import java.util.List;

@Path("aliens") //To set path for routes in website or tomcat server
public class AlienResource {
    AlienRepository repo=new AlienRepository();   //Creating a AlienRepository object to fetch the data
    @GET   //Indicate to use this method when http call request came. It use to fetch the resource
    @Produces(MediaType.APPLICATION_XML) //To determine what we are returning in this method
    public List<Aliens> getAliens(){
        System.out.println("Get alien called");
    return repo.getAliens();
}

@GET
@Path("alien/{id}")
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})  //This is content negotiation, as Produces works as an array, so it get request in multiple format according to the requirement from user or client.
public Aliens getAlien(@PathParam("id") int id){  //PathParam is used to get the value of id from path to the input variable id
        return repo.getAlien(id);
}

 @POST  //It is use for creating a resource.
 @Path("alien")  //To get the path to be 'aliens/alien' to access it.
 @Consumes(MediaType.APPLICATION_XML)
 @Produces(MediaType.APPLICATION_XML)
 public Aliens createAliens(Aliens a1){

     System.out.println(a1.toString());
     repo.create(a1); //It will accept the data a1 and add the data to the repository
        return a1;
 }
}
