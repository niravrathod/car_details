package com.google.ads.mediation.facebook;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Keep;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.AdChoicesView;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AdView;
import com.facebook.ads.C1699a;
import com.facebook.ads.C1700b;
import com.facebook.ads.C1701c;
import com.facebook.ads.C1702g;
import com.facebook.ads.C1703i;
import com.facebook.ads.C3756e;
import com.facebook.ads.C3757f;
import com.facebook.ads.C3926l;
import com.facebook.ads.C3927m;
import com.facebook.ads.C4589h;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd.Rating;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.NativeAppInstallAdMapper;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Keep
public final class FacebookAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, MediationRewardedVideoAdAdapter {
    private static final int DRAWABLE_FUTURE_TIMEOUT_SECONDS = 10;
    public static final String KEY_AD_VIEW_ATTRIBUTES = "ad_view_attributes";
    public static final String KEY_AUTOPLAY = "autoplay";
    public static final String KEY_BACKGROUND_COLOR = "background_color";
    public static final String KEY_BUTTON_BORDER_COLOR = "button_border_color";
    public static final String KEY_BUTTON_COLOR = "button_color";
    public static final String KEY_BUTTON_TEXT_COLOR = "button_text_color";
    public static final String KEY_DESCRIPTION_TEXT_COLOR = "description_text_color";
    public static final String KEY_DESCRIPTION_TEXT_SIZE = "description_text_size";
    public static final String KEY_ID = "id";
    public static final String KEY_IS_BOLD = "is_bold";
    public static final String KEY_IS_ITALIC = "is_italic";
    public static final String KEY_SOCIAL_CONTEXT_ASSET = "social_context";
    public static final String KEY_STYLE = "style";
    public static final String KEY_SUBTITLE_ASSET = "subtitle";
    public static final String KEY_TITLE_TEXT_COLOR = "title_text_color";
    public static final String KEY_TITLE_TEXT_SIZE = "title_text_size";
    public static final String KEY_TYPEFACE = "typeface";
    private static final int MAX_STAR_RATING = 5;
    private static final String PLACEMENT_PARAMETER = "pubid";
    private static final String TAG = "FacebookAdapter";
    private AdView mAdView;
    private MediationBannerListener mBannerListener;
    private Context mContext;
    private C3756e mInterstitialAd;
    private MediationInterstitialListener mInterstitialListener;
    private boolean mIsAdChoicesIconExpandable = true;
    private boolean mIsImpressionRecorded;
    private boolean mIsInitialized;
    private MediaView mMediaView;
    private C4589h mNativeAd;
    private MediationNativeListener mNativeListener;
    private MediationRewardedVideoAdListener mRewardedListener;
    private C3926l mRewardedVideoAd;
    private RelativeLayout mWrappedAdView;

    public static class FacebookExtrasBundleBuilder {
        /* renamed from: a */
        private boolean f6479a;

        public FacebookExtrasBundleBuilder setNativeAdChoicesIconExpandable(boolean z) {
            this.f6479a = z;
            return this;
        }

