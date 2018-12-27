package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement.Event;
import com.google.android.gms.measurement.AppMeasurement.UserProperty;
import com.j256.ormlite.field.FieldType;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class zzfk extends ao {
    /* renamed from: a */
    private static final String[] f21430a = new String[]{"firebase_", "google_", "ga_"};
    /* renamed from: b */
    private SecureRandom f21431b;
    /* renamed from: c */
    private final AtomicLong f21432c = new AtomicLong(0);
    /* renamed from: d */
    private int f21433d;
    /* renamed from: e */
    private Integer f21434e = null;

    zzfk(zzbt zzbt) {
        super(zzbt);
    }

    /* renamed from: e */
    protected final boolean mo4839e() {
        return true;
    }

    /* renamed from: f */
    protected final void mo4840f() {
        mo4395d();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo3172r().m28540i().m12354a("Utils falling back to Random for random id");
            }
        }
        this.f21432c.set(nextLong);
    }

    /* renamed from: g */
    public final long m28635g() {
        long nextLong;
        if (this.f21432c.get() == 0) {
            synchronized (this.f21432c) {
                nextLong = new Random(System.nanoTime() ^ mo3169m().currentTimeMillis()).nextLong();
                int i = this.f21433d + 1;
                this.f21433d = i;
                nextLong += (long) i;
            }
            return nextLong;
        }
        synchronized (this.f21432c) {
            this.f21432c.compareAndSet(-1, 1);
            nextLong = this.f21432c.getAndIncrement();
        }
        return nextLong;
    }

    /* renamed from: h */
    final SecureRandom m28636h() {
        mo4395d();
        if (this.f21431b == null) {
            this.f21431b = new SecureRandom();
        }
        return this.f21431b;
    }

    /* renamed from: a */
    static boolean m28595a(String str) {
        Preconditions.checkNotEmpty(str);
        if (str.charAt(0) == '_') {
            if (str.equals("_ep") == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    final Bundle m28611a(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            Object queryParameter;
            Object queryParameter2;
            Object queryParameter3;
            Object queryParameter4;
            if (uri.isHierarchical()) {
                queryParameter = uri.getQueryParameter("utm_campaign");
                queryParameter2 = uri.getQueryParameter("utm_source");
                queryParameter3 = uri.getQueryParameter("utm_medium");
                queryParameter4 = uri.getQueryParameter("gclid");
            } else {
                queryParameter = null;
                queryParameter2 = queryParameter;
                queryParameter3 = queryParameter2;
                queryParameter4 = queryParameter3;
            }
            if (TextUtils.isEmpty(queryParameter) && TextUtils.isEmpty(queryParameter2) && TextUtils.isEmpty(queryParameter3)) {
                if (TextUtils.isEmpty(queryParameter4)) {
                    return null;
                }
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("campaign", queryParameter);
            }
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("source", queryParameter2);
            }
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("medium", queryParameter3);
            }
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("gclid", queryParameter4);
            }
            queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            queryParameter = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("content", queryParameter);
            }
            queryParameter = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("aclid", queryParameter);
            }
            queryParameter = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("cp1", queryParameter);
            }
            uri = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(uri)) {
                bundle.putString("anid", uri);
            }
            return bundle;
        } catch (Uri uri2) {
            mo3172r().m28540i().m12355a("Install referrer url isn't a hierarchical URI", uri2);
            return null;
        }
    }

    /* renamed from: a */
    static boolean m28593a(Intent intent) {
        intent = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(intent) || "https://www.google.com".equals(intent))) {
            if ("android-app://com.google.appcrawler".equals(intent) == null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    final boolean m28621a(String str, String str2) {
        if (str2 == null) {
            mo3172r().v_().m12355a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo3172r().v_().m12355a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt)) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        mo3172r().v_().m12356a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo3172r().v_().m12356a("Name must start with a letter. Type, name", str, str2);
            return false;
        }
    }

    /* renamed from: d */
    private final boolean m28605d(String str, String str2) {
        if (str2 == null) {
            mo3172r().v_().m12355a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo3172r().v_().m12355a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                codePointAt = Character.charCount(codePointAt);
                while (codePointAt < length) {
                    int codePointAt2 = str2.codePointAt(codePointAt);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        codePointAt += Character.charCount(codePointAt2);
                    } else {
                        mo3172r().v_().m12356a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo3172r().v_().m12356a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* renamed from: a */
    final boolean m28622a(String str, String[] strArr, String str2) {
        if (str2 == null) {
            mo3172r().v_().m12355a("Name is required and can't be null. Type", str);
            return false;
        }
        Object obj;
        Preconditions.checkNotNull(str2);
        for (String startsWith : f21430a) {
            if (str2.startsWith(startsWith)) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj != null) {
            mo3172r().v_().m12356a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        }
        if (strArr != null) {
            Preconditions.checkNotNull(strArr);
            for (String c : strArr) {
                if (m28604c(str2, c)) {
                    strArr = 1;
                    break;
                }
            }
            strArr = null;
            if (strArr != null) {
                mo3172r().v_().m12356a("Name is reserved. Type, name", str, str2);
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    final boolean m28620a(String str, int i, String str2) {
        if (str2 == null) {
            mo3172r().v_().m12355a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo3172r().v_().m12357a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* renamed from: b */
    final int m28623b(String str) {
        if (!m28605d("event", str)) {
            return 2;
        }
        if (!m28622a("event", Event.f10395a, str)) {
            return 13;
        }
        if (m28620a("event", 40, str) == null) {
            return 2;
        }
        return null;
    }

    /* renamed from: c */
    final int m28627c(String str) {
        if (!m28605d("user property", str)) {
            return 6;
        }
        if (!m28622a("user property", UserProperty.f10399a, str)) {
            return 15;
        }
        if (m28620a("user property", 24, str) == null) {
            return 6;
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m28596a(String str, String str2, int i, Object obj, boolean z) {
        if (!(obj == null || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Boolean))) {
            if (!(obj instanceof Double)) {
                if (!((obj instanceof String) || (obj instanceof Character))) {
                    if (!(obj instanceof CharSequence)) {
                        if ((obj instanceof Bundle) != null && z) {
                            return true;
                        }
                        if ((obj instanceof Parcelable[]) != null && z) {
                            Parcelable[] parcelableArr = (Parcelable[]) obj;
                            str = parcelableArr.length;
                            i = 0;
                            while (i < str) {
                                z = parcelableArr[i];
                                if (z instanceof Bundle) {
                                    i++;
                                } else {
                                    mo3172r().m28540i().m12356a("All Parcelable[] elements must be of type Bundle. Value type, name", z.getClass(), str2);
                                    return false;
                                }
                            }
                            return true;
                        } else if ((obj instanceof ArrayList) == null || !z) {
                            return false;
                        } else {
                            ArrayList arrayList = (ArrayList) obj;
                            str = arrayList.size();
                            i = 0;
                            while (i < str) {
                                z = arrayList.get(i);
                                i++;
                                if (!(z instanceof Bundle)) {
                                    mo3172r().m28540i().m12356a("All ArrayList elements must be of type Bundle. Value type, name", z.getClass(), str2);
                                    return false;
                                }
                            }
                            return true;
                        }
                    }
                }
                obj = String.valueOf(obj);
                if (obj.codePointCount(0, obj.length()) <= i) {
                    return true;
                }
                mo3172r().m28540i().m12357a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj.length()));
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    final boolean m28626b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str2) != null) {
                if (this.r.m22734o() != null) {
                    mo3172r().v_().m12354a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (m28607g(str2) == null) {
                mo3172r().v_().m12355a("Invalid gma_app_id. Analytics disabled.", zzap.m28525a(str2));
                return false;
            }
        } else if (m28607g(str) == null) {
            if (this.r.m22734o() != null) {
                mo3172r().v_().m12355a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", zzap.m28525a(str));
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static boolean m28597a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return str.equals(str2) == null;
        } else {
            if (isEmpty && isEmpty2) {
                return (TextUtils.isEmpty(str3) == null && TextUtils.isEmpty(str4) == null) ? str3.equals(str4) == null : TextUtils.isEmpty(str4) == null;
            } else {
                if (isEmpty || !isEmpty2) {
                    if (TextUtils.isEmpty(str3) == null) {
                        if (str3.equals(str4) != null) {
                            return false;
                        }
                    }
                    return true;
                } else if (TextUtils.isEmpty(str4) != null) {
                    return false;
                } else {
                    if (TextUtils.isEmpty(str3) == null) {
                        if (str3.equals(str4) != null) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        }
    }

    @VisibleForTesting
    /* renamed from: g */
    private static boolean m28607g(String str) {
        Preconditions.checkNotNull(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: a */
    private static Object m28588a(int i, Object obj, boolean z) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof Long)) {
            if (!(obj instanceof Double)) {
                if (obj instanceof Integer) {
                    return Long.valueOf((long) ((Integer) obj).intValue());
                }
                if (obj instanceof Byte) {
                    return Long.valueOf((long) ((Byte) obj).byteValue());
                }
                if (obj instanceof Short) {
                    return Long.valueOf((long) ((Short) obj).shortValue());
                }
                if (obj instanceof Boolean) {
                    return Long.valueOf(((Boolean) obj).booleanValue() != 0 ? 1 : 0);
                } else if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                } else {
                    if (!((obj instanceof String) || (obj instanceof Character))) {
                        if (!(obj instanceof CharSequence)) {
                            return null;
                        }
                    }
                    return m28589a(String.valueOf(obj), i, z);
                }
            }
        }
        return obj;
    }

    /* renamed from: a */
    public static String m28589a(String str, int i, boolean z) {
        if (str.codePointCount(0, str.length()) > i) {
            return z ? String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...") : null;
        } else {
            return str;
        }
    }

    /* renamed from: a */
    final Object m28615a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m28588a(256, obj, true);
        }
        if (m28606e(str) == null) {
            i = 100;
        }
        return m28588a(i, obj, (boolean) null);
    }

    /* renamed from: a */
    static Bundle[] m28599a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: a */
    final Bundle m28613a(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        zzfk zzfk = this;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        String[] strArr = null;
        if (bundle2 == null) {
            return null;
        }
        Bundle bundle3 = new Bundle(bundle2);
        int i = 0;
        for (String str3 : bundle.keySet()) {
            int i2;
            Object obj;
            String str4;
            Object obj2;
            int i3;
            boolean z3;
            StringBuilder stringBuilder;
            String str5;
            boolean a;
            int i4;
            if (list2 != null) {
                if (!list2.contains(str3)) {
                }
                i2 = 0;
                if (i2 == 0) {
                    if (m28594a(bundle3, i2)) {
                        bundle3.putString("_ev", m28589a(str3, 40, true));
                        if (i2 == 3) {
                            m28591a(bundle3, (Object) str3);
                        }
                    }
                    bundle3.remove(str3);
                } else {
                    obj = bundle2.get(str3);
                    mo4395d();
                    if (z2) {
                        str4 = "param";
                        if (obj instanceof Parcelable[]) {
                            if (obj instanceof ArrayList) {
                                i2 = ((ArrayList) obj).size();
                            }
                            obj2 = 1;
                            if (obj2 == null) {
                                i3 = 17;
                                z3 = true;
                                if (i3 != 0 || "_ev".equals(str3)) {
                                    if (m28595a(str3)) {
                                        i++;
                                        if (i > 25) {
                                            stringBuilder = new StringBuilder(48);
                                            stringBuilder.append("Event can't contain more than 25 params");
                                            mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                            m28594a(bundle3, 5);
                                            bundle3.remove(str3);
                                        }
                                    }
                                    str5 = str2;
                                } else {
                                    if (m28594a(bundle3, i3)) {
                                        bundle3.putString("_ev", m28589a(str3, 40, z3));
                                        m28591a(bundle3, bundle2.get(str3));
                                    }
                                    bundle3.remove(str3);
                                }
                            }
                        } else {
                            i2 = ((Parcelable[]) obj).length;
                        }
                        if (i2 > 1000) {
                            mo3172r().m28540i().m12357a("Parameter array is too long; discarded. Value kind, name, array length", str4, str3, Integer.valueOf(i2));
                            obj2 = null;
                            if (obj2 == null) {
                                i3 = 17;
                                z3 = true;
                                if (i3 != 0) {
                                }
                                if (m28595a(str3)) {
                                    i++;
                                    if (i > 25) {
                                        stringBuilder = new StringBuilder(48);
                                        stringBuilder.append("Event can't contain more than 25 params");
                                        mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                        m28594a(bundle3, 5);
                                        bundle3.remove(str3);
                                    }
                                }
                                str5 = str2;
                            }
                        }
                        obj2 = 1;
                        if (obj2 == null) {
                            i3 = 17;
                            z3 = true;
                            if (i3 != 0) {
                            }
                            if (m28595a(str3)) {
                                i++;
                                if (i > 25) {
                                    stringBuilder = new StringBuilder(48);
                                    stringBuilder.append("Event can't contain more than 25 params");
                                    mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                    m28594a(bundle3, 5);
                                    bundle3.remove(str3);
                                }
                            }
                            str5 = str2;
                        }
                    }
                    if ((mo4400t().m27351f(str) || !m28606e(str2)) && !m28606e(str3)) {
                        z3 = true;
                        a = m28596a("param", str3, 100, obj, z2);
                    } else {
                        z3 = true;
                        a = m28596a("param", str3, 256, obj, z2);
                    }
                    i3 = a ? 0 : 4;
                    if (i3 != 0) {
                    }
                    if (m28595a(str3)) {
                        i++;
                        if (i > 25) {
                            stringBuilder = new StringBuilder(48);
                            stringBuilder.append("Event can't contain more than 25 params");
                            mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                            m28594a(bundle3, 5);
                            bundle3.remove(str3);
                        }
                    }
                    str5 = str2;
                }
                strArr = null;
            }
            i2 = 14;
            if (z) {
                if (m28621a("event param", str3)) {
                    if (!m28622a("event param", strArr, str3)) {
                        i4 = 14;
                        if (i4 == 0) {
                            if (m28605d("event param", str3)) {
                                if (!m28622a("event param", strArr, str3)) {
                                    if (!m28620a("event param", 40, str3)) {
                                    }
                                    i2 = 0;
                                }
                            }
                            i2 = 3;
                        } else {
                            i2 = i4;
                        }
                        if (i2 == 0) {
                            obj = bundle2.get(str3);
                            mo4395d();
                            if (z2) {
                                str4 = "param";
                                if (obj instanceof Parcelable[]) {
                                    if (obj instanceof ArrayList) {
                                        i2 = ((ArrayList) obj).size();
                                    }
                                    obj2 = 1;
                                    if (obj2 == null) {
                                        i3 = 17;
                                        z3 = true;
                                        if (i3 != 0) {
                                        }
                                        if (m28595a(str3)) {
                                            i++;
                                            if (i > 25) {
                                                stringBuilder = new StringBuilder(48);
                                                stringBuilder.append("Event can't contain more than 25 params");
                                                mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                                m28594a(bundle3, 5);
                                                bundle3.remove(str3);
                                            }
                                        }
                                        str5 = str2;
                                    }
                                } else {
                                    i2 = ((Parcelable[]) obj).length;
                                }
                                if (i2 > 1000) {
                                    mo3172r().m28540i().m12357a("Parameter array is too long; discarded. Value kind, name, array length", str4, str3, Integer.valueOf(i2));
                                    obj2 = null;
                                    if (obj2 == null) {
                                        i3 = 17;
                                        z3 = true;
                                        if (i3 != 0) {
                                        }
                                        if (m28595a(str3)) {
                                            i++;
                                            if (i > 25) {
                                                stringBuilder = new StringBuilder(48);
                                                stringBuilder.append("Event can't contain more than 25 params");
                                                mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                                m28594a(bundle3, 5);
                                                bundle3.remove(str3);
                                            }
                                        }
                                        str5 = str2;
                                    }
                                }
                                obj2 = 1;
                                if (obj2 == null) {
                                    i3 = 17;
                                    z3 = true;
                                    if (i3 != 0) {
                                    }
                                    if (m28595a(str3)) {
                                        i++;
                                        if (i > 25) {
                                            stringBuilder = new StringBuilder(48);
                                            stringBuilder.append("Event can't contain more than 25 params");
                                            mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                            m28594a(bundle3, 5);
                                            bundle3.remove(str3);
                                        }
                                    }
                                    str5 = str2;
                                }
                            }
                            if (mo4400t().m27351f(str)) {
                            }
                            z3 = true;
                            a = m28596a("param", str3, 100, obj, z2);
                            if (a) {
                            }
                            if (i3 != 0) {
                            }
                            if (m28595a(str3)) {
                                i++;
                                if (i > 25) {
                                    stringBuilder = new StringBuilder(48);
                                    stringBuilder.append("Event can't contain more than 25 params");
                                    mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                    m28594a(bundle3, 5);
                                    bundle3.remove(str3);
                                }
                            }
                            str5 = str2;
                        } else {
                            if (m28594a(bundle3, i2)) {
                                bundle3.putString("_ev", m28589a(str3, 40, true));
                                if (i2 == 3) {
                                    m28591a(bundle3, (Object) str3);
                                }
                            }
                            bundle3.remove(str3);
                        }
                        strArr = null;
                    } else if (!m28620a("event param", 40, str3)) {
                    }
                }
                i4 = 3;
                if (i4 == 0) {
                    i2 = i4;
                } else {
                    if (m28605d("event param", str3)) {
                        if (!m28622a("event param", strArr, str3)) {
                            if (m28620a("event param", 40, str3)) {
                            }
                            i2 = 0;
                        }
                    }
                    i2 = 3;
                }
                if (i2 == 0) {
                    if (m28594a(bundle3, i2)) {
                        bundle3.putString("_ev", m28589a(str3, 40, true));
                        if (i2 == 3) {
                            m28591a(bundle3, (Object) str3);
                        }
                    }
                    bundle3.remove(str3);
                } else {
                    obj = bundle2.get(str3);
                    mo4395d();
                    if (z2) {
                        str4 = "param";
                        if (obj instanceof Parcelable[]) {
                            i2 = ((Parcelable[]) obj).length;
                        } else {
                            if (obj instanceof ArrayList) {
                                i2 = ((ArrayList) obj).size();
                            }
                            obj2 = 1;
                            if (obj2 == null) {
                                i3 = 17;
                                z3 = true;
                                if (i3 != 0) {
                                }
                                if (m28595a(str3)) {
                                    i++;
                                    if (i > 25) {
                                        stringBuilder = new StringBuilder(48);
                                        stringBuilder.append("Event can't contain more than 25 params");
                                        mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                        m28594a(bundle3, 5);
                                        bundle3.remove(str3);
                                    }
                                }
                                str5 = str2;
                            }
                        }
                        if (i2 > 1000) {
                            mo3172r().m28540i().m12357a("Parameter array is too long; discarded. Value kind, name, array length", str4, str3, Integer.valueOf(i2));
                            obj2 = null;
                            if (obj2 == null) {
                                i3 = 17;
                                z3 = true;
                                if (i3 != 0) {
                                }
                                if (m28595a(str3)) {
                                    i++;
                                    if (i > 25) {
                                        stringBuilder = new StringBuilder(48);
                                        stringBuilder.append("Event can't contain more than 25 params");
                                        mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                        m28594a(bundle3, 5);
                                        bundle3.remove(str3);
                                    }
                                }
                                str5 = str2;
                            }
                        }
                        obj2 = 1;
                        if (obj2 == null) {
                            i3 = 17;
                            z3 = true;
                            if (i3 != 0) {
                            }
                            if (m28595a(str3)) {
                                i++;
                                if (i > 25) {
                                    stringBuilder = new StringBuilder(48);
                                    stringBuilder.append("Event can't contain more than 25 params");
                                    mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                    m28594a(bundle3, 5);
                                    bundle3.remove(str3);
                                }
                            }
                            str5 = str2;
                        }
                    }
                    if (mo4400t().m27351f(str)) {
                    }
                    z3 = true;
                    a = m28596a("param", str3, 100, obj, z2);
                    if (a) {
                    }
                    if (i3 != 0) {
                    }
                    if (m28595a(str3)) {
                        i++;
                        if (i > 25) {
                            stringBuilder = new StringBuilder(48);
                            stringBuilder.append("Event can't contain more than 25 params");
                            mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                            m28594a(bundle3, 5);
                            bundle3.remove(str3);
                        }
                    }
                    str5 = str2;
                }
                strArr = null;
            }
            i4 = 0;
            if (i4 == 0) {
                if (m28605d("event param", str3)) {
                    if (!m28622a("event param", strArr, str3)) {
                        if (m28620a("event param", 40, str3)) {
                        }
                        i2 = 0;
                    }
                }
                i2 = 3;
            } else {
                i2 = i4;
            }
            if (i2 == 0) {
                obj = bundle2.get(str3);
                mo4395d();
                if (z2) {
                    str4 = "param";
                    if (obj instanceof Parcelable[]) {
                        if (obj instanceof ArrayList) {
                            i2 = ((ArrayList) obj).size();
                        }
                        obj2 = 1;
                        if (obj2 == null) {
                            i3 = 17;
                            z3 = true;
                            if (i3 != 0) {
                            }
                            if (m28595a(str3)) {
                                i++;
                                if (i > 25) {
                                    stringBuilder = new StringBuilder(48);
                                    stringBuilder.append("Event can't contain more than 25 params");
                                    mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                    m28594a(bundle3, 5);
                                    bundle3.remove(str3);
                                }
                            }
                            str5 = str2;
                        }
                    } else {
                        i2 = ((Parcelable[]) obj).length;
                    }
                    if (i2 > 1000) {
                        mo3172r().m28540i().m12357a("Parameter array is too long; discarded. Value kind, name, array length", str4, str3, Integer.valueOf(i2));
                        obj2 = null;
                        if (obj2 == null) {
                            i3 = 17;
                            z3 = true;
                            if (i3 != 0) {
                            }
                            if (m28595a(str3)) {
                                i++;
                                if (i > 25) {
                                    stringBuilder = new StringBuilder(48);
                                    stringBuilder.append("Event can't contain more than 25 params");
                                    mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                    m28594a(bundle3, 5);
                                    bundle3.remove(str3);
                                }
                            }
                            str5 = str2;
                        }
                    }
                    obj2 = 1;
                    if (obj2 == null) {
                        i3 = 17;
                        z3 = true;
                        if (i3 != 0) {
                        }
                        if (m28595a(str3)) {
                            i++;
                            if (i > 25) {
                                stringBuilder = new StringBuilder(48);
                                stringBuilder.append("Event can't contain more than 25 params");
                                mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                                m28594a(bundle3, 5);
                                bundle3.remove(str3);
                            }
                        }
                        str5 = str2;
                    }
                }
                if (mo4400t().m27351f(str)) {
                }
                z3 = true;
                a = m28596a("param", str3, 100, obj, z2);
                if (a) {
                }
                if (i3 != 0) {
                }
                if (m28595a(str3)) {
                    i++;
                    if (i > 25) {
                        stringBuilder = new StringBuilder(48);
                        stringBuilder.append("Event can't contain more than 25 params");
                        mo3172r().v_().m12356a(stringBuilder.toString(), mo4397o().m28503a(str2), mo4397o().m28500a(bundle2));
                        m28594a(bundle3, 5);
                        bundle3.remove(str3);
                    }
                }
                str5 = str2;
            } else {
                if (m28594a(bundle3, i2)) {
                    bundle3.putString("_ev", m28589a(str3, 40, true));
                    if (i2 == 3) {
                        m28591a(bundle3, (Object) str3);
                    }
                }
                bundle3.remove(str3);
            }
            strArr = null;
        }
        return bundle3;
    }

    /* renamed from: a */
    private static boolean m28594a(Bundle bundle, int i) {
        if (bundle.getLong("_err") != 0) {
            return null;
        }
        bundle.putLong("_err", (long) i);
        return true;
    }

    /* renamed from: a */
    private static void m28591a(Bundle bundle, Object obj) {
        Preconditions.checkNotNull(bundle);
        if (obj == null) {
            return;
        }
        if ((obj instanceof String) || (obj instanceof CharSequence)) {
            bundle.putLong("_el", (long) String.valueOf(obj).length());
        }
    }

    /* renamed from: h */
    private static int m28608h(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        return FieldType.FOREIGN_ID_FIELD_SUFFIX.equals(str) != null ? 256 : 36;
    }

    /* renamed from: b */
    final int m28624b(String str, Object obj) {
        if ("_ldl".equals(str)) {
            str = m28596a("user property referrer", str, m28608h(str), obj, false);
        } else {
            str = m28596a("user property", str, m28608h(str), obj, false);
        }
        return str != null ? null : 7;
    }

    /* renamed from: c */
    final Object m28628c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return m28588a(m28608h(str), obj, true);
        }
        return m28588a(m28608h(str), obj, false);
    }

    /* renamed from: a */
    final void m28618a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else {
                if (str != null) {
                    mo3172r().m28542k().m12356a("Not putting event parameter. Invalid value type. name, type", mo4397o().m28505b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            }
        }
    }

    /* renamed from: a */
    public final void m28617a(int i, String str, String str2, int i2) {
        m28619a(null, i, str, str2, i2);
    }

    /* renamed from: a */
    final void m28619a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m28594a(bundle, i);
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.r.mo3173u();
        this.r.m22727h().m29583a("auto", "_err", bundle);
    }

    /* renamed from: i */
    static java.security.MessageDigest m28609i() {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = 0;
    L_0x0001:
        r1 = 2;
        if (r0 >= r1) goto L_0x0010;
    L_0x0004:
        r1 = "MD5";	 Catch:{ NoSuchAlgorithmException -> 0x000d }
        r1 = java.security.MessageDigest.getInstance(r1);	 Catch:{ NoSuchAlgorithmException -> 0x000d }
        if (r1 == 0) goto L_0x000d;
    L_0x000c:
        return r1;
    L_0x000d:
        r0 = r0 + 1;
        goto L_0x0001;
    L_0x0010:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfk.i():java.security.MessageDigest");
    }

    @VisibleForTesting
    /* renamed from: a */
    static long m28587a(byte[] bArr) {
        Preconditions.checkNotNull(bArr);
        long j = null;
        Preconditions.checkState(bArr.length > 0);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << j;
            j += 8;
            length--;
        }
        return j2;
    }

    /* renamed from: a */
    static boolean m28592a(Context context, boolean z) {
        Preconditions.checkNotNull(context);
        if (VERSION.SDK_INT >= true) {
            return m28602b(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return m28602b(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: b */
    private static boolean m28602b(android.content.Context r3, java.lang.String r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = 0;
        r1 = r3.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0019 }
        if (r1 != 0) goto L_0x0008;	 Catch:{ NameNotFoundException -> 0x0019 }
    L_0x0007:
        return r0;	 Catch:{ NameNotFoundException -> 0x0019 }
    L_0x0008:
        r2 = new android.content.ComponentName;	 Catch:{ NameNotFoundException -> 0x0019 }
        r2.<init>(r3, r4);	 Catch:{ NameNotFoundException -> 0x0019 }
        r3 = r1.getServiceInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x0019 }
        if (r3 == 0) goto L_0x0019;	 Catch:{ NameNotFoundException -> 0x0019 }
    L_0x0013:
        r3 = r3.enabled;	 Catch:{ NameNotFoundException -> 0x0019 }
        if (r3 == 0) goto L_0x0019;
    L_0x0017:
        r3 = 1;
        return r3;
    L_0x0019:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfk.b(android.content.Context, java.lang.String):boolean");
    }

    /* renamed from: d */
    final boolean m28631d(String str) {
        mo4395d();
        if (Wrappers.packageManager(mo3170n()).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        mo3172r().m28554w().m12355a("Permission not granted", str);
        return null;
    }

    /* renamed from: e */
    static boolean m28606e(String str) {
        return (TextUtils.isEmpty(str) || str.startsWith("_") == null) ? null : true;
    }

    /* renamed from: c */
    static boolean m28604c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        return str == null ? null : str.equals(str2);
    }

    /* renamed from: f */
    final boolean m28634f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String v = mo4400t().m27375v();
        mo3173u();
        return v.equals(str);
    }

    /* renamed from: a */
    final Bundle m28612a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = m28615a(str, bundle.get(str));
                if (a == null) {
                    mo3172r().m28540i().m12355a("Param value can't be null", mo4397o().m28505b(str));
                } else {
                    m28618a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* renamed from: a */
    final zzad m28614a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (m28623b(str2)) {
            mo3172r().v_().m12355a("Invalid conditional property event name", mo4397o().m28507c(str2));
            throw new IllegalArgumentException();
        }
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        bundle2.putString("_o", str3);
        return new zzad(str2, new zzaa(m28612a(m28613a(str, str2, bundle2, CollectionUtils.listOf((Object) "_o"), false, false))), str3, j);
    }

    /* renamed from: a */
    final long m28610a(Context context, String str) {
        mo4395d();
        Preconditions.checkNotNull(context);
        Preconditions.checkNotEmpty(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest i = m28609i();
        if (i == null) {
            mo3172r().v_().m12354a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (m28603c(context, str) == null) {
                    context = Wrappers.packageManager(context).getPackageInfo(mo3170n().getPackageName(), 64);
                    if (context.signatures != null && context.signatures.length > null) {
                        return m28587a(i.digest(context.signatures[null].toByteArray()));
                    }
                    mo3172r().m28540i().m12354a("Could not get signatures");
                    return -1;
                }
            } catch (Context context2) {
                mo3172r().v_().m12355a("Package name not found", context2);
            }
        }
        return 0;
    }

    @VisibleForTesting
    /* renamed from: c */
    private final boolean m28603c(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            context = Wrappers.packageManager(context).getPackageInfo(str, 64);
            if (!(context == null || context.signatures == null || context.signatures.length <= null)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(context.signatures[null].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (Context context2) {
            mo3172r().v_().m12355a("Error obtaining certificate", context2);
        } catch (Context context22) {
            mo3172r().v_().m12355a("Package name not found", context22);
        }
        return true;
    }

    /* renamed from: a */
    static byte[] m28598a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            parcelable = obtain.marshall();
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static Bundle m28600b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: b */
    public static java.lang.Object m28601b(java.lang.Object r4) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = 0;
        if (r4 != 0) goto L_0x0004;
    L_0x0003:
        return r0;
    L_0x0004:
        r1 = new java.io.ByteArrayOutputStream;	 Catch:{ all -> 0x0032 }
        r1.<init>();	 Catch:{ all -> 0x0032 }
        r2 = new java.io.ObjectOutputStream;	 Catch:{ all -> 0x0032 }
        r2.<init>(r1);	 Catch:{ all -> 0x0032 }
        r2.writeObject(r4);	 Catch:{ all -> 0x002f }
        r2.flush();	 Catch:{ all -> 0x002f }
        r4 = new java.io.ObjectInputStream;	 Catch:{ all -> 0x002f }
        r3 = new java.io.ByteArrayInputStream;	 Catch:{ all -> 0x002f }
        r1 = r1.toByteArray();	 Catch:{ all -> 0x002f }
        r3.<init>(r1);	 Catch:{ all -> 0x002f }
        r4.<init>(r3);	 Catch:{ all -> 0x002f }
        r1 = r4.readObject();	 Catch:{ all -> 0x002d }
        r2.close();	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        r4.close();	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        return r1;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x002d:
        r1 = move-exception;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        goto L_0x0035;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x002f:
        r1 = move-exception;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        r4 = r0;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        goto L_0x0035;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x0032:
        r1 = move-exception;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        r4 = r0;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
        r2 = r4;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x0035:
        if (r2 == 0) goto L_0x003a;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x0037:
        r2.close();	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x003a:
        if (r4 == 0) goto L_0x003f;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x003c:
        r4.close();	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x003f:
        throw r1;	 Catch:{ IOException -> 0x0040, IOException -> 0x0040 }
    L_0x0040:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzfk.b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public static String m28590a(String str, String[] strArr, String[] strArr2) {
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            if (m28604c(str, strArr[i])) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* renamed from: j */
    public final int m28637j() {
        if (this.f21434e == null) {
            this.f21434e = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(mo3170n()) / 1000);
        }
        return this.f21434e.intValue();
    }

    /* renamed from: a */
    public static long m28586a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* renamed from: k */
    final String m28638k() {
        m28636h().nextBytes(new byte[16]);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, r0)});
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo4392a() {
        super.mo4392a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo4393b() {
        super.mo4393b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo4394c() {
        super.mo4394c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo4395d() {
        super.mo4395d();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ zzx mo4396l() {
        return super.mo4396l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Clock mo3169m() {
        return super.mo3169m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ Context mo3170n() {
        return super.mo3170n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzan mo4397o() {
        return super.mo4397o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ zzfk mo4398p() {
        return super.mo4398p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ zzbo mo3171q() {
        return super.mo3171q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ zzap mo3172r() {
        return super.mo3172r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C4832l mo4399s() {
        return super.mo4399s();
    }

    /* renamed from: t */
    public final /* bridge */ /* synthetic */ zzn mo4400t() {
        return super.mo4400t();
    }

    /* renamed from: u */
    public final /* bridge */ /* synthetic */ zzk mo3173u() {
        return super.mo3173u();
    }
}
