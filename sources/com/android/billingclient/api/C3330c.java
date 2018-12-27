package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.billingclient.api.C1025g.C1024a;
import com.android.billingclient.api.C1029j.C1028a;
import com.android.billingclient.p041a.C1003a;
import com.android.p039a.p040a.C1002a;
import com.android.p039a.p040a.C1002a.C3329a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

/* renamed from: com.android.billingclient.api.c */
class C3330c extends C1009b {
    /* renamed from: a */
    private int f14151a = 0;
    /* renamed from: b */
    private final Handler f14152b = new Handler();
    /* renamed from: c */
    private final C1006a f14153c;
    /* renamed from: d */
    private final Context f14154d;
    /* renamed from: e */
    private C1002a f14155e;
    /* renamed from: f */
    private ServiceConnection f14156f;
    /* renamed from: g */
    private boolean f14157g;
    /* renamed from: h */
    private boolean f14158h;
    /* renamed from: i */
    private boolean f14159i;
    /* renamed from: j */
    private ExecutorService f14160j;
    /* renamed from: k */
    private final BroadcastReceiver f14161k = new C10101(this);

    /* renamed from: com.android.billingclient.api.c$1 */
    class C10101 extends BroadcastReceiver {
        /* renamed from: a */
        final /* synthetic */ C3330c f3380a;

        C10101(C3330c c3330c) {
            this.f3380a = c3330c;
        }

        public void onReceive(Context context, Intent intent) {
            context = this.f3380a.f14153c.m4341b();
            if (context == null) {
                C1003a.m4333b("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
            } else {
                context.mo925a(intent.getIntExtra("response_code_key", 6), C1003a.m4331a(intent.getBundleExtra("response_bundle_key")));
            }
        }
    }

    /* renamed from: com.android.billingclient.api.c$a */
    private final class C1015a implements ServiceConnection {
        /* renamed from: a */
        final /* synthetic */ C3330c f3392a;
        /* renamed from: b */
        private final C1016d f3393b;

        private C1015a(C3330c c3330c, C1016d c1016d) {
            this.f3392a = c3330c;
            if (c1016d != null) {
                this.f3393b = c1016d;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when init is done.");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C1003a.m4333b("BillingClient", "Billing service disconnected.");
            this.f3392a.f14155e = null;
            this.f3392a.f14151a = 0;
            this.f3393b.mo923a();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1003a.m4332a("BillingClient", "Billing service connected.");
            this.f3392a.f14155e = C3329a.m17123a(iBinder);
            componentName = this.f3392a.f14154d.getPackageName();
            this.f3392a.f14157g = false;
            this.f3392a.f14158h = false;
            this.f3392a.f14159i = false;
            try {
                int a = this.f3392a.f14155e.mo879a(6, componentName, "subs");
                if (a == 0) {
                    C1003a.m4332a("BillingClient", "In-app billing API version 6 with subs is supported.");
                    this.f3392a.f14159i = true;
                    this.f3392a.f14157g = true;
                    this.f3392a.f14158h = true;
                } else {
                    if (this.f3392a.f14155e.mo879a(6, componentName, "inapp") == 0) {
                        C1003a.m4332a("BillingClient", "In-app billing API without subs version 6 supported.");
                        this.f3392a.f14159i = true;
                    }
                    a = this.f3392a.f14155e.mo879a(5, componentName, "subs");
                    if (a == 0) {
                        C1003a.m4332a("BillingClient", "In-app billing API version 5 supported.");
                        this.f3392a.f14158h = true;
                        this.f3392a.f14157g = true;
                    } else {
                        a = this.f3392a.f14155e.mo879a(3, componentName, "subs");
                        if (a == 0) {
                            C1003a.m4332a("BillingClient", "In-app billing API version 3 with subscriptions is supported.");
                            this.f3392a.f14157g = true;
                        } else if (this.f3392a.f14159i) {
                            a = 0;
                        } else {
                            componentName = this.f3392a.f14155e.mo879a(3, componentName, "inapp");
                            if (componentName == null) {
                                C1003a.m4332a("BillingClient", "In-app billing API version 3 with in-app items is supported.");
                            } else {
                                C1003a.m4333b("BillingClient", "Even billing API version 3 is not supported on this device.");
                            }
                            a = componentName;
                        }
                    }
                }
                if (a == 0) {
                    this.f3392a.f14151a = 2;
                } else {
                    this.f3392a.f14151a = 0;
                    this.f3392a.f14155e = null;
                }
                this.f3393b.mo924a(a);
            } catch (ComponentName componentName2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("RemoteException while setting up in-app billing");
                stringBuilder.append(componentName2);
                C1003a.m4333b("BillingClient", stringBuilder.toString());
                this.f3392a.f14151a = 0;
                this.f3392a.f14155e = null;
                this.f3393b.mo924a(-1);
            }
        }
    }

