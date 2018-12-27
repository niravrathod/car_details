package com.bumptech.glide.load.engine;

import android.util.Log;
import com.bumptech.glide.load.C1216c;
import com.bumptech.glide.load.DataSource;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class GlideException extends Exception {
    /* renamed from: a */
    private static final StackTraceElement[] f3926a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List<Throwable> causes;
    private Class<?> dataClass;
    private DataSource dataSource;
    private String detailMessage;
    private C1216c key;

    /* renamed from: com.bumptech.glide.load.engine.GlideException$a */
    private static final class C1224a implements Appendable {
        /* renamed from: a */
        private final Appendable f3924a;
        /* renamed from: b */
        private boolean f3925b = true;

        /* renamed from: a */
        private CharSequence m5007a(CharSequence charSequence) {
            return charSequence == null ? "" : charSequence;
        }

        C1224a(Appendable appendable) {
            this.f3924a = appendable;
        }

        public Appendable append(char c) {
            boolean z = false;
            if (this.f3925b) {
                this.f3925b = false;
                this.f3924a.append("  ");
            }
            if (c == '\n') {
                z = true;
            }
            this.f3925b = z;
            this.f3924a.append(c);
            return this;
        }

        public Appendable append(CharSequence charSequence) {
            charSequence = m5007a(charSequence);
            return append(charSequence, 0, charSequence.length());
        }

        public Appendable append(CharSequence charSequence, int i, int i2) {
            charSequence = m5007a(charSequence);
            boolean z = false;
            if (this.f3925b) {
                this.f3925b = false;
                this.f3924a.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f3925b = z;
            this.f3924a.append(charSequence, i, i2);
            return this;
        }
    }

    public Throwable fillInStackTrace() {
        return this;
    }

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public GlideException(String str, Throwable th) {
        this(str, Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.detailMessage = str;
        setStackTrace(f3926a);
        this.causes = list;
    }

    /* renamed from: a */
    void m5014a(C1216c c1216c, DataSource dataSource) {
        m5015a(c1216c, dataSource, null);
    }

    /* renamed from: a */
    void m5015a(C1216c c1216c, DataSource dataSource, Class<?> cls) {
        this.key = c1216c;
        this.dataSource = dataSource;
        this.dataClass = cls;
    }

    /* renamed from: a */
    public List<Throwable> m5013a() {
        return this.causes;
    }

    /* renamed from: b */
    public List<Throwable> m5017b() {
        List arrayList = new ArrayList();
        m5010a((Throwable) this, arrayList);
        return arrayList;
    }

    /* renamed from: a */
    public void m5016a(String str) {
        List b = m5017b();
        int size = b.size();
        int i = 0;
        while (i < size) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Root cause (");
            int i2 = i + 1;
            stringBuilder.append(i2);
            stringBuilder.append(" of ");
            stringBuilder.append(size);
            stringBuilder.append(")");
            Log.i(str, stringBuilder.toString(), (Throwable) b.get(i));
            i = i2;
        }
    }

    /* renamed from: a */
    private void m5010a(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable a : ((GlideException) th).m5013a()) {
                m5010a(a, (List) list);
            }
            return;
        }
        list.add(th);
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    public void printStackTrace(PrintStream printStream) {
        m5008a((Appendable) printStream);
    }

    public void printStackTrace(PrintWriter printWriter) {
        m5008a((Appendable) printWriter);
    }

    /* renamed from: a */
    private void m5008a(Appendable appendable) {
        m5009a((Throwable) this, appendable);
        m5011a(m5013a(), new C1224a(appendable));
    }

    public String getMessage() {
        String stringBuilder;
        StringBuilder stringBuilder2 = new StringBuilder(71);
        stringBuilder2.append(this.detailMessage);
        if (this.dataClass != null) {
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(", ");
            stringBuilder3.append(this.dataClass);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        if (this.dataSource != null) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(", ");
            stringBuilder3.append(this.dataSource);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        if (this.key != null) {
            stringBuilder3 = new StringBuilder();
            stringBuilder3.append(", ");
            stringBuilder3.append(this.key);
            stringBuilder = stringBuilder3.toString();
        } else {
            stringBuilder = "";
        }
        stringBuilder2.append(stringBuilder);
        List<Throwable> b = m5017b();
        if (b.isEmpty()) {
            return stringBuilder2.toString();
        }
        if (b.size() == 1) {
            stringBuilder2.append("\nThere was 1 cause:");
        } else {
            stringBuilder2.append("\nThere were ");
            stringBuilder2.append(b.size());
            stringBuilder2.append(" causes:");
        }
        for (Throwable th : b) {
            stringBuilder2.append('\n');
            stringBuilder2.append(th.getClass().getName());
            stringBuilder2.append('(');
            stringBuilder2.append(th.getMessage());
            stringBuilder2.append(')');
        }
        stringBuilder2.append("\n call GlideException#logRootCauses(String) for more detail");
        return stringBuilder2.toString();
    }

    /* renamed from: a */
    private static void m5009a(java.lang.Throwable r1, java.lang.Appendable r2) {
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
        r0 = r1.getClass();	 Catch:{ IOException -> 0x0020 }
        r0 = r0.toString();	 Catch:{ IOException -> 0x0020 }
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0020 }
        r0 = ": ";	 Catch:{ IOException -> 0x0020 }
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0020 }
        r0 = r1.getMessage();	 Catch:{ IOException -> 0x0020 }
        r2 = r2.append(r0);	 Catch:{ IOException -> 0x0020 }
        r0 = 10;	 Catch:{ IOException -> 0x0020 }
        r2.append(r0);	 Catch:{ IOException -> 0x0020 }
        return;
    L_0x0020:
        r2 = new java.lang.RuntimeException;
        r2.<init>(r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.GlideException.a(java.lang.Throwable, java.lang.Appendable):void");
    }

    /* renamed from: a */
    private static void m5011a(List<Throwable> list, Appendable appendable) {
        try {
            m5012b(list, appendable);
        } catch (List<Throwable> list2) {
            throw new RuntimeException(list2);
        }
    }

    /* renamed from: b */
    private static void m5012b(List<Throwable> list, Appendable appendable) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).m5008a(appendable);
            } else {
                m5009a(th, appendable);
            }
            i = i2;
        }
    }
}
