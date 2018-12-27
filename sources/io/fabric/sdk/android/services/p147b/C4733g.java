package io.fabric.sdk.android.services.p147b;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: io.fabric.sdk.android.services.b.g */
public class C4733g extends C4296h {
    public C4733g(Context context, File file, String str, String str2) {
        super(context, file, str, str2);
    }

    /* renamed from: a */
    public OutputStream mo4535a(File file) {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}
