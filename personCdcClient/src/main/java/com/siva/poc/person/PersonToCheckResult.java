package com.siva.poc.person;

/**
 * Created by e056441 on 3/22/2017.
 */
public class PersonToCheckResult {

    public String name;

    public String message;

    public String rejectReason;

    public PersonToCheckResult(){
    }

    public PersonToCheckResult(String name, String message, String rejectReason) {
        this.name = name;
        this.message = message;
        this.rejectReason = rejectReason;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }
}