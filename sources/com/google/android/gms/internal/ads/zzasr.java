package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.gms.ads.impl.C2397R;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import org.json.JSONObject;

@zzaer
public final class zzasr extends FrameLayout implements zzasg {
    /* renamed from: a */
    private final zzasg f21360a;
    /* renamed from: b */
    private final zzaqx f21361b;

    public zzasr(zzasg zzasg) {
        super(zzasg.getContext());
        this.f21360a = zzasg;
        this.f21361b = new zzaqx(zzasg.mo4774p(), this, this);
        addView(this.f21360a.getView());
    }

    public final View getView() {
        return this;
    }

    /* renamed from: a */
    public final zzaqx mo4731a() {
        return this.f21361b;
    }

    public final void onPause() {
        this.f21361b.m10062b();
        this.f21360a.onPause();
    }

    /* renamed from: B */
    public final void mo4722B() {
        this.f21361b.m10063c();
        this.f21360a.mo4722B();
    }

    /* renamed from: I */
    public final void mo4729I() {
        setBackgroundColor(0);
        this.f21360a.setBackgroundColor(0);
    }

    /* renamed from: j */
    public final int mo4763j() {
        return getMeasuredHeight();
    }

    /* renamed from: k */
    public final int mo4764k() {
        return getMeasuredWidth();
    }

    /* renamed from: l */
    public final void mo4765l() {
        this.f21360a.mo4765l();
    }

    public final WebView getWebView() {
        return this.f21360a.getWebView();
    }

    /* renamed from: a */
    public final void mo4743a(String str, Map<String, ?> map) {
        this.f21360a.mo4743a(str, (Map) map);
    }

    /* renamed from: a */
    public final void mo2748a(String str, JSONObject jSONObject) {
        this.f21360a.mo2748a(str, jSONObject);
    }

    /* renamed from: a */
    public final void mo4740a(String str, zzu<? super zzasg> zzu) {
        this.f21360a.mo4740a(str, (zzu) zzu);
    }

    /* renamed from: b */
    public final void mo4749b(String str, zzu<? super zzasg> zzu) {
        this.f21360a.mo4749b(str, zzu);
    }

    /* renamed from: a */
    public final void mo4741a(String str, Predicate<zzu<? super zzasg>> predicate) {
        this.f21360a.mo4741a(str, (Predicate) predicate);
    }

    /* renamed from: m */
    public final void mo4769m() {
        this.f21360a.mo4769m();
    }

    /* renamed from: a */
    public final void mo4732a(int i) {
        this.f21360a.mo4732a(i);
    }

    /* renamed from: n */
    public final void mo4770n() {
        this.f21360a.mo4770n();
    }

    /* renamed from: o */
    public final void mo4771o() {
        this.f21360a.mo4771o();
    }

    /* renamed from: b */
    public final void mo2749b(String str) {
        this.f21360a.mo2749b(str);
    }

    /* renamed from: b */
    public final void mo4750b(String str, JSONObject jSONObject) {
        this.f21360a.mo4750b(str, jSONObject);
    }

    /* renamed from: d */
    public final Activity mo4199d() {
        return this.f21360a.mo4199d();
    }

    /* renamed from: p */
    public final Context mo4774p() {
        return this.f21360a.mo4774p();
    }

    /* renamed from: e */
    public final zzv mo4200e() {
        return this.f21360a.mo4200e();
    }

    /* renamed from: q */
    public final zzd mo4775q() {
        return this.f21360a.mo4775q();
    }

    /* renamed from: y */
    public final IObjectWrapper mo4785y() {
        return this.f21360a.mo4785y();
    }

    /* renamed from: r */
    public final zzd mo4776r() {
        return this.f21360a.mo4776r();
    }

    /* renamed from: s */
    public final zzatt mo4205s() {
        return this.f21360a.mo4205s();
    }

    /* renamed from: t */
    public final String mo4781t() {
        return this.f21360a.mo4781t();
    }

    /* renamed from: u */
    public final zzatn mo4782u() {
        return this.f21360a.mo4782u();
    }

    /* renamed from: v */
    public final WebViewClient mo4783v() {
        return this.f21360a.mo4783v();
    }

    /* renamed from: w */
    public final boolean mo4784w() {
        return this.f21360a.mo4784w();
    }

    /* renamed from: x */
    public final zzck mo4207x() {
        return this.f21360a.mo4207x();
    }

    /* renamed from: i */
    public final zzaop mo4204i() {
        return this.f21360a.mo4204i();
    }

    /* renamed from: z */
    public final boolean mo4208z() {
        return this.f21360a.mo4208z();
    }

    public final int getRequestedOrientation() {
        return this.f21360a.getRequestedOrientation();
    }

    /* renamed from: A */
    public final boolean mo4721A() {
        return this.f21360a.mo4721A();
    }

    /* renamed from: C */
    public final boolean mo4723C() {
        return this.f21360a.mo4723C();
    }

    /* renamed from: D */
    public final boolean mo4724D() {
        return this.f21360a.mo4724D();
    }

    public final void zzcl() {
        this.f21360a.zzcl();
    }

    public final void zzck() {
        this.f21360a.zzck();
    }

    /* renamed from: g */
    public final String mo4759g() {
        return this.f21360a.mo4759g();
    }

