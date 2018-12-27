package com.facebook.ads.internal.view.component;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.support.v4.p009a.C0299a;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.facebook.ads.internal.adapters.p082a.C1727d;
import com.facebook.ads.internal.adapters.p082a.C1728e;
import com.facebook.ads.internal.p081a.C1712b;
import com.facebook.ads.internal.p081a.C1713c;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1921k;
import com.facebook.ads.internal.p101q.p102a.C1933t;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p107r.C1958a;
import com.facebook.ads.internal.view.C1980a.C1965a;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.view.component.a */
public class C2013a extends Button {
    /* renamed from: a */
    public static final int f6216a = ((int) (C1936w.f5934b * 16.0f));
    /* renamed from: b */
    private static final int f6217b = ((int) (C1936w.f5934b * 4.0f));
    /* renamed from: c */
    private final Paint f6218c = new Paint();
    /* renamed from: d */
    private final RectF f6219d;
    /* renamed from: e */
    private final boolean f6220e;
    /* renamed from: f */
    private final String f6221f;
    /* renamed from: g */
    private final C1958a f6222g;
    /* renamed from: h */
    private final C1933t f6223h;
    /* renamed from: i */
    private final C1827c f6224i;
    /* renamed from: j */
    private final C1965a f6225j;

    public C2013a(Context context, boolean z, boolean z2, String str, C1727d c1727d, C1827c c1827c, C1965a c1965a, C1958a c1958a, C1933t c1933t) {
        super(context);
        this.f6224i = c1827c;
        this.f6225j = c1965a;
        this.f6220e = z;
        this.f6221f = str;
        this.f6222g = c1958a;
        this.f6223h = c1933t;
        C1936w.m7330a(this, false, 16);
        setGravity(17);
        setPadding(f6216a, f6216a, f6216a, f6216a);
        setTextColor(c1727d.m6529f(z2));
        int e = c1727d.m6528e(z2);
        int a = C0299a.m1068a(e, -16777216, 0.1f);
        this.f6218c.setStyle(Style.FILL);
        this.f6218c.setColor(e);
        this.f6219d = new RectF();
        if (!z) {
            Drawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(a));
            stateListDrawable.addState(new int[0], new ColorDrawable(e));
            C1936w.m7329a((View) this, stateListDrawable);
        }
    }

    /* renamed from: a */
    public void m7577a(C1728e c1728e, String str, Map<String, String> map) {
        m7578a(c1728e.m6533b(), c1728e.m6532a(), str, map);
    }

    /* renamed from: a */
    public void m7578a(String str, final String str2, final String str3, final Map<String, String> map) {
        if (!(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2))) {
            if (this.f6224i != null) {
                setText(str.toUpperCase(Locale.US));
                setOnClickListener(new OnClickListener(this) {
                    /* renamed from: d */
                    final /* synthetic */ C2013a f6184d;

                    public void onClick(View view) {
                        Throwable e;
                        String valueOf;
                        String stringBuilder;
                        try {
                            Uri parse = Uri.parse(str2);
                            this.f6184d.f6222g.m7419a(map);
                            map.put("touch", C1921k.m7293a(this.f6184d.f6223h.m7321e()));
                            C1712b a = C1713c.m6462a(this.f6184d.getContext(), this.f6184d.f6224i, str3, parse, map);
                            if (a != null) {
                                a.mo1328b();
                            }
                            if (this.f6184d.f6225j != null) {
                                this.f6184d.f6225j.mo1280a(this.f6184d.f6221f);
                            }
                        } catch (ActivityNotFoundException e2) {
                            e = e2;
                            valueOf = String.valueOf(C2013a.class);
                            StringBuilder stringBuilder2 = new StringBuilder();
                            stringBuilder2.append("Error while opening ");
                            stringBuilder2.append(str2);
                            stringBuilder = stringBuilder2.toString();
                            Log.e(valueOf, stringBuilder, e);
                        } catch (Exception e3) {
                            e = e3;
                            valueOf = String.valueOf(C2013a.class);
                            stringBuilder = "Error executing action";
                            Log.e(valueOf, stringBuilder, e);
                        }
                    }
                });
                return;
            }
        }
        setVisibility(8);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f6220e) {
            this.f6219d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            canvas.drawRoundRect(this.f6219d, (float) f6217b, (float) f6217b, this.f6218c);
        }
        super.onDraw(canvas);
    }
}