    C3330c(Context context, C1027i c1027i) {
        this.f14154d = context.getApplicationContext();
        this.f14153c = new C1006a(this.f14154d, c1027i);
    }

    /* renamed from: a */
    public int mo890a(String str) {
        int i = -1;
        if (!mo894a()) {
            return -1;
        }
        int hashCode = str.hashCode();
        if (hashCode != -422092961) {
            if (hashCode != 292218239) {
                if (hashCode != 1219490065) {
                    if (hashCode == 1987365622) {
                        if (str.equals("subscriptions")) {
                            i = 0;
                        }
                    }
                } else if (str.equals("subscriptionsOnVr")) {
                    i = 3;
                }
            } else if (str.equals("inAppItemsOnVr")) {
                i = 2;
            }
        } else if (str.equals("subscriptionsUpdate")) {
            i = 1;
        }
        hashCode = -2;
        switch (i) {
            case 0:
                if (this.f14157g != null) {
                    hashCode = 0;
                }
                return hashCode;
            case 1:
                if (this.f14158h != null) {
                    hashCode = 0;
                }
                return hashCode;
            case 2:
                return m17137c("inapp");
            case 3:
                return m17137c("subs");
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported feature: ");
                stringBuilder.append(str);
                C1003a.m4333b("BillingClient", stringBuilder.toString());
                return 5;
        }
    }

    /* renamed from: a */
    public boolean mo894a() {
        return (this.f14151a != 2 || this.f14155e == null || this.f14156f == null) ? false : true;
    }

    /* renamed from: a */
    public void mo891a(C1016d c1016d) {
        if (mo894a()) {
            C1003a.m4332a("BillingClient", "Service connection is valid. No need to re-initialize.");
            c1016d.mo924a(0);
        } else if (this.f14151a == 1) {
            C1003a.m4333b("BillingClient", "Client is already in the process of connecting to billing service.");
            c1016d.mo924a(5);
        } else if (this.f14151a == 3) {
            C1003a.m4333b("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            c1016d.mo924a(5);
        } else {
            this.f14151a = 1;
            this.f14153c.m4340a();
            C1023f.m4374a(this.f14154d).m4378a(this.f14161k, new IntentFilter("proxy_activity_response_intent_action"));
            C1003a.m4332a("BillingClient", "Starting in-app billing setup.");
            this.f14156f = new C1015a(c1016d);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List queryIntentServices = this.f14154d.getPackageManager().queryIntentServices(intent, 0);
            if (!(queryIntentServices == null || queryIntentServices.isEmpty())) {
                ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
                if (resolveInfo.serviceInfo != null) {
                    String str = resolveInfo.serviceInfo.packageName;
                    String str2 = resolveInfo.serviceInfo.name;
                    if (!"com.android.vending".equals(str) || str2 == null) {
                        C1003a.m4333b("BillingClient", "The device doesn't have valid Play Store.");
                    } else {
                        ComponentName componentName = new ComponentName(str, str2);
                        Intent intent2 = new Intent(intent);
                        intent2.setComponent(componentName);
                        intent2.putExtra("libraryVersion", "1.1");
                        if (this.f14154d.bindService(intent2, this.f14156f, 1)) {
                            C1003a.m4332a("BillingClient", "Service was bonded successfully.");
                            return;
                        }
                        C1003a.m4333b("BillingClient", "Connection to Billing service is blocked.");
                    }
                }
            }
            this.f14151a = 0;
            C1003a.m4332a("BillingClient", "Billing service unavailable on device.");
            c1016d.mo924a(3);
        }
    }

    /* renamed from: b */
    public void mo896b() {
        try {
            C1023f.m4374a(this.f14154d).m4377a(this.f14161k);
            this.f14153c.m4342c();
            if (!(this.f14156f == null || this.f14155e == null)) {
                C1003a.m4332a("BillingClient", "Unbinding from service.");
                this.f14154d.unbindService(this.f14156f);
                this.f14156f = null;
            }
            this.f14155e = null;
            if (this.f14160j != null) {
                this.f14160j.shutdownNow();
                this.f14160j = null;
            }
        } catch (Exception e) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("There was an exception while ending connection: ");
            stringBuilder.append(e);
            C1003a.m4333b("BillingClient", stringBuilder.toString());
        } catch (Throwable th) {
            this.f14151a = 3;
        }
        this.f14151a = 3;
    }

