package com.codeinsidecoffee.paypalpaymentapi.dao;








import com.codeinsidecoffee.paypalpaymentapi.model.PayPalConst;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class PayPalRetrofitClient {

    public static PayPalRetroFitService getAccessToken(){

        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(PayPalConst.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        PayPalRetroFitService retroFitService= retrofit.create(PayPalRetroFitService.class);


        return retroFitService;
    }


}
