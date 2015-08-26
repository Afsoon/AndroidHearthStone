package com.said.data.api;

import retrofit.RequestInterceptor;

/**
 * Created by Said on 11/8/15.
 */
public class HearthStoneInterceptor implements RequestInterceptor {

    private final String HEADER_KEY = "X-Mashape-Key";
    private final String HEADER_VALUE = "mjWfULQkCcmshH6bfB5TVkaJA4yWp1k0Axwjsn6GNc3YfcdAbQ";

    @Override
    public void intercept(RequestFacade request) {
        request.addHeader(HEADER_KEY, HEADER_VALUE);
    }
}
