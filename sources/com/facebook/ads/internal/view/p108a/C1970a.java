package com.facebook.ads.internal.view.p108a;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p103b.C1940b;
import com.facebook.ads.internal.p101q.p103b.C1941c;
import java.util.List;

@TargetApi(19)
/* renamed from: com.facebook.ads.internal.view.a.a */
public class C1970a extends LinearLayout {
    /* renamed from: a */
    private static final int f6070a = Color.rgb(224, 224, 224);
    /* renamed from: b */
    private static final Uri f6071b = Uri.parse("http://www.facebook.com");
    /* renamed from: c */
    private static final OnTouchListener f6072c = new C19661();
    /* renamed from: d */
    private static final int f6073d = Color.argb(34, 0, 0, 0);
    /* renamed from: e */
    private ImageView f6074e;
    /* renamed from: f */
    private C1976e f6075f;
    /* renamed from: g */
    private ImageView f6076g;
    /* renamed from: h */
    private C1969a f6077h;
    /* renamed from: i */
    private String f6078i;

    /* renamed from: com.facebook.ads.internal.view.a.a$1 */
    static class C19661 implements OnTouchListener {
        C19661() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    C1936w.m7328a(view, C1970a.f6073d);
                    break;
                case 1:
                    C1936w.m7328a(view, 0);
                    break;
                default:
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.a$2 */
    class C19672 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1970a f6068a;

        C19672(C1970a c1970a) {
            this.f6068a = c1970a;
        }

        public void onClick(View view) {
            if (this.f6068a.f6077h != null) {
                this.f6068a.f6077h.mo1410a();
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.a$3 */
    class C19683 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C1970a f6069a;

        C19683(C1970a c1970a) {
            this.f6069a = c1970a;
        }

        public void onClick(View view) {
            if (!TextUtils.isEmpty(this.f6069a.f6078i)) {
                if (!"about:blank".equals(this.f6069a.f6078i)) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f6069a.f6078i));
                    intent.addFlags(268435456);
                    this.f6069a.getContext().startActivity(intent);
                }
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.view.a.a$a */
    public interface C1969a {
        /* renamed from: a */
        void mo1410a();
    }

    public C1970a(Context context) {
        super(context);
        m7448a(context);
    }

    /* renamed from: a */
    private void m7448a(Context context) {
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (50.0f * f);
        int i2 = (int) (f * 4.0f);
        C1936w.m7328a((View) this, -1);
        setGravity(16);
        this.f6074e = new ImageView(context);
        LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        this.f6074e.setScaleType(ScaleType.CENTER);
        this.f6074e.setImageBitmap(C1941c.m7340a(C1940b.BROWSER_CLOSE));
        this.f6074e.setOnTouchListener(f6072c);
        this.f6074e.setOnClickListener(new C19672(this));
        addView(this.f6074e, layoutParams);
        this.f6075f = new C1976e(context);
        layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        this.f6075f.setPadding(0, i2, 0, i2);
        addView(this.f6075f, layoutParams);
        this.f6076g = new ImageView(context);
        LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        this.f6076g.setScaleType(ScaleType.CENTER);
        this.f6076g.setOnTouchListener(f6072c);
        this.f6076g.setOnClickListener(new C19683(this));
        addView(this.f6076g, layoutParams2);
        setupDefaultNativeBrowser(context);
    }

    private void setupDefaultNativeBrowser(Context context) {
        Bitmap bitmap;
        List queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", f6071b), 65536);
        if (queryIntentActivities.size() == 0) {
            this.f6076g.setVisibility(8);
            bitmap = null;
        } else {
            C1940b c1940b = (queryIntentActivities.size() == 1 && "com.android.chrome".equals(((ResolveInfo) queryIntentActivities.get(0)).activityInfo.packageName)) ? C1940b.BROWSER_LAUNCH_CHROME : C1940b.BROWSER_LAUNCH_NATIVE;
            bitmap = C1941c.m7340a(c1940b);
        }
        this.f6076g.setImageBitmap(bitmap);
    }

    public void setListener(C1969a c1969a) {
        this.f6077h = c1969a;
    }

    public void setTitle(String str) {
        this.f6075f.setTitle(str);
    }

    public void setUrl(String str) {
        this.f6078i = str;
        if (!TextUtils.isEmpty(str)) {
            if (!"about:blank".equals(str)) {
                this.f6075f.setSubtitle(str);
                this.f6076g.setEnabled(true);
                this.f6076g.setColorFilter(null);
                return;
            }
        }
        this.f6075f.setSubtitle(null);
        this.f6076g.setEnabled(false);
        this.f6076g.setColorFilter(new PorterDuffColorFilter(f6070a, Mode.SRC_IN));
    }
}
