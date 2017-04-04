package com.siva.poc;

import com.siva.poc.person.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PersonClientApplication {

	private final RestTemplate restTemplate;
	
	private static final String PERSON_JSON = "application/json";

	private static final String PERSON_URL = "http://localhost:7878/check";

	private static final String PERSONV1_URL = "http://localhost:7878/check/v1";


	

	@Autowired
	public PersonClientApplication(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}


	public PersonToCheckResult personAdultCheck(Person person) {

		PersonToCheckRequest request = new PersonToCheckRequest(person);
		PersonToCheckResult response = sendRequestToUserLoginService(request);
		return response;
	}

	private PersonToCheckResult sendRequestToUserLoginService(
			PersonToCheckRequest request) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(HttpHeaders.CONTENT_TYPE, PERSON_JSON);

		// tag::client_call_server[]
		ResponseEntity<PersonToCheckResult> response = restTemplate.exchange(PERSON_URL, HttpMethod.POST, new HttpEntity<>(request,httpHeaders),PersonToCheckResult.class);
		// end::client_call_server[]
		System.out.println("response body = "+response.getBody());
		return response.getBody();
	}



	public PersonToCheckResult personAdultCheckV1(PersonV1 personV1) {

		PersonToCheckRequestV1 request = new PersonToCheckRequestV1(personV1);
		PersonToCheckResult response = sendRequestToPersonService(request);
		return response;
	}

	private PersonToCheckResult sendRequestToPersonService(
			PersonToCheckRequestV1 request) {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add(HttpHeaders.CONTENT_TYPE, PERSON_JSON);

		// tag::client_call_server[]
		ResponseEntity<PersonToCheckResult> response = restTemplate.exchange(PERSONV1_URL, HttpMethod.POST, new HttpEntity<>(request,httpHeaders),PersonToCheckResult.class);
		// end::client_call_server[]
		System.out.println("response body = "+response.getBody());
		return response.getBody();
	}


	public static void main(String[] args) {
		SpringApplication.run(PersonClientApplication.class, args);
	}
}
