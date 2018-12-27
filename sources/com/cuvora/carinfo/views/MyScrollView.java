package com.cuvora.carinfo.views;

import android.content.Context;
import android.os.Handler;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.util.Log;

public class MyScrollView extends NestedScrollView {
    /* renamed from: e */
    private static String f21083e;
    /* renamed from: a */
    String f21084a = "";
    /* renamed from: b */
    String f21085b = "";
    /* renamed from: c */
    String f21086c = "";
    /* renamed from: d */
    Runnable f21087d = new C16671(this);
    /* renamed from: f */
    private Handler f21088f = new Handler();
    /* renamed from: g */
    private C1668a f21089g;
    /* renamed from: h */
    private long f21090h = 100;

    /* renamed from: com.cuvora.carinfo.views.MyScrollView$1 */
    class C16671 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ MyScrollView f4999a;

        C16671(MyScrollView myScrollView) {
            this.f4999a = myScrollView;
        }

        public void run() {
            this.f4999a.mo4659a();
        }
    }

    /* renamed from: com.cuvora.carinfo.views.MyScrollView$a */
    public interface C1668a {
        /* renamed from: m */
        void mo5019m();

        /* renamed from: n */
        void mo5020n();

        /* renamed from: o */
        void mo5021o();
    }

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(MyScrollView.class.getSimpleName());
        stringBuilder.append(" ");
        f21083e = stringBuilder.toString();
    }

    public void setListener(C1668a c1668a) {
        this.f21089g = c1668a;
    }

    public MyScrollView(Context context) {
        super(context);
    }

    public MyScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean startNestedScroll(int i) {
        Log.e(f21083e, "startNestedScroll called");
        if (this.f21089g != null) {
            this.f21089g.mo5019m();
        }
        try {
            this.f21088f.removeCallbacks(this.f21087d);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return super.startNestedScroll(i);
    }

    public void stopNestedScroll() {
        super.stopNestedScroll();
        this.f21088f.postDelayed(this.f21087d, this.f21090h);
        if (this.f21089g != null) {
            this.f21089g.mo5020n();
        }
    }

    /* renamed from: a */
    public void mo4659a() {
        String str = f21083e;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Old Bounds are ");
        stringBuilder.append(this.f21085b);
        Log.e(str, stringBuilder.toString());
        str = f21083e;
        stringBuilder = new StringBuilder();
        stringBuilder.append("New Bounds are ");
        stringBuilder.append(this.f21084a);
        Log.e(str, stringBuilder.toString());
        if (this.f21085b.equalsIgnoreCase(this.f21084a)) {
            this.f21088f.removeCallbacks(this.f21087d);
            if (!(this.f21086c.equalsIgnoreCase(this.f21084a) || this.f21089g == null)) {
                this.f21089g.mo5021o();
            }
            this.f21086c = this.f21084a;
            this.f21085b = "";
            return;
        }
        this.f21085b = this.f21084a;
        this.f21088f.postDelayed(this.f21087d, this.f21090h);
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(i);
        stringBuilder.append("");
        stringBuilder.append(i2);
        stringBuilder.append("");
        stringBuilder.append(i3);
        stringBuilder.append("");
        stringBuilder.append(i4);
        this.f21084a = stringBuilder.toString();
        String str = f21083e;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("onScrollChanged called ");
        stringBuilder2.append(i);
        stringBuilder2.append(" ");
        stringBuilder2.append(i2);
        stringBuilder2.append(" ");
        stringBuilder2.append(i3);
        stringBuilder2.append(" ");
        stringBuilder2.append(i4);
        Log.e(str, stringBuilder2.toString());
    }
}
