package android.support.transition;

import android.view.View;

public abstract class bb extends af {
    /* renamed from: a */
    private static final String[] f13075a = new String[]{"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    /* renamed from: a */
    public void mo236a(ah ahVar) {
        View view = ahVar.f995b;
        Object obj = (Integer) ahVar.f994a.get("android:visibility:visibility");
        if (obj == null) {
            obj = Integer.valueOf(view.getVisibility());
        }
        ahVar.f994a.put("android:visibilityPropagation:visibility", obj);
        r2 = new int[2];
        view.getLocationOnScreen(r2);
        r2[0] = r2[0] + Math.round(view.getTranslationX());
        r2[0] = r2[0] + (view.getWidth() / 2);
        r2[1] = r2[1] + Math.round(view.getTranslationY());
        r2[1] = r2[1] + (view.getHeight() / 2);
        ahVar.f994a.put("android:visibilityPropagation:center", r2);
    }

    /* renamed from: a */
    public String[] mo237a() {
        return f13075a;
    }

    /* renamed from: b */
    public int m15258b(ah ahVar) {
        if (ahVar == null) {
            return 8;
        }
        Integer num = (Integer) ahVar.f994a.get("android:visibilityPropagation:visibility");
        if (num == null) {
            return 8;
        }
        return num.intValue();
    }

    /* renamed from: c */
    public int m15259c(ah ahVar) {
        return m15255a(ahVar, 0);
    }

    /* renamed from: d */
    public int m15260d(ah ahVar) {
        return m15255a(ahVar, 1);
    }

    /* renamed from: a */
    private static int m15255a(ah ahVar, int i) {
        if (ahVar == null) {
            return -1;
        }
        int[] iArr = (int[]) ahVar.f994a.get("android:visibilityPropagation:center");
        if (iArr == null) {
            return -1;
        }
        return iArr[i];
    }
}
