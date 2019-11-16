package com.example.jersey.rest.servlets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.json.simple.JSONObject;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

@Path("panama")
@Produces(MediaType.APPLICATION_JSON)
public class Panama {
//
	@GET
    @ApiResponse(
            responseCode = "200",
            content = @Content(
                mediaType = "application/json"
            ),
            description = "panamajson"
        )
	public JSONObject getPanama() {
		JSONObject jo = new JSONObject();
		
		jo.put("NAME", "JAMES B");
		jo.put("AGE", "45");
		return jo;
	}
	
	
}
