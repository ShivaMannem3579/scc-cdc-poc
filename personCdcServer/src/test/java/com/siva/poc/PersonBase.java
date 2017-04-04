package com.siva.poc;

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public class PersonBase {
	
	@Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(new PersonController());
    }


    public void assertThatRejectReasonIsNull(Object rejectReason) {
        assert rejectReason == null;
    }

}
