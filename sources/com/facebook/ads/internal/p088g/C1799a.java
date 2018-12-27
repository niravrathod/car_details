package com.facebook.ads.internal.p088g;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.StatFs;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.internal.g.a */
public class C1799a {
    /* renamed from: a */
    private static SensorManager f5424a;
    /* renamed from: b */
    private static Sensor f5425b;
    /* renamed from: c */
    private static Sensor f5426c;
    /* renamed from: d */
    private static volatile float[] f5427d;
    /* renamed from: e */
    private static volatile float[] f5428e;
    /* renamed from: f */
    private static Map<String, String> f5429f = new ConcurrentHashMap();
    /* renamed from: g */
    private static String[] f5430g = new String[]{"x", "y", "z"};
    /* renamed from: h */
    private static SensorEventListener f5431h;
    /* renamed from: i */
    private static SensorEventListener f5432i;

    /* renamed from: com.facebook.ads.internal.g.a$a */
    private static class C1797a implements SensorEventListener {
        private C1797a() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1799a.f5427d = sensorEvent.values;
            C1799a.m6770d();
        }
    }

    /* renamed from: com.facebook.ads.internal.g.a$b */
    private static class C1798b implements SensorEventListener {
        private C1798b() {
        }

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            C1799a.f5428e = sensorEvent.values;
            C1799a.m6772e();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m6761a() {
        Map hashMap = new HashMap();
        hashMap.putAll(f5429f);
        C1799a.m6763a(hashMap);
        return hashMap;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static synchronized void m6762a(android.content.Context r5) {
        /*
        r0 = com.facebook.ads.internal.p088g.C1799a.class;
        monitor-enter(r0);
        com.facebook.ads.internal.p088g.C1799a.m6766b(r5);	 Catch:{ all -> 0x006e }
        com.facebook.ads.internal.p088g.C1799a.m6769c(r5);	 Catch:{ all -> 0x006e }
        com.facebook.ads.internal.p088g.C1799a.m6771d(r5);	 Catch:{ all -> 0x006e }
        r1 = f5424a;	 Catch:{ all -> 0x006e }
        if (r1 != 0) goto L_0x0020;
    L_0x0010:
        r1 = "sensor";
        r5 = r5.getSystemService(r1);	 Catch:{ all -> 0x006e }
        r5 = (android.hardware.SensorManager) r5;	 Catch:{ all -> 0x006e }
        f5424a = r5;	 Catch:{ all -> 0x006e }
        r5 = f5424a;	 Catch:{ all -> 0x006e }
        if (r5 != 0) goto L_0x0020;
    L_0x001e:
        monitor-exit(r0);
        return;
    L_0x0020:
        r5 = f5425b;	 Catch:{ all -> 0x006e }
        if (r5 != 0) goto L_0x002d;
    L_0x0024:
        r5 = f5424a;	 Catch:{ all -> 0x006e }
        r1 = 1;
        r5 = r5.getDefaultSensor(r1);	 Catch:{ all -> 0x006e }
        f5425b = r5;	 Catch:{ all -> 0x006e }
    L_0x002d:
        r5 = f5426c;	 Catch:{ all -> 0x006e }
        if (r5 != 0) goto L_0x003a;
    L_0x0031:
        r5 = f5424a;	 Catch:{ all -> 0x006e }
        r1 = 4;
        r5 = r5.getDefaultSensor(r1);	 Catch:{ all -> 0x006e }
        f5426c = r5;	 Catch:{ all -> 0x006e }
    L_0x003a:
        r5 = f5431h;	 Catch:{ all -> 0x006e }
        r1 = 3;
        r2 = 0;
        if (r5 != 0) goto L_0x0054;
    L_0x0040:
        r5 = new com.facebook.ads.internal.g.a$a;	 Catch:{ all -> 0x006e }
        r5.<init>();	 Catch:{ all -> 0x006e }
        f5431h = r5;	 Catch:{ all -> 0x006e }
        r5 = f5425b;	 Catch:{ all -> 0x006e }
        if (r5 == 0) goto L_0x0054;
    L_0x004b:
        r5 = f5424a;	 Catch:{ all -> 0x006e }
        r3 = f5431h;	 Catch:{ all -> 0x006e }
        r4 = f5425b;	 Catch:{ all -> 0x006e }
        r5.registerListener(r3, r4, r1);	 Catch:{ all -> 0x006e }
    L_0x0054:
        r5 = f5432i;	 Catch:{ all -> 0x006e }
        if (r5 != 0) goto L_0x006c;
    L_0x0058:
        r5 = new com.facebook.ads.internal.g.a$b;	 Catch:{ all -> 0x006e }
        r5.<init>();	 Catch:{ all -> 0x006e }
        f5432i = r5;	 Catch:{ all -> 0x006e }
        r5 = f5426c;	 Catch:{ all -> 0x006e }
        if (r5 == 0) goto L_0x006c;
    L_0x0063:
        r5 = f5424a;	 Catch:{ all -> 0x006e }
        r2 = f5432i;	 Catch:{ all -> 0x006e }
        r3 = f5426c;	 Catch:{ all -> 0x006e }
        r5.registerListener(r2, r3, r1);	 Catch:{ all -> 0x006e }
    L_0x006c:
        monitor-exit(r0);
        return;
    L_0x006e:
        r5 = move-exception;
        monitor-exit(r0);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.g.a.a(android.content.Context):void");
    }

    /* renamed from: a */
    private static void m6763a(Map<String, String> map) {
        float[] fArr = f5427d;
        float[] fArr2 = f5428e;
        if (fArr != null) {
            int min = Math.min(f5430g.length, fArr.length);
            for (int i = 0; i < min; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("accelerometer_");
                stringBuilder.append(f5430g[i]);
                map.put(stringBuilder.toString(), String.valueOf(fArr[i]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(f5430g.length, fArr2.length);
            for (int i2 = 0; i2 < min2; i2++) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("rotation_");
                stringBuilder2.append(f5430g[i2]);
                map.put(stringBuilder2.toString(), String.valueOf(fArr2[i2]));
            }
        }
    }

    /* renamed from: b */
    private static void m6766b(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        f5429f.put("available_memory", String.valueOf(memoryInfo.availMem));
        if (VERSION.SDK_INT >= 16) {
            f5429f.put("total_memory", String.valueOf(memoryInfo.totalMem));
        }
    }

    /* renamed from: c */
    private static void m6769c(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long availableBlocks = (long) statFs.getAvailableBlocks();
        f5429f.put("free_space", String.valueOf(availableBlocks * ((long) statFs.getBlockSize())));
    }

    /* renamed from: d */
    private static synchronized void m6770d() {
        synchronized (C1799a.class) {
            if (f5424a != null) {
                f5424a.unregisterListener(f5431h);
            }
            f5431h = null;
        }
    }

    /* renamed from: d */
    private static void m6771d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            Object obj;
            float f;
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            int intExtra3 = registerReceiver.getIntExtra("status", -1);
            if (intExtra3 != 2) {
                if (intExtra3 != 5) {
                    obj = null;
                    f = 0.0f;
                    if (intExtra2 > 0) {
                        f = 100.0f * (((float) intExtra) / ((float) intExtra2));
                    }
                    f5429f.put("battery", String.valueOf(f));
                    f5429f.put("charging", obj == null ? "1" : "0");
                }
            }
            obj = 1;
            f = 0.0f;
            if (intExtra2 > 0) {
                f = 100.0f * (((float) intExtra) / ((float) intExtra2));
            }
            f5429f.put("battery", String.valueOf(f));
            if (obj == null) {
            }
            f5429f.put("charging", obj == null ? "1" : "0");
        }
    }

    /* renamed from: e */
    private static synchronized void m6772e() {
        synchronized (C1799a.class) {
            if (f5424a != null) {
                f5424a.unregisterListener(f5432i);
            }
            f5432i = null;
        }
    }
}
