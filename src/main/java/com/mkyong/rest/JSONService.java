package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.Track;
import com.mkyong.rest.client.ComplexTrackObject;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.List;

@Path("/json/metallica")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}

	@POST
	@Path("/post/entity")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSONforEntity(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();

	}

	@POST
	@Path("/post/entity/list")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSONforListOfEntities(List<Track> trackList) {
		String output = "consumeJSONList Client : " + trackList.toString() + "\n\n";
		return Response.status(200).entity(output).build();
	}

	@POST
	@Path("/post/entity/pojo")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSONPojo(ComplexTrackObject trackObject) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		String output = objectMapper.writeValueAsString(trackObject);;
		return Response.status(200).entity(output).build();
	}

	
}