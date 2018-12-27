package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.C0501d.C0500a;
import java.util.ArrayList;
import java.util.List;

public class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new C04881();
        /* renamed from: a */
        private final MediaDescriptionCompat f1579a;
        /* renamed from: b */
        private final long f1580b;
        /* renamed from: c */
        private Object f1581c;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$1 */
        static class C04881 implements Creator<QueueItem> {
            C04881() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1760a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1761a(i);
            }

            /* renamed from: a */
            public QueueItem m1760a(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: a */
            public QueueItem[] m1761a(int i) {
                return new QueueItem[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f1579a = mediaDescriptionCompat;
                this.f1580b = j;
                this.f1581c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        QueueItem(Parcel parcel) {
            this.f1579a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f1580b = parcel.readLong();
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f1579a.writeToParcel(parcel, i);
            parcel.writeLong(this.f1580b);
        }

        /* renamed from: a */
        public static QueueItem m1762a(Object obj) {
            if (obj != null) {
                if (VERSION.SDK_INT >= 21) {
                    return new QueueItem(obj, MediaDescriptionCompat.m1700a(C0500a.m1857a(obj)), C0500a.m1858b(obj));
                }
            }
            return null;
        }

        /* renamed from: a */
        public static List<QueueItem> m1763a(List<?> list) {
            if (list != null) {
                if (VERSION.SDK_INT >= 21) {
                    List<QueueItem> arrayList = new ArrayList();
                    for (Object a : list) {
                        arrayList.add(m1762a(a));
                    }
                    return arrayList;
                }
            }
            return null;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("MediaSession.QueueItem {Description=");
            stringBuilder.append(this.f1579a);
            stringBuilder.append(", Id=");
            stringBuilder.append(this.f1580b);
            stringBuilder.append(" }");
            return stringBuilder.toString();
        }
    }

    static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new C04891();
        /* renamed from: a */
        private ResultReceiver f1582a;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$1 */
        static class C04891 implements Creator<ResultReceiverWrapper> {
            C04891() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1764a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1765a(i);
            }

            /* renamed from: a */
            public ResultReceiverWrapper m1764a(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: a */
            public ResultReceiverWrapper[] m1765a(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f1582a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            this.f1582a.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new C04901();
        /* renamed from: a */
        private final Object f1583a;
        /* renamed from: b */
        private final C0495b f1584b;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token$1 */
        static class C04901 implements Creator<Token> {
            C04901() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m1766a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m1767a(i);
            }

            /* renamed from: a */
            public Token m1766a(Parcel parcel) {
                if (VERSION.SDK_INT >= 21) {
                    parcel = parcel.readParcelable(null);
                } else {
                    parcel = parcel.readStrongBinder();
                }
                return new Token(parcel);
            }

            /* renamed from: a */
            public Token[] m1767a(int i) {
                return new Token[i];
            }
        }

        public int describeContents() {
            return 0;
        }

        Token(Object obj) {
            this(obj, null);
        }

        Token(Object obj, C0495b c0495b) {
            this.f1583a = obj;
            this.f1584b = c0495b;
        }

        /* renamed from: a */
        public static Token m1768a(Object obj) {
            return m1769a(obj, null);
        }

        /* renamed from: a */
        public static Token m1769a(Object obj, C0495b c0495b) {
            return (obj == null || VERSION.SDK_INT < 21) ? null : new Token(C0501d.m1859a(obj), c0495b);
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f1583a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f1583a);
            }
        }

        public int hashCode() {
            if (this.f1583a == null) {
                return 0;
            }
            return this.f1583a.hashCode();
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f1583a == null) {
                if (token.f1583a != null) {
                    z = false;
                }
                return z;
            } else if (token.f1583a == null) {
                return false;
            } else {
                return this.f1583a.equals(token.f1583a);
            }
        }

        /* renamed from: a */
        public Object m1770a() {
            return this.f1583a;
        }

        /* renamed from: b */
        public C0495b m1771b() {
            return this.f1584b;
        }
    }
}
