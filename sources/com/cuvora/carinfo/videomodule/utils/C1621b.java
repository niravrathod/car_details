package com.cuvora.carinfo.videomodule.utils;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.C0389b;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.ui.C1589a;
import com.feedbox.C2110d;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import kotlin.TypeCastException;
import kotlin.collections.C4329j;
import kotlin.collections.C4888r;
import kotlin.jvm.internal.C2885g;
import kotlin.text.C4886o;
import kotlin.text.Regex;

/* renamed from: com.cuvora.carinfo.videomodule.utils.b */
public final class C1621b {
    /* renamed from: a */
    public static final C1621b f4881a = new C1621b();
    /* renamed from: b */
    private static final ColorDrawable f4882b = new ColorDrawable(C0389b.m1438c(((C2110d) C2110d.f6448c.m7672a()).m7676a().getApplicationContext(), R.color.color_gray_back));

    /* renamed from: com.cuvora.carinfo.videomodule.utils.b$b */
    static final class C1619b implements Runnable {
        /* renamed from: a */
        final /* synthetic */ TextView f4867a;
        /* renamed from: b */
        final /* synthetic */ int f4868b;
        /* renamed from: c */
        final /* synthetic */ String f4869c;
        /* renamed from: d */
        final /* synthetic */ Context f4870d;
        /* renamed from: e */
        final /* synthetic */ int f4871e;
        /* renamed from: f */
        final /* synthetic */ boolean f4872f;
        /* renamed from: g */
        final /* synthetic */ C1589a f4873g;

        C1619b(TextView textView, int i, String str, Context context, int i2, boolean z, C1589a c1589a) {
            this.f4867a = textView;
            this.f4868b = i;
            this.f4869c = str;
            this.f4870d = context;
            this.f4871e = i2;
            this.f4872f = z;
            this.f4873g = c1589a;
        }

