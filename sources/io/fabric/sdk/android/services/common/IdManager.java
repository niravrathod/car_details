package io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.C2771h;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;

public class IdManager {
    /* renamed from: e */
    private static final Pattern f11868e = Pattern.compile("[^\\p{Alnum}]");
    /* renamed from: f */
    private static final String f11869f = Pattern.quote("/");
    /* renamed from: a */
    C2791c f11870a;
    /* renamed from: b */
    C2790b f11871b;
    /* renamed from: c */
    boolean f11872c;
    /* renamed from: d */
    C2803m f11873d;
    /* renamed from: g */
    private final ReentrantLock f11874g = new ReentrantLock();
    /* renamed from: h */
    private final C2804n f11875h;
    /* renamed from: i */
    private final boolean f11876i;
    /* renamed from: j */
    private final boolean f11877j;
    /* renamed from: k */
    private final Context f11878k;
    /* renamed from: l */
    private final String f11879l;
    /* renamed from: m */
    private final String f11880m;
    /* renamed from: n */
    private final Collection<C2771h> f11881n;

    public enum DeviceIdentifierType {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        
        public final int protobufIndex;

        private DeviceIdentifierType(int i) {
            this.protobufIndex = i;
        }
    }

    public IdManager(Context context, String str, String str2, Collection<C2771h> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f11878k = context;
            this.f11879l = str;
            this.f11880m = str2;
            this.f11881n = collection;
            this.f11875h = new C2804n();
            this.f11870a = new C2791c(context);
            this.f11873d = new C2803m();
            this.f11876i = CommonUtils.m13616a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            if (this.f11876i == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Device ID collection disabled for ");
                stringBuilder.append(context.getPackageName());
                C2766c.m13524h().mo3554a("Fabric", stringBuilder.toString());
            }
            this.f11877j = CommonUtils.m13616a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (this.f11877j == null) {
                collection = new StringBuilder();
                collection.append("User information collection disabled for ");
                collection.append(context.getPackageName());
                C2766c.m13524h().mo3554a("Fabric", collection.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /* renamed from: a */
    public boolean m13648a() {
        return this.f11877j;
    }

    /* renamed from: a */
    private String m13642a(String str) {
        return str == null ? null : f11868e.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    /* renamed from: b */
    public String m13649b() {
        String str = this.f11880m;
        if (str != null) {
            return str;
        }
        SharedPreferences a = CommonUtils.m13599a(this.f11878k);
        m13646b(a);
        String string = a.getString("crashlytics.installation.id", null);
        return string == null ? m13641a(a) : string;
    }

    /* renamed from: c */
    public String m13650c() {
        return this.f11879l;
    }

    /* renamed from: d */
    public String m13651d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(m13652e());
        stringBuilder.append("/");
        stringBuilder.append(m13653f());
        return stringBuilder.toString();
    }

    /* renamed from: e */
    public String m13652e() {
        return m13645b(VERSION.RELEASE);
    }

    /* renamed from: f */
    public String m13653f() {
        return m13645b(VERSION.INCREMENTAL);
    }

    /* renamed from: g */
    public String m13654g() {
        return String.format(Locale.US, "%s/%s", new Object[]{m13645b(Build.MANUFACTURER), m13645b(Build.MODEL)});
    }

    /* renamed from: b */
    private String m13645b(String str) {
        return str.replaceAll(f11869f, "");
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private String m13641a(SharedPreferences sharedPreferences) {
        this.f11874g.lock();
        try {
            String string = sharedPreferences.getString("crashlytics.installation.id", null);
            if (string == null) {
                string = m13642a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString("crashlytics.installation.id", string).commit();
            }
            this.f11874g.unlock();
            return string;
        } catch (Throwable th) {
            this.f11874g.unlock();
        }
    }

    /* renamed from: b */
    private void m13646b(SharedPreferences sharedPreferences) {
        C2790b l = m13659l();
        if (l != null) {
            m13643a(sharedPreferences, l.f11888a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private void m13643a(SharedPreferences sharedPreferences, String str) {
        this.f11874g.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                Object string = sharedPreferences.getString("crashlytics.advertising.id", null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString("crashlytics.advertising.id", str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString("crashlytics.advertising.id", str).commit();
                }
                this.f11874g.unlock();
            }
        } finally {
            this.f11874g.unlock();
        }
    }

    /* renamed from: h */
    public Map<DeviceIdentifierType, String> m13655h() {
        Map hashMap = new HashMap();
        for (C2771h c2771h : this.f11881n) {
            if (c2771h instanceof C2800k) {
                for (Entry entry : ((C2800k) c2771h).getDeviceIdentifiers().entrySet()) {
                    m13644a(hashMap, (DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: i */
    public String m13656i() {
        return this.f11875h.m13696a(this.f11878k);
    }

    /* renamed from: j */
    public Boolean m13657j() {
        return m13658k() ? m13647m() : null;
    }

    /* renamed from: a */
    private void m13644a(Map<DeviceIdentifierType, String> map, DeviceIdentifierType deviceIdentifierType, String str) {
        if (str != null) {
            map.put(deviceIdentifierType, str);
        }
    }

    /* renamed from: k */
    protected boolean m13658k() {
        return this.f11876i && !this.f11873d.m13695b(this.f11878k);
    }

    /* renamed from: l */
    synchronized C2790b m13659l() {
        if (!this.f11872c) {
            this.f11871b = this.f11870a.m13670a();
            this.f11872c = true;
        }
        return this.f11871b;
    }

    /* renamed from: m */
    private Boolean m13647m() {
        C2790b l = m13659l();
        return l != null ? Boolean.valueOf(l.f11889b) : null;
    }
}
