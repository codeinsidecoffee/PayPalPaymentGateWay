package com.codeinsidecoffee.paypalpaymentapi.dao;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import com.codeinsidecoffee.paypalpaymentapi.model.PaymentInfoBean;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PaymentInfo extends AsyncTask<Void,Void,Void> {
    Context context;
    String payment_id;
    String access_token;
    OnPaymentInfoListener listener;
    private String TAG="PaymentInfo";

    public PaymentInfo(Context context, String payment_id,String access_token, OnPaymentInfoListener listener) {
        this.context = context;
        this.payment_id = payment_id;
        this.access_token=access_token;
        this.listener = listener;
    }

    public interface OnPaymentInfoListener{
        void onPaymentInfo(PaymentInfoBean paymentInfoBean);
    }
    @Override
    protected Void doInBackground(Void... voids) {
        PayPalRetroFitService retroFitService= PayPalRetrofitClient.getAccessToken();
        String authToken ="Bearer "+access_token;
        Call<PaymentInfoBean> call=retroFitService.paymnentInfo(authToken,payment_id);
        call.enqueue(new Callback<PaymentInfoBean>() {
            @Override
            public void onResponse(Call<PaymentInfoBean> call, Response<PaymentInfoBean> response) {

                if(response.isSuccessful()){
                    PaymentInfoBean paymentInfoBean=response.body();
                    listener.onPaymentInfo(paymentInfoBean);
                }

            }

            @Override
            public void onFailure(Call<PaymentInfoBean> call, Throwable t) {
                Log.e(TAG, "onFailure: "+t.toString() );
            }
        });
        return null;
    }
}
