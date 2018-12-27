package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeAppInstallAd;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.ads.formats.UnifiedNativeAdAssetNames;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@zzaer
@ParametersAreNonnullByDefault
public final class zzqc extends zzqu implements OnClickListener, OnTouchListener, OnGlobalLayoutListener, OnScrollChangedListener, zzqf {
    @VisibleForTesting
    /* renamed from: a */
    static final String[] f20359a = new String[]{NativeAppInstallAd.ASSET_MEDIA_VIDEO, NativeContentAd.ASSET_MEDIA_VIDEO, UnifiedNativeAdAssetNames.ASSET_MEDIA_VIDEO};
    /* renamed from: b */
    private final Object f20360b = new Object();
    /* renamed from: c */
    private final WeakReference<View> f20361c;
    /* renamed from: d */
    private final Map<String, WeakReference<View>> f20362d = new HashMap();
    /* renamed from: e */
    private final Map<String, WeakReference<View>> f20363e = new HashMap();
    /* renamed from: f */
    private final Map<String, WeakReference<View>> f20364f = new HashMap();
    @GuardedBy("mLock")
    @VisibleForTesting
    /* renamed from: g */
    private zzpm f20365g;
    @VisibleForTesting
    /* renamed from: h */
    private View f20366h;
    @VisibleForTesting
    /* renamed from: i */
    private Point f20367i = new Point();
    @VisibleForTesting
    /* renamed from: j */
    private Point f20368j = new Point();
    @VisibleForTesting
    /* renamed from: k */
    private WeakReference<zzfs> f20369k = new WeakReference(null);

    public zzqc(View view, HashMap<String, View> hashMap, HashMap<String, View> hashMap2) {
        zzbv.zzfi();
        zzaqa.m10047a(view, (OnGlobalLayoutListener) this);
        zzbv.zzfi();
        zzaqa.m10048a(view, (OnScrollChangedListener) this);
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        this.f20361c = new WeakReference(view);
        hashMap = hashMap.entrySet().iterator();
        while (hashMap.hasNext()) {
            Entry entry = (Entry) hashMap.next();
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.f20362d.put(str, new WeakReference(view2));
                if (!(NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str) || UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW.equals(str))) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.f20364f.putAll(this.f20362d);
        hashMap = hashMap2.entrySet().iterator();
        while (hashMap.hasNext() != null) {
            Entry entry2 = (Entry) hashMap.next();
            view2 = (View) entry2.getValue();
            if (view2 != null) {
                this.f20363e.put((String) entry2.getKey(), new WeakReference(view2));
                view2.setOnTouchListener(this);
            }
        }
        this.f20364f.putAll(this.f20363e);
        zznw.m10901a(view.getContext());
    }

    /* renamed from: a */
    public final void mo2625a() {
        synchronized (this.f20360b) {
            this.f20366h = null;
            this.f20365g = null;
            this.f20367i = null;
            this.f20368j = null;
        }
    }

