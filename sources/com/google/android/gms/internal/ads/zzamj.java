package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.google.ads.AdRequest;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

@zzaer
public final class zzamj {
    /* renamed from: a */
    private final Context f8882a;
    /* renamed from: b */
    private String f8883b;
    /* renamed from: c */
    private String f8884c;
    /* renamed from: d */
    private String f8885d;
    /* renamed from: e */
    private String f8886e;
    /* renamed from: f */
    private final float f8887f;
    /* renamed from: g */
    private float f8888g;
    /* renamed from: h */
    private float f8889h;
    /* renamed from: i */
    private float f8890i;
    /* renamed from: j */
    private int f8891j;
    /* renamed from: k */
    private int f8892k;
    /* renamed from: l */
    private float f8893l;
    /* renamed from: m */
    private float f8894m;
    /* renamed from: n */
    private float f8895n;
    /* renamed from: o */
    private float f8896o;
    /* renamed from: p */
    private Handler f8897p;
    /* renamed from: q */
    private Runnable f8898q;

    public zzamj(Context context) {
        this.f8891j = 0;
        this.f8898q = new dl(this);
        this.f8882a = context;
        this.f8887f = context.getResources().getDisplayMetrics().density;
        this.f8892k = ViewConfiguration.get(this.f8882a).getScaledTouchSlop();
        zzbv.zzfa().m9925a();
        this.f8897p = zzbv.zzfa().m9926b();
    }

    public zzamj(Context context, String str) {
        this(context);
        this.f8883b = str;
    }

