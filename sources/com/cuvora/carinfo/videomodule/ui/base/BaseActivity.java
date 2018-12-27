package com.cuvora.carinfo.videomodule.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import com.crashlytics.android.answers.Answers;
import com.crashlytics.android.answers.CustomEvent;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

public abstract class BaseActivity extends AppCompatActivity {
    /* renamed from: o */
    public static final C1597a f21880o = new C1597a();
    /* renamed from: n */
    private HashMap f21881n;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.base.BaseActivity$a */
    public static final class C1597a {
        private C1597a() {
        }

        /* renamed from: a */
        public final void m6127a(String str) {
            C2885g.m13910b(str, "screenName");
            Answers.getInstance().logCustom((CustomEvent) new CustomEvent("Screen Visible").putCustomAttribute("screen_name", str));
        }
    }

    /* renamed from: c */
    public View mo5039c(int i) {
        if (this.f21881n == null) {
            this.f21881n = new HashMap();
        }
        View view = (View) this.f21881n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21881n.put(Integer.valueOf(i), view);
        return view;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }
}
