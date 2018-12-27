package com.facebook.ads.internal.view.p109b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.internal.p085d.C1780c;
import com.facebook.ads.internal.p091j.C1812a;
import com.facebook.ads.internal.p091j.C1813b;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.p101q.p103b.C1943e;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.b.d */
public class C1991d extends AsyncTask<String, Void, Bitmap[]> {
    /* renamed from: b */
    private static final String f6143b = "d";
    /* renamed from: a */
    public boolean f6144a = false;
    /* renamed from: c */
    private final WeakReference<Context> f6145c;
    /* renamed from: d */
    private final int f6146d;
    /* renamed from: e */
    private final WeakReference<ImageView> f6147e;
    /* renamed from: f */
    private final WeakReference<C1988b> f6148f;
    /* renamed from: g */
    private final WeakReference<ViewGroup> f6149g;
    /* renamed from: h */
    private C1992e f6150h;
    /* renamed from: i */
    private int f6151i = -1;
    /* renamed from: j */
    private int f6152j = -1;

    public C1991d(ViewGroup viewGroup, int i) {
        this.f6145c = new WeakReference(viewGroup.getContext());
        this.f6148f = null;
        this.f6147e = null;
        this.f6149g = new WeakReference(viewGroup);
        this.f6146d = i;
    }

    public C1991d(ImageView imageView) {
        this.f6145c = new WeakReference(imageView.getContext());
        this.f6148f = null;
        this.f6147e = new WeakReference(imageView);
        this.f6149g = null;
        this.f6146d = 0;
    }

    public C1991d(C1988b c1988b) {
        this.f6145c = new WeakReference(c1988b.getContext());
        this.f6148f = new WeakReference(c1988b);
        this.f6147e = null;
        this.f6149g = null;
        this.f6146d = 0;
    }

    /* renamed from: a */
    public C1991d m7499a() {
        this.f6151i = -1;
        this.f6152j = -1;
        return this;
    }

    /* renamed from: a */
    public C1991d m7500a(int i, int i2) {
        this.f6151i = i;
        this.f6152j = i2;
        return this;
    }

    /* renamed from: a */
    public C1991d m7501a(C1992e c1992e) {
        this.f6150h = c1992e;
        return this;
    }

    /* renamed from: a */
    public C1991d m7502a(boolean z) {
        this.f6144a = z;
        return this;
    }

    /* renamed from: a */
    public void m7503a(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.f6150h != null) {
                this.f6150h.mo1272a(false);
            }
            return;
        }
        executeOnExecutor(THREAD_POOL_EXECUTOR, new String[]{str});
    }

    /* renamed from: a */
    protected void m7504a(Bitmap[] bitmapArr) {
        boolean z = false;
        if (this.f6147e != null) {
            ImageView imageView = (ImageView) this.f6147e.get();
            if (imageView != null) {
                imageView.setImageBitmap(bitmapArr[0]);
            }
        }
        if (this.f6148f != null) {
            C1988b c1988b = (C1988b) this.f6148f.get();
            if (c1988b != null) {
                c1988b.m7485a(bitmapArr[0], bitmapArr[1]);
            }
        }
        if (!(this.f6149g == null || this.f6149g.get() == null || bitmapArr[1] == null)) {
            C1936w.m7329a((View) this.f6149g.get(), new BitmapDrawable(((Context) this.f6145c.get()).getResources(), bitmapArr[1]));
        }
        if (this.f6150h != null) {
            C1992e c1992e = this.f6150h;
            if (bitmapArr[0] != null) {
                z = true;
            }
            c1992e.mo1272a(z);
        }
    }

    /* renamed from: a */
    protected Bitmap[] m7505a(String... strArr) {
        Throwable th;
        String str;
        StringBuilder stringBuilder;
        String str2 = strArr[0];
        Context context = (Context) this.f6145c.get();
        String str3 = null;
        if (context == null) {
            return new Bitmap[]{null, null};
        }
        Bitmap a;
        try {
            a = C1780c.m6692a(context).m6699a(str2, this.f6151i, this.f6152j);
            try {
                Object obj = (this.f6148f == null || this.f6148f.get() == null) ? null : 1;
                Object obj2 = (this.f6149g == null || this.f6149g.get() == null) ? null : 1;
                if (!((obj == null && obj2 == null) || a == null || this.f6144a)) {
                    C1943e c1943e = new C1943e(a);
                    c1943e.m7346a(this.f6146d != 0 ? this.f6146d : Math.round(((float) a.getWidth()) / 40.0f));
                    str3 = c1943e.m7345a();
                }
            } catch (Throwable th2) {
                th = th2;
                str = f6143b;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error downloading image: ");
                stringBuilder.append(str2);
                Log.e(str, stringBuilder.toString(), th);
                C1813b.m6823a(C1812a.m6820a(th, null));
                return new Bitmap[]{a, str3};
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
            str = f6143b;
            stringBuilder = new StringBuilder();
            stringBuilder.append("Error downloading image: ");
            stringBuilder.append(str2);
            Log.e(str, stringBuilder.toString(), th);
            C1813b.m6823a(C1812a.m6820a(th, null));
            return new Bitmap[]{a, str3};
        }
        return new Bitmap[]{a, str3};
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m7505a((String[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m7504a((Bitmap[]) obj);
    }
}
