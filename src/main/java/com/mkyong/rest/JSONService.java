package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mkyong.ClientConversationSearch;
import com.mkyong.Track;
import com.mkyong.rest.client.ComplexTrackObject;
import com.mkyong.rest.client.TrackClient;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Path("/json")
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

	@GET
	@Path("/post/entity/jaxb")
//	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ComplexTrackObject createTrackInJSONJaxb() throws IOException {
		TrackClient track1 = new TrackClient();
		track1.setSinger("dima");
		track1.setTitle("best");
		TrackClient track2 = new TrackClient();
		track2.setSinger("andrey");
		track2.setTitle("best2");
		List<TrackClient> trackClients = new ArrayList<TrackClient>();
		trackClients.add(track1);
		trackClients.add(track2);
		return new ComplexTrackObject("ddd", 30, Arrays.asList("dfsd", "dfdsfffff"), trackClients);
	}


//	@POST
//	@Path("/post/clientsearch")
//	@Consumes(MediaType.APPLICATION_JSON)
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<String> conversationsClientSearch(ClientConversationSearch clientConversationSearch) throws IOException {
//		return Arrays.asList("some link", "some link2", "some link3");
//	}
@POST
	@Path("/post/clientsearch")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public String conversationsClientSearch(ClientConversationSearch clientConversationSearch) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.writeValueAsString(clientConversationSearch);
	}

}