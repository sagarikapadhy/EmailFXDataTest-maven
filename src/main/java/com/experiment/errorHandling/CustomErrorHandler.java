package com.experiment.errorHandling;


/**
 * Can be used to write custom error messages as this is extending RuntimeException
 * like for NullPointerException, if(errorMessage instanceOf NullPointerException)
 */

public class CustomErrorHandler extends RuntimeException {

    public CustomErrorHandler(String errorMessage) {
        super(errorMessage);


    }

    public CustomErrorHandler() {
    }
}