    /* renamed from: a */
    public final void mo2626a(IObjectWrapper iObjectWrapper) {
        synchronized (this.f20360b) {
            ViewGroup viewGroup = null;
            m26825a(null);
            iObjectWrapper = ObjectWrapper.m26020a(iObjectWrapper);
            if (iObjectWrapper instanceof zzpq) {
                zzpm zzpm = (zzpq) iObjectWrapper;
                if (zzpm.mo2600c()) {
                    int i;
                    View view;
                    View view2 = (View) this.f20361c.get();
                    if (!(this.f20365g == null || view2 == null)) {
                        this.f20365g.mo2595b(view2, this.f20364f);
                    }
                    synchronized (this.f20360b) {
                        i = 0;
                        if (this.f20365g instanceof zzpq) {
                            zzpq zzpq = (zzpq) this.f20365g;
                            View view3 = (View) this.f20361c.get();
                            if (!(zzpq == null || zzpq.mo2610p() == null || view3 == null || !zzbv.zzfj().m9668a(view3.getContext()))) {
                                zzfw r = zzpq.m21847r();
                                if (r != null) {
                                    r.m21206a(false);
                                }
                                zzfs zzfs = (zzfs) this.f20369k.get();
                                if (!(zzfs == null || r == null)) {
                                    zzfs.m10605b(r);
                                }
                            }
                        }
                    }
                    if ((this.f20365g instanceof zzpl) && ((zzpl) this.f20365g).m26807h()) {
                        ((zzpl) this.f20365g).m26797a(zzpm);
                    } else {
                        this.f20365g = zzpm;
                        if (zzpm instanceof zzpl) {
                            ((zzpl) zzpm).m26797a(null);
                        }
                    }
                    String[] strArr = new String[]{NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, UnifiedNativeAdAssetNames.ASSET_ADCHOICES_CONTAINER_VIEW};
                    while (i < 2) {
                        WeakReference weakReference = (WeakReference) this.f20364f.get(strArr[i]);
                        if (weakReference != null) {
                            view = (View) weakReference.get();
                            break;
                        }
                        i++;
                    }
                    view = null;
                    if (view == null) {
                        zzaok.m10007e("Ad choices asset view is not provided.");
                    } else {
                        if (view instanceof ViewGroup) {
                            viewGroup = (ViewGroup) view;
                        }
                        if (viewGroup != null) {
                            this.f20366h = zzpm.mo2583a((OnClickListener) this, true);
                            if (this.f20366h != null) {
                                this.f20364f.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference(this.f20366h));
                                this.f20362d.put(NativeContentAd.ASSET_ATTRIBUTION_ICON_IMAGE, new WeakReference(this.f20366h));
                                viewGroup.removeAllViews();
                                viewGroup.addView(this.f20366h);
                            }
                        }
                    }
                    zzpm.mo4270a(view2, this.f20362d, this.f20363e, (OnTouchListener) this, (OnClickListener) this);
                    zzalo.f8872a.post(new te(this, zzpm));
                    m26825a(view2);
                    this.f20365g.mo2594b(view2);
                    synchronized (this.f20360b) {
                        if (this.f20365g instanceof zzpq) {
                            zzpq zzpq2 = (zzpq) this.f20365g;
                            view = (View) this.f20361c.get();
                            if (!(zzpq2 == null || zzpq2.mo2610p() == null || view == null || !zzbv.zzfj().m9668a(view.getContext()))) {
                                zzfs zzfs2 = (zzfs) this.f20369k.get();
                                if (zzfs2 == null) {
                                    zzfs2 = new zzfs(view.getContext(), view);
                                    this.f20369k = new WeakReference(zzfs2);
                                }
                                zzfs2.m10604a(zzpq2.m21847r());
                            }
                        }
                    }
                    return;
                }
                zzaok.m10003c("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                return;
            }
            zzaok.m10007e("Not an instance of native engine. This is most likely a transient error");
        }
    }

    /* renamed from: b */
    public final void mo2627b(IObjectWrapper iObjectWrapper) {
        synchronized (this.f20360b) {
            this.f20365g.mo2585a((View) ObjectWrapper.m26020a(iObjectWrapper));
        }
    }

