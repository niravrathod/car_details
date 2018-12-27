package com.google.firebase.p136a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.firebase_abt.zzj;
import com.google.android.gms.internal.firebase_abt.zzo;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@KeepForSdk
/* renamed from: com.google.firebase.a.a */
public class C2559a {
    /* renamed from: a */
    private AppMeasurement f10899a;
    /* renamed from: b */
    private String f10900b;
    /* renamed from: c */
    private int f10901c;
    /* renamed from: d */
    private long f10902d;
    /* renamed from: e */
    private SharedPreferences f10903e;
    /* renamed from: f */
    private String f10904f;
    /* renamed from: g */
    private Integer f10905g = null;

    @KeepForSdk
    public C2559a(Context context, String str, int i) {
        this.f10899a = AppMeasurement.getInstance(context);
        this.f10900b = str;
        this.f10901c = i;
        this.f10903e = context.getSharedPreferences("com.google.firebase.abt", 0);
        this.f10904f = String.format("%s_lastKnownExperimentStartTime", new Object[]{str});
        this.f10902d = this.f10903e.getLong(this.f10904f, 0);
    }

    /* renamed from: a */
    private static zzo m12568a(byte[] bArr) {
        try {
            return (zzo) zzj.m11481a(new zzo(), bArr, 0, bArr.length);
        } catch (Throwable e) {
            Log.e("FirebaseABTesting", "Payload was not defined or could not be deserialized.", e);
            return null;
        }
    }

    /* renamed from: a */
    private final void m12569a(String str) {
        this.f10899a.clearConditionalUserProperty(str, null, null);
    }

    /* renamed from: a */
    private final void m12570a(Collection<ConditionalUserProperty> collection) {
        for (ConditionalUserProperty conditionalUserProperty : collection) {
            m12569a(conditionalUserProperty.mName);
        }
    }

    /* renamed from: a */
    private final boolean m12571a(zzo zzo) {
        int i = zzo.f20495i;
        int i2 = this.f10901c;
        if (i == 0) {
            i = i2 != 0 ? i2 : 1;
        }
        if (i == 1) {
            return true;
        }
        if (Log.isLoggable("FirebaseABTesting", 3)) {
            Log.d("FirebaseABTesting", String.format("Experiment won't be set due to the overflow policy: [%s, %s]", new Object[]{zzo.f20489c, zzo.f20490d}));
        }
        return false;
    }

    /* renamed from: b */
    private final ConditionalUserProperty m12572b(zzo zzo) {
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mOrigin = this.f10900b;
        conditionalUserProperty.mCreationTimestamp = zzo.f20491e;
        conditionalUserProperty.mName = zzo.f20489c;
        conditionalUserProperty.mValue = zzo.f20490d;
        conditionalUserProperty.mTriggerEventName = TextUtils.isEmpty(zzo.f20492f) ? null : zzo.f20492f;
        conditionalUserProperty.mTriggerTimeout = zzo.f20493g;
        conditionalUserProperty.mTimeToLive = zzo.f20494h;
        return conditionalUserProperty;
    }

    /* renamed from: b */
    private final void m12573b() {
        if (this.f10903e.getLong(this.f10904f, 0) != this.f10902d) {
            Editor edit = this.f10903e.edit();
            edit.putLong(this.f10904f, this.f10902d);
            edit.apply();
        }
    }

    /* renamed from: c */
    private final List<ConditionalUserProperty> m12574c() {
        return this.f10899a.getConditionalUserProperties(this.f10900b, "");
    }

    /* renamed from: d */
    private final int m12575d() {
        if (this.f10905g == null) {
            this.f10905g = Integer.valueOf(this.f10899a.getMaxUserProperties(this.f10900b));
        }
        return this.f10905g.intValue();
    }

    @KeepForSdk
    /* renamed from: a */
    public void m12576a() {
        m12570a(m12574c());
    }

    @KeepForSdk
    /* renamed from: a */
    public void m12577a(List<byte[]> list) {
        String str;
        String str2;
        if (list == null) {
            str = "FirebaseABTesting";
            str2 = "Cannot replace experiments because experimentPayloads is null.";
        } else if (list.isEmpty()) {
            m12576a();
            return;
        } else {
            List arrayList = new ArrayList();
            for (byte[] a : list) {
                zzo a2 = C2559a.m12568a(a);
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
            if (arrayList.isEmpty()) {
                str = "FirebaseABTesting";
                str2 = "All payloads are either not defined or cannot not be deserialized.";
            } else {
                Set hashSet = new HashSet();
                ArrayList arrayList2 = (ArrayList) arrayList;
                int size = arrayList2.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    hashSet.add(((zzo) obj).f20489c);
                }
                List<ConditionalUserProperty> c = m12574c();
                Set hashSet2 = new HashSet();
                for (ConditionalUserProperty conditionalUserProperty : c) {
                    hashSet2.add(conditionalUserProperty.mName);
                }
                Collection arrayList3 = new ArrayList();
                for (ConditionalUserProperty conditionalUserProperty2 : c) {
                    if (!hashSet.contains(conditionalUserProperty2.mName)) {
                        arrayList3.add(conditionalUserProperty2);
                    }
                }
                m12570a(arrayList3);
                ArrayList arrayList4 = new ArrayList();
                size = arrayList2.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    zzo zzo = (zzo) obj2;
                    if (!hashSet2.contains(zzo.f20489c)) {
                        int i4 = 1;
                        if (zzo.f20491e <= this.f10902d) {
                            if (Log.isLoggable("FirebaseABTesting", 3)) {
                                Log.d("FirebaseABTesting", String.format("The experiment [%s, %s, %d] is not new since its startTime is before lastKnownStartTime: %d", new Object[]{zzo.f20489c, zzo.f20490d, Long.valueOf(zzo.f20491e), Long.valueOf(this.f10902d)}));
                            }
                            i4 = 0;
                        }
                        if (i4 != 0) {
                            arrayList4.add(zzo);
                        }
                    }
                }
                Deque arrayDeque = new ArrayDeque(m12574c());
                i2 = m12575d();
                arrayList4 = arrayList4;
                i3 = arrayList4.size();
                int i5 = 0;
                while (i5 < i3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    zzo zzo2 = (zzo) obj3;
                    if (arrayDeque.size() >= i2) {
                        if (m12571a(zzo2)) {
                            while (arrayDeque.size() >= i2) {
                                m12569a(((ConditionalUserProperty) arrayDeque.pollFirst()).mName);
                            }
                        }
                    }
                    ConditionalUserProperty b = m12572b(zzo2);
                    this.f10899a.setConditionalUserProperty(b);
                    arrayDeque.offer(b);
                }
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj4 = arrayList2.get(i);
                    i++;
                    this.f10902d = Math.max(this.f10902d, ((zzo) obj4).f20491e);
                }
                m12573b();
                return;
            }
        }
        Log.e(str, str2);
    }
}
