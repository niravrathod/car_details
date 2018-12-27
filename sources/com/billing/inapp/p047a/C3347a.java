package com.billing.inapp.p047a;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.android.billingclient.api.C1009b;
import com.android.billingclient.api.C1016d;
import com.android.billingclient.api.C1019e;
import com.android.billingclient.api.C1025g;
import com.android.billingclient.api.C1025g.C1024a;
import com.android.billingclient.api.C1026h;
import com.android.billingclient.api.C1027i;
import com.android.billingclient.api.C1029j;
import com.android.billingclient.api.C1032k;
import com.android.billingclient.api.C1032k.C1031a;
import com.android.billingclient.api.C1033l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.billing.inapp.a.a */
public class C3347a implements C1027i {
    /* renamed from: f */
    private static C3347a f14190f;
    /* renamed from: a */
    private C1009b f14191a;
    /* renamed from: b */
    private boolean f14192b;
    /* renamed from: c */
    private C1101a f14193c;
    /* renamed from: d */
    private final List<C1025g> f14194d = new ArrayList();
    /* renamed from: e */
    private int f14195e = -1;

    /* renamed from: com.billing.inapp.a.a$1 */
    class C10971 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3347a f3603a;

        C10971(C3347a c3347a) {
            this.f3603a = c3347a;
        }

