package com.codeinsidecoffee.paypalpaymentapi.dao;



import com.codeinsidecoffee.paypalpaymentapi.model.PayPalConst;
import com.codeinsidecoffee.paypalpaymentapi.model.PaymentInfoBean;
import com.codeinsidecoffee.paypalpaymentapi.model.TokenBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;


public interface PayPalRetroFitService {

    @FormUrlEncoded
    @POST(PayPalConst.TOKEN_FILE_NAME)
    Call<TokenBean> tokenInfo(@Header("Authorization") String authHeader,
                              @Field(PayPalConst.GRANT_TYPE) String grant_type);

    @GET(PayPalConst.PAYMENT_INFO_FILE_NAME+"{payment_id}")
    Call<PaymentInfoBean> paymnentInfo(@Header("Authorization") String authToken,
                                       @Path("payment_id") String payment_id);

}
