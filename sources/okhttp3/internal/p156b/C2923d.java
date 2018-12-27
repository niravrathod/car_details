package okhttp3.internal.p156b;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.C2933c;

/* renamed from: okhttp3.internal.b.d */
public final class C2923d {
    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f12342a = new C29221();
    /* renamed from: b */
    private static final String[] f12343b = new String[]{"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
    /* renamed from: c */
    private static final DateFormat[] f12344c = new DateFormat[f12343b.length];

    /* renamed from: okhttp3.internal.b.d$1 */
    class C29221 extends ThreadLocal<DateFormat> {
        C29221() {
        }

        protected /* synthetic */ Object initialValue() {
            return m14149a();
        }

        /* renamed from: a */
        protected DateFormat m14149a() {
            DateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C2933c.f12358g);
            return simpleDateFormat;
        }
    }

    /* renamed from: a */
    public static Date m14151a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f12342a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f12343b) {
            int length = f12343b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f12344c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f12343b[i], Locale.US);
                    dateFormat.setTimeZone(C2933c.f12358g);
                    f12344c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m14150a(Date date) {
        return ((DateFormat) f12342a.get()).format(date);
    }
}
