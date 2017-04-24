package com.mkyong.rest.client;

import com.mkyong.ClientConversationSearch;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import java.time.Period;
import java.util.List;

public class JerseyClientConversationsSearch {

  public static void main(String[] args) {

	try {

		ClientConfig clientConfig = new DefaultClientConfig();

		clientConfig.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);

		Client client = Client.create(clientConfig);

		ClientConversationSearch clientConversationSearch = new ClientConversationSearch();
		clientConversationSearch.setComment("comment");
//		clientConversationSearch.setPeriod(Period.ofMonths(2));
		clientConversationSearch.setTimeZone("Europe/Prague");

		WebResource webResource = client
						.resource("http://10.17.1.56:8102/api/v2/conversations/client-search");
//						.resource("http://10.17.2.57:8080/client-search/rest/json/post/clientsearch");
//						.resource("http://localhost:8080/rest/json/post/clientsearch");
		ClientResponse response = webResource.accept("application/json").type("application/json")
						.header("Authorization", "Bearer c3095e5b-c820-4bbd-8496-bf261e3c8590").post(ClientResponse.class, clientConversationSearch);

		if (response.getStatus() != 200) {
			throw new RuntimeException("Failed : HTTP error code : "
			     + response.getStatus());
		}

		System.out.println("Output from Server .... \n");
		String conversationSearchJson = response.getEntity(String.class);
		System.out.println(conversationSearchJson);

	  } catch (Exception e) {

		e.printStackTrace();

	  }

	}
}