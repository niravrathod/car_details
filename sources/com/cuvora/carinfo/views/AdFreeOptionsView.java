package com.cuvora.carinfo.views;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.billingclient.api.C1025g;
import com.billing.inapp.p047a.C3347a;
import com.billing.inapp.p047a.C3347a.C1101a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.helpers.C1540d;
import com.cuvora.carinfo.helpers.C1570t;
import com.cuvora.carinfo.loaders.C1580t;
import com.cuvora.carinfo.models.AdFreeSubscriptionModel;
import com.cuvora.carinfo.models.RewardedVideoSubModel;
import com.cuvora.carinfo.models.homepage.ActionTypeEnum;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import java.util.List;

public class AdFreeOptionsView extends FrameLayout {
    /* renamed from: i */
    private static String f4891i = "AdFreeOptionsView";
    /* renamed from: a */
    private final View f4892a;
    /* renamed from: b */
    private final TextView f4893b;
    /* renamed from: c */
    private final TextView f4894c;
    /* renamed from: d */
    private TextView f4895d;
    /* renamed from: e */
    private TextView f4896e;
    /* renamed from: f */
    private TextView f4897f;
    /* renamed from: g */
    private CardView f4898g;
    /* renamed from: h */
    private CardView f4899h;
    /* renamed from: j */
    private RewardedVideoAd f4900j;
    /* renamed from: k */
    private boolean f4901k;
    /* renamed from: l */
    private C1628a f4902l;

    /* renamed from: com.cuvora.carinfo.views.AdFreeOptionsView$a */
    public interface C1628a {
        /* renamed from: a */
        void mo1163a();

        /* renamed from: b */
        void mo1164b();
    }

    /* renamed from: com.cuvora.carinfo.views.AdFreeOptionsView$1 */
    class C37361 implements RewardedVideoAdListener {
        /* renamed from: a */
        final /* synthetic */ AdFreeOptionsView f14997a;

        C37361(AdFreeOptionsView adFreeOptionsView) {
            this.f14997a = adFreeOptionsView;
        }

        public void onRewardedVideoAdLoaded() {
            Log.d(AdFreeOptionsView.f4891i, "onRewardedVideoAdLoaded");
        }

        public void onRewardedVideoAdOpened() {
            Log.d(AdFreeOptionsView.f4891i, "onRewardedVideoAdOpened");
        }

        public void onRewardedVideoStarted() {
            Log.d(AdFreeOptionsView.f4891i, "onRewardedVideoStarted");
        }

        public void onRewardedVideoAdClosed() {
            Log.d(AdFreeOptionsView.f4891i, "onRewardedVideoAdClosed");
        }

        public void onRewarded(RewardItem rewardItem) {
            C1540d.m5811a("Rewarded Video Subscription Success", rewardItem.getType());
            C1570t.m6014e();
            C1540d.m5813a("rewarded_video", ActionTypeEnum.REWARDED.name(), "", true);
            long c = C1570t.m6003c();
            this.f14997a.m6208a("rewarded_video_expiry_time", String.valueOf(c));
            C1570t.m5982a(this.f14997a.getContext(), c);
            if (this.f14997a.f4902l != null) {
                this.f14997a.f4902l.mo1164b();
            }
        }

        public void onRewardedVideoAdLeftApplication() {
            Log.d(AdFreeOptionsView.f4891i, "onRewardedVideoAdLeftApplication");
        }

        public void onRewardedVideoAdFailedToLoad(int i) {
            if (this.f14997a.f4892a != null) {
                this.f14997a.f4892a.setVisibility(8);
            }
            C1540d.m5811a("Rewarded Video failed to load", String.valueOf(i));
            Log.d(AdFreeOptionsView.f4891i, "onRewardedVideoAdFailedToLoad");
        }

        public void onRewardedVideoCompleted() {
            Log.d(AdFreeOptionsView.f4891i, "onRewardedVideoCompleted");
        }
    }

    /* renamed from: a */
    public void m6215a() {
        this.f4900j = MobileAds.getRewardedVideoAdInstance(getContext());
        m6214g();
        this.f4900j.setRewardedVideoAdListener(new C37361(this));
    }

    public void setType(ActionTypeEnum actionTypeEnum) {
        AdFreeSubscriptionModel d = C1570t.m6010d();
        C1540d.m5812a(actionTypeEnum.name(), d.price, d.productId);
        C1540d.m5811a("Go Ad Free Dialog Shown", actionTypeEnum.name());
        if (actionTypeEnum == ActionTypeEnum.REWARDED) {
            this.f4896e.setVisibility(8);
            this.f4895d.setVisibility(8);
            this.f4898g.setVisibility(8);
        }
        if (actionTypeEnum == ActionTypeEnum.INAPP) {
            this.f4896e.setVisibility(8);
            this.f4897f.setVisibility(8);
            this.f4899h.setVisibility(8);
        }
        if (actionTypeEnum == ActionTypeEnum.REWARDED_INAPP) {
            this.f4896e.setVisibility(0);
            this.f4895d.setVisibility(0);
            this.f4898g.setVisibility(0);
            this.f4897f.setVisibility(0);
            this.f4899h.setVisibility(0);
        }
    }

