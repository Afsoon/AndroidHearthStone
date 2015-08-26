package com.said.data.api;

import retrofit.ErrorHandler;
import retrofit.RetrofitError;

/**
 * Created by Said on 18/8/15.
 */
public class RetrofitErrorHandler implements ErrorHandler {


    @Override
    public Throwable handleError(RetrofitError cause) {
        if(cause.getKind().equals(RetrofitError.Kind.NETWORK)){
            return cause;
        }
        return cause;
    }
}
