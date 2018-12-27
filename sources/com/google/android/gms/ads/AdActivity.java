package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzabw;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzkd;

@KeepForSdkWithMembers
public class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    /* renamed from: a */
    private zzabw f7589a;

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f7589a = zzkd.m10710b().m10705a((Activity) this);
        if (this.f7589a == null) {
            zzaok.m10006d("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            this.f7589a.onCreate(bundle);
        } catch (Bundle bundle2) {
            zzaok.m10006d("#007 Could not call remote method.", bundle2);
            finish();
        }
    }

    protected void onRestart() {
        super.onRestart();
        try {
            if (this.f7589a != null) {
                this.f7589a.onRestart();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            finish();
        }
    }

    protected void onStart() {
        super.onStart();
        try {
            if (this.f7589a != null) {
                this.f7589a.onStart();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            finish();
        }
    }

    protected void onResume() {
        super.onResume();
        try {
            if (this.f7589a != null) {
                this.f7589a.onResume();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            finish();
        }
    }

    protected void onPause() {
        try {
            if (this.f7589a != null) {
                this.f7589a.onPause();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.f7589a != null) {
                this.f7589a.onSaveInstanceState(bundle);
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStop() {
        try {
            if (this.f7589a != null) {
                this.f7589a.onStop();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    protected void onDestroy() {
        try {
            if (this.f7589a != null) {
                this.f7589a.onDestroy();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    /* renamed from: a */
    private final void m8743a() {
        if (this.f7589a != null) {
            try {
                this.f7589a.zzax();
            } catch (Throwable e) {
                zzaok.m10006d("#007 Could not call remote method.", e);
            }
        }
    }

    public void setContentView(int i) {
        super.setContentView(i);
        m8743a();
    }

    public void setContentView(View view) {
        super.setContentView(view);
        m8743a();
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        m8743a();
    }

    public void onBackPressed() {
        boolean z = true;
        try {
            if (this.f7589a != null) {
                z = this.f7589a.zzou();
            }
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
        }
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.f7589a.onActivityResult(i, i2, intent);
        } catch (Throwable e) {
            zzaok.m10006d("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.f7589a.zzq(ObjectWrapper.m26019a((Object) configuration));
        } catch (Configuration configuration2) {
            zzaok.m10006d("#007 Could not call remote method.", configuration2);
        }
    }
}