        public void run() {
            this.f3603a.f14193c.mo919a();
            Log.d("BillingManager", "Setup successful. Querying inventory.");
        }
    }

    /* renamed from: com.billing.inapp.a.a$4 */
    class C11004 implements Runnable {
        /* renamed from: a */
        final /* synthetic */ C3347a f3613a;

        C11004(C3347a c3347a) {
            this.f3613a = c3347a;
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C1024a b = this.f3613a.f14191a.mo895b("inapp");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Querying purchases elapsed time: ");
            stringBuilder.append(System.currentTimeMillis() - currentTimeMillis);
            stringBuilder.append("ms");
            Log.i("BillingManager", stringBuilder.toString());
            if (this.f3613a.m17208c()) {
                C1024a b2 = this.f3613a.f14191a.mo895b("subs");
                if (b2 == null || b2.m4380a() != 0) {
                    Log.e("BillingManager", "Got an error response trying to query subscription purchases");
                } else if (!(b == null || b.m4381b() == null)) {
                    b.m4381b().addAll(b2.m4381b());
                }
            } else if (b == null || b.m4380a() != 0) {
                Log.w("BillingManager", "queryPurchases() got an error response code: ");
            } else {
                Log.i("BillingManager", "Skipped subscription purchases query since they are not supported");
            }
            if (b != null) {
                this.f3613a.m17192a(b);
            }
        }
    }

    /* renamed from: com.billing.inapp.a.a$a */
    public interface C1101a {
        /* renamed from: a */
        void mo919a();

        /* renamed from: a */
        void mo920a(int i, List<C1025g> list);
    }

    /* renamed from: a */
    public static C3347a m17191a(Context context) {
        if (f14190f == null) {
            f14190f = new C3347a(context);
        }
        return f14190f;
    }

    /* renamed from: a */
    public void m17204a(C1101a c1101a) {
        this.f14193c = c1101a;
    }

    private C3347a(Context context) {
        Log.d("BillingManager", "Creating Billing client.");
        this.f14191a = C1009b.m4345a(context).m4343a(this).m4344a();
        Log.d("BillingManager", "Starting setup.");
        m17205a(new C10971(this));
    }

    /* renamed from: a */
    public void mo925a(int i, List<C1025g> list) {
        if (i == 0) {
            for (C1025g a : list) {
                m17193a(a);
            }
            this.f14193c.mo920a(i, this.f14194d);
        } else if (i == 1) {
            Log.i("BillingManager", "onPurchasesUpdated() - user cancelled the purchase flow - skipping");
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onPurchasesUpdated() got unknown resultCode: ");
            stringBuilder.append(i);
            Log.w("BillingManager", stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public void m17201a(Activity activity, String str, String str2) {
        m17202a(activity, str, null, str2);
    }

    /* renamed from: a */
    public void m17202a(Activity activity, String str, ArrayList<String> arrayList, String str2) {
        final ArrayList<String> arrayList2 = arrayList;
        final String str3 = str;
        final String str4 = str2;
        final Activity activity2 = activity;
        m17198b(new Runnable(this) {
            /* renamed from: e */
            final /* synthetic */ C3347a f3608e;

            public void run() {
                String str = "BillingManager";
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Launching in-app purchase flow. Replace old SKU? ");
                stringBuilder.append(arrayList2 != null);
                Log.d(str, stringBuilder.toString());
                this.f3608e.f14191a.mo889a(activity2, C1019e.m4366h().m4356a(str3).m4359b(str4).m4357a(arrayList2).m4358a());
            }
        });
    }

    /* renamed from: a */
    public void m17199a() {
        Log.d("BillingManager", "Destroying the manager.");
        if (this.f14191a != null && this.f14191a.mo894a()) {
            this.f14191a.mo896b();
            this.f14191a = null;
        }
    }

    /* renamed from: a */
    public void m17206a(final String str, final List<String> list, final C1033l c1033l) {
        m17198b(new Runnable(this) {
            /* renamed from: d */
            final /* synthetic */ C3347a f3612d;

            /* renamed from: com.billing.inapp.a.a$3$1 */
            class C33441 implements C1033l {
                /* renamed from: a */
                final /* synthetic */ C10993 f14185a;

                C33441(C10993 c10993) {
                    this.f14185a = c10993;
                }

                /* renamed from: a */
                public void mo921a(int i, List<C1029j> list) {
                    c1033l.mo921a(i, list);
                }
            }

            public void run() {
                C1031a c = C1032k.m4402c();
                Log.e("INAPP ", list.toString());
                c.m4398a(list).m4397a(str);
                Log.e("INAPP ", c.toString());
                this.f3612d.f14191a.mo892a(c.m4399a(), new C33441(this));
            }
        });
    }

    /* renamed from: b */
    public int m17207b() {
        return this.f14195e;
    }

    /* renamed from: a */
    private void m17193a(C1025g c1025g) {
        if (m17196a(c1025g.m4387f(), c1025g.m4388g())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got a verified purchase: ");
            stringBuilder.append(c1025g);
            Log.d("BillingManager", stringBuilder.toString());
            this.f14194d.add(c1025g);
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("Got a purchase: ");
        stringBuilder.append(c1025g);
        stringBuilder.append("; but signature is bad. Skipping...");
        Log.i("BillingManager", stringBuilder.toString());
    }

    /* renamed from: a */
    private void m17192a(C1024a c1024a) {
        if (this.f14191a != null) {
            if (c1024a.m4380a() == 0) {
                Log.d("BillingManager", "Query inventory was successful.");
                this.f14194d.clear();
                mo925a(0, c1024a.m4381b());
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Billing client was null or result code (");
        stringBuilder.append(c1024a.m4380a());
        stringBuilder.append(") was bad - quitting");
        Log.w("BillingManager", stringBuilder.toString());
    }

    /* renamed from: c */
    public boolean m17208c() {
        int a = this.f14191a.mo890a("subscriptions");
        if (a != 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("areSubscriptionsSupported() got an error response: ");
            stringBuilder.append(a);
            Log.w("BillingManager", stringBuilder.toString());
        }
        return a == 0;
    }

    /* renamed from: d */
    public void m17209d() {
        m17198b(new C11004(this));
    }

    /* renamed from: a */
    public void m17203a(final C1026h c1026h) {
        if (m17208c()) {
            this.f14191a.mo893a("subs", new C1026h(this) {
                /* renamed from: b */
                final /* synthetic */ C3347a f14187b;

                /* renamed from: a */
                public void mo922a(int i, List<C1025g> list) {
                    c1026h.mo922a(i, list);
                }
            });
        }
    }

    /* renamed from: a */
    public void m17205a(final Runnable runnable) {
        this.f14191a.mo891a(new C1016d(this) {
            /* renamed from: b */
            final /* synthetic */ C3347a f14189b;

            /* renamed from: a */
            public void mo924a(int i) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Setup finished. Response code: ");
                stringBuilder.append(i);
                Log.d("BillingManager", stringBuilder.toString());
                if (i == 0) {
                    this.f14189b.f14192b = true;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                this.f14189b.f14195e = i;
            }

            /* renamed from: a */
            public void mo923a() {
                this.f14189b.f14192b = false;
            }
        });
    }

    /* renamed from: b */
    private void m17198b(Runnable runnable) {
        if (this.f14192b) {
            runnable.run();
        } else {
            m17205a(runnable);
        }
    }

    /* renamed from: a */
    private boolean m17196a(String str, String str2) {
        if ("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgvaJM84DlL9FhHETgdibbptKg4Jb9sheejY+j3TX6e9ftNPsojWUWe4RI/0FhzHzaT3CwaGU4o1ozO9UHrg0m9Zt52YO4qNzxiBo9nsTTGhvHlp8pVEEzruCEzKDCfKYVVsvuddM2DLXb6FVBwxCD0N/EtKYPAxdd5xkN/FIKN9QuJeGyT5AGCPr7c/RlMZXU2d7ZM6yJbnUNC3V3ArMTwyeA/JCIVDrOF82LrWfBxXrGkqrUYmOMrfw+yBL8yZeA79ErfvHgOuyI9wODAvEDgNCL29cOIXPo5qGaH11S1TgSHYw2ax6ddAcg382HT+Fz+Fyn+4uNUZGnvqsmyXAdwIDAQAB".contains("CONSTRUCT_YOUR")) {
            throw new RuntimeException("Please update your app's public key at: BASE_64_ENCODED_PUBLIC_KEY");
        }
        try {
            return C1103c.m4605a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgvaJM84DlL9FhHETgdibbptKg4Jb9sheejY+j3TX6e9ftNPsojWUWe4RI/0FhzHzaT3CwaGU4o1ozO9UHrg0m9Zt52YO4qNzxiBo9nsTTGhvHlp8pVEEzruCEzKDCfKYVVsvuddM2DLXb6FVBwxCD0N/EtKYPAxdd5xkN/FIKN9QuJeGyT5AGCPr7c/RlMZXU2d7ZM6yJbnUNC3V3ArMTwyeA/JCIVDrOF82LrWfBxXrGkqrUYmOMrfw+yBL8yZeA79ErfvHgOuyI9wODAvEDgNCL29cOIXPo5qGaH11S1TgSHYw2ax6ddAcg382HT+Fz+Fyn+4uNUZGnvqsmyXAdwIDAQAB", str, str2);
        } catch (String str3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Got an exception trying to validate a purchase: ");
            stringBuilder.append(str3);
            Log.e("BillingManager", stringBuilder.toString());
            return null;
        }
    }
}
