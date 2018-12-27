package com.billing.inapp.p048b;

import android.os.Bundle;
import android.support.v4.app.C4432h;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.billingclient.api.C1029j;
import com.android.billingclient.api.C1033l;
import com.billing.inapp.C1118b.C1105a;
import com.billing.inapp.C1118b.C1106b;
import com.billing.inapp.C1118b.C1107c;
import com.billing.inapp.C1118b.C1108d;
import com.billing.inapp.C1118b.C1109e;
import com.billing.inapp.p047a.C1102b;
import com.billing.inapp.p048b.p049a.C1115f;
import com.billing.inapp.p048b.p049a.C3353h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.billing.inapp.b.a */
public class C4778a extends C4432h {
    /* renamed from: a */
    private RecyclerView f20896a;
    /* renamed from: b */
    private C3355c f20897b;
    /* renamed from: c */
    private View f20898c;
    /* renamed from: d */
    private TextView f20899d;
    /* renamed from: e */
    private C1102b f20900e;

    /* renamed from: com.billing.inapp.b.a$1 */
    class C11101 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ C4778a f3617a;

        C11101(C4778a c4778a) {
            this.f3617a = c4778a;
        }

        public void onClick(View view) {
            this.f3617a.dismiss();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, C1109e.AppTheme);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(C1107c.acquire_fragment, viewGroup, false);
        this.f20899d = (TextView) layoutInflater.findViewById(C1106b.error_textview);
        this.f20896a = (RecyclerView) layoutInflater.findViewById(C1106b.list);
        this.f20898c = layoutInflater.findViewById(C1106b.screen_wait);
        if (this.f20900e != null) {
            m27719a();
        }
        Toolbar toolbar = (Toolbar) layoutInflater.findViewById(C1106b.toolbar);
        toolbar.setNavigationOnClickListener(new C11101(this));
        toolbar.setTitle(C1108d.button_purchase);
        return layoutInflater;
    }

    /* renamed from: a */
    public void m27730a(C1102b c1102b) {
        this.f20900e = c1102b;
        if (this.f20896a != null) {
            m27719a();
        }
    }

    /* renamed from: a */
    private void m27724a(boolean z) {
        int i = 0;
        this.f20896a.setVisibility(z ? 8 : 0);
        View view = this.f20898c;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    private void m27719a() {
        m27724a(true);
        m27728c();
    }

    /* renamed from: b */
    private void m27726b() {
        if (getActivity() != null) {
            if (!getActivity().isFinishing()) {
                this.f20898c.setVisibility(8);
                this.f20899d.setVisibility(0);
                int b = this.f20900e.m4600a().m17207b();
                if (b == 0) {
                    this.f20899d.setText(getText(C1108d.error_no_skus));
                } else if (b != 3) {
                    this.f20899d.setText(getText(C1108d.error_billing_default));
                } else {
                    this.f20899d.setText(getText(C1108d.error_billing_unavailable));
                }
                return;
            }
        }
        Log.i("AcquireFragment", "No need to show an error - activity is finishing already");
    }

    /* renamed from: c */
    private void m27728c() {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("querySkuDetails() got subscriptions and inApp SKU details lists for: ");
        stringBuilder.append(System.currentTimeMillis() - currentTimeMillis);
        stringBuilder.append("ms");
        Log.d("AcquireFragment", stringBuilder.toString());
        if (getActivity() != null && !getActivity().isFinishing()) {
            final List arrayList = new ArrayList();
            this.f20897b = new C3355c();
            final C3353h a = m27729a(this.f20897b, this.f20900e);
            this.f20897b.m17229a(a);
            m27723a(arrayList, a.m17221a().m4617a("subs"), "subs", new Runnable(this) {
                /* renamed from: c */
                final /* synthetic */ C4778a f3620c;

                public void run() {
                    this.f3620c.m27723a(arrayList, a.m17221a().m4617a("inapp"), "inapp", null);
                }
            });
        }
    }

    /* renamed from: a */
    private void m27723a(final List<C1115f> list, List<String> list2, final String str, final Runnable runnable) {
        this.f20900e.m4600a().m17206a(str, (List) list2, new C1033l(this) {
            /* renamed from: d */
            final /* synthetic */ C4778a f14199d;

            /* renamed from: a */
            public void mo921a(int i, List<C1029j> list) {
                if (i != 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsuccessful query for type: ");
                    stringBuilder.append(str);
                    stringBuilder.append(". Error code: ");
                    stringBuilder.append(i);
                    Log.w("AcquireFragment", stringBuilder.toString());
                } else if (list != null && list.size() > 0) {
                    list.add(new C1115f(this.f14199d.getString(str == "inapp" ? C1108d.header_inapp : C1108d.header_subscriptions)));
                    for (C1029j c1029j : list) {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("Adding sku: ");
                        stringBuilder2.append(c1029j);
                        Log.i("AcquireFragment", stringBuilder2.toString());
                        list.add(new C1115f(c1029j, 1, str));
                    }
                    if (list.size() == 0) {
                        this.f14199d.m27726b();
                    } else {
                        if (this.f14199d.f20896a.getAdapter() == 0) {
                            this.f14199d.f20896a.setAdapter(this.f14199d.f20897b);
                            i = this.f14199d.getContext().getResources();
                            this.f14199d.f20896a.m24635a(new C3354b(this.f14199d.f20897b, (int) i.getDimension(C1105a.header_gap), (int) i.getDimension(C1105a.row_gap)));
                            this.f14199d.f20896a.setLayoutManager(new LinearLayoutManager(this.f14199d.getContext()));
                        }
                        this.f14199d.f20897b.m17230a(list);
                        this.f14199d.m27724a((boolean) null);
                    }
                }
                if (runnable != 0) {
                    runnable.run();
                }
            }
        });
    }

    /* renamed from: a */
    protected C3353h m27729a(C3355c c3355c, C1102b c1102b) {
        return new C3353h(c3355c, c1102b);
    }
}
