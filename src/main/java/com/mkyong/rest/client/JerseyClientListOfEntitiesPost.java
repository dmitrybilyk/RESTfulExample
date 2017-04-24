//package com.mkyong.rest.client;
//
//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;
//import com.sun.jersey.api.client.config.ClientConfig;
//import com.sun.jersey.api.client.config.DefaultClientConfig;
//import com.sun.jersey.api.json.JSONConfiguration;
//import org.codehaus.jackson.map.ObjectMapper;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class JerseyClientListOfEntitiesPost {
//
//  public static void main(String[] args) {
//
//	try {
//
////		Client client = Client.create();
//
////		String input = "{\"singer\":\"Metallica\",\"title\":\"Fade To Black\"}";
//		TrackClient track1 = new TrackClient();
//		track1.setSinger("dima");
//		track1.setTitle("best");
//		TrackClient track2 = new TrackClient();
//		track2.setSinger("andrey");
//		track2.setTitle("best2");
//		List<TrackClient> trackClients = new ArrayList<TrackClient>();
//		trackClients.add(track1);
//		trackClients.add(track2);
//
////		ObjectMapper objectMapper = new ObjectMapper();
////		String inputJson = objectMapper.writeValueAsString(input);
//
//		ClientConfig clientConfig = new DefaultClientConfig();
//
//		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
//
//		com.sun.jersey.api.client.Client client = com.sun.jersey.api.client.Client.create(clientConfig);
//
//		WebResource webResource = client
//						.resource("http://localhost:8080/rest/json/post/entity/list");
//		ClientResponse response = webResource.accept("application/json").type("application/json").post(ClientResponse.class, trackClients);
//
////		ClientResponse response = webResource.type("application/json")
////		   .post(ClientResponse.class, inputJson);
//
//		if (response.getStatus() != 200) {
//			throw new RuntimeException("Failed : HTTP error code : "
//			     + response.getStatus());
//		}
//
//		System.out.println("Output from Server .... \n");
//		String output = response.getEntity(String.class);
//		System.out.println(output);
//
//	  } catch (Exception e) {
//
//		e.printStackTrace();
//
//	  }
//
//	}
//}