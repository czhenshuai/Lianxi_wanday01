package com.jiyun.new_day01.models;

import com.jiyun.new_day01.Utils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by Brother Chen on 2017/12/19.
 */

public class ModelsImpl implements ModelsInf {

    @Override
    public void sendCall(final Callbackers callbackers) {
        Utils.getInstance().sendGet("", new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                callbackers.sendStirng(string);
            }
        });
    }
}
