package com.google.android.gms.internal.measurement;

final /* synthetic */ class dw {
    /* renamed from: a */
    private static final /* synthetic */ int[] f10126a = new int[zzyq.values().length];

    static {
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
        r0 = com.google.android.gms.internal.measurement.zzyq.values();
        r0 = r0.length;
        r0 = new int[r0];
        f10126a = r0;
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1 = com.google.android.gms.internal.measurement.zzyq.DOUBLE;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
        r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
    L_0x0014:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x001f }
        r1 = com.google.android.gms.internal.measurement.zzyq.FLOAT;	 Catch:{ NoSuchFieldError -> 0x001f }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
        r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
    L_0x001f:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x002a }
        r1 = com.google.android.gms.internal.measurement.zzyq.INT64;	 Catch:{ NoSuchFieldError -> 0x002a }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
        r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
    L_0x002a:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r1 = com.google.android.gms.internal.measurement.zzyq.UINT64;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
        r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
    L_0x0035:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r1 = com.google.android.gms.internal.measurement.zzyq.INT32;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
        r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
    L_0x0040:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x004b }
        r1 = com.google.android.gms.internal.measurement.zzyq.FIXED64;	 Catch:{ NoSuchFieldError -> 0x004b }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
        r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
    L_0x004b:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r1 = com.google.android.gms.internal.measurement.zzyq.FIXED32;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
        r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
    L_0x0056:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r1 = com.google.android.gms.internal.measurement.zzyq.BOOL;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
        r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
    L_0x0062:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x006e }
        r1 = com.google.android.gms.internal.measurement.zzyq.BYTES;	 Catch:{ NoSuchFieldError -> 0x006e }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
        r2 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x006e }
    L_0x006e:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x007a }
        r1 = com.google.android.gms.internal.measurement.zzyq.UINT32;	 Catch:{ NoSuchFieldError -> 0x007a }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
        r2 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007a }
    L_0x007a:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x0086 }
        r1 = com.google.android.gms.internal.measurement.zzyq.SFIXED32;	 Catch:{ NoSuchFieldError -> 0x0086 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0086 }
        r2 = 11;	 Catch:{ NoSuchFieldError -> 0x0086 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0086 }
    L_0x0086:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x0092 }
        r1 = com.google.android.gms.internal.measurement.zzyq.SFIXED64;	 Catch:{ NoSuchFieldError -> 0x0092 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0092 }
        r2 = 12;	 Catch:{ NoSuchFieldError -> 0x0092 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0092 }
    L_0x0092:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x009e }
        r1 = com.google.android.gms.internal.measurement.zzyq.SINT32;	 Catch:{ NoSuchFieldError -> 0x009e }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x009e }
        r2 = 13;	 Catch:{ NoSuchFieldError -> 0x009e }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x009e }
    L_0x009e:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x00aa }
        r1 = com.google.android.gms.internal.measurement.zzyq.SINT64;	 Catch:{ NoSuchFieldError -> 0x00aa }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00aa }
        r2 = 14;	 Catch:{ NoSuchFieldError -> 0x00aa }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00aa }
    L_0x00aa:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x00b6 }
        r1 = com.google.android.gms.internal.measurement.zzyq.STRING;	 Catch:{ NoSuchFieldError -> 0x00b6 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00b6 }
        r2 = 15;	 Catch:{ NoSuchFieldError -> 0x00b6 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00b6 }
    L_0x00b6:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x00c2 }
        r1 = com.google.android.gms.internal.measurement.zzyq.GROUP;	 Catch:{ NoSuchFieldError -> 0x00c2 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00c2 }
        r2 = 16;	 Catch:{ NoSuchFieldError -> 0x00c2 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00c2 }
    L_0x00c2:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x00ce }
        r1 = com.google.android.gms.internal.measurement.zzyq.MESSAGE;	 Catch:{ NoSuchFieldError -> 0x00ce }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00ce }
        r2 = 17;	 Catch:{ NoSuchFieldError -> 0x00ce }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00ce }
    L_0x00ce:
        r0 = f10126a;	 Catch:{ NoSuchFieldError -> 0x00da }
        r1 = com.google.android.gms.internal.measurement.zzyq.ENUM;	 Catch:{ NoSuchFieldError -> 0x00da }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x00da }
        r2 = 18;	 Catch:{ NoSuchFieldError -> 0x00da }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x00da }
    L_0x00da:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.dw.<clinit>():void");
    }
}
