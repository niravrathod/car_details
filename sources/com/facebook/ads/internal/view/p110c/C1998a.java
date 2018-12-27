package com.facebook.ads.internal.view.p110c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.p081a.C1712b;
import com.facebook.ads.internal.p081a.C1713c;
import com.facebook.ads.internal.p094m.C1827c;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p118b.C3866a;
import java.util.HashMap;

/* renamed from: com.facebook.ads.internal.view.c.a */
public class C1998a extends RelativeLayout {
    /* renamed from: a */
    private final String f6167a;
    /* renamed from: b */
    private C3859a f6168b;
    /* renamed from: c */
    private final Paint f6169c = new Paint();
    /* renamed from: d */
    private final RectF f6170d;

    public C1998a(Context context, String str, String str2, int i, C3859a c3859a, final C1827c c1827c, final String str3) {
        super(context);
        this.f6167a = str;
        this.f6168b = c3859a;
        View textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(16.0f);
        textView.setText(str2);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        addView(textView);
        this.f6169c.setStyle(Style.FILL);
        this.f6169c.setColor(i);
        this.f6170d = new RectF();
        C1936w.m7328a((View) this, 0);
        setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ C1998a f6155c;

            public void onClick(View view) {
                Throwable e;
                String valueOf;
                String stringBuilder;
                try {
                    Uri parse = Uri.parse(this.f6155c.f6167a);
                    this.f6155c.f6168b.getEventBus().m6829a(new C3866a(parse));
                    C1712b a = C1713c.m6462a(this.f6155c.getContext(), c1827c, str3, parse, new HashMap());
                    if (a != null) {
                        a.mo1328b();
                    }
                } catch (ActivityNotFoundException e2) {
                    e = e2;
                    valueOf = String.valueOf(C1998a.class);
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("Error while opening ");
                    stringBuilder2.append(this.f6155c.f6167a);
                    stringBuilder = stringBuilder2.toString();
                    Log.e(valueOf, stringBuilder, e);
                } catch (Exception e3) {
                    e = e3;
                    valueOf = String.valueOf(C1998a.class);
                    stringBuilder = "Error executing action";
                    Log.e(valueOf, stringBuilder, e);
                }
            }
        });
    }

    protected void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f6170d.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
        f *= 10.0f;
        canvas.drawRoundRect(this.f6170d, f, f, this.f6169c);
        super.onDraw(canvas);
    }
}
