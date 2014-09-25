package com.china3s.android.util;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;

import com.china3s.android.R;

/**
 * Created by xuyujian on 2014/9/23.
 */
public class SkipToUtil {

    public static String BUNDLE = "BUNDLE";

    public static void skipTo(Activity ctx,Class cls){
        skipTo(ctx,cls,null,false);
    }

    public static void skipTo(Fragment frg,Class cls){
        skipTo(frg.getActivity(),cls);
    }

    public static void skipTo(Activity ctx,Class cls,Bundle bundle,boolean isFinish){
        Intent intent = new Intent(ctx,cls);
        if (bundle != null){
            intent.putExtra(BUNDLE,bundle);
        }
        ctx.startActivity(intent);
        if (isFinish){
            ctx.finish();
        }
        ctx.overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
    }
}
