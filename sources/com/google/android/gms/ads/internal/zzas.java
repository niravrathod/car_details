package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.gmsg.zzu;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaer;
import com.google.android.gms.internal.ads.zzakm;
import com.google.android.gms.internal.ads.zzaok;
import com.google.android.gms.internal.ads.zzasg;
import com.google.android.gms.internal.ads.zzpb;
import com.google.android.gms.internal.ads.zzpd;
import com.google.android.gms.internal.ads.zzqk;
import com.google.android.gms.internal.ads.zzql;
import com.google.android.gms.internal.ads.zzye;
import com.google.android.gms.internal.ads.zzyz;
import com.google.android.gms.internal.ads.zzzc;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@zzaer
@ParametersAreNonnullByDefault
public final class zzas {
    public static View zze(zzakm zzakm) {
        if (zzakm == null) {
            zzaok.m10003c("AdState is null");
            return null;
        } else if (zzf(zzakm) && zzakm.f8781b != null) {
            return zzakm.f8781b.getView();
        } else {
            try {
                IObjectWrapper a = zzakm.f8795p != null ? zzakm.f8795p.mo2759a() : null;
                if (a != null) {
                    return (View) ObjectWrapper.m26020a(a);
                }
                zzaok.m10007e("View in mediation adapter is null.");
                return null;
            } catch (zzakm zzakm2) {
                zzaok.m10004c("Could not get View from mediation adapter.", zzakm2);
                return null;
            }
        }
    }

    public static boolean zza(zzasg zzasg, zzye zzye, CountDownLatch countDownLatch) {
        zzasg zzasg2 = zzasg;
        zzye zzye2 = zzye;
        CountDownLatch countDownLatch2 = countDownLatch;
        boolean z = false;
        try {
            View view = zzasg.getView();
            if (view == null) {
                zzaok.m10007e("AdWebView is null");
            } else {
                view.setVisibility(4);
                List list = zzye2.f9879b.f9853r;
                if (list != null) {
                    if (!list.isEmpty()) {
                        zzasg2.mo4740a("/nativeExpressAssetsLoaded", new C4077k(countDownLatch2));
                        zzasg2.mo4740a("/nativeExpressAssetsLoadingFailed", new C4078l(countDownLatch2));
                        zzyz h = zzye2.f9880c.mo2777h();
                        zzzc i = zzye2.f9880c.mo2778i();
                        View view2 = null;
                        String a;
                        List b;
                        String c;
                        zzqk d;
                        String e;
                        if (list.contains("2") && h != null) {
                            a = h.mo2802a();
                            b = h.mo2805b();
                            c = h.mo2807c();
                            d = h.mo2809d();
                            e = h.mo2810e();
                            double f = h.mo2811f();
                            String g = h.mo2812g();
                            String h2 = h.mo2813h();
                            Bundle l = h.mo2817l();
                            if (h.mo2821p() != null) {
                                view2 = (View) ObjectWrapper.m26020a(h.mo2821p());
                            }
                            zzasg.mo4782u().mo2393a(new C4075i(new zzpb(a, b, c, d, e, f, g, h2, null, l, null, view2, h.mo2822q(), null), zzye2.f9879b.f9852q, zzasg2));
                        } else if (!list.contains("1") || i == null) {
                            zzaok.m10007e("No matching template id and mapper");
                        } else {
                            a = i.mo2823a();
                            b = i.mo2826b();
                            c = i.mo2828c();
                            d = i.mo2830d();
                            e = i.mo2831e();
                            String f2 = i.mo2832f();
                            Bundle j = i.mo2836j();
                            if (i.mo2840n() != null) {
                                view2 = (View) ObjectWrapper.m26020a(i.mo2840n());
                            }
                            zzasg.mo4782u().mo2393a(new C4076j(new zzpd(a, b, c, d, e, f2, null, j, null, view2, i.mo2841o(), null), zzye2.f9879b.f9852q, zzasg2));
                        }
                        String str = zzye2.f9879b.f9850o;
                        String str2 = zzye2.f9879b.f9851p;
                        if (str2 != null) {
                            zzasg.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", null);
                        } else {
                            zzasg2.loadData(str, "text/html", "UTF-8");
                        }
                        z = true;
                    }
                }
                zzaok.m10007e("No template ids present in mediation response");
            }
        } catch (Throwable e2) {
            zzaok.m10004c("Unable to invoke load assets", e2);
        } catch (RuntimeException e3) {
            countDownLatch.countDown();
            throw e3;
        }
        if (!z) {
            countDownLatch.countDown();
        }
        return z;
    }