    /* renamed from: b */
    public boolean m6216b() {
        return this.f4900j != null ? this.f4900j.isLoaded() : false;
    }

    /* renamed from: g */
    private void m6214g() {
        this.f4900j.loadAd(getContext().getResources().getString(R.string.rewarded_video_ad_unit_id), new Builder().build());
    }

    public void setListener(C1628a c1628a) {
        this.f4902l = c1628a;
    }

    public AdFreeOptionsView(Context context) {
        this(context, null);
    }

    public AdFreeOptionsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AdFreeOptionsView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4901k = false;
        i = inflate(context, R.layout.view_ad_free_options, this);
        this.f4895d = (TextView) i.findViewById(R.id.adFreeSubsTitle);
        final AdFreeSubscriptionModel d = C1570t.m6010d();
        this.f4895d.setText(d.productDesc);
        this.f4897f = (TextView) i.findViewById(R.id.rewardedVideoSubsTitle);
        final RewardedVideoSubModel e = C1570t.m6014e();
        this.f4897f.setText(String.format(e.desc, new Object[]{Integer.valueOf(e.validity)}));
        this.f4896e = (TextView) i.findViewById(R.id.tvOr);
        this.f4893b = (TextView) i.findViewById(R.id.tvAdFreeCta);
        this.f4894c = (TextView) i.findViewById(R.id.tvRewardedVideoCta);
        this.f4893b.setText(d.productCta);
        this.f4894c.setText(e.cta);
        this.f4898g = (CardView) i.findViewById(R.id.cvAdSubscription);
        this.f4899h = (CardView) i.findViewById(R.id.cvRewardedVideo);
        this.f4892a = i.findViewById(R.id.progressBar);
        this.f4899h.setOnClickListener(new OnClickListener(this) {
            /* renamed from: b */
            final /* synthetic */ AdFreeOptionsView f4887b;

            public void onClick(View view) {
                if (this.f4887b.f4900j.isLoaded() != null) {
                    this.f4887b.f4900j.show();
                    C1540d.m5811a("Rewarded video cta clicked", this.f4887b.f4894c.getText().toString());
                    C1540d.m5820b("", ActionTypeEnum.REWARDED.name(), e.cta);
                }
            }
        });
        this.f4898g.setOnClickListener(new OnClickListener(this) {
            /* renamed from: c */
            final /* synthetic */ AdFreeOptionsView f4890c;

            /* renamed from: com.cuvora.carinfo.views.AdFreeOptionsView$3$1 */
            class C37371 implements C1101a {
                /* renamed from: a */
                final /* synthetic */ C16273 f14998a;

                /* renamed from: a */
                public void mo919a() {
                }

                C37371(C16273 c16273) {
                    this.f14998a = c16273;
                }

                /* renamed from: a */
                public void mo920a(int i, List<C1025g> list) {
                    if (i == 0) {
                        C1540d.m5811a("Ad free Subs purchased", d.productId);
                        C1570t.m5981a(context, i, (List) list);
                        C1540d.m5813a(d.productId, ActionTypeEnum.INAPP.name(), d.price, true);
                        if (this.f14998a.f4890c.f4902l != 0) {
                            this.f14998a.f4890c.f4902l.mo1163a();
                        }
                    } else if (i == 7) {
                        C1540d.m5811a("Ad free Subs purchase error", String.valueOf(i));
                        Toast.makeText(context, "You already have access to ad free version of the app", 0).show();
                    } else {
                        C1540d.m5811a("Ad free Subs purchase error", String.valueOf(i));
                    }
                }
            }

            public void onClick(View view) {
                C1540d.m5820b(d.price, ActionTypeEnum.INAPP.name(), d.productCta);
                C1540d.m5811a("In App Subs Cta clicked", this.f4890c.f4893b.getText().toString());
                C3347a.m17191a(context).m17204a(new C37371(this));
                C3347a.m17191a(context).m17201a((Activity) context, d.productId, "subs");
            }
        });
    }

    /* renamed from: a */
    private void m6208a(String str, String str2) {
        new C1580t(getContext(), str, str2).execute(new Void[null]);
    }

    /* renamed from: c */
    public void m6217c() {
        if (this.f4900j != null) {
            this.f4900j.resume(getContext());
        }
    }

    /* renamed from: d */
    public void m6218d() {
        if (this.f4900j != null) {
            this.f4900j.pause(getContext());
        }
    }

    /* renamed from: e */
    public void m6219e() {
        if (this.f4900j != null) {
            this.f4900j.destroy(getContext());
        }
    }
}