    /* renamed from: a */
    public int mo889a(android.app.Activity r18, com.android.billingclient.api.C1019e r19) {
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
        r17 = this;
        r0 = r17;
        r1 = r18;
        r2 = r17.mo894a();
        r3 = -1;
        if (r2 != 0) goto L_0x0010;
    L_0x000b:
        r1 = r0.m17124a(r3);
        return r1;
    L_0x0010:
        r8 = r19.m4368b();
        r2 = r19.m4367a();
        r4 = 5;
        if (r2 != 0) goto L_0x0027;
    L_0x001b:
        r1 = "BillingClient";
        r2 = "Please fix the input params. SKU can't be null.";
        com.android.billingclient.p041a.C1003a.m4333b(r1, r2);
        r1 = r0.m17124a(r4);
        return r1;
    L_0x0027:
        if (r8 != 0) goto L_0x0035;
    L_0x0029:
        r1 = "BillingClient";
        r2 = "Please fix the input params. SkuType can't be null.";
        com.android.billingclient.p041a.C1003a.m4333b(r1, r2);
        r1 = r0.m17124a(r4);
        return r1;
    L_0x0035:
        r4 = "subs";
        r4 = r8.equals(r4);
        r5 = -2;
        if (r4 == 0) goto L_0x004e;
    L_0x003e:
        r4 = r0.f14157g;
        if (r4 != 0) goto L_0x004e;
    L_0x0042:
        r1 = "BillingClient";
        r2 = "Current client doesn't support subscriptions.";
        com.android.billingclient.p041a.C1003a.m4333b(r1, r2);
        r1 = r0.m17124a(r5);
        return r1;
    L_0x004e:
        r4 = r19.m4369c();
        r6 = 1;
        r16 = 0;
        if (r4 == 0) goto L_0x0059;
    L_0x0057:
        r4 = 1;
        goto L_0x005a;
    L_0x0059:
        r4 = 0;
    L_0x005a:
        if (r4 == 0) goto L_0x006c;
    L_0x005c:
        r7 = r0.f14158h;
        if (r7 != 0) goto L_0x006c;
    L_0x0060:
        r1 = "BillingClient";
        r2 = "Current client doesn't support subscriptions update.";
        com.android.billingclient.p041a.C1003a.m4333b(r1, r2);
        r1 = r0.m17124a(r5);
        return r1;
    L_0x006c:
        r7 = r19.m4373g();
        if (r7 == 0) goto L_0x0082;
    L_0x0072:
        r7 = r0.f14159i;
        if (r7 != 0) goto L_0x0082;
    L_0x0076:
        r1 = "BillingClient";
        r2 = "Current client doesn't support extra params for buy intent.";
        com.android.billingclient.p041a.C1003a.m4333b(r1, r2);
        r1 = r0.m17124a(r5);
        return r1;
    L_0x0082:
        r5 = "BillingClient";	 Catch:{ RemoteException -> 0x0137 }
        r7 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0137 }
        r7.<init>();	 Catch:{ RemoteException -> 0x0137 }
        r9 = "Constructing buy intent for ";	 Catch:{ RemoteException -> 0x0137 }
        r7.append(r9);	 Catch:{ RemoteException -> 0x0137 }
        r7.append(r2);	 Catch:{ RemoteException -> 0x0137 }
        r9 = ", item type: ";	 Catch:{ RemoteException -> 0x0137 }
        r7.append(r9);	 Catch:{ RemoteException -> 0x0137 }
        r7.append(r8);	 Catch:{ RemoteException -> 0x0137 }
        r7 = r7.toString();	 Catch:{ RemoteException -> 0x0137 }
        com.android.billingclient.p041a.C1003a.m4332a(r5, r7);	 Catch:{ RemoteException -> 0x0137 }
        r5 = r0.f14159i;	 Catch:{ RemoteException -> 0x0137 }
        if (r5 == 0) goto L_0x00cb;	 Catch:{ RemoteException -> 0x0137 }
    L_0x00a4:
        r5 = r19;	 Catch:{ RemoteException -> 0x0137 }
        r10 = r0.m17126a(r5);	 Catch:{ RemoteException -> 0x0137 }
        r4 = "libraryVersion";	 Catch:{ RemoteException -> 0x0137 }
        r6 = "1.1";	 Catch:{ RemoteException -> 0x0137 }
        r10.putString(r4, r6);	 Catch:{ RemoteException -> 0x0137 }
        r4 = r19.m4371e();	 Catch:{ RemoteException -> 0x0137 }
        if (r4 == 0) goto L_0x00ba;	 Catch:{ RemoteException -> 0x0137 }
    L_0x00b7:
        r4 = 7;	 Catch:{ RemoteException -> 0x0137 }
        r5 = 7;	 Catch:{ RemoteException -> 0x0137 }
        goto L_0x00bc;	 Catch:{ RemoteException -> 0x0137 }
    L_0x00ba:
        r4 = 6;	 Catch:{ RemoteException -> 0x0137 }
        r5 = 6;	 Catch:{ RemoteException -> 0x0137 }
    L_0x00bc:
        r4 = r0.f14155e;	 Catch:{ RemoteException -> 0x0137 }
        r6 = r0.f14154d;	 Catch:{ RemoteException -> 0x0137 }
        r6 = r6.getPackageName();	 Catch:{ RemoteException -> 0x0137 }
        r9 = 0;	 Catch:{ RemoteException -> 0x0137 }
        r7 = r2;	 Catch:{ RemoteException -> 0x0137 }
        r4 = r4.mo884a(r5, r6, r7, r8, r9, r10);	 Catch:{ RemoteException -> 0x0137 }
        goto L_0x00fc;	 Catch:{ RemoteException -> 0x0137 }
    L_0x00cb:
        r5 = r19;	 Catch:{ RemoteException -> 0x0137 }
        if (r4 == 0) goto L_0x00ed;	 Catch:{ RemoteException -> 0x0137 }
    L_0x00cf:
        r9 = r0.f14155e;	 Catch:{ RemoteException -> 0x0137 }
        r10 = 5;	 Catch:{ RemoteException -> 0x0137 }
        r4 = r0.f14154d;	 Catch:{ RemoteException -> 0x0137 }
        r11 = r4.getPackageName();	 Catch:{ RemoteException -> 0x0137 }
        r4 = new java.lang.String[r6];	 Catch:{ RemoteException -> 0x0137 }
        r5 = r19.m4369c();	 Catch:{ RemoteException -> 0x0137 }
        r4[r16] = r5;	 Catch:{ RemoteException -> 0x0137 }
        r12 = java.util.Arrays.asList(r4);	 Catch:{ RemoteException -> 0x0137 }
        r14 = "subs";	 Catch:{ RemoteException -> 0x0137 }
        r15 = 0;	 Catch:{ RemoteException -> 0x0137 }
        r13 = r2;	 Catch:{ RemoteException -> 0x0137 }
        r4 = r9.mo885a(r10, r11, r12, r13, r14, r15);	 Catch:{ RemoteException -> 0x0137 }
        goto L_0x00fc;	 Catch:{ RemoteException -> 0x0137 }
    L_0x00ed:
        r4 = r0.f14155e;	 Catch:{ RemoteException -> 0x0137 }
        r5 = 3;	 Catch:{ RemoteException -> 0x0137 }
        r6 = r0.f14154d;	 Catch:{ RemoteException -> 0x0137 }
        r6 = r6.getPackageName();	 Catch:{ RemoteException -> 0x0137 }
        r9 = 0;	 Catch:{ RemoteException -> 0x0137 }
        r7 = r2;	 Catch:{ RemoteException -> 0x0137 }
        r4 = r4.mo883a(r5, r6, r7, r8, r9);	 Catch:{ RemoteException -> 0x0137 }
    L_0x00fc:
        r5 = "BillingClient";	 Catch:{ RemoteException -> 0x0137 }
        r5 = com.android.billingclient.p041a.C1003a.m4330a(r4, r5);	 Catch:{ RemoteException -> 0x0137 }
        if (r5 == 0) goto L_0x011f;	 Catch:{ RemoteException -> 0x0137 }
    L_0x0104:
        r1 = "BillingClient";	 Catch:{ RemoteException -> 0x0137 }
        r4 = new java.lang.StringBuilder;	 Catch:{ RemoteException -> 0x0137 }
        r4.<init>();	 Catch:{ RemoteException -> 0x0137 }
        r6 = "Unable to buy item, Error response code: ";	 Catch:{ RemoteException -> 0x0137 }
        r4.append(r6);	 Catch:{ RemoteException -> 0x0137 }
        r4.append(r5);	 Catch:{ RemoteException -> 0x0137 }
        r4 = r4.toString();	 Catch:{ RemoteException -> 0x0137 }
        com.android.billingclient.p041a.C1003a.m4333b(r1, r4);	 Catch:{ RemoteException -> 0x0137 }
        r1 = r0.m17124a(r5);	 Catch:{ RemoteException -> 0x0137 }
        return r1;	 Catch:{ RemoteException -> 0x0137 }
    L_0x011f:
        r5 = new android.content.Intent;	 Catch:{ RemoteException -> 0x0137 }
        r6 = com.android.billingclient.api.ProxyBillingActivity.class;	 Catch:{ RemoteException -> 0x0137 }
        r5.<init>(r1, r6);	 Catch:{ RemoteException -> 0x0137 }
        r6 = "BUY_INTENT";	 Catch:{ RemoteException -> 0x0137 }
        r4 = r4.getParcelable(r6);	 Catch:{ RemoteException -> 0x0137 }
        r4 = (android.app.PendingIntent) r4;	 Catch:{ RemoteException -> 0x0137 }
        r6 = "BUY_INTENT";	 Catch:{ RemoteException -> 0x0137 }
        r5.putExtra(r6, r4);	 Catch:{ RemoteException -> 0x0137 }
        r1.startActivity(r5);	 Catch:{ RemoteException -> 0x0137 }
        return r16;
    L_0x0137:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r4 = "RemoteException while launching launching replace subscriptions flow: ; for sku: ";
        r1.append(r4);
        r1.append(r2);
        r2 = "; try to reconnect";
        r1.append(r2);
        r1 = r1.toString();
        r2 = "BillingClient";
        com.android.billingclient.p041a.C1003a.m4333b(r2, r1);
        r1 = r0.m17124a(r3);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.c.a(android.app.Activity, com.android.billingclient.api.e):int");
    }