    public static boolean zzf(zzakm zzakm) {
        return (zzakm == null || !zzakm.f8793n || zzakm.f8794o == null || zzakm.f8794o.f9850o == null) ? null : true;
    }

    @VisibleForTesting
    /* renamed from: a */
    static zzu<zzasg> m8803a(zzyz zzyz, zzzc zzzc, zzab zzab) {
        return new C4079m(zzyz, zzab, zzzc);
    }

    /* renamed from: b */
    private static void m8812b(zzasg zzasg) {
        OnClickListener onClickListener = zzasg.getOnClickListener();
        if (onClickListener != null) {
            onClickListener.onClick(zzasg.getView());
        }
    }

    /* renamed from: a */
    private static JSONObject m8807a(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        if (bundle != null) {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject2 = new JSONObject(str);
                str = jSONObject2.keys();
                while (str.hasNext()) {
                    String str2 = (String) str.next();
                    if (bundle.containsKey(str2)) {
                        if ("image".equals(jSONObject2.getString(str2))) {
                            Object obj = bundle.get(str2);
                            if (obj instanceof Bitmap) {
                                jSONObject.put(str2, m8805a((Bitmap) obj));
                            } else {
                                zzaok.m10007e("Invalid type. An image type extra should return a bitmap");
                            }
                        } else if (bundle.get(str2) instanceof Bitmap) {
                            zzaok.m10007e("Invalid asset type. Bitmap should be returned only for image type");
                        } else {
                            jSONObject.put(str2, String.valueOf(bundle.get(str2)));
                        }
                    }
                }
                return jSONObject;
            }
        }
        return jSONObject;
    }

    @com.google.android.gms.common.util.VisibleForTesting
    /* renamed from: a */
    private static java.lang.String m8806a(com.google.android.gms.internal.ads.zzqk r1) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        if (r1 != 0) goto L_0x000a;
    L_0x0002:
        r1 = "Image is null. Returning empty string";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
        r1 = "";
        return r1;
    L_0x000a:
        r0 = r1.mo2616b();	 Catch:{ RemoteException -> 0x0015 }
        if (r0 == 0) goto L_0x001a;	 Catch:{ RemoteException -> 0x0015 }
    L_0x0010:
        r0 = r0.toString();	 Catch:{ RemoteException -> 0x0015 }
        return r0;
    L_0x0015:
        r0 = "Unable to get image uri. Trying data uri next";
        com.google.android.gms.internal.ads.zzaok.m10007e(r0);
    L_0x001a:
        r1 = m8811b(r1);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzas.a(com.google.android.gms.internal.ads.zzqk):java.lang.String");
    }

    /* renamed from: b */
    private static java.lang.String m8811b(com.google.android.gms.internal.ads.zzqk r1) {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r1 = r1.mo2615a();	 Catch:{ RemoteException -> 0x002b }
        if (r1 != 0) goto L_0x000e;	 Catch:{ RemoteException -> 0x002b }
    L_0x0006:
        r1 = "Drawable is null. Returning empty string";	 Catch:{ RemoteException -> 0x002b }
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);	 Catch:{ RemoteException -> 0x002b }
        r1 = "";	 Catch:{ RemoteException -> 0x002b }
        return r1;	 Catch:{ RemoteException -> 0x002b }
    L_0x000e:
        r1 = com.google.android.gms.dynamic.ObjectWrapper.m26020a(r1);	 Catch:{ RemoteException -> 0x002b }
        r1 = (android.graphics.drawable.Drawable) r1;	 Catch:{ RemoteException -> 0x002b }
        r0 = r1 instanceof android.graphics.drawable.BitmapDrawable;
        if (r0 != 0) goto L_0x0020;
    L_0x0018:
        r1 = "Drawable is not an instance of BitmapDrawable. Returning empty string";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
        r1 = "";
        return r1;
    L_0x0020:
        r1 = (android.graphics.drawable.BitmapDrawable) r1;
        r1 = r1.getBitmap();
        r1 = m8805a(r1);
        return r1;
    L_0x002b:
        r1 = "Unable to get drawable. Returning empty string";
        com.google.android.gms.internal.ads.zzaok.m10007e(r1);
        r1 = "";
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.zzas.b(com.google.android.gms.internal.ads.zzqk):java.lang.String");
    }

    /* renamed from: a */
    private static String m8805a(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bitmap == null) {
            zzaok.m10007e("Bitmap is null. Returning empty string");
            return "";
        }
        bitmap.compress(CompressFormat.PNG, 100, byteArrayOutputStream);
        bitmap = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        String valueOf = String.valueOf("data:image/png;base64,");
        bitmap = String.valueOf(bitmap);
        return bitmap.length() != 0 ? valueOf.concat(bitmap) : new String(valueOf);
    }

    /* renamed from: a */
    private static zzqk m8804a(Object obj) {
        return obj instanceof IBinder ? zzql.m21851a((IBinder) obj) : null;
    }

    /* renamed from: a */
    static final /* synthetic */ void m8810a(zzpd zzpd, String str, zzasg zzasg, boolean z) {
        try {
            z = new JSONObject();
            z.put("headline", zzpd.mo2650e());
            z.put("body", zzpd.mo2654i());
            z.put("call_to_action", zzpd.mo2656k());
            z.put("advertiser", zzpd.mo2657l());
            z.put("logo", m8806a(zzpd.mo2655j()));
            JSONArray jSONArray = new JSONArray();
            List<Object> f = zzpd.mo2633f();
            if (f != null) {
                for (Object a : f) {
                    jSONArray.put(m8806a(m8804a(a)));
                }
            }
            z.put("images", jSONArray);
            z.put("extras", m8807a(zzpd.mo2660o(), str));
            zzpd = new JSONObject();
            zzpd.put("assets", z);
            zzpd.put("template_id", "1");
            zzasg.mo4750b("google.afma.nativeExpressAds.loadAssets", zzpd);
        } catch (zzpd zzpd2) {
            zzaok.m10004c("Exception occurred when loading assets", zzpd2);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m8809a(zzpb zzpb, String str, zzasg zzasg, boolean z) {
        try {
            z = new JSONObject();
            z.put("headline", zzpb.mo2632e());
            z.put("body", zzpb.mo2634g());
            z.put("call_to_action", zzpb.mo2636i());
            z.put("price", zzpb.mo2639l());
            z.put("star_rating", String.valueOf(zzpb.mo2637j()));
            z.put("store", zzpb.mo2638k());
            z.put("icon", m8806a(zzpb.mo2635h()));
            JSONArray jSONArray = new JSONArray();
            List<Object> f = zzpb.mo2633f();
            if (f != null) {
                for (Object a : f) {
                    jSONArray.put(m8806a(m8804a(a)));
                }
            }
            z.put("images", jSONArray);
            z.put("extras", m8807a(zzpb.mo2642o(), str));
            zzpb = new JSONObject();
            zzpb.put("assets", z);
            zzpb.put("template_id", "2");
            zzasg.mo4750b("google.afma.nativeExpressAds.loadAssets", zzpb);
        } catch (zzpb zzpb2) {
            zzaok.m10004c("Exception occurred when loading assets", zzpb2);
        }
    }
}
