package com.jiyun.new_day01.persenters;

import com.jiyun.new_day01.models.Callbackers;
import com.jiyun.new_day01.models.ModelsImpl;
import com.jiyun.new_day01.models.ModelsInf;
import com.jiyun.new_day01.views.ViewsInf;

/**
 * Created by Brother Chen on 2017/12/19.
 */

public class PersentersImpl  implements PersentersInf,Callbackers{
    private ModelsInf modelsInf;
    private ViewsInf viewsInf;
    public PersentersImpl(ViewsInf viewsInf){
        this.modelsInf=new ModelsImpl();
        this.viewsInf=viewsInf;
    }


    @Override
    public void ModelToPersneters() {
            modelsInf.sendCall(this);
    }

    @Override
    public void sendStirng(String string) {
        viewsInf.showData(string);

    }
}
