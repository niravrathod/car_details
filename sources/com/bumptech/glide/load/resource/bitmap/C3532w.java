package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C1218d;
import com.bumptech.glide.load.C1218d.C1217a;
import com.bumptech.glide.load.C1280f;
import com.bumptech.glide.load.C3452e;
import com.bumptech.glide.load.engine.C1277s;
import com.bumptech.glide.load.engine.p060a.C1232e;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.resource.bitmap.w */
public class C3532w<T> implements C1280f<T, Bitmap> {
    /* renamed from: a */
    public static final C1218d<Long> f14565a = C1218d.m4989a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", Long.valueOf(-1), new C35281());
    /* renamed from: b */
    public static final C1218d<Integer> f14566b = C1218d.m4989a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", Integer.valueOf(2), new C35292());
    /* renamed from: c */
    private static final C1290b f14567c = new C1290b();
    /* renamed from: d */
    private final C1291c<T> f14568d;
    /* renamed from: e */
    private final C1232e f14569e;
    /* renamed from: f */
    private final C1290b f14570f;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$b */
    static class C1290b {
        C1290b() {
        }

        /* renamed from: a */
        public MediaMetadataRetriever m5224a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$c */
    interface C1291c<T> {
        /* renamed from: a */
        void mo1064a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$1 */
    class C35281 implements C1217a<Long> {
        /* renamed from: a */
        private final ByteBuffer f14563a = ByteBuffer.allocate(8);

        C35281() {
        }

        /* renamed from: a */
        public void m17865a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f14563a) {
                this.f14563a.position(0);
                messageDigest.update(this.f14563a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$2 */
    class C35292 implements C1217a<Integer> {
        /* renamed from: a */
        private final ByteBuffer f14564a = ByteBuffer.allocate(4);

        C35292() {
        }

        /* renamed from: a */
        public void m17867a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.f14564a) {
                    this.f14564a.position(0);
                    messageDigest.update(this.f14564a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$a */
    private static final class C3530a implements C1291c<AssetFileDescriptor> {
        private C3530a() {
        }

        /* renamed from: a */
        public void m17869a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.w$d */
    static final class C3531d implements C1291c<ParcelFileDescriptor> {
        C3531d() {
        }

        /* renamed from: a */
        public void m17871a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: a */
    public boolean mo1051a(T t, C3452e c3452e) {
        return true;
    }

    /* renamed from: a */
    public static C1280f<AssetFileDescriptor, Bitmap> m17875a(C1232e c1232e) {
        return new C3532w(c1232e, new C3530a());
    }

    /* renamed from: b */
    public static C1280f<ParcelFileDescriptor, Bitmap> m17877b(C1232e c1232e) {
        return new C3532w(c1232e, new C3531d());
    }

    C3532w(C1232e c1232e, C1291c<T> c1291c) {
        this(c1232e, c1291c, f14567c);
    }

    C3532w(C1232e c1232e, C1291c<T> c1291c, C1290b c1290b) {
        this.f14569e = c1232e;
        this.f14568d = c1291c;
        this.f14570f = c1290b;
    }

    /* renamed from: a */
    public C1277s<Bitmap> mo1050a(T t, int i, int i2, C3452e c3452e) {
        long longValue = ((Long) c3452e.m17523a(f14565a)).longValue();
        if (longValue < 0) {
            if (longValue != -1) {
                i = new StringBuilder();
                i.append("Requested frame must be non-negative, or DEFAULT_FRAME, given: ");
                i.append(longValue);
                throw new IllegalArgumentException(i.toString());
            }
        }
        Integer num = (Integer) c3452e.m17523a(f14566b);
        if (num == null) {
            num = Integer.valueOf(2);
        }
        c3452e = (DownsampleStrategy) c3452e.m17523a(DownsampleStrategy.f4043h);
        if (c3452e == null) {
            c3452e = DownsampleStrategy.f4042g;
        }
        C3452e c3452e2 = c3452e;
        c3452e = this.f14570f.m5224a();
        try {
            this.f14568d.mo1064a(c3452e, t);
            t = C3532w.m17874a(c3452e, longValue, num.intValue(), i, i2, c3452e2);
            c3452e.release();
            return C3515d.m17802a(t, this.f14569e);
        } catch (T t2) {
            throw new IOException(t2);
        } catch (Throwable th) {
            c3452e.release();
        }
    }

    /* renamed from: a */
    private static Bitmap m17874a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        i2 = (VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || downsampleStrategy == DownsampleStrategy.f4041f) ? 0 : C3532w.m17876b(mediaMetadataRetriever, j, i, i2, i3, downsampleStrategy);
        return i2 == 0 ? C3532w.m17873a(mediaMetadataRetriever, j, i) : i2;
    }

    @TargetApi(27)
    /* renamed from: b */
    private static Bitmap m17876b(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, DownsampleStrategy downsampleStrategy) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                int i4 = parseInt2;
                parseInt2 = parseInt;
                parseInt = i4;
            }
            i2 = downsampleStrategy.mo1052a(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * i2), Math.round(i2 * ((float) parseInt2)));
        } catch (MediaMetadataRetriever mediaMetadataRetriever2) {
            if (Log.isLoggable("VideoDecoder", 3) != null) {
                Log.d("VideoDecoder", "Exception trying to decode frame on oreo+", mediaMetadataRetriever2);
            }
            return null;
        }
    }

    /* renamed from: a */
    private static Bitmap m17873a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }
}
