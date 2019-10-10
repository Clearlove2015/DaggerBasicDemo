package com.odbpo.fenggo.dagger_basic_demo.net;

import android.content.Context;
import android.widget.Toast;

public class TestService {

    private Context context;

    public TestService(Context context) {
        this.context = context;
    }

    public void test(){
        System.out.println("zc TestService test ");
        Toast.makeText(context,"test",Toast.LENGTH_SHORT).show();
    }

}
