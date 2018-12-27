package com.facebook.ads.internal.p101q.p102a;

import android.os.Build.VERSION;
import android.view.InputDevice;
import android.view.InputDevice.MotionRange;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.internal.q.a.t */
public class C1933t {
    /* renamed from: a */
    private static final String f5914a = "t";
    /* renamed from: b */
    private boolean f5915b;
    /* renamed from: c */
    private int f5916c = -1;
    /* renamed from: d */
    private int f5917d = -1;
    /* renamed from: e */
    private int f5918e = -1;
    /* renamed from: f */
    private int f5919f = -1;
    /* renamed from: g */
    private long f5920g = -1;
    /* renamed from: h */
    private int f5921h = -1;
    /* renamed from: i */
    private long f5922i = -1;
    /* renamed from: j */
    private long f5923j = -1;
    /* renamed from: k */
    private int f5924k = -1;
    /* renamed from: l */
    private int f5925l = -1;
    /* renamed from: m */
    private int f5926m = -1;
    /* renamed from: n */
    private int f5927n = -1;
    /* renamed from: o */
    private float f5928o = -1.0f;
    /* renamed from: p */
    private float f5929p = -1.0f;
    /* renamed from: q */
    private float f5930q = -1.0f;
    /* renamed from: r */
    private View f5931r;
    /* renamed from: s */
    private View f5932s;

    /* renamed from: f */
    private C1920j m7315f() {
        if (this.f5931r != null) {
            if (this.f5932s != null) {
                if (this.f5931r != this.f5932s) {
                    return C1920j.INTERNAL_NO_CLICK;
                }
                if (VERSION.SDK_INT < 4) {
                    return C1920j.INTERNAL_API_TOO_LOW;
                }
                Object tag = this.f5931r.getTag(C1920j.f5893o);
                return tag == null ? C1920j.INTERNAL_NO_TAG : !(tag instanceof C1920j) ? C1920j.INTERNAL_WRONG_TAG_CLASS : (C1920j) tag;
            }
        }
        return C1920j.INTERNAL_NULL_VIEW;
    }

    /* renamed from: a */
    public void m7316a() {
        this.f5920g = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m7317a(MotionEvent motionEvent, View view, View view2) {
        if (!this.f5915b) {
            this.f5915b = true;
            InputDevice device = motionEvent.getDevice();
            if (device != null) {
                MotionRange motionRange = device.getMotionRange(0);
                MotionRange motionRange2 = device.getMotionRange(1);
                if (!(motionRange == null || motionRange2 == null)) {
                    this.f5930q = Math.min(motionRange.getRange(), motionRange2.getRange());
                }
            }
            if (this.f5930q <= 0.0f) {
                this.f5930q = (float) Math.min(view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationInWindow(iArr2);
        switch (motionEvent.getAction()) {
            case 0:
                this.f5916c = (int) (((float) iArr[0]) / C1936w.f5934b);
                this.f5917d = (int) (((float) iArr[1]) / C1936w.f5934b);
                this.f5918e = (int) (((float) view.getWidth()) / C1936w.f5934b);
                this.f5919f = (int) (((float) view.getHeight()) / C1936w.f5934b);
                this.f5921h = 1;
                this.f5922i = System.currentTimeMillis();
                this.f5924k = (int) (((float) ((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0])) / C1936w.f5934b);
                this.f5925l = (int) (((float) ((((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1])) / C1936w.f5934b);
                this.f5928o = motionEvent.getPressure();
                this.f5929p = motionEvent.getSize();
                this.f5931r = view2;
                return;
            case 1:
            case 3:
                this.f5923j = System.currentTimeMillis();
                this.f5926m = (int) (((float) ((((int) (motionEvent.getX() + 0.5f)) + iArr2[0]) - iArr[0])) / C1936w.f5934b);
                this.f5927n = (int) (((float) ((((int) (motionEvent.getY() + 0.5f)) + iArr2[1]) - iArr[1])) / C1936w.f5934b);
                this.f5932s = view2;
                return;
            case 2:
                this.f5928o -= this.f5928o / ((float) this.f5921h);
                this.f5928o += motionEvent.getPressure() / ((float) this.f5921h);
                this.f5929p -= this.f5929p / ((float) this.f5921h);
                this.f5929p += motionEvent.getSize() / ((float) this.f5921h);
                this.f5921h++;
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    public boolean m7318b() {
        return this.f5920g != -1;
    }

    /* renamed from: c */
    public long m7319c() {
        return m7318b() ? System.currentTimeMillis() - this.f5920g : -1;
    }

    /* renamed from: d */
    public boolean m7320d() {
        return this.f5915b;
    }

    /* renamed from: e */
    public Map<String, String> m7321e() {
        if (!this.f5915b) {
            return null;
        }
        String valueOf = String.valueOf((this.f5929p * this.f5930q) / 2.0f);
        long j = (this.f5920g <= 0 || this.f5923j <= this.f5920g) ? -1 : this.f5923j - this.f5920g;
        Map<String, String> hashMap = new HashMap();
        hashMap.put("adPositionX", String.valueOf(this.f5916c));
        hashMap.put("adPositionY", String.valueOf(this.f5917d));
        hashMap.put("width", String.valueOf(this.f5918e));
        hashMap.put("height", String.valueOf(this.f5919f));
        hashMap.put("clickDelayTime", String.valueOf(j));
        hashMap.put("startTime", String.valueOf(this.f5922i));
        hashMap.put("endTime", String.valueOf(this.f5923j));
        hashMap.put("startX", String.valueOf(this.f5924k));
        hashMap.put("startY", String.valueOf(this.f5925l));
        hashMap.put("clickX", String.valueOf(this.f5926m));
        hashMap.put("clickY", String.valueOf(this.f5927n));
        hashMap.put("endX", String.valueOf(this.f5926m));
        hashMap.put("endY", String.valueOf(this.f5927n));
        hashMap.put("force", String.valueOf(this.f5928o));
        hashMap.put("radiusX", valueOf);
        hashMap.put("radiusY", valueOf);
        hashMap.put("clickedViewTag", String.valueOf(m7315f().m7292a()));
        return hashMap;
    }
}
