package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.support.v4.app.C0369x.C0366a;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.app.z */
class C0370z {
    /* renamed from: a */
    private static final Object f1290a = new Object();
    /* renamed from: b */
    private static Field f1291b;
    /* renamed from: c */
    private static boolean f1292c;
    /* renamed from: d */
    private static final Object f1293d = new Object();

    /* renamed from: a */
    public static SparseArray<Bundle> m1368a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    /* renamed from: a */
    public static Bundle m1366a(Notification notification) {
        synchronized (f1290a) {
            if (f1292c) {
                return null;
            }
            try {
                if (f1291b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                        declaredField.setAccessible(true);
                        f1291b = declaredField;
                    } else {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1292c = true;
                        return null;
                    }
                }
                Bundle bundle = (Bundle) f1291b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1291b.set(notification, bundle);
                }
                return bundle;
            } catch (Notification notification2) {
                Log.e("NotificationCompat", "Unable to access notification extras", notification2);
                f1292c = true;
                return null;
            } catch (Notification notification22) {
                Log.e("NotificationCompat", "Unable to access notification extras", notification22);
                f1292c = true;
                return null;
            }
        }
    }

    /* renamed from: a */
    public static Bundle m1365a(Builder builder, C0366a c0366a) {
        builder.addAction(c0366a.m1333a(), c0366a.m1334b(), c0366a.m1335c());
        builder = new Bundle(c0366a.m1336d());
        if (c0366a.m1338f() != null) {
            builder.putParcelableArray("android.support.remoteInputs", C0370z.m1369a(c0366a.m1338f()));
        }
        if (c0366a.m1339g() != null) {
            builder.putParcelableArray("android.support.dataRemoteInputs", C0370z.m1369a(c0366a.m1339g()));
        }
        builder.putBoolean("android.support.allowGeneratedReplies", c0366a.m1337e());
        return builder;
    }

    /* renamed from: a */
    private static Bundle m1367a(ab abVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", abVar.m1146a());
        bundle.putCharSequence("label", abVar.m1147b());
        bundle.putCharSequenceArray("choices", abVar.m1148c());
        bundle.putBoolean("allowFreeFormInput", abVar.m1150e());
        bundle.putBundle("extras", abVar.m1151f());
        ab<String> d = abVar.m1149d();
        if (!(d == null || d.isEmpty())) {
            ArrayList arrayList = new ArrayList(d.size());
            for (String add : d) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    /* renamed from: a */
    private static Bundle[] m1369a(ab[] abVarArr) {
        if (abVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[abVarArr.length];
        for (int i = 0; i < abVarArr.length; i++) {
            bundleArr[i] = C0370z.m1367a(abVarArr[i]);
        }
        return bundleArr;
    }
}
