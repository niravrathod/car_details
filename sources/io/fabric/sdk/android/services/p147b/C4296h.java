package io.fabric.sdk.android.services.p147b;

import android.content.Context;
import io.fabric.sdk.android.services.common.C2808o;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.fabric.sdk.android.services.b.h */
public class C4296h implements C2781c {
    /* renamed from: a */
    private final Context f18013a;
    /* renamed from: b */
    private final File f18014b;
    /* renamed from: c */
    private final String f18015c;
    /* renamed from: d */
    private final File f18016d;
    /* renamed from: e */
    private C2808o f18017e = new C2808o(this.f18016d);
    /* renamed from: f */
    private File f18018f;

    public C4296h(Context context, File file, String str, String str2) {
        this.f18013a = context;
        this.f18014b = file;
        this.f18015c = str2;
        this.f18016d = new File(this.f18014b, str);
        m23601e();
    }

    /* renamed from: e */
    private void m23601e() {
        this.f18018f = new File(this.f18014b, this.f18015c);
        if (!this.f18018f.exists()) {
            this.f18018f.mkdirs();
        }
    }

    /* renamed from: a */
    public void mo3570a(byte[] bArr) {
        this.f18017e.m13719a(bArr);
    }

    /* renamed from: a */
    public int mo3566a() {
        return this.f18017e.m13717a();
    }

    /* renamed from: a */
    public void mo3568a(String str) {
        this.f18017e.close();
        m23600a(this.f18016d, new File(this.f18018f, str));
        this.f18017e = new C2808o(this.f18016d);
    }

    /* renamed from: a */
    private void m23600a(File file, File file2) {
        Closeable fileInputStream;
        Closeable a;
        Closeable closeable = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                a = mo4535a(file2);
            } catch (Throwable th) {
                file2 = th;
                CommonUtils.m13613a(fileInputStream, "Failed to close file input stream");
                CommonUtils.m13613a(closeable, "Failed to close output stream");
                file.delete();
                throw file2;
            }
            try {
                CommonUtils.m13615a((InputStream) fileInputStream, (OutputStream) a, new byte[1024]);
                CommonUtils.m13613a(fileInputStream, "Failed to close file input stream");
                CommonUtils.m13613a(a, "Failed to close output stream");
                file.delete();
            } catch (Throwable th2) {
                Throwable th3 = th2;
                closeable = a;
                file2 = th3;
                CommonUtils.m13613a(fileInputStream, "Failed to close file input stream");
                CommonUtils.m13613a(closeable, "Failed to close output stream");
                file.delete();
                throw file2;
            }
        } catch (Throwable th4) {
            file2 = th4;
            fileInputStream = null;
            CommonUtils.m13613a(fileInputStream, "Failed to close file input stream");
            CommonUtils.m13613a(closeable, "Failed to close output stream");
            file.delete();
            throw file2;
        }
    }

    /* renamed from: a */
    public OutputStream mo4535a(File file) {
        return new FileOutputStream(file);
    }

    /* renamed from: a */
    public List<File> mo3567a(int i) {
        List<File> arrayList = new ArrayList();
        for (Object add : this.f18018f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo3569a(List<File> list) {
        for (File file : list) {
            CommonUtils.m13610a(this.f18013a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    /* renamed from: c */
    public List<File> mo3573c() {
        return Arrays.asList(this.f18018f.listFiles());
    }

    /* renamed from: d */
    public void mo3574d() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r0 = r1.f18017e;	 Catch:{ IOException -> 0x0005 }
        r0.close();	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        r0 = r1.f18016d;
        r0.delete();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.b.h.d():void");
    }

    /* renamed from: b */
    public boolean mo3572b() {
        return this.f18017e.m13722b();
    }

    /* renamed from: a */
    public boolean mo3571a(int i, int i2) {
        return this.f18017e.m13721a(i, i2);
    }
}