    /* renamed from: a */
    private final boolean m26829a(String[] strArr) {
        for (Object obj : strArr) {
            if (this.f20362d.get(obj) != null) {
                return 1;
            }
        }
        for (Object obj2 : strArr) {
            if (this.f20363e.get(obj2) != null) {
                return false;
            }
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private final void m26826a(com.google.android.gms.internal.ads.zzpq r7) {
        /*
        r6 = this;
        r0 = r6.f20360b;
        monitor-enter(r0);
        r1 = f20359a;	 Catch:{ all -> 0x003b }
        r2 = r1.length;	 Catch:{ all -> 0x003b }
        r3 = 0;
    L_0x0007:
        if (r3 >= r2) goto L_0x001f;
    L_0x0009:
        r4 = r1[r3];	 Catch:{ all -> 0x003b }
        r5 = r6.f20364f;	 Catch:{ all -> 0x003b }
        r4 = r5.get(r4);	 Catch:{ all -> 0x003b }
        r4 = (java.lang.ref.WeakReference) r4;	 Catch:{ all -> 0x003b }
        if (r4 == 0) goto L_0x001c;
    L_0x0015:
        r1 = r4.get();	 Catch:{ all -> 0x003b }
        r1 = (android.view.View) r1;	 Catch:{ all -> 0x003b }
        goto L_0x0020;
    L_0x001c:
        r3 = r3 + 1;
        goto L_0x0007;
    L_0x001f:
        r1 = 0;
    L_0x0020:
        r2 = r1 instanceof android.widget.FrameLayout;	 Catch:{ all -> 0x003b }
        if (r2 != 0) goto L_0x0029;
    L_0x0024:
        r7.mo2606l();	 Catch:{ all -> 0x003b }
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;
    L_0x0029:
        r2 = new com.google.android.gms.internal.ads.tf;	 Catch:{ all -> 0x003b }
        r2.<init>(r6, r1);	 Catch:{ all -> 0x003b }
        r3 = r7 instanceof com.google.android.gms.internal.ads.zzpl;	 Catch:{ all -> 0x003b }
        if (r3 == 0) goto L_0x0036;
    L_0x0032:
        r7.m21829b(r1, r2);	 Catch:{ all -> 0x003b }
        goto L_0x0039;
    L_0x0036:
        r7.mo2586a(r1, r2);	 Catch:{ all -> 0x003b }
    L_0x0039:
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        return;
    L_0x003b:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003b }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqc.a(com.google.android.gms.internal.ads.zzpq):void");
    }

    /* renamed from: a */
    private final void m26825a(View view) {
        synchronized (this.f20360b) {
            if (this.f20365g != null) {
                zzpm i;
                if (this.f20365g instanceof zzpl) {
                    i = ((zzpl) this.f20365g).m26808i();
                } else {
                    i = this.f20365g;
                }
                if (i != null) {
                    i.mo2598c(view);
                }
            }
        }
    }

    public final void onGlobalLayout() {
        synchronized (this.f20360b) {
            if (this.f20365g != null) {
                View view = (View) this.f20361c.get();
                if (view != null) {
                    this.f20365g.mo2599c(view, this.f20364f);
                }
            }
        }
    }

    public final void onScrollChanged() {
        synchronized (this.f20360b) {
            if (this.f20365g != null) {
                View view = (View) this.f20361c.get();
                if (view != null) {
                    this.f20365g.mo2599c(view, this.f20364f);
                }
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        synchronized (this.f20360b) {
            if (this.f20365g == null) {
                return false;
            }
            View view2 = (View) this.f20361c.get();
            if (view2 == null) {
                return false;
            }
            int[] iArr = new int[2];
            view2.getLocationOnScreen(iArr);
            Point point = new Point((int) (motionEvent.getRawX() - ((float) iArr[0])), (int) (motionEvent.getRawY() - ((float) iArr[1])));
            this.f20367i = point;
            if (motionEvent.getAction() == 0) {
                this.f20368j = point;
            }
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.setLocation((float) point.x, (float) point.y);
            this.f20365g.mo2584a(motionEvent);
            motionEvent.recycle();
            return false;
        }
    }

    /* renamed from: b */
    public final synchronized Map<String, WeakReference<View>> mo4272b() {
        return this.f20364f;
    }

    /* renamed from: c */
    public final View mo4273c() {
        return (View) this.f20361c.get();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r10) {
        /*
        r9 = this;
        r0 = r9.f20360b;
        monitor-enter(r0);
        r1 = r9.f20365g;	 Catch:{ all -> 0x0096 }
        if (r1 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r0);	 Catch:{ all -> 0x0096 }
        return;
    L_0x0009:
        r1 = r9.f20361c;	 Catch:{ all -> 0x0096 }
        r1 = r1.get();	 Catch:{ all -> 0x0096 }
        r7 = r1;
        r7 = (android.view.View) r7;	 Catch:{ all -> 0x0096 }
        if (r7 != 0) goto L_0x0016;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0096 }
        return;
    L_0x0016:
        r5 = new android.os.Bundle;	 Catch:{ all -> 0x0096 }
        r5.<init>();	 Catch:{ all -> 0x0096 }
        r1 = "x";
        r2 = r9.f20367i;	 Catch:{ all -> 0x0096 }
        r2 = r2.x;	 Catch:{ all -> 0x0096 }
        r2 = r9.m26824a(r2);	 Catch:{ all -> 0x0096 }
        r2 = (float) r2;	 Catch:{ all -> 0x0096 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0096 }
        r1 = "y";
        r2 = r9.f20367i;	 Catch:{ all -> 0x0096 }
        r2 = r2.y;	 Catch:{ all -> 0x0096 }
        r2 = r9.m26824a(r2);	 Catch:{ all -> 0x0096 }
        r2 = (float) r2;	 Catch:{ all -> 0x0096 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0096 }
        r1 = "start_x";
        r2 = r9.f20368j;	 Catch:{ all -> 0x0096 }
        r2 = r2.x;	 Catch:{ all -> 0x0096 }
        r2 = r9.m26824a(r2);	 Catch:{ all -> 0x0096 }
        r2 = (float) r2;	 Catch:{ all -> 0x0096 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0096 }
        r1 = "start_y";
        r2 = r9.f20368j;	 Catch:{ all -> 0x0096 }
        r2 = r2.y;	 Catch:{ all -> 0x0096 }
        r2 = r9.m26824a(r2);	 Catch:{ all -> 0x0096 }
        r2 = (float) r2;	 Catch:{ all -> 0x0096 }
        r5.putFloat(r1, r2);	 Catch:{ all -> 0x0096 }
        r1 = r9.f20366h;	 Catch:{ all -> 0x0096 }
        if (r1 == 0) goto L_0x008d;
    L_0x0057:
        r1 = r9.f20366h;	 Catch:{ all -> 0x0096 }
        r1 = r1.equals(r10);	 Catch:{ all -> 0x0096 }
        if (r1 == 0) goto L_0x008d;
    L_0x005f:
        r1 = r9.f20365g;	 Catch:{ all -> 0x0096 }
        r1 = r1 instanceof com.google.android.gms.internal.ads.zzpl;	 Catch:{ all -> 0x0096 }
        if (r1 == 0) goto L_0x0081;
    L_0x0065:
        r1 = r9.f20365g;	 Catch:{ all -> 0x0096 }
        r1 = (com.google.android.gms.internal.ads.zzpl) r1;	 Catch:{ all -> 0x0096 }
        r1 = r1.m26808i();	 Catch:{ all -> 0x0096 }
        if (r1 == 0) goto L_0x0094;
    L_0x006f:
        r1 = r9.f20365g;	 Catch:{ all -> 0x0096 }
        r1 = (com.google.android.gms.internal.ads.zzpl) r1;	 Catch:{ all -> 0x0096 }
        r2 = r1.m26808i();	 Catch:{ all -> 0x0096 }
        r4 = "1007";
        r6 = r9.f20364f;	 Catch:{ all -> 0x0096 }
        r8 = 0;
        r3 = r10;
        r2.mo2587a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0096 }
        goto L_0x0094;
    L_0x0081:
        r2 = r9.f20365g;	 Catch:{ all -> 0x0096 }
        r4 = "1007";
        r6 = r9.f20364f;	 Catch:{ all -> 0x0096 }
        r8 = 0;
        r3 = r10;
        r2.mo2587a(r3, r4, r5, r6, r7, r8);	 Catch:{ all -> 0x0096 }
        goto L_0x0094;
    L_0x008d:
        r1 = r9.f20365g;	 Catch:{ all -> 0x0096 }
        r2 = r9.f20364f;	 Catch:{ all -> 0x0096 }
        r1.mo2589a(r10, r2, r5, r7);	 Catch:{ all -> 0x0096 }
    L_0x0094:
        monitor-exit(r0);	 Catch:{ all -> 0x0096 }
        return;
    L_0x0096:
        r10 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0096 }
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqc.onClick(android.view.View):void");
    }

    @VisibleForTesting
    /* renamed from: a */
    private final int m26824a(int i) {
        synchronized (this.f20360b) {
            zzkd.m10709a();
            i = zzaoa.m9962b(this.f20365g.mo2610p(), i);
        }
        return i;
    }
}