    /* renamed from: a */
    public final void m9887a(MotionEvent motionEvent) {
        int actionMasked;
        int historySize;
        if (((Boolean) zzkd.m10713e().m10897a(zznw.ce)).booleanValue()) {
            actionMasked = motionEvent.getActionMasked();
            historySize = motionEvent.getHistorySize();
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked == 0) {
                this.f8891j = 0;
                this.f8893l = motionEvent.getX();
                this.f8894m = motionEvent.getY();
                return;
            }
            if (this.f8891j != -1) {
                int i = 1;
                if (this.f8891j == 0 && actionMasked == 5) {
                    this.f8891j = 5;
                    this.f8895n = motionEvent.getX(1);
                    this.f8896o = motionEvent.getY(1);
                    this.f8897p.postDelayed(this.f8898q, ((Long) zzkd.m10713e().m10897a(zznw.cf)).longValue());
                    return;
                } else if (this.f8891j == 5) {
                    if (pointerCount == 2) {
                        if (actionMasked == 2) {
                            pointerCount = 0;
                            for (actionMasked = 0; actionMasked < historySize; actionMasked++) {
                                if (!m9884a(motionEvent.getHistoricalX(0, actionMasked), motionEvent.getHistoricalY(0, actionMasked), motionEvent.getHistoricalX(1, actionMasked), motionEvent.getHistoricalY(1, actionMasked))) {
                                    pointerCount = 1;
                                }
                            }
                            if (m9884a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) != null) {
                                i = pointerCount;
                            }
                        } else {
                            i = 0;
                        }
                    }
                    if (i != 0) {
                        this.f8891j = -1;
                        this.f8897p.removeCallbacks(this.f8898q);
                    }
                }
            }
            return;
        }
        actionMasked = motionEvent.getHistorySize();
        for (historySize = 0; historySize < actionMasked; historySize++) {
            m9883a(motionEvent.getActionMasked(), motionEvent.getHistoricalX(0, historySize), motionEvent.getHistoricalY(0, historySize));
        }
        m9883a(motionEvent.getActionMasked(), motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: a */
    private final boolean m9884a(float f, float f2, float f3, float f4) {
        return Math.abs(this.f8893l - f) < ((float) this.f8892k) && Math.abs(this.f8894m - f2) < ((float) this.f8892k) && Math.abs(this.f8895n - f3) < ((float) this.f8892k) && Math.abs(this.f8896o - f4) < ((float) this.f8892k);
    }

    @VisibleForTesting
    /* renamed from: a */
    private final void m9883a(int i, float f, float f2) {
        if (i == 0) {
            this.f8891j = 0;
            this.f8888g = f;
            this.f8889h = f2;
            this.f8890i = f2;
        } else if (this.f8891j != -1) {
            if (i == 2) {
                if (f2 > this.f8889h) {
                    this.f8889h = f2;
                } else if (f2 < this.f8890i) {
                    this.f8890i = f2;
                }
                if (this.f8889h - this.f8890i > this.f8887f * 30.0f) {
                    this.f8891j = -1;
                    return;
                }
                if (this.f8891j != 0) {
                    if (this.f8891j != 2) {
                        if ((this.f8891j == 1 || this.f8891j == 3) && f - this.f8888g <= this.f8887f * -50.0f) {
                            this.f8888g = f;
                            this.f8891j++;
                        }
                        if (this.f8891j != 1) {
                            if (this.f8891j == 3) {
                                if (this.f8891j == 2 && f < this.f8888g) {
                                    this.f8888g = f;
                                    return;
                                }
                            }
                        }
                        if (f > this.f8888g) {
                            this.f8888g = f;
                        }
                    }
                }
                if (f - this.f8888g >= this.f8887f * 50.0f) {
                    this.f8888g = f;
                    this.f8891j++;
                }
                if (this.f8891j != 1) {
                    if (this.f8891j == 3) {
                        this.f8888g = f;
                        return;
                    }
                }
                if (f > this.f8888g) {
                    this.f8888g = f;
                }
            } else if (i == 1 && this.f8891j == 4) {
                m9885a();
            }
        }
    }

    /* renamed from: a */
    public final void m9885a() {
        String str;
        try {
            if (this.f8882a instanceof Activity) {
                String str2 = !TextUtils.isEmpty(zzbv.zzeu().m9903a()) ? "Creative Preview (Enabled)" : "Creative Preview";
                str = zzbv.zzeu().m9907b() ? "Troubleshooting (Enabled)" : "Troubleshooting";
                List arrayList = new ArrayList();
                int a = m9882a(arrayList, "Ad Information", true);
                int a2 = m9882a(arrayList, str2, true);
                int a3 = m9882a(arrayList, str, true);
                Builder builder = new Builder(this.f8882a, zzbv.zzem().mo4795f());
                builder.setTitle("Select a Debug Mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new dm(this, a, a2, a3));
                builder.create().show();
                return;
            }
            zzaok.m10005d("Can not create dialog without Activity Context");
        } catch (Throwable e) {
            str = "";
            if (zzalg.m21226a()) {
                Log.v(AdRequest.LOGTAG, str, e);
            }
        }
    }

    /* renamed from: a */
    public final void m9888a(String str) {
        this.f8884c = str;
    }

    /* renamed from: b */
    public final void m9891b(String str) {
        this.f8885d = str;
    }

    /* renamed from: c */
    public final void m9893c(String str) {
        this.f8883b = str;
    }

    /* renamed from: d */
    public final void m9895d(String str) {
        this.f8886e = str;
    }

    /* renamed from: a */
    private static int m9882a(List<String> list, String str, boolean z) {
        list.add(str);
        return list.size() - 1;
    }

    /* renamed from: b */
    final /* synthetic */ void m9890b() {
        zzbv.zzeu().m9905a(this.f8882a, this.f8884c, this.f8885d, this.f8886e);
    }

    /* renamed from: c */
    final /* synthetic */ void m9892c() {
        zzbv.zzeu().m9904a(this.f8882a, this.f8884c, this.f8885d);
    }

    /* renamed from: a */
    final /* synthetic */ void m9889a(String str, DialogInterface dialogInterface, int i) {
        zzbv.zzek();
        zzalo.m9789a(this.f8882a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    /* renamed from: a */
    final /* synthetic */ void m9886a(int i, int i2, int i3, DialogInterface dialogInterface, int i4) {
        if (i4 == i) {
            if ((this.f8882a instanceof Activity) == 0) {
                zzaok.m10005d("Can not create dialog without Activity Context");
                return;
            }
            i = this.f8883b;
            if (TextUtils.isEmpty(i) == 0) {
                Uri build = new Uri.Builder().encodedQuery(i.replaceAll("\\+", "%20")).build();
                i2 = new StringBuilder();
                zzbv.zzek();
                i = zzalo.m9786a(build);
                for (String str : i.keySet()) {
                    i2.append(str);
                    i2.append(" = ");
                    i2.append((String) i.get(str));
                    i2.append("\n\n");
                }
                i = i2.toString().trim();
                if (TextUtils.isEmpty(i) == 0) {
                    i2 = new Builder(this.f8882a);
                    i2.setMessage(i);
                    i2.setTitle("Ad Information");
                    i2.setPositiveButton("Share", new dn(this, i));
                    i2.setNegativeButton("Close", C2436do.f8003a);
                    i2.create().show();
                }
            }
            i = "No debug information";
            i2 = new Builder(this.f8882a);
            i2.setMessage(i);
            i2.setTitle("Ad Information");
            i2.setPositiveButton("Share", new dn(this, i));
            i2.setNegativeButton("Close", C2436do.f8003a);
            i2.create().show();
        } else if (i4 == i2) {
            zzaok.m10001b("Debug mode [Creative Preview] selected.");
            zzalm.m9772a(new dp(this));
        } else {
            if (i4 == i3) {
                zzaok.m10001b("Debug mode [Troubleshooting] selected.");
                zzalm.m9772a(new dq(this));
            }
        }
    }

    /* renamed from: d */
    final /* synthetic */ void m9894d() {
        this.f8891j = 4;
        m9885a();
    }
}
