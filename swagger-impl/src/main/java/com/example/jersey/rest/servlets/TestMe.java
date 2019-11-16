package com.example.jersey.rest.servlets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@Path("testme")
@Tag(name = "Example")
public class TestMe {
	
    @GET
    @ApiResponse(
            responseCode = "200",
            description = "MOFO."
        )
    public String getTestMe() {

        return "FUCK YOU MOFO";
    }

}
