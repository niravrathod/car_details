package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.C4029a.C2297a;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import java.util.regex.Pattern;

/* renamed from: com.google.android.exoplayer2.extractor.j */
public final class C2263j {
    /* renamed from: a */
    public static final C2297a f7173a = new C40201();
    /* renamed from: d */
    private static final Pattern f7174d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    /* renamed from: b */
    public int f7175b = -1;
    /* renamed from: c */
    public int f7176c = -1;

    /* renamed from: com.google.android.exoplayer2.extractor.j$1 */
    static class C40201 implements C2297a {
        /* renamed from: a */
        public boolean mo1622a(int i, int i2, int i3, int i4, int i5) {
            return i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2);
        }

        C40201() {
        }
    }

    /* renamed from: a */
    public boolean m8328a(int i) {
        int i2 = i >> 12;
        i &= 4095;
        if (i2 <= 0) {
            if (i <= 0) {
                return false;
            }
        }
        this.f7175b = i2;
        this.f7176c = i;
        return true;
    }

    /* renamed from: a */
    public boolean m8329a(Metadata metadata) {
        for (int i = 0; i < metadata.m8400a(); i++) {
            Entry a = metadata.m8401a(i);
            if (a instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) a;
                if (m8326a(commentFrame.f19405b, commentFrame.f19406c)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m8326a(java.lang.String r5, java.lang.String r6) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r4 = this;
        r0 = "iTunSMPB";
        r5 = r0.equals(r5);
        r0 = 0;
        if (r5 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r5 = f7174d;
        r5 = r5.matcher(r6);
        r6 = r5.find();
        if (r6 == 0) goto L_0x0033;
    L_0x0016:
        r6 = 1;
        r1 = r5.group(r6);	 Catch:{ NumberFormatException -> 0x0033 }
        r2 = 16;	 Catch:{ NumberFormatException -> 0x0033 }
        r1 = java.lang.Integer.parseInt(r1, r2);	 Catch:{ NumberFormatException -> 0x0033 }
        r3 = 2;	 Catch:{ NumberFormatException -> 0x0033 }
        r5 = r5.group(r3);	 Catch:{ NumberFormatException -> 0x0033 }
        r5 = java.lang.Integer.parseInt(r5, r2);	 Catch:{ NumberFormatException -> 0x0033 }
        if (r1 > 0) goto L_0x002e;	 Catch:{ NumberFormatException -> 0x0033 }
    L_0x002c:
        if (r5 <= 0) goto L_0x0033;	 Catch:{ NumberFormatException -> 0x0033 }
    L_0x002e:
        r4.f7175b = r1;	 Catch:{ NumberFormatException -> 0x0033 }
        r4.f7176c = r5;	 Catch:{ NumberFormatException -> 0x0033 }
        return r6;
    L_0x0033:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.j.a(java.lang.String, java.lang.String):boolean");
    }

    /* renamed from: a */
    public boolean m8327a() {
        return (this.f7175b == -1 || this.f7176c == -1) ? false : true;
    }
}
