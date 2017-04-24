package com.mkyong.rest.client;

import com.mkyong.ClientConversationSearch;
import com.mkyong.rest.CommunicationType;
import com.mkyong.rest.Conversation;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.ObjectMapper;

import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.util.List;

public class JerseyClientConversationsSearch {

  public static void main(String[] args) throws IOException {

//	try {
//
//		ClientConfig clientConfig = new DefaultClientConfig();
//
//		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
//
//		Client client = Client.create(clientConfig);
//
		ClientConversationSearch clientConversationSearch = new ClientConversationSearch();
		clientConversationSearch.getCommunicationTypeIncludes().add(CommunicationType.CHAT.name());
//		clientConversationSearch.setPeriod(Period.ofMonths(2));
		clientConversationSearch.setTimeZone("Europe/Prague");
//
//		WebResource webResource = client
////						.resource("http://10.17.2.119:8102/api/v2/conversations/client-search");
////						.resource("http://10.17.2.57:8080/client-search/rest/json/post/clientsearch");
//						.resource("http://localhost:8080/rest/json/post/clientsearch");
//		ClientResponse response = webResource.accept("application/json").type("application/json")
//						.header("Authorization", "Bearer c3095e5b-c820-4bbd-8496-bf261e3c8590").post(ClientResponse.class, clientConversationSearch);
//
//		if (response.getStatus() != 200) {
//			throw new RuntimeException("Failed : HTTP error code : "
//			     + response.getStatus());
//		}
//
//		System.out.println("Output from Server .... \n");
//		String conversationSearchJson = response.getEntity(String.class);
//		System.out.println(conversationSearchJson);
//
//	  } catch (Exception e) {
//
//		e.printStackTrace();
//
//	  }

		Client client = Client.create();
		WebResource webResource2 = client.resource("http://10.17.1.56:8102/api/v2/conversations/client-search");
//		WebResource webResource2 = client.resource("http://localhost:8080/rest/json/post/clientsearch");
		ObjectMapper objectMapper = new ObjectMapper();
		String s = objectMapper.writeValueAsString(clientConversationSearch);
		ClientResponse response2 = webResource2.type(MediaType.APPLICATION_JSON)
//						.accept(MediaType.APPLICATION_JSON_TYPE)
						.header("Authorization", "Bearer 08a72740-4b18-4072-bf5d-79429ac9e704")
						.post(ClientResponse.class, s);
		if (response2.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : " + response2.getStatus());
		}

		List<Conversation> output2 = response2.getEntity(List.class);
		System.out.println("\n============getFtoCResponse============");
		System.out.println(output2);

//		String payload = "\r\n{\r\n\"query\": \"google \",\r\n\"rows\": 50,\r\n\"return_docs\": true,\r\n\"is_facet\": true\r\n}"; //this is escapped json string in single line
//		ClientConfig config = new ClientConfig();
//		Client client = ClientBuilder.newClient(config);
//		WebTarget target = client.target("http://localhost:7400/searchws/search/getresults");
//		Response response = target.request().accept(MediaType.APPLICATION_JSON).post(Entity.entity(payload, MediaType.APPLICATION_JSON), Response.class);
////		processresponse(response); //This could be any method which processes your json response and gets you your desired data.
//		System.out.println(response.readEntity(String.class));

	}
}