        public final void run() {
            if (this.f4867a.getLineCount() > this.f4868b) {
                List a = new Regex("... more").m13920a(this.f4867a.getText().toString(), 0);
                if (!a.isEmpty()) {
                    ListIterator listIterator = a.listIterator(a.size());
                    while (listIterator.hasPrevious()) {
                        Object obj;
                        if (((String) listIterator.previous()).length() == 0) {
                            obj = 1;
                            continue;
                        } else {
                            obj = null;
                            continue;
                        }
                        if (obj == null) {
                            a = C4888r.m30246b(a, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                a = C4329j.m23705a();
                Collection collection = a;
                if (collection != null) {
                    Object[] toArray = collection.toArray(new String[0]);
                    if (toArray != null) {
                        String str = ((String[]) toArray)[0];
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(str.subSequence(0, str.length() - (this.f4869c.length() + 1)).toString());
                        stringBuilder.append("... ");
                        stringBuilder.append(this.f4869c);
                        this.f4867a.setText(stringBuilder.toString());
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                }
                throw new TypeCastException("null cannot be cast to non-null type java.util.Collection<T>");
            }
            TextView textView = this.f4867a;
            C1621b c1621b = C1621b.f4881a;
            Context context = this.f4870d;
            Object fromHtml = Html.fromHtml(this.f4867a.getText().toString());
            C2885g.m13907a(fromHtml, "Html.fromHtml(tv.text.toString())");
            textView.setText(c1621b.m6193a(context, (Spanned) fromHtml, this.f4867a, this.f4868b, this.f4871e, this.f4869c, this.f4872f, this.f4873g), BufferType.SPANNABLE);
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.utils.b$c */
    public static final class C1620c implements OnGlobalLayoutListener {
        /* renamed from: a */
        final /* synthetic */ TextView f4874a;
        /* renamed from: b */
        final /* synthetic */ int f4875b;
        /* renamed from: c */
        final /* synthetic */ String f4876c;
        /* renamed from: d */
        final /* synthetic */ Context f4877d;
        /* renamed from: e */
        final /* synthetic */ int f4878e;
        /* renamed from: f */
        final /* synthetic */ boolean f4879f;
        /* renamed from: g */
        final /* synthetic */ C1589a f4880g;

        C1620c(TextView textView, int i, String str, Context context, int i2, boolean z, C1589a c1589a) {
            this.f4874a = textView;
            this.f4875b = i;
            this.f4876c = str;
            this.f4877d = context;
            this.f4878e = i2;
            this.f4879f = z;
            this.f4880g = c1589a;
        }

        public void onGlobalLayout() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
            /*
            r12 = this;
            r0 = r12.f4874a;
            r0 = r0.getViewTreeObserver();
            r1 = r12;
            r1 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r1;
            r0.removeGlobalOnLayoutListener(r1);
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLayout();	 Catch:{ Exception -> 0x01a1 }
            if (r0 == 0) goto L_0x01a2;	 Catch:{ Exception -> 0x01a1 }
        L_0x0014:
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLineCount();	 Catch:{ Exception -> 0x01a1 }
            r1 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            r1 = r1 + 1;	 Catch:{ Exception -> 0x01a1 }
            if (r0 >= r1) goto L_0x0021;	 Catch:{ Exception -> 0x01a1 }
        L_0x0020:
            return;	 Catch:{ Exception -> 0x01a1 }
        L_0x0021:
            r0 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            r1 = 0;	 Catch:{ Exception -> 0x01a1 }
            if (r0 != 0) goto L_0x0082;	 Catch:{ Exception -> 0x01a1 }
        L_0x0026:
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLayout();	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLineEnd(r1);	 Catch:{ Exception -> 0x01a1 }
            r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a1 }
            r2.<init>();	 Catch:{ Exception -> 0x01a1 }
            r3 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r3 = r3.getText();	 Catch:{ Exception -> 0x01a1 }
            r4 = r12.f4876c;	 Catch:{ Exception -> 0x01a1 }
            r4 = r4.length();	 Catch:{ Exception -> 0x01a1 }
            r4 = r4 + 4;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0 - r4;	 Catch:{ Exception -> 0x01a1 }
            r0 = r3.subSequence(r1, r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.toString();	 Catch:{ Exception -> 0x01a1 }
            r2.append(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = " ";	 Catch:{ Exception -> 0x01a1 }
            r2.append(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r12.f4876c;	 Catch:{ Exception -> 0x01a1 }
            r2.append(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r2.toString();	 Catch:{ Exception -> 0x01a1 }
            r1 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = (java.lang.CharSequence) r0;	 Catch:{ Exception -> 0x01a1 }
            r1.setText(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r1 = android.text.method.LinkMovementMethod.getInstance();	 Catch:{ Exception -> 0x01a1 }
            r0.setMovementMethod(r1);	 Catch:{ Exception -> 0x01a1 }
            r2 = com.cuvora.carinfo.videomodule.utils.C1621b.f4881a;	 Catch:{ Exception -> 0x01a1 }
            r3 = r12.f4877d;	 Catch:{ Exception -> 0x01a1 }
            r4 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r5 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            r6 = r12.f4878e;	 Catch:{ Exception -> 0x01a1 }
            r7 = r12.f4876c;	 Catch:{ Exception -> 0x01a1 }
            r8 = r12.f4879f;	 Catch:{ Exception -> 0x01a1 }
            r9 = r12.f4880g;	 Catch:{ Exception -> 0x01a1 }
            r2.m6196b(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x01a1 }
            goto L_0x01a2;	 Catch:{ Exception -> 0x01a1 }
        L_0x0082:
            r0 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            if (r0 <= 0) goto L_0x00f0;	 Catch:{ Exception -> 0x01a1 }
        L_0x0086:
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLineCount();	 Catch:{ Exception -> 0x01a1 }
            r2 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            if (r0 <= r2) goto L_0x00f0;	 Catch:{ Exception -> 0x01a1 }
        L_0x0090:
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLayout();	 Catch:{ Exception -> 0x01a1 }
            r2 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            r2 = r2 + -1;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLineEnd(r2);	 Catch:{ Exception -> 0x01a1 }
            r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a1 }
            r2.<init>();	 Catch:{ Exception -> 0x01a1 }
            r3 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r3 = r3.getText();	 Catch:{ Exception -> 0x01a1 }
            r4 = r12.f4876c;	 Catch:{ Exception -> 0x01a1 }
            r4 = r4.length();	 Catch:{ Exception -> 0x01a1 }
            r4 = r4 + 4;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0 - r4;	 Catch:{ Exception -> 0x01a1 }
            r0 = r3.subSequence(r1, r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.toString();	 Catch:{ Exception -> 0x01a1 }
            r2.append(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = "... ";	 Catch:{ Exception -> 0x01a1 }
            r2.append(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r12.f4876c;	 Catch:{ Exception -> 0x01a1 }
            r2.append(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r2.toString();	 Catch:{ Exception -> 0x01a1 }
            r1 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = (java.lang.CharSequence) r0;	 Catch:{ Exception -> 0x01a1 }
            r1.setText(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r1 = android.text.method.LinkMovementMethod.getInstance();	 Catch:{ Exception -> 0x01a1 }
            r0.setMovementMethod(r1);	 Catch:{ Exception -> 0x01a1 }
            r2 = com.cuvora.carinfo.videomodule.utils.C1621b.f4881a;	 Catch:{ Exception -> 0x01a1 }
            r3 = r12.f4877d;	 Catch:{ Exception -> 0x01a1 }
            r4 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r5 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            r6 = r12.f4878e;	 Catch:{ Exception -> 0x01a1 }
            r7 = r12.f4876c;	 Catch:{ Exception -> 0x01a1 }
            r8 = r12.f4879f;	 Catch:{ Exception -> 0x01a1 }
            r9 = r12.f4880g;	 Catch:{ Exception -> 0x01a1 }
            r2.m6196b(r3, r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x01a1 }
            goto L_0x01a2;	 Catch:{ Exception -> 0x01a1 }
        L_0x00f0:
            r0 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            if (r0 <= 0) goto L_0x0123;	 Catch:{ Exception -> 0x01a1 }
        L_0x00f4:
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLineCount();	 Catch:{ Exception -> 0x01a1 }
            r2 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            if (r0 < r2) goto L_0x0108;	 Catch:{ Exception -> 0x01a1 }
        L_0x00fe:
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLineCount();	 Catch:{ Exception -> 0x01a1 }
            r2 = r12.f4875b;	 Catch:{ Exception -> 0x01a1 }
            if (r0 != r2) goto L_0x0123;	 Catch:{ Exception -> 0x01a1 }
        L_0x0108:
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getText();	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.toString();	 Catch:{ Exception -> 0x01a1 }
            r1 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r2 = r0;	 Catch:{ Exception -> 0x01a1 }
            r2 = (java.lang.CharSequence) r2;	 Catch:{ Exception -> 0x01a1 }
            r1.setText(r2);	 Catch:{ Exception -> 0x01a1 }
            r1 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = (java.lang.CharSequence) r0;	 Catch:{ Exception -> 0x01a1 }
            r1.setText(r0);	 Catch:{ Exception -> 0x01a1 }
            goto L_0x01a2;	 Catch:{ Exception -> 0x01a1 }
        L_0x0123:
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.getLayout();	 Catch:{ Exception -> 0x01a1 }
            r2 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r2 = r2.getLayout();	 Catch:{ Exception -> 0x01a1 }
            r3 = "tv.layout";	 Catch:{ Exception -> 0x01a1 }
            kotlin.jvm.internal.C2885g.m13907a(r2, r3);	 Catch:{ Exception -> 0x01a1 }
            r2 = r2.getLineCount();	 Catch:{ Exception -> 0x01a1 }
            r2 = r2 + -1;	 Catch:{ Exception -> 0x01a1 }
            r7 = r0.getLineEnd(r2);	 Catch:{ Exception -> 0x01a1 }
            r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x01a1 }
            r0.<init>();	 Catch:{ Exception -> 0x01a1 }
            r2 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r2 = r2.getText();	 Catch:{ Exception -> 0x01a1 }
            r1 = r2.subSequence(r1, r7);	 Catch:{ Exception -> 0x01a1 }
            r1 = r1.toString();	 Catch:{ Exception -> 0x01a1 }
            r0.append(r1);	 Catch:{ Exception -> 0x01a1 }
            r1 = " ";	 Catch:{ Exception -> 0x01a1 }
            r0.append(r1);	 Catch:{ Exception -> 0x01a1 }
            r1 = r12.f4876c;	 Catch:{ Exception -> 0x01a1 }
            r0.append(r1);	 Catch:{ Exception -> 0x01a1 }
            r0 = r0.toString();	 Catch:{ Exception -> 0x01a1 }
            r1 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r0 = (java.lang.CharSequence) r0;	 Catch:{ Exception -> 0x01a1 }
            r1.setText(r0);	 Catch:{ Exception -> 0x01a1 }
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r1 = android.text.method.LinkMovementMethod.getInstance();	 Catch:{ Exception -> 0x01a1 }
            r0.setMovementMethod(r1);	 Catch:{ Exception -> 0x01a1 }
            r0 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r3 = com.cuvora.carinfo.videomodule.utils.C1621b.f4881a;	 Catch:{ Exception -> 0x01a1 }
            r4 = r12.f4877d;	 Catch:{ Exception -> 0x01a1 }
            r1 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r1 = r1.getText();	 Catch:{ Exception -> 0x01a1 }
            r1 = r1.toString();	 Catch:{ Exception -> 0x01a1 }
            r5 = android.text.Html.fromHtml(r1);	 Catch:{ Exception -> 0x01a1 }
            r1 = "Html.fromHtml(tv.text.toString())";	 Catch:{ Exception -> 0x01a1 }
            kotlin.jvm.internal.C2885g.m13907a(r5, r1);	 Catch:{ Exception -> 0x01a1 }
            r6 = r12.f4874a;	 Catch:{ Exception -> 0x01a1 }
            r8 = r12.f4878e;	 Catch:{ Exception -> 0x01a1 }
            r9 = r12.f4876c;	 Catch:{ Exception -> 0x01a1 }
            r10 = r12.f4879f;	 Catch:{ Exception -> 0x01a1 }
            r11 = r12.f4880g;	 Catch:{ Exception -> 0x01a1 }
            r1 = r3.m6193a(r4, r5, r6, r7, r8, r9, r10, r11);	 Catch:{ Exception -> 0x01a1 }
            r1 = (java.lang.CharSequence) r1;	 Catch:{ Exception -> 0x01a1 }
            r2 = android.widget.TextView.BufferType.SPANNABLE;	 Catch:{ Exception -> 0x01a1 }
            r0.setText(r1, r2);	 Catch:{ Exception -> 0x01a1 }
            goto L_0x01a2;
        L_0x01a2:
            r0 = r12.f4880g;
            if (r0 == 0) goto L_0x01a9;
        L_0x01a6:
            r0.m6121a();
        L_0x01a9:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.cuvora.carinfo.videomodule.utils.b.c.onGlobalLayout():void");
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.utils.b$a */
    public static final class C3734a extends C1624d {
        /* renamed from: a */
        final /* synthetic */ boolean f14990a;
        /* renamed from: b */
        final /* synthetic */ TextView f14991b;
        /* renamed from: c */
        final /* synthetic */ Context f14992c;
        /* renamed from: d */
        final /* synthetic */ int f14993d;
        /* renamed from: e */
        final /* synthetic */ C1589a f14994e;

        C3734a(boolean z, TextView textView, Context context, int i, C1589a c1589a, boolean z2, int i2) {
            this.f14990a = z;
            this.f14991b = textView;
            this.f14992c = context;
            this.f14993d = i;
            this.f14994e = c1589a;
            super(z2, i2);
        }

        public void onClick(View view) {
            C2885g.m13910b(view, "widget");
            if (this.f14990a != null) {
                this.f14991b.setLayoutParams(this.f14991b.getLayoutParams());
                this.f14991b.setText(this.f14991b.getTag().toString(), BufferType.SPANNABLE);
                this.f14991b.invalidate();
                C1621b.f4881a.m6199a(this.f14992c, this.f14991b, -1, this.f14993d, "less", false, this.f14994e);
                return;
            }
            this.f14991b.setLayoutParams(this.f14991b.getLayoutParams());
            this.f14991b.setText(this.f14991b.getTag().toString(), BufferType.SPANNABLE);
            this.f14991b.invalidate();
            C1621b.f4881a.m6199a(this.f14992c, this.f14991b, 2, this.f14993d, "more", true, this.f14994e);
        }
    }

    private C1621b() {
    }

    /* renamed from: a */
    public final String m6198a(long j) {
        TreeMap treeMap = new TreeMap();
        Map map = treeMap;
        map.put(Long.valueOf(1000), "k");
        map.put(Long.valueOf(1000000), "M");
        map.put(Long.valueOf(1000000000), "G");
        if (j == Long.MIN_VALUE) {
            return m6198a(-9223372036854775807L);
        }
        if (j < ((long) 1000)) {
            return String.valueOf(j);
        }
        String valueOf;
        Entry floorEntry = treeMap.floorEntry(Long.valueOf(j));
        Long l = (Long) floorEntry.getKey();
        String str = (String) floorEntry.getValue();
        long j2 = (long) 10;
        j /= l.longValue() / j2;
        double d = (double) j;
        Double.isNaN(d);
        d /= 10.0d;
        j2 = j / j2;
        j = (j >= ((long) 100) || ((long) d) == j2) ? null : 1;
        if (j != null) {
            j = new StringBuilder();
            valueOf = String.valueOf(d);
        } else {
            j = new StringBuilder();
            valueOf = String.valueOf(j2);
        }
        j.append(valueOf);
        j.append(str);
        return j.toString();
    }

    /* renamed from: a */
    public final void m6199a(Context context, TextView textView, int i, int i2, String str, boolean z, C1589a c1589a) {
        TextView textView2 = textView;
        Context context2 = context;
        C2885g.m13910b(context, "mContext");
        C2885g.m13910b(textView, "tv");
        String str2 = str;
        C2885g.m13910b(str, "expandText");
        if (textView.getTag() == null) {
            textView.setTag(textView.getText());
        }
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C1620c(textView, i, str, context, i2, z, c1589a));
    }

    /* renamed from: b */
    private final void m6196b(Context context, TextView textView, int i, int i2, String str, boolean z, C1589a c1589a) {
        Runnable c1619b = new C1619b(textView, i, str, context, i2, z, c1589a);
        TextView textView2 = textView;
        textView.post(c1619b);
    }

    /* renamed from: a */
    private final SpannableStringBuilder m6193a(Context context, Spanned spanned, TextView textView, int i, int i2, String str, boolean z, C1589a c1589a) {
        String obj = spanned.toString();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        CharSequence charSequence = obj;
        if (C4886o.m30234a(charSequence, (CharSequence) str, false, 2, null)) {
            CharSequence charSequence2 = charSequence;
            String str2 = str;
            spannableStringBuilder.setSpan(new C3734a(z, textView, context, i2, c1589a, false, i2), C4886o.m30236b(charSequence2, str2, 0, false, 6, null), C4886o.m30236b(charSequence2, str2, 0, false, 6, null) + str.length(), 0);
        }
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public final float m6197a(Context context) {
        C2885g.m13910b(context, "context");
        Object resources = context.getResources();
        C2885g.m13907a(resources, "context.resources");
        return ((float) resources.getConfiguration().smallestScreenWidthDp) / 360.0f;
    }
}
