package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzbo;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@zzaer
@ParametersAreNonnullByDefault
@VisibleForTesting
public interface zzasg extends zzbo, zzarg, zzatc, zzatd, zzath, zzatk, zzatl, zzatm, zzfw, zzvd, zzwb {
    /* renamed from: A */
    boolean mo4721A();

    /* renamed from: B */
    void mo4722B();

    /* renamed from: C */
    boolean mo4723C();

    /* renamed from: D */
    boolean mo4724D();

    /* renamed from: E */
    boolean mo4725E();

    /* renamed from: F */
    void mo4726F();

    /* renamed from: G */
    void mo4727G();

    /* renamed from: H */
    zzpk mo4728H();

    /* renamed from: I */
    void mo4729I();

    /* renamed from: J */
    void mo4730J();

    /* renamed from: a */
    void mo4732a(int i);

    /* renamed from: a */
    void mo4733a(Context context);

    /* renamed from: a */
    void mo4735a(zzd zzd);

    /* renamed from: a */
    void mo4736a(IObjectWrapper iObjectWrapper);

    /* renamed from: a */
    void mo4197a(zzasw zzasw);

    /* renamed from: a */
    void mo4737a(zzatt zzatt);

    /* renamed from: a */
    void mo4738a(zzpk zzpk);

    /* renamed from: a */
    void mo4739a(String str);

    /* renamed from: a */
    void mo4740a(String str, zzu<? super zzasg> zzu);

    /* renamed from: a */
    void mo4741a(String str, Predicate<zzu<? super zzasg>> predicate);

    /* renamed from: a */
    void mo4742a(String str, String str2, String str3);

    /* renamed from: b */
    zzasw mo4198b();

    /* renamed from: b */
    void mo4748b(zzd zzd);

    /* renamed from: b */
    void mo4749b(String str, zzu<? super zzasg> zzu);

    /* renamed from: b */
    void mo4751b(boolean z);

    /* renamed from: c */
    void mo4753c(boolean z);

    /* renamed from: d */
    Activity mo4199d();

    /* renamed from: d */
    void mo4754d(boolean z);

    void destroy();

    /* renamed from: e */
    zzv mo4200e();

    /* renamed from: e */
    void mo4756e(boolean z);

    /* renamed from: f */
    void mo4758f(boolean z);

    Context getContext();

    int getHeight();

    LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    OnClickListener getOnClickListener();

    ViewParent getParent();

    int getRequestedOrientation();

    View getView();

    WebView getWebView();

    int getWidth();

    /* renamed from: h */
    zzoi mo4203h();

    /* renamed from: i */
    zzaop mo4204i();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    /* renamed from: m */
    void mo4769m();

    void measure(int i, int i2);

    /* renamed from: n */
    void mo4770n();

    /* renamed from: o */
    void mo4771o();

    void onPause();

    void onResume();

    /* renamed from: p */
    Context mo4774p();

    /* renamed from: q */
    zzd mo4775q();

    /* renamed from: r */
    zzd mo4776r();

    /* renamed from: s */
    zzatt mo4205s();

    void setBackgroundColor(int i);

    void setOnClickListener(OnClickListener onClickListener);

    void setOnTouchListener(OnTouchListener onTouchListener);

    void setRequestedOrientation(int i);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void stopLoading();

    /* renamed from: t */
    String mo4781t();

    /* renamed from: u */
    zzatn mo4782u();

    /* renamed from: v */
    WebViewClient mo4783v();

    /* renamed from: w */
    boolean mo4784w();

    /* renamed from: x */
    zzck mo4207x();

    /* renamed from: y */
    IObjectWrapper mo4785y();

    /* renamed from: z */
    boolean mo4208z();
}