    /* renamed from: a */
    private int m17124a(int i) {
        this.f14153c.m4341b().mo925a(i, null);
        return i;
    }

    /* renamed from: b */
    public C1024a mo895b(String str) {
        if (!mo894a()) {
            return new C1024a(-1, null);
        }
        if (!TextUtils.isEmpty(str)) {
            return m17130a(str, false);
        }
        C1003a.m4333b("BillingClient", "Please provide a valid SKU type.");
        return new C1024a(5, null);
    }

    /* renamed from: a */
    public void mo892a(C1032k c1032k, final C1033l c1033l) {
        if (mo894a()) {
            final Object a = c1032k.m4403a();
            c1032k = c1032k.m4404b();
            if (TextUtils.isEmpty(a)) {
                C1003a.m4333b("BillingClient", "Please fix the input params. SKU type can't be empty.");
                c1033l.mo921a(5, null);
                return;
            } else if (c1032k == null) {
                C1003a.m4333b("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
                c1033l.mo921a(5, null);
                return;
            } else {
                m17132a(new Runnable(this) {
                    /* renamed from: d */
                    final /* synthetic */ C3330c f3386d;

                    public void run() {
                        final C1028a a = this.f3386d.m17144a(a, c1032k);
                        this.f3386d.m17135b(new Runnable(this) {
                            /* renamed from: b */
                            final /* synthetic */ C10122 f3382b;

                            public void run() {
                                c1033l.mo921a(a.m4392b(), a.m4391a());
                            }
                        });
                    }
                });
                return;
            }
        }
        c1033l.mo921a(-1, null);
    }

    /* renamed from: a */
    public void mo893a(final String str, final C1026h c1026h) {
        if (mo894a()) {
            m17132a(new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ C3330c f3391c;

                public void run() {
                    final C1024a a = this.f3391c.m17130a(str, true);
                    this.f3391c.m17135b(new Runnable(this) {
                        /* renamed from: b */
                        final /* synthetic */ C10143 f3388b;

                        public void run() {
                            c1026h.mo922a(a.m4380a(), a.m4381b());
                        }
                    });
                }
            });
        } else {
            c1026h.mo922a(-1, null);
        }
    }

