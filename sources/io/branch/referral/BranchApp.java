package io.branch.referral;

import android.app.Application;
import android.content.Context;

public class BranchApp extends Application {
    public void onCreate() {
        super.onCreate();
        if (C2742i.m13287a((Context) this)) {
            Branch.m23407b((Context) this);
        } else {
            Branch.m23384a((Context) this);
        }
    }
}
