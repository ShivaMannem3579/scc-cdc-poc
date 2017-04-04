package com.siva.poc;

import com.siva.poc.model.PersonToCheck;
import com.siva.poc.model.PersonToCheckResult;
import com.siva.poc.model.PersonToCheckV1;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by e056441 on 3/22/2017.
 */
@RestController
public class PersonController {
    @RequestMapping(value = "/check",
            method= RequestMethod.POST,
            consumes="application/json",
            produces="application/json")
    public PersonToCheckResult check(@RequestBody PersonToCheck personToCheck) {
        System.out.println("personToCheck details:::::::::::::::::"+personToCheck);

        if (personToCheck.age >= 18)
            return new PersonToCheckResult(personToCheck.getName(), "ADULT", "NO_REASON");

        return new PersonToCheckResult(personToCheck.getName(), "NOT AN ADULT", "AGE IS LESS THAN 18");
    }


    @RequestMapping(value = "/check/v1",
            method= RequestMethod.POST,
            consumes="application/json",
            produces="application/json")
    public PersonToCheckResult checkv1(@RequestBody PersonToCheckV1 personToCheckV1) {
        System.out.println("PersonToCheckV1 details:::::::::::::::::"+personToCheckV1);
        if(personToCheckV1.getDriversLicense() == null)
            return new PersonToCheckResult(personToCheckV1.getName(), "NOT AN ADULT", "DRIVERS LICENSE IS NOT VALID");
        if (personToCheckV1.age >= 18)
            return new PersonToCheckResult(personToCheckV1.getName(), "ADULT", "NO_REASON");

        return new PersonToCheckResult(personToCheckV1.getName(), "NOT AN ADULT", "AGE IS LESS THAN 18");
    }
}