    /* renamed from: a */
    private Bundle m17126a(C1019e c1019e) {
        Bundle bundle = new Bundle();
        if (c1019e.m4372f() != 0) {
            bundle.putInt("prorationMode", c1019e.m4372f());
        }
        if (c1019e.m4370d() != null) {
            bundle.putString("accountId", c1019e.m4370d());
        }
        if (c1019e.m4371e()) {
            bundle.putBoolean("vr", true);
        }
        if (c1019e.m4369c() != null) {
            bundle.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{c1019e.m4369c()})));
        }
        return bundle;
    }

    /* renamed from: a */
    private void m17132a(Runnable runnable) {
        if (this.f14160j == null) {
            this.f14160j = Executors.newFixedThreadPool(C1003a.f3372a);
        }
        this.f14160j.submit(runnable);
    }

    /* renamed from: c */
    private int m17137c(java.lang.String r5) {
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
        r4 = this;
        r0 = r4.f14155e;	 Catch:{ RemoteException -> 0x0017 }
        r1 = 7;	 Catch:{ RemoteException -> 0x0017 }
        r2 = r4.f14154d;	 Catch:{ RemoteException -> 0x0017 }
        r2 = r2.getPackageName();	 Catch:{ RemoteException -> 0x0017 }
        r3 = r4.m17138c();	 Catch:{ RemoteException -> 0x0017 }
        r5 = r0.mo887b(r1, r2, r5, r3);	 Catch:{ RemoteException -> 0x0017 }
        if (r5 != 0) goto L_0x0015;
    L_0x0013:
        r5 = 0;
        goto L_0x0016;
    L_0x0015:
        r5 = -2;
    L_0x0016:
        return r5;
    L_0x0017:
        r5 = "BillingClient";
        r0 = "RemoteException while checking if billing is supported; try to reconnect";
        com.android.billingclient.p041a.C1003a.m4333b(r5, r0);
        r5 = -1;
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.c.c(java.lang.String):int");
    }

    /* renamed from: c */
    private Bundle m17138c() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("vr", true);
        return bundle;
    }

    /* renamed from: a */
    com.android.billingclient.api.C1029j.C1028a m17144a(java.lang.String r13, java.util.List<java.lang.String> r14) {
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
        r12 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r14.size();
        r2 = 0;
        r3 = 0;
    L_0x000b:
        if (r3 >= r1) goto L_0x00f7;
    L_0x000d:
        r4 = r3 + 20;
        if (r4 <= r1) goto L_0x0013;
    L_0x0011:
        r5 = r1;
        goto L_0x0014;
    L_0x0013:
        r5 = r4;
    L_0x0014:
        r6 = new java.util.ArrayList;
        r3 = r14.subList(r3, r5);
        r6.<init>(r3);
        r3 = new android.os.Bundle;
        r3.<init>();
        r5 = "ITEM_ID_LIST";
        r3.putStringArrayList(r5, r6);
        r5 = "libraryVersion";
        r6 = "1.1";
        r3.putString(r5, r6);
        r5 = 0;
        r6 = r12.f14155e;	 Catch:{ RemoteException -> 0x00d9 }
        r7 = 3;	 Catch:{ RemoteException -> 0x00d9 }
        r8 = r12.f14154d;	 Catch:{ RemoteException -> 0x00d9 }
        r8 = r8.getPackageName();	 Catch:{ RemoteException -> 0x00d9 }
        r3 = r6.mo880a(r7, r8, r13, r3);	 Catch:{ RemoteException -> 0x00d9 }
        r6 = 4;
        if (r3 != 0) goto L_0x004c;
    L_0x003f:
        r13 = "BillingClient";
        r14 = "querySkuDetailsAsync got null sku details list";
        com.android.billingclient.p041a.C1003a.m4333b(r13, r14);
        r13 = new com.android.billingclient.api.j$a;
        r13.<init>(r6, r5);
        return r13;
    L_0x004c:
        r7 = "DETAILS_LIST";
        r7 = r3.containsKey(r7);
        r8 = 6;
        if (r7 != 0) goto L_0x0086;
    L_0x0055:
        r13 = "BillingClient";
        r13 = com.android.billingclient.p041a.C1003a.m4330a(r3, r13);
        if (r13 == 0) goto L_0x0079;
    L_0x005d:
        r14 = "BillingClient";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "getSkuDetails() failed. Response code: ";
        r1.append(r2);
        r1.append(r13);
        r1 = r1.toString();
        com.android.billingclient.p041a.C1003a.m4333b(r14, r1);
        r14 = new com.android.billingclient.api.j$a;
        r14.<init>(r13, r0);
        return r14;
    L_0x0079:
        r13 = "BillingClient";
        r14 = "getSkuDetails() returned a bundle with neither an error nor a detail list.";
        com.android.billingclient.p041a.C1003a.m4333b(r13, r14);
        r13 = new com.android.billingclient.api.j$a;
        r13.<init>(r8, r0);
        return r13;
    L_0x0086:
        r7 = "DETAILS_LIST";
        r3 = r3.getStringArrayList(r7);
        if (r3 != 0) goto L_0x009b;
    L_0x008e:
        r13 = "BillingClient";
        r14 = "querySkuDetailsAsync got null response list";
        com.android.billingclient.p041a.C1003a.m4333b(r13, r14);
        r13 = new com.android.billingclient.api.j$a;
        r13.<init>(r6, r5);
        return r13;
    L_0x009b:
        r6 = 0;
    L_0x009c:
        r7 = r3.size();
        if (r6 >= r7) goto L_0x00d6;
    L_0x00a2:
        r7 = r3.get(r6);
        r7 = (java.lang.String) r7;
        r9 = new com.android.billingclient.api.j;	 Catch:{ JSONException -> 0x00c9 }
        r9.<init>(r7);	 Catch:{ JSONException -> 0x00c9 }
        r7 = "BillingClient";
        r10 = new java.lang.StringBuilder;
        r10.<init>();
        r11 = "Got sku details: ";
        r10.append(r11);
        r10.append(r9);
        r10 = r10.toString();
        com.android.billingclient.p041a.C1003a.m4332a(r7, r10);
        r0.add(r9);
        r6 = r6 + 1;
        goto L_0x009c;
    L_0x00c9:
        r13 = "BillingClient";
        r14 = "Got a JSON exception trying to decode SkuDetails";
        com.android.billingclient.p041a.C1003a.m4333b(r13, r14);
        r13 = new com.android.billingclient.api.j$a;
        r13.<init>(r8, r5);
        return r13;
    L_0x00d6:
        r3 = r4;
        goto L_0x000b;
    L_0x00d9:
        r13 = move-exception;
        r14 = new java.lang.StringBuilder;
        r14.<init>();
        r0 = "querySkuDetailsAsync got a remote exception (try to reconnect): ";
        r14.append(r0);
        r14.append(r13);
        r13 = r14.toString();
        r14 = "BillingClient";
        com.android.billingclient.p041a.C1003a.m4333b(r14, r13);
        r13 = new com.android.billingclient.api.j$a;
        r14 = -1;
        r13.<init>(r14, r5);
        return r13;
    L_0x00f7:
        r13 = new com.android.billingclient.api.j$a;
        r13.<init>(r2, r0);
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.c.a(java.lang.String, java.util.List):com.android.billingclient.api.j$a");
    }

    /* renamed from: a */
    private C1024a m17130a(String str, boolean z) {
        C3330c c3330c = this;
        String str2 = str;
        boolean z2 = z;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Querying owned items, item type: ");
        stringBuilder.append(str2);
        stringBuilder.append("; history: ");
        stringBuilder.append(z2);
        C1003a.m4332a("BillingClient", stringBuilder.toString());
        List arrayList = new ArrayList();
        String str3 = null;
        do {
            if (z2) {
                try {
                    if (c3330c.f14159i) {
                        Bundle a = c3330c.f14155e.mo882a(6, c3330c.f14154d.getPackageName(), str, str3, null);
                    } else {
                        C1003a.m4333b("BillingClient", "getPurchaseHistory is not supported on current device");
                        return new C1024a(-2, null);
                    }
                } catch (RemoteException e) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("Got exception trying to get purchases: ");
                    stringBuilder.append(e);
                    stringBuilder.append("; try to reconnect");
                    C1003a.m4333b("BillingClient", stringBuilder.toString());
                    return new C1024a(-1, null);
                }
            }
            a = c3330c.f14155e.mo881a(3, c3330c.f14154d.getPackageName(), str2, str3);
            if (a == null) {
                C1003a.m4333b("BillingClient", "queryPurchases got null owned items list");
                return new C1024a(6, null);
            }
            int a2 = C1003a.m4330a(a, "BillingClient");
            if (a2 != 0) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("getPurchases() failed. Response code: ");
                stringBuilder2.append(a2);
                C1003a.m4333b("BillingClient", stringBuilder2.toString());
                return new C1024a(a2, null);
            }
            if (a.containsKey("INAPP_PURCHASE_ITEM_LIST") && a.containsKey("INAPP_PURCHASE_DATA_LIST")) {
                if (a.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                    ArrayList stringArrayList = a.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList stringArrayList2 = a.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList stringArrayList3 = a.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    if (stringArrayList == null) {
                        C1003a.m4333b("BillingClient", "Bundle returned from getPurchases() contains null SKUs list.");
                        return new C1024a(6, null);
                    } else if (stringArrayList2 == null) {
                        C1003a.m4333b("BillingClient", "Bundle returned from getPurchases() contains null purchases list.");
                        return new C1024a(6, null);
                    } else if (stringArrayList3 == null) {
                        C1003a.m4333b("BillingClient", "Bundle returned from getPurchases() contains null signatures list.");
                        return new C1024a(6, null);
                    } else {
                        int i = 0;
                        while (i < stringArrayList2.size()) {
                            String str4 = (String) stringArrayList2.get(i);
                            String str5 = (String) stringArrayList3.get(i);
                            String str6 = (String) stringArrayList.get(i);
                            StringBuilder stringBuilder3 = new StringBuilder();
                            stringBuilder3.append("Sku is owned: ");
                            stringBuilder3.append(str6);
                            C1003a.m4332a("BillingClient", stringBuilder3.toString());
                            try {
                                C1025g c1025g = new C1025g(str4, str5);
                                if (TextUtils.isEmpty(c1025g.m4385d())) {
                                    C1003a.m4333b("BillingClient", "BUG: empty/null token!");
                                }
                                arrayList.add(c1025g);
                                i++;
                            } catch (JSONException e2) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append("Got an exception trying to decode the purchase: ");
                                stringBuilder.append(e2);
                                C1003a.m4333b("BillingClient", stringBuilder.toString());
                                return new C1024a(6, null);
                            }
                        }
                        str3 = a.getString("INAPP_CONTINUATION_TOKEN");
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("Continuation token: ");
                        stringBuilder.append(str3);
                        C1003a.m4332a("BillingClient", stringBuilder.toString());
                    }
                }
            }
            C1003a.m4333b("BillingClient", "Bundle returned from getPurchases() doesn't contain required fields.");
            return new C1024a(6, null);
        } while (!TextUtils.isEmpty(str3));
        return new C1024a(0, arrayList);
    }

    /* renamed from: b */
    private void m17135b(Runnable runnable) {
        this.f14152b.post(runnable);
    }
}