        public Bundle build() {
            Bundle bundle = new Bundle();
            bundle.putBoolean("expandable_icon", this.f6479a);
            return bundle;
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$c */
    private static class C2119c extends AsyncTask<Object, Void, Boolean> {
        /* renamed from: a */
        private C2120g f6482a;

        protected /* synthetic */ Object doInBackground(Object[] objArr) {
            return m7727a(objArr);
        }

        protected /* synthetic */ void onPostExecute(Object obj) {
            m7728a((Boolean) obj);
        }

        public C2119c(C2120g c2120g) {
            this.f6482a = c2120g;
        }

        /* renamed from: a */
        protected Boolean m7727a(Object... objArr) {
            C4679a c4679a = (C4679a) objArr[0];
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
            HashMap hashMap = new HashMap();
            List images = c4679a.getImages();
            for (int i = 0; i < images.size(); i++) {
                C3942d c3942d = (C3942d) images.get(i);
                hashMap.put(c3942d, m7726a(c3942d.getUri(), newCachedThreadPool));
            }
            C3942d c3942d2 = (C3942d) c4679a.getIcon();
            hashMap.put(c3942d2, m7726a(c3942d2.getUri(), newCachedThreadPool));
            for (Entry entry : hashMap.entrySet()) {
                try {
                    ((C3942d) entry.getKey()).m19597a((Drawable) ((Future) entry.getValue()).get(10, TimeUnit.SECONDS));
                } catch (Object[] objArr2) {
                    String str = FacebookAdapter.TAG;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Exception occurred while waiting for future to return. Returning null as drawable : ");
                    stringBuilder.append(objArr2);
                    Log.w(str, stringBuilder.toString());
                    return Boolean.valueOf(false);
                }
            }
            return Boolean.valueOf(1);
        }

        /* renamed from: a */
        private Future<Drawable> m7726a(final Uri uri, ExecutorService executorService) {
            return executorService.submit(new Callable<Drawable>(this) {
                /* renamed from: b */
                final /* synthetic */ C2119c f6481b;

                public /* synthetic */ Object call() {
                    return m7725a();
                }

                /* renamed from: a */
                public Drawable m7725a() {
                    Bitmap decodeStream = BitmapFactory.decodeStream(new URL(uri.toString()).openStream());
                    decodeStream.setDensity(160);
                    return new BitmapDrawable(Resources.getSystem(), decodeStream);
                }
            });
        }

        /* renamed from: a */
        protected void m7728a(Boolean bool) {
            super.onPostExecute(bool);
            if (bool.booleanValue() != null) {
                this.f6482a.mo1518a();
            } else {
                this.f6482a.mo1519b();
            }
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$g */
    private interface C2120g {
        /* renamed from: a */
        void mo1518a();

        /* renamed from: b */
        void mo1519b();
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$b */
    private class C3941b implements C1701c {
        /* renamed from: a */
        final /* synthetic */ FacebookAdapter f15677a;

        /* renamed from: c */
        public void mo1490c(C1699a c1699a) {
        }

        private C3941b(FacebookAdapter facebookAdapter) {
            this.f15677a = facebookAdapter;
        }

        /* renamed from: b */
        public void mo1512b(C1699a c1699a) {
            this.f15677a.mBannerListener.onAdClicked(this.f15677a);
            this.f15677a.mBannerListener.onAdOpened(this.f15677a);
            this.f15677a.mBannerListener.onAdLeftApplication(this.f15677a);
        }

        /* renamed from: a */
        public void mo1510a(C1699a c1699a) {
            this.f15677a.mBannerListener.onAdLoaded(this.f15677a);
        }

        /* renamed from: a */
        public void mo1511a(C1699a c1699a, C1700b c1700b) {
            c1699a = c1700b.m6436b();
            if (!TextUtils.isEmpty(c1699a)) {
                Log.w(FacebookAdapter.TAG, c1699a);
            }
            this.f15677a.mBannerListener.onAdFailedToLoad(this.f15677a, this.f15677a.convertErrorCode(c1700b));
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$d */
    private class C3942d extends Image {
        /* renamed from: a */
        final /* synthetic */ FacebookAdapter f15678a;
        /* renamed from: b */
        private Drawable f15679b;
        /* renamed from: c */
        private Uri f15680c;

        public double getScale() {
            return 1.0d;
        }

        public C3942d(FacebookAdapter facebookAdapter, Uri uri) {
            this.f15678a = facebookAdapter;
            this.f15680c = uri;
        }

        /* renamed from: a */
        protected void m19597a(Drawable drawable) {
            this.f15679b = drawable;
        }

        public Drawable getDrawable() {
            return this.f15679b;
        }

        public Uri getUri() {
            return this.f15680c;
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$e */
    private class C3943e implements RewardItem {
        /* renamed from: a */
        final /* synthetic */ FacebookAdapter f15681a;

        public int getAmount() {
            return 1;
        }

        public String getType() {
            return "";
        }

        private C3943e(FacebookAdapter facebookAdapter) {
            this.f15681a = facebookAdapter;
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$h */
    private class C3945h implements C1701c {
        /* renamed from: a */
        final /* synthetic */ FacebookAdapter f15684a;
        /* renamed from: b */
        private C4589h f15685b;
        /* renamed from: c */
        private NativeMediationAdRequest f15686c;

        private C3945h(FacebookAdapter facebookAdapter, C4589h c4589h, NativeMediationAdRequest nativeMediationAdRequest) {
            this.f15684a = facebookAdapter;
            this.f15685b = c4589h;
            this.f15686c = nativeMediationAdRequest;
        }

        /* renamed from: b */
        public void mo1512b(C1699a c1699a) {
            this.f15684a.mNativeListener.onAdClicked(this.f15684a);
            this.f15684a.mNativeListener.onAdOpened(this.f15684a);
            this.f15684a.mNativeListener.onAdLeftApplication(this.f15684a);
        }

        /* renamed from: c */
        public void mo1490c(C1699a c1699a) {
            if (this.f15684a.mIsImpressionRecorded != null) {
                Log.d(FacebookAdapter.TAG, "Received onLoggingImpression callback for a native whose impression is already recorded. Ignoring the duplicate callback.");
                return;
            }
            this.f15684a.mNativeListener.onAdImpression(this.f15684a);
            this.f15684a.mIsImpressionRecorded = true;
        }

        /* renamed from: a */
        public void mo1510a(C1699a c1699a) {
            if (c1699a != this.f15685b) {
                Log.w(FacebookAdapter.TAG, "Ad loaded is not a native ad.");
                this.f15684a.mNativeListener.onAdFailedToLoad(this.f15684a, 0);
                return;
            }
            final C4679a c4679a = new C4679a(this.f15684a, this.f15685b, this.f15686c.getNativeAdOptions());
            c4679a.m25705a(new C2120g(this) {
                /* renamed from: b */
                final /* synthetic */ C3945h f15683b;

                /* renamed from: a */
                public void mo1518a() {
                    this.f15683b.f15684a.mNativeListener.onAdLoaded(this.f15683b.f15684a, c4679a);
                }

                /* renamed from: b */
                public void mo1519b() {
                    this.f15683b.f15684a.mNativeListener.onAdFailedToLoad(this.f15683b.f15684a, 3);
                }
            });
        }

        /* renamed from: a */
        public void mo1511a(C1699a c1699a, C1700b c1700b) {
            c1699a = c1700b.m6436b();
            if (!TextUtils.isEmpty(c1699a)) {
                Log.w(FacebookAdapter.TAG, c1699a);
            }
            this.f15684a.mNativeListener.onAdFailedToLoad(this.f15684a, this.f15684a.convertErrorCode(c1700b));
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$a */
    class C4679a extends NativeAppInstallAdMapper {
        /* renamed from: a */
        final /* synthetic */ FacebookAdapter f19317a;
        /* renamed from: f */
        private C4589h f19318f;
        /* renamed from: g */
        private NativeAdOptions f19319g;

        /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$a$1 */
        class C39401 implements C1702g {
            /* renamed from: a */
            final /* synthetic */ C4679a f15676a;

            /* renamed from: a */
            public void mo1502a(MediaView mediaView) {
            }

            /* renamed from: a */
            public void mo1503a(MediaView mediaView, float f) {
            }

            /* renamed from: b */
            public void mo1504b(MediaView mediaView) {
            }

            /* renamed from: d */
            public void mo1506d(MediaView mediaView) {
            }

            /* renamed from: e */
            public void mo1507e(MediaView mediaView) {
            }

            /* renamed from: f */
            public void mo1508f(MediaView mediaView) {
            }

            /* renamed from: g */
            public void mo1509g(MediaView mediaView) {
            }

            C39401(C4679a c4679a) {
                this.f15676a = c4679a;
            }

            /* renamed from: c */
            public void mo1505c(MediaView mediaView) {
                if (this.f15676a.f19317a.mNativeListener != null) {
                    this.f15676a.f19317a.mNativeListener.onVideoEnd(this.f15676a.f19317a);
                }
            }
        }

        public C4679a(FacebookAdapter facebookAdapter, C4589h c4589h, NativeAdOptions nativeAdOptions) {
            this.f19317a = facebookAdapter;
            this.f19318f = c4589h;
            this.f19319g = nativeAdOptions;
        }

        /* renamed from: a */
        public void m25705a(C2120g c2120g) {
            if (m25704a(this.f19318f)) {
                setHeadline(this.f19318f.getAdTitle());
                List arrayList = new ArrayList();
                arrayList.add(new C3942d(this.f19317a, Uri.parse(this.f19318f.getAdCoverImage().getUrl())));
                setImages(arrayList);
                setBody(this.f19318f.getAdBody());
                setIcon(new C3942d(this.f19317a, Uri.parse(this.f19318f.getAdIcon().getUrl())));
                setCallToAction(this.f19318f.m18730m());
                this.f19317a.mMediaView.setListener(new C39401(this));
                this.f19317a.mMediaView.setNativeAd(this.f19318f);
                setMediaView(this.f19317a.mMediaView);
                setHasVideoContent(true);
                Double a = m25703a(this.f19318f.getAdStarRating());
                if (a != null) {
                    setStarRating(a.doubleValue());
                }
                Bundle bundle = new Bundle();
                bundle.putCharSequence(FacebookAdapter.KEY_ID, this.f19318f.m18732o());
                bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f19318f.m18731n());
                bundle.putCharSequence(FacebookAdapter.KEY_SUBTITLE_ASSET, this.f19318f.getAdSubtitle());
                C1703i l = this.f19318f.m18729l();
                if (l != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean(FacebookAdapter.KEY_AUTOPLAY, l.m6458j());
                    bundle2.putInt(FacebookAdapter.KEY_BACKGROUND_COLOR, l.m6450b());
                    bundle2.putInt(FacebookAdapter.KEY_BUTTON_BORDER_COLOR, l.m6455g());
                    bundle2.putInt(FacebookAdapter.KEY_BUTTON_COLOR, l.m6453e());
                    bundle2.putInt(FacebookAdapter.KEY_BUTTON_TEXT_COLOR, l.m6454f());
                    bundle2.putInt(FacebookAdapter.KEY_DESCRIPTION_TEXT_COLOR, l.m6452d());
                    bundle2.putInt(FacebookAdapter.KEY_DESCRIPTION_TEXT_SIZE, l.m6457i());
                    bundle2.putInt(FacebookAdapter.KEY_TITLE_TEXT_COLOR, l.m6451c());
                    bundle2.putInt(FacebookAdapter.KEY_TITLE_TEXT_SIZE, l.m6456h());
                    Typeface a2 = l.m6449a();
                    if (a2 != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean(FacebookAdapter.KEY_IS_BOLD, a2.isBold());
                        bundle3.putBoolean(FacebookAdapter.KEY_IS_ITALIC, a2.isItalic());
                        bundle3.putInt(FacebookAdapter.KEY_STYLE, a2.getStyle());
                        bundle2.putBundle(FacebookAdapter.KEY_TYPEFACE, bundle3);
                    }
                    bundle.putBundle(FacebookAdapter.KEY_AD_VIEW_ATTRIBUTES, bundle2);
                }
                setExtras(bundle);
                if (this.f19319g != null ? this.f19319g.shouldReturnUrlsForImageAssets() : false) {
                    c2120g.mo1518a();
                } else {
                    new C2119c(c2120g).execute(new Object[]{this});
                }
                return;
            }
            Log.w(FacebookAdapter.TAG, "Ad from Facebook doesn't have all assets required for the app install format.");
            c2120g.mo1519b();
        }

        /* renamed from: a */
        private boolean m25704a(C4589h c4589h) {
            return (c4589h.getAdTitle() == null || c4589h.getAdCoverImage() == null || c4589h.getAdBody() == null || c4589h.getAdIcon() == null || c4589h.m18730m() == null || this.f19317a.mMediaView == null) ? null : true;
        }

        public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
            ViewGroup viewGroup = (ViewGroup) view;
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (childAt instanceof FrameLayout) {
                View adChoicesView = new AdChoicesView(view.getContext(), this.f19318f, this.f19317a.mIsAdChoicesIconExpandable);
                ((ViewGroup) childAt).addView(adChoicesView);
                LayoutParams layoutParams = (LayoutParams) adChoicesView.getLayoutParams();
                if (this.f19319g != null) {
                    int adChoicesPlacement = this.f19319g.getAdChoicesPlacement();
                    if (adChoicesPlacement != 0) {
                        switch (adChoicesPlacement) {
                            case 2:
                                layoutParams.gravity = 85;
                                break;
                            case 3:
                                layoutParams.gravity = 83;
                                break;
                            default:
                                layoutParams.gravity = 53;
                                break;
                        }
                    }
                    layoutParams.gravity = 51;
                } else {
                    layoutParams.gravity = 53;
                }
                viewGroup.requestLayout();
            } else {
                Log.w(FacebookAdapter.TAG, "Failed to show AdChoices icon.");
            }
            setOverrideImpressionRecording(true);
            setOverrideClickHandling(true);
            map2 = new ArrayList();
            map = map.entrySet().iterator();
            while (map.hasNext()) {
                map2.add(((Entry) map.next()).getValue());
            }
            this.f19318f.registerViewForInteraction(view, map2);
        }

        public void untrackView(View view) {
            super.untrackView(view);
            ViewGroup viewGroup = (ViewGroup) view;
            view = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (view instanceof FrameLayout) {
                ((FrameLayout) view).removeAllViews();
            }
            this.f19318f.m18735r();
        }

        /* renamed from: a */
        private Double m25703a(Rating rating) {
            return rating == null ? null : Double.valueOf((rating.getValue() * 5.0d) / rating.getScale());
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$f */
    private class C4680f implements C3757f {
        /* renamed from: a */
        final /* synthetic */ FacebookAdapter f19320a;

        /* renamed from: c */
        public void mo1490c(C1699a c1699a) {
        }

        private C4680f(FacebookAdapter facebookAdapter) {
            this.f19320a = facebookAdapter;
        }

        /* renamed from: b */
        public void mo1512b(C1699a c1699a) {
            this.f19320a.mInterstitialListener.onAdClicked(this.f19320a);
            this.f19320a.mInterstitialListener.onAdLeftApplication(this.f19320a);
        }

        /* renamed from: a */
        public void mo1510a(C1699a c1699a) {
            this.f19320a.mInterstitialListener.onAdLoaded(this.f19320a);
        }

        /* renamed from: a */
        public void mo1511a(C1699a c1699a, C1700b c1700b) {
            c1699a = c1700b.m6436b();
            if (!TextUtils.isEmpty(c1699a)) {
                Log.w(FacebookAdapter.TAG, c1699a);
            }
            this.f19320a.mInterstitialListener.onAdFailedToLoad(this.f19320a, this.f19320a.convertErrorCode(c1700b));
        }

        /* renamed from: e */
        public void mo4013e(C1699a c1699a) {
            this.f19320a.mInterstitialListener.onAdClosed(this.f19320a);
        }

        /* renamed from: d */
        public void mo4012d(C1699a c1699a) {
            this.f19320a.mInterstitialListener.onAdOpened(this.f19320a);
        }
    }

    /* renamed from: com.google.ads.mediation.facebook.FacebookAdapter$i */
    private class C4681i implements C3927m {
        /* renamed from: a */
        final /* synthetic */ FacebookAdapter f19321a;

        /* renamed from: c */
        public void mo1490c(C1699a c1699a) {
        }

        private C4681i(FacebookAdapter facebookAdapter) {
            this.f19321a = facebookAdapter;
        }

        /* renamed from: a */
        public void mo4014a() {
            this.f19321a.mRewardedListener.onRewarded(this.f19321a, new C3943e());
        }

        /* renamed from: a */
        public void mo1511a(C1699a c1699a, C1700b c1700b) {
            c1699a = c1700b.m6436b();
            if (!TextUtils.isEmpty(c1699a)) {
                Log.w(FacebookAdapter.TAG, c1699a);
            }
            this.f19321a.mRewardedListener.onAdFailedToLoad(this.f19321a, this.f19321a.convertErrorCode(c1700b));
        }

        /* renamed from: a */
        public void mo1510a(C1699a c1699a) {
            this.f19321a.mRewardedListener.onAdLoaded(this.f19321a);
        }

        /* renamed from: b */
        public void mo1512b(C1699a c1699a) {
            this.f19321a.mRewardedListener.onAdClicked(this.f19321a);
            this.f19321a.mRewardedListener.onAdLeftApplication(this.f19321a);
        }

        /* renamed from: b */
        public void mo4015b() {
            this.f19321a.mRewardedListener.onAdClosed(this.f19321a);
        }
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onDestroy() {
        if (this.mAdView != null) {
            this.mAdView.m18679b();
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd.m18753b();
        }
        if (this.mNativeAd != null) {
            this.mNativeAd.m18735r();
            this.mNativeAd.m18727j();
        }
        if (this.mMediaView != null) {
            this.mMediaView.m18716a();
        }
        if (this.mRewardedVideoAd != null) {
            this.mRewardedVideoAd.m19556b();
        }
    }

    public void requestBannerAd(Context context, MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mBannerListener = mediationBannerListener;
        if (isValidRequestParameters(context, bundle) == null) {
            this.mBannerListener.onAdFailedToLoad(this, 1);
        } else if (adSize == null) {
            Log.w(TAG, "Fail to request banner ad, adSize is null");
            this.mBannerListener.onAdFailedToLoad(this, 1);
        } else {
            mediationBannerListener = bundle.getString("pubid");
            bundle = getAdSize(context, adSize);
            if (bundle == null) {
                context = TAG;
                mediationBannerListener = new StringBuilder();
                mediationBannerListener.append("The input ad size ");
                mediationBannerListener.append(adSize.toString());
                mediationBannerListener.append(" is not supported at this moment.");
                Log.w(context, mediationBannerListener.toString());
                this.mBannerListener.onAdFailedToLoad(this, 3);
                return;
            }
            bundle2 = new StringBuilder();
            bundle2.append("ADMOB_");
            bundle2.append(getGMSVersionCode(context));
            AdSettings.m6375a(bundle2.toString());
            this.mAdView = new AdView(context, mediationBannerListener, bundle);
            this.mAdView.setAdListener(new C3941b());
            buildAdRequest(mediationAdRequest);
            mediationBannerListener = new RelativeLayout.LayoutParams(adSize.getWidthInPixels(context), adSize.getHeightInPixels(context));
            this.mWrappedAdView = new RelativeLayout(context);
            this.mAdView.setLayoutParams(mediationBannerListener);
            this.mWrappedAdView.addView(this.mAdView);
            this.mAdView.m18678a();
        }
    }

    public View getBannerView() {
        return this.mWrappedAdView;
    }

    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mInterstitialListener = mediationInterstitialListener;
        if (isValidRequestParameters(context, bundle) == null) {
            this.mInterstitialListener.onAdFailedToLoad(this, 1);
            return;
        }
        mediationInterstitialListener = bundle.getString("pubid");
        bundle = new StringBuilder();
        bundle.append("ADMOB_");
        bundle.append(getGMSVersionCode(context));
        AdSettings.m6375a(bundle.toString());
        this.mInterstitialAd = new C3756e(context, mediationInterstitialListener);
        this.mInterstitialAd.m18751a(new C4680f());
        buildAdRequest(mediationAdRequest);
        this.mInterstitialAd.m18750a();
    }

    public void showInterstitial() {
        if (this.mInterstitialAd.m18754c()) {
            this.mInterstitialAd.m18755d();
        }
    }

    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        this.mContext = context;
        this.mRewardedListener = mediationRewardedVideoAdListener;
        if (isValidRequestParameters(context, bundle) == null) {
            this.mRewardedListener.onAdFailedToLoad(this, 1);
            return;
        }
        this.mRewardedVideoAd = new C3926l(context, bundle.getString("pubid"));
        this.mRewardedVideoAd.m19552a(new C4681i());
        this.mIsInitialized = true;
        this.mRewardedListener.onInitializationSucceeded(this);
    }

    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        if (this.mRewardedVideoAd == null) {
            Log.w(TAG, "Failed to request rewarded video ad, adapter has not been initialized.");
            this.mIsInitialized = false;
            if (this.mRewardedListener != null) {
                this.mRewardedListener.onAdFailedToLoad(this, 0);
            }
        } else if (this.mRewardedVideoAd.m19557c() != null) {
            this.mRewardedListener.onAdLoaded(this);
        } else {
            buildAdRequest(mediationAdRequest);
            mediationAdRequest = new StringBuilder();
            mediationAdRequest.append("ADMOB_");
            mediationAdRequest.append(getGMSVersionCode(this.mContext));
            AdSettings.m6375a(mediationAdRequest.toString());
            this.mRewardedVideoAd.m19553a(true);
        }
    }

    public void showVideo() {
        if (this.mRewardedVideoAd == null || !this.mRewardedVideoAd.m19557c()) {
            Log.w(TAG, "No ads to show.");
            if (this.mRewardedListener != null) {
                this.mRewardedListener.onAdOpened(this);
                this.mRewardedListener.onAdClosed(this);
                return;
            }
            return;
        }
        this.mRewardedVideoAd.m19554a();
        this.mRewardedListener.onAdOpened(this);
        this.mRewardedListener.onVideoStarted(this);
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    public void requestNativeAd(Context context, MediationNativeListener mediationNativeListener, Bundle bundle, NativeMediationAdRequest nativeMediationAdRequest, Bundle bundle2) {
        this.mNativeListener = mediationNativeListener;
        if (isValidRequestParameters(context, bundle) == null) {
            this.mNativeListener.onAdFailedToLoad(this, 1);
            return;
        }
        if (nativeMediationAdRequest.isAppInstallAdRequested() != null) {
            if (nativeMediationAdRequest.isContentAdRequested() != null) {
                mediationNativeListener = bundle.getString("pubid");
                if (bundle2 != null) {
                    this.mIsAdChoicesIconExpandable = bundle2.getBoolean("expandable_icon", true);
                }
                this.mMediaView = new MediaView(context);
                bundle = new StringBuilder();
                bundle.append("ADMOB_");
                bundle.append(getGMSVersionCode(context));
                AdSettings.m6375a(bundle.toString());
                this.mNativeAd = new C4589h(context, mediationNativeListener);
                this.mNativeAd.setAdListener(new C3945h(this.mNativeAd, nativeMediationAdRequest));
                buildAdRequest(nativeMediationAdRequest);
                this.mNativeAd.m18726i();
                return;
            }
        }
        Log.w(TAG, "Failed to request native ad. Both app install and content ad should be requested");
        this.mNativeListener.onAdFailedToLoad(this, 1);
    }

    private static boolean isValidRequestParameters(Context context, Bundle bundle) {
        if (context == null) {
            Log.w(TAG, "Failed to request ad, Context is null.");
            return false;
        } else if (bundle == null) {
            Log.w(TAG, "Failed to request ad, serverParameters is null.");
            return false;
        } else if (TextUtils.isEmpty(bundle.getString("pubid")) == null) {
            return true;
        } else {
            Log.w(TAG, "Failed to request ad, placementId is null or empty.");
            return false;
        }
    }

    private int convertErrorCode(C1700b c1700b) {
        if (c1700b == null) {
            return 0;
        }
        c1700b = c1700b.m6435a();
        if (c1700b != 2000) {
            switch (c1700b) {
                case 1000:
                    break;
                case 1001:
                    return 3;
                case 1002:
                    return 1;
                default:
                    return 0;
            }
        }
        return 2;
    }

    private void buildAdRequest(MediationAdRequest mediationAdRequest) {
        if (mediationAdRequest != null) {
            boolean z = true;
            if (mediationAdRequest.taggedForChildDirectedTreatment() != 1) {
                z = false;
            }
            AdSettings.m6376a(z);
        }
    }

    private com.facebook.ads.AdSize getAdSize(Context context, AdSize adSize) {
        if (adSize.getWidth() == com.facebook.ads.AdSize.f5066c.m6380a() && adSize.getHeight() == com.facebook.ads.AdSize.f5066c.m6381b()) {
            return com.facebook.ads.AdSize.f5066c;
        }
        context = pixelToDip(adSize.getHeightInPixels(context));
        if (context == com.facebook.ads.AdSize.f5068e.m6381b()) {
            return com.facebook.ads.AdSize.f5068e;
        }
        if (context == com.facebook.ads.AdSize.f5069f.m6381b()) {
            return com.facebook.ads.AdSize.f5069f;
        }
        return context == com.facebook.ads.AdSize.f5070g.m6381b() ? com.facebook.ads.AdSize.f5070g : null;
    }

    private int pixelToDip(int i) {
        return Math.round(((float) i) / Resources.getSystem().getDisplayMetrics().density);
    }

    private static int getGMSVersionCode(android.content.Context r2) {
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r0 = 0;
        r2 = r2.getPackageManager();	 Catch:{ NameNotFoundException -> 0x000e }
        r1 = "com.google.android.gms";	 Catch:{ NameNotFoundException -> 0x000e }
        r2 = r2.getPackageInfo(r1, r0);	 Catch:{ NameNotFoundException -> 0x000e }
        r2 = r2.versionCode;	 Catch:{ NameNotFoundException -> 0x000e }
        return r2;
    L_0x000e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.facebook.FacebookAdapter.getGMSVersionCode(android.content.Context):int");
    }
}
