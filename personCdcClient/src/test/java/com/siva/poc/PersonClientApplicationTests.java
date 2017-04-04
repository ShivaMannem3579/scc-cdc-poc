package com.siva.poc;

import static org.assertj.core.api.Assertions.assertThat;

import com.siva.poc.person.Person;
import com.siva.poc.person.PersonToCheckResult;
import com.siva.poc.person.PersonV1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@AutoConfigureStubRunner(ids = {"com.siva.poc:personCdcServer:+:stubs:7878"}, workOffline = true)
@DirtiesContext
public class PersonClientApplicationTests {

	@Autowired
	private PersonClientApplication clientApplication;

	@Test
	public void contextLoads() {
	}

	
	@Test
	public void shouldSuccessfullyTestAdult() {
		// given:
		Person person = new Person("vinay", 21);
	    // when:
		PersonToCheckResult userloginResult = clientApplication.personAdultCheck(person);
		// then:
		assertThat(userloginResult.getMessage()).isEqualTo("ADULT");
		 assertThat(userloginResult.getRejectReason()).isEqualTo("NO_REASON");
	}


	@Test
	public void shouldSuccessfullyTestNotValidAdult() {
		// given:
		Person person = new Person("vinay", 15);
		// when:
		PersonToCheckResult userloginResult = clientApplication.personAdultCheck(person);
		// then:
		assertThat(userloginResult.getMessage()).isEqualTo("NOT AN ADULT");
		assertThat(userloginResult.getRejectReason()).isEqualTo("AGE IS LESS THAN 18");
	}

	@Test
	public void shouldSuccessfullyTestAdultV1() {
		// given:
		PersonV1 person = new PersonV1("vinay", 21, "abcd");
	    // when:
		PersonToCheckResult checkResult = clientApplication.personAdultCheckV1(person);
		// then:
		assertThat(checkResult.getMessage()).isEqualTo("ADULT");
		 assertThat(checkResult.getRejectReason()).isEqualTo("NO_REASON");
	}


	@Test
	public void shouldSuccessfullyTestNotValidAdultV1() {
		// given:
		PersonV1 person = new PersonV1("vinay", 21, null);
		// when:
		PersonToCheckResult checkResult = clientApplication.personAdultCheckV1(person);
		// then:
		assertThat(checkResult.getMessage()).isEqualTo("NOT AN ADULT");
		assertThat(checkResult.getRejectReason()).isEqualTo("DRIVERS LICENSE IS NOT VALID");
	}


}
