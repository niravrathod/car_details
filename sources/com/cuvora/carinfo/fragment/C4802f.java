package com.cuvora.carinfo.fragment;

import android.os.Bundle;
import android.support.v4.app.C4432h;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.SwitchCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1570t;

/* renamed from: com.cuvora.carinfo.fragment.f */
public class C4802f extends C4432h {
    /* renamed from: a */
    int f21021a = 1;
    /* renamed from: b */
    int f21022b = R.style.MyDialog;
    /* renamed from: c */
    private SwitchCompat f21023c;
    /* renamed from: d */
    private AppCompatButton f21024d;

    /* renamed from: com.cuvora.carinfo.fragment.f$1 */
    class C14991 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4802f f4487a;

        C14991(C4802f c4802f) {
            this.f4487a = c4802f;
        }

        public void onClick(android.view.View r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r3 = r2.f4487a;
            r3 = r3.getContext();
            r0 = r2.f4487a;
            r0 = r0.f21023c;
            r0 = r0.isChecked();
            com.cuvora.carinfo.helpers.C1570t.m5987a(r3, r0);
            r3 = r2.f4487a;	 Catch:{ Exception -> 0x002e }
            r3 = r3.getContext();	 Catch:{ Exception -> 0x002e }
            r3 = java.util.Objects.requireNonNull(r3);	 Catch:{ Exception -> 0x002e }
            r3 = (android.content.Context) r3;	 Catch:{ Exception -> 0x002e }
            r3 = r3.getPackageManager();	 Catch:{ Exception -> 0x002e }
            r0 = r2.f4487a;	 Catch:{ Exception -> 0x002e }
            r1 = "com.cuvora.carinfo";	 Catch:{ Exception -> 0x002e }
            r3 = r3.getLaunchIntentForPackage(r1);	 Catch:{ Exception -> 0x002e }
            r0.startActivity(r3);	 Catch:{ Exception -> 0x002e }
        L_0x002e:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.fragment.f.1.onClick(android.view.View):void");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(this.f21021a, this.f21022b);
    }

    /* renamed from: a */
    public static C4802f m27786a() {
        Bundle bundle = new Bundle();
        C4802f c4802f = new C4802f();
        c4802f.setArguments(bundle);
        return c4802f;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.view_settings_internal, viewGroup, false);
        m27787a(inflate);
        m27789c();
        m27788b();
        return inflate;
    }

    /* renamed from: b */
    private void m27788b() {
        this.f21024d.setOnClickListener(new C14991(this));
    }

    /* renamed from: c */
    private void m27789c() {
        this.f21023c.setChecked(C1570t.m6016e(getContext()));
    }

    /* renamed from: a */
    private void m27787a(View view) {
        this.f21023c = (SwitchCompat) view.findViewById(R.id.switch_show_ads);
        this.f21024d = (AppCompatButton) view.findViewById(R.id.applyBtn);
    }
}