    /* renamed from: c */
    public final zzoh mo4752c() {
        return this.f21360a.mo4752c();
    }

    /* renamed from: h */
    public final zzoi mo4203h() {
        return this.f21360a.mo4203h();
    }

    /* renamed from: b */
    public final zzasw mo4198b() {
        return this.f21360a.mo4198b();
    }

    /* renamed from: a */
    public final void mo4735a(zzd zzd) {
        this.f21360a.mo4735a(zzd);
    }

    /* renamed from: a */
    public final void mo4736a(IObjectWrapper iObjectWrapper) {
        this.f21360a.mo4736a(iObjectWrapper);
    }

    /* renamed from: a */
    public final void mo4737a(zzatt zzatt) {
        this.f21360a.mo4737a(zzatt);
    }

    /* renamed from: b */
    public final void mo4751b(boolean z) {
        this.f21360a.mo4751b(z);
    }

    /* renamed from: F */
    public final void mo4726F() {
        this.f21360a.mo4726F();
    }

    /* renamed from: a */
    public final void mo4733a(Context context) {
        this.f21360a.mo4733a(context);
    }

    /* renamed from: c */
    public final void mo4753c(boolean z) {
        this.f21360a.mo4753c(z);
    }

    public final void setRequestedOrientation(int i) {
        this.f21360a.setRequestedOrientation(i);
    }

    /* renamed from: b */
    public final void mo4748b(zzd zzd) {
        this.f21360a.mo4748b(zzd);
    }

    /* renamed from: d */
    public final void mo4754d(boolean z) {
        this.f21360a.mo4754d(z);
    }

    /* renamed from: a */
    public final void mo4739a(String str) {
        this.f21360a.mo4739a(str);
    }

    /* renamed from: G */
    public final void mo4727G() {
        this.f21360a.mo4727G();
    }

    public final void destroy() {
        IObjectWrapper y = mo4785y();
        if (y != null) {
            zzbv.zzfb().m9456b(y);
            zzalo.f8872a.postDelayed(new gv(this), (long) ((Integer) zzkd.m10713e().m10897a(zznw.cz)).intValue());
            return;
        }
        this.f21360a.destroy();
    }

    public final void loadData(String str, String str2, String str3) {
        this.f21360a.loadData(str, str2, str3);
    }

    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f21360a.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    public final void loadUrl(String str) {
        this.f21360a.loadUrl(str);
    }

    /* renamed from: a */
    public final void mo4742a(String str, String str2, String str3) {
        this.f21360a.mo4742a(str, str2, str3);
    }

    public final void setOnClickListener(OnClickListener onClickListener) {
        this.f21360a.setOnClickListener(onClickListener);
    }

    public final void setOnTouchListener(OnTouchListener onTouchListener) {
        this.f21360a.setOnTouchListener(onTouchListener);
    }

    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f21360a.setWebChromeClient(webChromeClient);
    }

    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f21360a.setWebViewClient(webViewClient);
    }

    public final void stopLoading() {
        this.f21360a.stopLoading();
    }

    public final void onResume() {
        this.f21360a.onResume();
    }

    /* renamed from: J */
    public final void mo4730J() {
        View textView = new TextView(getContext());
        Resources g = zzbv.zzeo().m9722g();
        textView.setText(g != null ? g.getString(C2397R.string.s7) : "Test Ad");
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        Drawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        if (VERSION.SDK_INT >= 16) {
            textView.setBackground(gradientDrawable);
        } else {
            textView.setBackgroundDrawable(gradientDrawable);
        }
        addView(textView, new LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    /* renamed from: f */
    public final void mo4758f(boolean z) {
        this.f21360a.mo4758f(z);
    }

    /* renamed from: a */
    public final void mo2329a(zzfv zzfv) {
        this.f21360a.mo2329a(zzfv);
    }

    public final OnClickListener getOnClickListener() {
        return this.f21360a.getOnClickListener();
    }

    /* renamed from: a */
    public final void mo4738a(zzpk zzpk) {
        this.f21360a.mo4738a(zzpk);
    }

    /* renamed from: H */
    public final zzpk mo4728H() {
        return this.f21360a.mo4728H();
    }

    /* renamed from: a */
    public final void mo4197a(zzasw zzasw) {
        this.f21360a.mo4197a(zzasw);
    }

    /* renamed from: E */
    public final boolean mo4725E() {
        return this.f21360a.mo4725E();
    }

    /* renamed from: e */
    public final void mo4756e(boolean z) {
        this.f21360a.mo4756e(z);
    }

    /* renamed from: a */
    public final void mo4744a(boolean z) {
        this.f21360a.mo4744a(z);
    }

    /* renamed from: f */
    public final void mo4757f() {
        this.f21360a.mo4757f();
    }

    /* renamed from: a */
    public final void mo4734a(zzc zzc) {
        this.f21360a.mo4734a(zzc);
    }

    /* renamed from: a */
    public final void mo4745a(boolean z, int i) {
        this.f21360a.mo4745a(z, i);
    }

    /* renamed from: a */
    public final void mo4746a(boolean z, int i, String str) {
        this.f21360a.mo4746a(z, i, str);
    }

    /* renamed from: a */
    public final void mo4747a(boolean z, int i, String str, String str2) {
        this.f21360a.mo4747a(z, i, str, str2);
    }
}
