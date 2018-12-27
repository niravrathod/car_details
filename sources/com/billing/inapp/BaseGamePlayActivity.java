package com.billing.inapp;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.billing.inapp.C1118b.C1106b;
import com.billing.inapp.C1118b.C1108d;
import com.billing.inapp.p047a.C1102b;
import com.billing.inapp.p047a.C3347a;
import com.billing.inapp.p048b.C4778a;

public abstract class BaseGamePlayActivity extends FragmentActivity implements C1102b {
    /* renamed from: n */
    private C3347a f21674n;
    /* renamed from: o */
    private C4778a f21675o;
    /* renamed from: p */
    private C1104a f21676p;
    /* renamed from: q */
    private View f21677q;
    /* renamed from: r */
    private View f21678r;
    /* renamed from: s */
    private ImageView f21679s;
    /* renamed from: t */
    private ImageView f21680t;

    /* renamed from: com.billing.inapp.BaseGamePlayActivity$1 */
    class C10941 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ BaseGamePlayActivity f3601a;

        C10941(BaseGamePlayActivity baseGamePlayActivity) {
            this.f3601a = baseGamePlayActivity;
        }

        public void onClick(View view) {
            this.f3601a.onPurchaseButtonClicked(view);
        }
    }

    /* renamed from: com.billing.inapp.BaseGamePlayActivity$2 */
    class C10952 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ BaseGamePlayActivity f3602a;

        C10952(BaseGamePlayActivity baseGamePlayActivity) {
            this.f3602a = baseGamePlayActivity;
        }

        public void onClick(View view) {
            this.f3602a.onDriveButtonClicked(view);
        }
    }

    /* renamed from: h */
    protected abstract int mo4973h();

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(mo4973h());
        this.f21676p = new C1104a(this);
        if (getPackageName().startsWith("com.example")) {
            throw new RuntimeException("Please change the sample's package name!");
        }
        if (bundle != null) {
            this.f21675o = (C4778a) m28707f().mo291a("dialog");
        }
        this.f21677q = findViewById(C1106b.screen_wait);
        this.f21678r = findViewById(C1106b.screen_main);
        this.f21679s = (ImageView) findViewById(C1106b.free_or_premium);
        this.f21680t = (ImageView) findViewById(C1106b.gas_gauge);
        findViewById(C1106b.button_purchase).setOnClickListener(new C10941(this));
        findViewById(C1106b.button_drive).setOnClickListener(new C10952(this));
    }

    protected void onResume() {
        super.onResume();
        if (this.f21674n != null && this.f21674n.m17207b() == 0) {
            this.f21674n.m17209d();
        }
    }

    public void onPurchaseButtonClicked(View view) {
        Log.d("BaseGamePlayActivity", "Purchase button clicked.");
        if (this.f21675o == null) {
            this.f21675o = new C4778a();
        }
        if (m29832i() == null) {
            this.f21675o.show(m28707f(), "dialog");
            if (this.f21674n != null && this.f21674n.m17207b() > -1) {
                this.f21675o.m27730a((C1102b) this);
            }
        }
    }

    public void onDriveButtonClicked(View view) {
        Log.d("BaseGamePlayActivity", "Drive button clicked.");
        if (this.f21676p.m4608b() != null) {
            m29830c(C1108d.alert_no_gas);
            return;
        }
        this.f21676p.m4607a();
        m29830c(C1108d.alert_drove);
        m29828j();
    }

    public void onDestroy() {
        Log.d("BaseGamePlayActivity", "Destroying helper.");
        if (this.f21674n != null) {
            this.f21674n.m17199a();
        }
        super.onDestroy();
    }

    /* renamed from: c */
    void m29830c(int i) {
        m29829a(i, null);
    }

    /* renamed from: a */
    void m29829a(int i, Object obj) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            Builder builder = new Builder(this);
            builder.setNeutralButton("OK", null);
            if (obj == null) {
                builder.setMessage(i);
            } else {
                builder.setMessage(getResources().getString(i, new Object[]{obj}));
            }
            builder.create().show();
            return;
        }
        throw new RuntimeException("Dialog could be shown only from the main thread");
    }

    /* renamed from: a */
    private void m29827a(ImageView imageView, int i) {
        imageView.setImageResource(i);
        imageView.setTag(Integer.valueOf(i));
    }

    /* renamed from: j */
    private void m29828j() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Updating the UI. Thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        Log.d("BaseGamePlayActivity", stringBuilder.toString());
        m29827a(this.f21680t, this.f21676p.m4609c());
    }

    /* renamed from: i */
    public boolean m29832i() {
        return this.f21675o != null && this.f21675o.isVisible();
    }
}
