package com.crashlytics.android.core;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.settings.C2847o;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.crashlytics.android.core.h */
class C1367h {
    /* renamed from: a */
    private final C1366b f4282a;
    /* renamed from: b */
    private final Builder f4283b;

    /* renamed from: com.crashlytics.android.core.h$a */
    interface C1365a {
        /* renamed from: a */
        void mo1146a(boolean z);
    }

    /* renamed from: com.crashlytics.android.core.h$b */
    private static class C1366b {
        /* renamed from: a */
        private boolean f4280a;
        /* renamed from: b */
        private final CountDownLatch f4281b;

        private C1366b() {
            this.f4280a = false;
            this.f4281b = new CountDownLatch(1);
        }

        /* renamed from: a */
        void m5545a(boolean z) {
            this.f4280a = z;
            this.f4281b.countDown();
        }

        /* renamed from: a */
        boolean m5546a() {
            return this.f4280a;
        }

        /* renamed from: b */
        void m5547b() {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r1 = this;
            r0 = r1.f4281b;	 Catch:{ InterruptedException -> 0x0005 }
            r0.await();	 Catch:{ InterruptedException -> 0x0005 }
        L_0x0005:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.h.b.b():void");
        }
    }

    /* renamed from: a */
    private static int m5548a(float f, int i) {
        return (int) (f * ((float) i));
    }

    /* renamed from: a */
    public static C1367h m5550a(Activity activity, C2847o c2847o, final C1365a c1365a) {
        final C1366b c1366b = new C1366b();
        C1397t c1397t = new C1397t(activity, c2847o);
        Builder builder = new Builder(activity);
        activity = C1367h.m5549a(activity, c1397t.m5675b());
        builder.setView(activity).setTitle(c1397t.m5674a()).setCancelable(false).setNeutralButton(c1397t.m5676c(), new OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                c1366b.m5545a(true);
                dialogInterface.dismiss();
            }
        });
        if (c2847o.f12039d != null) {
            builder.setNegativeButton(c1397t.m5678e(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    c1366b.m5545a(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (c2847o.f12041f != null) {
            builder.setPositiveButton(c1397t.m5677d(), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    c1365a.mo1146a(true);
                    c1366b.m5545a(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new C1367h(builder, c1366b);
    }

    /* renamed from: a */
    private static ScrollView m5549a(Activity activity, String str) {
        float f = activity.getResources().getDisplayMetrics().density;
        int a = C1367h.m5548a(f, 5);
        View textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(a, a, a, a);
        textView.setFocusable(null);
        str = new ScrollView(activity);
        str.setPadding(C1367h.m5548a(f, 14), C1367h.m5548a(f, 2), C1367h.m5548a(f, 10), C1367h.m5548a(f, 12));
        str.addView(textView);
        return str;
    }

    private C1367h(Builder builder, C1366b c1366b) {
        this.f4282a = c1366b;
        this.f4283b = builder;
    }

    /* renamed from: a */
    public void m5551a() {
        this.f4283b.show();
    }

    /* renamed from: b */
    public void m5552b() {
        this.f4282a.m5547b();
    }

    /* renamed from: c */
    public boolean m5553c() {
        return this.f4282a.m5546a();
    }
}
