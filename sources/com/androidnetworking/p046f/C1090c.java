package com.androidnetworking.p046f;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.widget.ImageView.ScaleType;
import com.androidnetworking.common.C1053a;
import com.androidnetworking.common.C1054b;
import com.androidnetworking.error.ANError;
import com.androidnetworking.p043b.C1040b;
import com.androidnetworking.p044d.C1057a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URLConnection;
import okhttp3.C2900c;
import okhttp3.aa;
import okio.C4905m;

/* renamed from: com.androidnetworking.f.c */
public class C1090c {
    /* renamed from: a */
    public static File m4592a(Context context, String str) {
        return new File(context.getCacheDir(), str);
    }

    /* renamed from: a */
    public static C2900c m4594a(Context context, int i, String str) {
        return new C2900c(C1090c.m4592a(context, str), (long) i);
    }

    /* renamed from: a */
    public static String m4593a(String str) {
        str = URLConnection.getFileNameMap().getContentTypeFor(str);
        return str == null ? "application/octet-stream" : str;
    }

    /* renamed from: a */
    public static C1054b<Bitmap> m4589a(aa aaVar, int i, int i2, Config config, ScaleType scaleType) {
        return C1090c.m4588a(aaVar, i, i2, config, new Options(), scaleType);
    }

    /* renamed from: a */
    public static C1054b<Bitmap> m4588a(aa aaVar, int i, int i2, Config config, Options options, ScaleType scaleType) {
        Object decodeByteArray;
        byte[] bArr = new byte[0];
        try {
            bArr = C4905m.a(aaVar.m14017h().mo916c()).mo4577s();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (i == 0 && i2 == 0) {
            options.inPreferredConfig = config;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int a = C1090c.m4587a(i, i2, i3, i4, scaleType);
            i = C1090c.m4587a(i2, i, i4, i3, scaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = C1090c.m4586a(i3, i4, a, i);
            i2 = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (i2 == 0 || (i2.getWidth() <= a && i2.getHeight() <= i)) {
                decodeByteArray = i2;
            } else {
                decodeByteArray = Bitmap.createScaledBitmap(i2, a, i, true);
                i2.recycle();
            }
        }
        if (decodeByteArray == 0) {
            return C1054b.m4492a(C1090c.m4597b(new ANError(aaVar)));
        }
        return C1054b.m4493a(decodeByteArray);
    }

    /* renamed from: a */
    private static int m4587a(int i, int i2, int i3, int i4, ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        } else {
            if (i == 0) {
                i = (double) i2;
                i4 = (double) i4;
                Double.isNaN(i);
                Double.isNaN(i4);
                i /= i4;
                i3 = (double) i3;
                Double.isNaN(i3);
                return (int) (i3 * i);
            } else if (i2 == 0) {
                return i;
            } else {
                double d = (double) i4;
                i3 = (double) i3;
                Double.isNaN(d);
                Double.isNaN(i3);
                d /= i3;
                double d2;
                if (scaleType == ScaleType.CENTER_CROP) {
                    i3 = (double) i;
                    Double.isNaN(i3);
                    d2 = (double) i2;
                    if (i3 * d < d2) {
                        Double.isNaN(d2);
                        i = (int) (d2 / d);
                    }
                    return i;
                }
                i3 = (double) i;
                Double.isNaN(i3);
                d2 = (double) i2;
                if (i3 * d > d2) {
                    Double.isNaN(d2);
                    i = (int) (d2 / d);
                }
                return i;
            }
        }
    }

    /* renamed from: a */
    public static int m4586a(int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        d /= d2;
        i = (double) i2;
        i3 = (double) i4;
        Double.isNaN(i);
        Double.isNaN(i3);
        i = Math.min(d, i / i3);
        i3 = 1065353216;
        while (true) {
            i4 = 1073741824 * i3;
            if (((double) i4) > i) {
                return (int) i3;
            }
            i3 = i4;
        }
    }

    /* renamed from: a */
    public static void m4596a(aa aaVar, String str, String str2) {
        byte[] bArr = new byte[2048];
        FileOutputStream fileOutputStream = null;
        try {
            aaVar = aaVar.m14017h().m14031d();
            try {
                File file = new File(str);
                if (file.exists() == null) {
                    file.mkdirs();
                }
                str2 = new FileOutputStream(new File(file, str2));
                while (true) {
                    try {
                        str = aaVar.read(bArr);
                        if (str == -1) {
                            break;
                        }
                        str2.write(bArr, 0, str);
                    } catch (Throwable th) {
                        str = th;
                        fileOutputStream = str2;
                    }
                }
                str2.flush();
                if (aaVar != null) {
                    try {
                        aaVar.close();
                    } catch (aa aaVar2) {
                        aaVar2.printStackTrace();
                    }
                }
                try {
                    str2.close();
                } catch (aa aaVar22) {
                    aaVar22.printStackTrace();
                }
            } catch (Throwable th2) {
                str = th2;
                if (aaVar22 != null) {
                    try {
                        aaVar22.close();
                    } catch (aa aaVar222) {
                        aaVar222.printStackTrace();
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (aa aaVar2222) {
                        aaVar2222.printStackTrace();
                    }
                }
                throw str;
            }
        } catch (Throwable th3) {
            str = th3;
            aaVar2222 = null;
            if (aaVar2222 != null) {
                aaVar2222.close();
            }
            if (fileOutputStream != null) {
                fileOutputStream.close();
            }
            throw str;
        }
    }

    /* renamed from: a */
    public static void m4595a(C1057a c1057a, long j, long j2, long j3, boolean z) {
        final C1057a c1057a2 = c1057a;
        final long j4 = j;
        final long j5 = j2;
        final long j6 = j3;
        final boolean z2 = z;
        C1040b.m4416a().m4417b().mo903c().execute(new Runnable() {
            public void run() {
                if (c1057a2 != null) {
                    c1057a2.m4504a(j4, j5, j6, z2);
                }
            }
        });
    }

    /* renamed from: a */
    public static ANError m4590a(ANError aNError) {
        aNError.m4581a("connectionError");
        aNError.m4580a(0);
        return aNError;
    }

    /* renamed from: a */
    public static ANError m4591a(ANError aNError, C1053a c1053a, int i) {
        aNError = c1053a.m4458a(aNError);
        aNError.m4580a(i);
        aNError.m4581a("responseFromServerError");
        return aNError;
    }

    /* renamed from: b */
    public static ANError m4597b(ANError aNError) {
        aNError.m4580a(0);
        aNError.m4581a("parseError");
        return aNError;
    }
}
