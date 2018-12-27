package com.google.android.exoplayer2.metadata;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.emsg.C4028a;
import com.google.android.exoplayer2.metadata.id3.C4029a;
import com.google.android.exoplayer2.metadata.scte35.C4030a;

/* renamed from: com.google.android.exoplayer2.metadata.b */
public interface C2285b {
    /* renamed from: a */
    public static final C2285b f7244a = new C40271();

    /* renamed from: com.google.android.exoplayer2.metadata.b$1 */
    static class C40271 implements C2285b {
        C40271() {
        }

        /* renamed from: a */
        public boolean mo1642a(Format format) {
            format = format.f6489f;
            if (!("application/id3".equals(format) || "application/x-emsg".equals(format))) {
                if ("application/x-scte35".equals(format) == null) {
                    return null;
                }
            }
            return true;
        }

        /* renamed from: b */
        public C2284a mo1643b(Format format) {
            format = format.f6489f;
            int hashCode = format.hashCode();
            if (hashCode != -1248341703) {
                if (hashCode != 1154383568) {
                    if (hashCode == 1652648887) {
                        if (format.equals("application/x-scte35") != null) {
                            format = 2;
                            switch (format) {
                                case null:
                                    return new C4029a();
                                case 1:
                                    return new C4028a();
                                case 2:
                                    return new C4030a();
                                default:
                                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
                            }
                        }
                    }
                } else if (format.equals("application/x-emsg") != null) {
                    format = true;
                    switch (format) {
                        case null:
                            return new C4029a();
                        case 1:
                            return new C4028a();
                        case 2:
                            return new C4030a();
                        default:
                            throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
                    }
                }
            } else if (format.equals("application/id3") != null) {
                format = null;
                switch (format) {
                    case null:
                        return new C4029a();
                    case 1:
                        return new C4028a();
                    case 2:
                        return new C4030a();
                    default:
                        throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
                }
            }
            format = -1;
            switch (format) {
                case null:
                    return new C4029a();
                case 1:
                    return new C4028a();
                case 2:
                    return new C4030a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }
    }

    /* renamed from: a */
    boolean mo1642a(Format format);

    /* renamed from: b */
    C2284a mo1643b(Format format);
}
