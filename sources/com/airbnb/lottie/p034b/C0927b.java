package com.airbnb.lottie.p034b;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable.Callback;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import com.airbnb.lottie.C0928b;
import com.airbnb.lottie.C0967g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.airbnb.lottie.b.b */
public class C0927b {
    /* renamed from: a */
    private static final Object f3121a = new Object();
    /* renamed from: b */
    private final Context f3122b;
    /* renamed from: c */
    private String f3123c;
    /* renamed from: d */
    private C0928b f3124d;
    /* renamed from: e */
    private final Map<String, C0967g> f3125e;

    public C0927b(Callback callback, String str, C0928b c0928b, Map<String, C0967g> map) {
        this.f3123c = str;
        if (TextUtils.isEmpty(str) == null && this.f3123c.charAt(this.f3123c.length() - 1) != 47) {
            str = new StringBuilder();
            str.append(this.f3123c);
            str.append('/');
            this.f3123c = str.toString();
        }
        if ((callback instanceof View) == null) {
            Log.w("LOTTIE", "LottieDrawable must be inside of a view for images to work.");
            this.f3125e = new HashMap();
            this.f3122b = null;
            return;
        }
        this.f3122b = ((View) callback).getContext();
        this.f3125e = map;
        m4017a(c0928b);
    }

    /* renamed from: a */
    public void m4017a(C0928b c0928b) {
        this.f3124d = c0928b;
    }

    /* renamed from: a */
    public Bitmap m4015a(String str) {
        C0967g c0967g = (C0967g) this.f3125e.get(str);
        if (c0967g == null) {
            return null;
        }
        Bitmap c = c0967g.m4208c();
        if (c != null) {
            return c;
        }
        if (this.f3124d != null) {
            Bitmap a = this.f3124d.m4019a(c0967g);
            if (a != null) {
                m4014a(str, a);
            }
            return a;
        }
        String b = c0967g.m4207b();
        Options options = new Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (!b.startsWith("data:") || b.indexOf("base64,") <= 0) {
            try {
                if (TextUtils.isEmpty(this.f3123c)) {
                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                }
                AssetManager assets = this.f3122b.getAssets();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.f3123c);
                stringBuilder.append(b);
                return m4014a(str, BitmapFactory.decodeStream(assets.open(stringBuilder.toString()), null, options));
            } catch (String str2) {
                Log.w("LOTTIE", "Unable to open asset.", str2);
                return null;
            }
        }
        try {
            byte[] decode = Base64.decode(b.substring(b.indexOf(44) + 1), 0);
            return m4014a(str2, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
        } catch (String str22) {
            Log.w("LOTTIE", "data URL did not have correct base64 format.", str22);
            return null;
        }
    }

    /* renamed from: a */
    public void m4016a() {
        synchronized (f3121a) {
            Iterator it = this.f3125e.entrySet().iterator();
            while (it.hasNext()) {
                Bitmap c = ((C0967g) ((Entry) it.next()).getValue()).m4208c();
                if (c != null) {
                    c.recycle();
                }
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public boolean m4018a(Context context) {
        return (!(context == null && this.f3122b == null) && this.f3122b.equals(context) == null) ? null : true;
    }

    /* renamed from: a */
    private Bitmap m4014a(String str, Bitmap bitmap) {
        synchronized (f3121a) {
            ((C0967g) this.f3125e.get(str)).m4206a(bitmap);
        }
        return bitmap;
    }
}
