package io.fabric.sdk.android;

import android.util.Log;

/* renamed from: io.fabric.sdk.android.b */
public class C4290b implements C2774k {
    /* renamed from: a */
    private int f17996a;

    public C4290b(int i) {
        this.f17996a = i;
    }

    public C4290b() {
        this.f17996a = 4;
    }

    /* renamed from: a */
    public boolean mo3556a(String str, int i) {
        return this.f17996a <= i ? true : null;
    }

    /* renamed from: a */
    public void mo3555a(String str, String str2, Throwable th) {
        if (mo3556a(str, 3)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: b */
    public void m23573b(String str, String str2, Throwable th) {
        if (mo3556a(str, 2)) {
            Log.v(str, str2, th);
        }
    }

    /* renamed from: c */
    public void m23575c(String str, String str2, Throwable th) {
        if (mo3556a(str, 4)) {
            Log.i(str, str2, th);
        }
    }

    /* renamed from: d */
    public void mo3560d(String str, String str2, Throwable th) {
        if (mo3556a(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    /* renamed from: e */
    public void mo3562e(String str, String str2, Throwable th) {
        if (mo3556a(str, 6)) {
            Log.e(str, str2, th);
        }
    }

    /* renamed from: a */
    public void mo3554a(String str, String str2) {
        mo3555a(str, str2, null);
    }

    /* renamed from: b */
    public void mo3557b(String str, String str2) {
        m23573b(str, str2, null);
    }

    /* renamed from: c */
    public void mo3558c(String str, String str2) {
        m23575c(str, str2, null);
    }

    /* renamed from: d */
    public void mo3559d(String str, String str2) {
        mo3560d(str, str2, null);
    }

    /* renamed from: e */
    public void mo3561e(String str, String str2) {
        mo3562e(str, str2, null);
    }

    /* renamed from: a */
    public void mo3552a(int i, String str, String str2) {
        mo3553a(i, str, str2, false);
    }

    /* renamed from: a */
    public void mo3553a(int i, String str, String str2, boolean z) {
        if (z || mo3556a(str, i)) {
            Log.println(i, str, str2);
        }
    }
}
