package android.support.v7.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.content.C0397e;
import android.util.Log;
import java.util.Calendar;

/* renamed from: android.support.v7.app.n */
class C0671n {
    /* renamed from: a */
    private static C0671n f2178a;
    /* renamed from: b */
    private final Context f2179b;
    /* renamed from: c */
    private final LocationManager f2180c;
    /* renamed from: d */
    private final C0670a f2181d = new C0670a();

    /* renamed from: android.support.v7.app.n$a */
    private static class C0670a {
        /* renamed from: a */
        boolean f2172a;
        /* renamed from: b */
        long f2173b;
        /* renamed from: c */
        long f2174c;
        /* renamed from: d */
        long f2175d;
        /* renamed from: e */
        long f2176e;
        /* renamed from: f */
        long f2177f;

        C0670a() {
        }
    }

    /* renamed from: a */
    static C0671n m2690a(Context context) {
        if (f2178a == null) {
            context = context.getApplicationContext();
            f2178a = new C0671n(context, (LocationManager) context.getSystemService("location"));
        }
        return f2178a;
    }

    C0671n(Context context, LocationManager locationManager) {
        this.f2179b = context;
        this.f2180c = locationManager;
    }

    /* renamed from: a */
    boolean m2694a() {
        C0670a c0670a = this.f2181d;
        if (m2693c()) {
            return c0670a.f2172a;
        }
        Location b = m2692b();
        if (b != null) {
            m2691a(b);
            return c0670a.f2172a;
        }
        boolean z;
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        if (i >= 6) {
            if (i < 22) {
                z = false;
                return z;
            }
        }
        z = true;
        return z;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m2692b() {
        Location location = null;
        Location a = C0397e.m1471a(this.f2179b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m2689a("network") : null;
        if (C0397e.m1471a(this.f2179b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m2689a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: a */
    private Location m2689a(String str) {
        try {
            if (this.f2180c.isProviderEnabled(str)) {
                return this.f2180c.getLastKnownLocation(str);
            }
        } catch (String str2) {
            Log.d("TwilightManager", "Failed to get last known location", str2);
        }
        return null;
    }

    /* renamed from: c */
    private boolean m2693c() {
        return this.f2181d.f2177f > System.currentTimeMillis();
    }

    /* renamed from: a */
    private void m2691a(Location location) {
        long j;
        C0670a c0670a = this.f2181d;
        long currentTimeMillis = System.currentTimeMillis();
        C0669m a = C0669m.m2687a();
        C0669m c0669m = a;
        c0669m.m2688a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f2169a;
        c0669m.m2688a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f2171c == 1;
        long j3 = a.f2170b;
        long j4 = j2;
        j2 = a.f2169a;
        long j5 = j3;
        boolean z2 = z;
        a.m2688a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = a.f2170b;
        if (j5 != -1) {
            if (j2 != -1) {
                j = currentTimeMillis > j2 ? 0 + j6 : currentTimeMillis > j5 ? 0 + j2 : 0 + j5;
                j += 60000;
                c0670a.f2172a = z2;
                c0670a.f2173b = j4;
                c0670a.f2174c = j5;
                c0670a.f2175d = j2;
                c0670a.f2176e = j6;
                c0670a.f2177f = j;
            }
        }
        j = 43200000 + currentTimeMillis;
        c0670a.f2172a = z2;
        c0670a.f2173b = j4;
        c0670a.f2174c = j5;
        c0670a.f2175d = j2;
        c0670a.f2176e = j6;
        c0670a.f2177f = j;
    }
}
