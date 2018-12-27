package com.google.android.exoplayer2.text;

import com.google.android.exoplayer2.Format;

/* renamed from: com.google.android.exoplayer2.text.f */
public interface C2357f {
    /* renamed from: a */
    public static final C2357f f7496a = new C40471();

    /* renamed from: com.google.android.exoplayer2.text.f$1 */
    static class C40471 implements C2357f {
        C40471() {
        }

        /* renamed from: a */
        public boolean mo1682a(Format format) {
            format = format.f6489f;
            if (!("text/vtt".equals(format) || "application/ttml+xml".equals(format) || "application/x-mp4-vtt".equals(format) || "application/x-subrip".equals(format) || "application/x-quicktime-tx3g".equals(format) || "application/cea-608".equals(format) || "application/x-mp4-cea-608".equals(format) || "application/cea-708".equals(format))) {
                if ("application/dvbsubs".equals(format) == null) {
                    return null;
                }
            }
            return true;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        /* renamed from: b */
        public com.google.android.exoplayer2.text.C4046e mo1683b(com.google.android.exoplayer2.Format r3) {
            /*
            r2 = this;
            r0 = r3.f6489f;
            r1 = r0.hashCode();
            switch(r1) {
                case -1351681404: goto L_0x005a;
                case -1026075066: goto L_0x0050;
                case -1004728940: goto L_0x0046;
                case 691401887: goto L_0x003c;
                case 930165504: goto L_0x0032;
                case 1566015601: goto L_0x0028;
                case 1566016562: goto L_0x001e;
                case 1668750253: goto L_0x0014;
                case 1693976202: goto L_0x000a;
                default: goto L_0x0009;
            };
        L_0x0009:
            goto L_0x0065;
        L_0x000a:
            r1 = "application/ttml+xml";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x0012:
            r0 = 2;
            goto L_0x0066;
        L_0x0014:
            r1 = "application/x-subrip";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x001c:
            r0 = 3;
            goto L_0x0066;
        L_0x001e:
            r1 = "application/cea-708";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x0026:
            r0 = 7;
            goto L_0x0066;
        L_0x0028:
            r1 = "application/cea-608";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x0030:
            r0 = 5;
            goto L_0x0066;
        L_0x0032:
            r1 = "application/x-mp4-cea-608";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x003a:
            r0 = 6;
            goto L_0x0066;
        L_0x003c:
            r1 = "application/x-quicktime-tx3g";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x0044:
            r0 = 4;
            goto L_0x0066;
        L_0x0046:
            r1 = "text/vtt";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x004e:
            r0 = 0;
            goto L_0x0066;
        L_0x0050:
            r1 = "application/x-mp4-vtt";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x0058:
            r0 = 1;
            goto L_0x0066;
        L_0x005a:
            r1 = "application/dvbsubs";
            r0 = r0.equals(r1);
            if (r0 == 0) goto L_0x0065;
        L_0x0062:
            r0 = 8;
            goto L_0x0066;
        L_0x0065:
            r0 = -1;
        L_0x0066:
            switch(r0) {
                case 0: goto L_0x00a5;
                case 1: goto L_0x009f;
                case 2: goto L_0x0099;
                case 3: goto L_0x0093;
                case 4: goto L_0x008b;
                case 5: goto L_0x0081;
                case 6: goto L_0x0081;
                case 7: goto L_0x0079;
                case 8: goto L_0x0071;
                default: goto L_0x0069;
            };
        L_0x0069:
            r3 = new java.lang.IllegalArgumentException;
            r0 = "Attempted to create decoder for unsupported format";
            r3.<init>(r0);
            throw r3;
        L_0x0071:
            r0 = new com.google.android.exoplayer2.text.b.a;
            r3 = r3.f6491h;
            r0.<init>(r3);
            return r0;
        L_0x0079:
            r0 = new com.google.android.exoplayer2.text.a.c;
            r3 = r3.f6509z;
            r0.<init>(r3);
            return r0;
        L_0x0081:
            r0 = new com.google.android.exoplayer2.text.a.a;
            r1 = r3.f6489f;
            r3 = r3.f6509z;
            r0.<init>(r1, r3);
            return r0;
        L_0x008b:
            r0 = new com.google.android.exoplayer2.text.e.a;
            r3 = r3.f6491h;
            r0.<init>(r3);
            return r0;
        L_0x0093:
            r3 = new com.google.android.exoplayer2.text.c.a;
            r3.<init>();
            return r3;
        L_0x0099:
            r3 = new com.google.android.exoplayer2.text.d.a;
            r3.<init>();
            return r3;
        L_0x009f:
            r3 = new com.google.android.exoplayer2.text.f.b;
            r3.<init>();
            return r3;
        L_0x00a5:
            r3 = new com.google.android.exoplayer2.text.f.g;
            r3.<init>();
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.f.1.b(com.google.android.exoplayer2.Format):com.google.android.exoplayer2.text.e");
        }
    }

    /* renamed from: a */
    boolean mo1682a(Format format);

    /* renamed from: b */
    C4046e mo1683b(Format format);
}
