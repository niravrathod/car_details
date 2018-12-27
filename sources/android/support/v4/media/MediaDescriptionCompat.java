package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.media.C0482d.C0481a;
import android.support.v4.media.C3146e.C3145a;
import android.text.TextUtils;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Creator<MediaDescriptionCompat> CREATOR = new C04691();
    /* renamed from: a */
    private final String f1546a;
    /* renamed from: b */
    private final CharSequence f1547b;
    /* renamed from: c */
    private final CharSequence f1548c;
    /* renamed from: d */
    private final CharSequence f1549d;
    /* renamed from: e */
    private final Bitmap f1550e;
    /* renamed from: f */
    private final Uri f1551f;
    /* renamed from: g */
    private final Bundle f1552g;
    /* renamed from: h */
    private final Uri f1553h;
    /* renamed from: i */
    private Object f1554i;

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$1 */
    static class C04691 implements Creator<MediaDescriptionCompat> {
        C04691() {
        }

        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m1689a(parcel);
        }

        public /* synthetic */ Object[] newArray(int i) {
            return m1690a(i);
        }

        /* renamed from: a */
        public MediaDescriptionCompat m1689a(Parcel parcel) {
            if (VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.m1700a(C0482d.m1733a(parcel));
        }

        /* renamed from: a */
        public MediaDescriptionCompat[] m1690a(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public static final class C0470a {
        /* renamed from: a */
        private String f1538a;
        /* renamed from: b */
        private CharSequence f1539b;
        /* renamed from: c */
        private CharSequence f1540c;
        /* renamed from: d */
        private CharSequence f1541d;
        /* renamed from: e */
        private Bitmap f1542e;
        /* renamed from: f */
        private Uri f1543f;
        /* renamed from: g */
        private Bundle f1544g;
        /* renamed from: h */
        private Uri f1545h;

        /* renamed from: a */
        public C0470a m1695a(String str) {
            this.f1538a = str;
            return this;
        }

        /* renamed from: a */
        public C0470a m1694a(CharSequence charSequence) {
            this.f1539b = charSequence;
            return this;
        }

        /* renamed from: b */
        public C0470a m1698b(CharSequence charSequence) {
            this.f1540c = charSequence;
            return this;
        }

        /* renamed from: c */
        public C0470a m1699c(CharSequence charSequence) {
            this.f1541d = charSequence;
            return this;
        }

        /* renamed from: a */
        public C0470a m1691a(Bitmap bitmap) {
            this.f1542e = bitmap;
            return this;
        }

        /* renamed from: a */
        public C0470a m1692a(Uri uri) {
            this.f1543f = uri;
            return this;
        }

        /* renamed from: a */
        public C0470a m1693a(Bundle bundle) {
            this.f1544g = bundle;
            return this;
        }

        /* renamed from: b */
        public C0470a m1697b(Uri uri) {
            this.f1545h = uri;
            return this;
        }

        /* renamed from: a */
        public MediaDescriptionCompat m1696a() {
            return new MediaDescriptionCompat(this.f1538a, this.f1539b, this.f1540c, this.f1541d, this.f1542e, this.f1543f, this.f1544g, this.f1545h);
        }
    }

    public int describeContents() {
        return 0;
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f1546a = str;
        this.f1547b = charSequence;
        this.f1548c = charSequence2;
        this.f1549d = charSequence3;
        this.f1550e = bitmap;
        this.f1551f = uri;
        this.f1552g = bundle;
        this.f1553h = uri2;
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f1546a = parcel.readString();
        this.f1547b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1548c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1549d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1550e = (Bitmap) parcel.readParcelable(null);
        this.f1551f = (Uri) parcel.readParcelable(null);
        this.f1552g = parcel.readBundle();
        this.f1553h = (Uri) parcel.readParcelable(null);
    }

    /* renamed from: a */
    public String m1701a() {
        return this.f1546a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (VERSION.SDK_INT < 21) {
            parcel.writeString(this.f1546a);
            TextUtils.writeToParcel(this.f1547b, parcel, i);
            TextUtils.writeToParcel(this.f1548c, parcel, i);
            TextUtils.writeToParcel(this.f1549d, parcel, i);
            parcel.writeParcelable(this.f1550e, i);
            parcel.writeParcelable(this.f1551f, i);
            parcel.writeBundle(this.f1552g);
            parcel.writeParcelable(this.f1553h, i);
            return;
        }
        C0482d.m1735a(m1702b(), parcel, i);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f1547b);
        stringBuilder.append(", ");
        stringBuilder.append(this.f1548c);
        stringBuilder.append(", ");
        stringBuilder.append(this.f1549d);
        return stringBuilder.toString();
    }

    /* renamed from: b */
    public Object m1702b() {
        if (this.f1554i == null) {
            if (VERSION.SDK_INT >= 21) {
                Object a = C0481a.m1724a();
                C0481a.m1730a(a, this.f1546a);
                C0481a.m1729a(a, this.f1547b);
                C0481a.m1731b(a, this.f1548c);
                C0481a.m1732c(a, this.f1549d);
                C0481a.m1726a(a, this.f1550e);
                C0481a.m1727a(a, this.f1551f);
                Bundle bundle = this.f1552g;
                if (VERSION.SDK_INT < 23 && this.f1553h != null) {
                    if (bundle == null) {
                        bundle = new Bundle();
                        bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
                    }
                    bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f1553h);
                }
                C0481a.m1728a(a, bundle);
                if (VERSION.SDK_INT >= 23) {
                    C3145a.m15667b(a, this.f1553h);
                }
                this.f1554i = C0481a.m1725a(a);
                return this.f1554i;
            }
        }
        return this.f1554i;
    }

    /* renamed from: a */
    public static MediaDescriptionCompat m1700a(Object obj) {
        Bundle bundle = null;
        if (obj == null || VERSION.SDK_INT < 21) {
            return null;
        }
        Uri uri;
        MediaDescriptionCompat a;
        C0470a c0470a = new C0470a();
        c0470a.m1695a(C0482d.m1734a(obj));
        c0470a.m1694a(C0482d.m1736b(obj));
        c0470a.m1698b(C0482d.m1737c(obj));
        c0470a.m1699c(C0482d.m1738d(obj));
        c0470a.m1691a(C0482d.m1739e(obj));
        c0470a.m1692a(C0482d.m1740f(obj));
        Bundle g = C0482d.m1741g(obj);
        if (g == null) {
            uri = null;
        } else {
            uri = (Uri) g.getParcelable("android.support.v4.media.description.MEDIA_URI");
        }
        if (uri != null) {
            if (g.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") && g.size() == 2) {
                c0470a.m1693a(bundle);
                if (uri != null) {
                    c0470a.m1697b(uri);
                } else if (VERSION.SDK_INT >= 23) {
                    c0470a.m1697b(C3146e.m15668h(obj));
                }
                a = c0470a.m1696a();
                a.f1554i = obj;
                return a;
            }
            g.remove("android.support.v4.media.description.MEDIA_URI");
            g.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        }
        bundle = g;
        c0470a.m1693a(bundle);
        if (uri != null) {
            c0470a.m1697b(uri);
        } else if (VERSION.SDK_INT >= 23) {
            c0470a.m1697b(C3146e.m15668h(obj));
        }
        a = c0470a.m1696a();
        a.f1554i = obj;
        return a;
    }
}
