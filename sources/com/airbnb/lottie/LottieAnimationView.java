package com.airbnb.lottie;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.JsonReader;
import android.util.Log;
import android.view.View.BaseSavedState;
import com.airbnb.lottie.C0978m.C0977a;
import com.airbnb.lottie.model.C0989e;
import com.airbnb.lottie.model.C0991g;
import com.airbnb.lottie.p037e.C0961c;
import java.io.StringReader;
import org.json.JSONObject;

public class LottieAnimationView extends AppCompatImageView {
    /* renamed from: a */
    public static final CacheStrategy f18666a = CacheStrategy.Weak;
    /* renamed from: b */
    private static final String f18667b = LottieAnimationView.class.getSimpleName();
    /* renamed from: c */
    private final C0968h<C0955d> f18668c = new C32841(this);
    /* renamed from: d */
    private final C0968h<Throwable> f18669d = new C32852(this);
    /* renamed from: e */
    private final C0966f f18670e = new C0966f();
    /* renamed from: f */
    private CacheStrategy f18671f;
    /* renamed from: g */
    private String f18672g;
    /* renamed from: h */
    private int f18673h;
    /* renamed from: i */
    private boolean f18674i = false;
    /* renamed from: j */
    private boolean f18675j = false;
    /* renamed from: k */
    private boolean f18676k = false;
    /* renamed from: l */
    private C0973k f18677l;
    /* renamed from: m */
    private C0955d f18678m;

    @Deprecated
    public enum CacheStrategy {
        None,
        Weak,
        Strong
    }

    private static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C09141();
        /* renamed from: a */
        String f3087a;
        /* renamed from: b */
        int f3088b;
        /* renamed from: c */
        float f3089c;
        /* renamed from: d */
        boolean f3090d;
        /* renamed from: e */
        String f3091e;
        /* renamed from: f */
        int f3092f;
        /* renamed from: g */
        int f3093g;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$1 */
        static class C09141 implements Creator<SavedState> {
            C09141() {
            }

            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3975a(parcel);
            }

            public /* synthetic */ Object[] newArray(int i) {
                return m3976a(i);
            }

            /* renamed from: a */
            public SavedState m3975a(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: a */
            public SavedState[] m3976a(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f3087a = parcel.readString();
            this.f3089c = parcel.readFloat();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f3090d = z;
            this.f3091e = parcel.readString();
            this.f3092f = parcel.readInt();
            this.f3093g = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f3087a);
            parcel.writeFloat(this.f3089c);
            parcel.writeInt(this.f3090d);
            parcel.writeString(this.f3091e);
            parcel.writeInt(this.f3092f);
            parcel.writeInt(this.f3093g);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$1 */
    class C32841 implements C0968h<C0955d> {
        /* renamed from: a */
        final /* synthetic */ LottieAnimationView f14007a;

        C32841(LottieAnimationView lottieAnimationView) {
            this.f14007a = lottieAnimationView;
        }

        /* renamed from: a */
        public void m16939a(C0955d c0955d) {
            this.f14007a.setComposition(c0955d);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$2 */
    class C32852 implements C0968h<Throwable> {
        /* renamed from: a */
        final /* synthetic */ LottieAnimationView f14008a;

        C32852(LottieAnimationView lottieAnimationView) {
            this.f14008a = lottieAnimationView;
        }

        /* renamed from: a */
        public void m16942a(Throwable th) {
            throw new IllegalStateException("Unable to parse composition", th);
        }
    }

    public LottieAnimationView(Context context) {
        super(context);
        m24758a((AttributeSet) null);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m24758a(attributeSet);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24758a(attributeSet);
    }

    /* renamed from: a */
    private void m24758a(AttributeSet attributeSet) {
        attributeSet = getContext().obtainStyledAttributes(attributeSet, C0977a.LottieAnimationView);
        this.f18671f = CacheStrategy.values()[attributeSet.getInt(C0977a.LottieAnimationView_lottie_cacheStrategy, f18666a.ordinal())];
        if (!isInEditMode()) {
            boolean hasValue = attributeSet.hasValue(C0977a.LottieAnimationView_lottie_rawRes);
            boolean hasValue2 = attributeSet.hasValue(C0977a.LottieAnimationView_lottie_fileName);
            boolean hasValue3 = attributeSet.hasValue(C0977a.LottieAnimationView_lottie_url);
            if (hasValue) {
                if (hasValue2) {
                    throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use use only one at once.");
                }
            }
            if (hasValue) {
                int resourceId = attributeSet.getResourceId(C0977a.LottieAnimationView_lottie_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                r0 = attributeSet.getString(C0977a.LottieAnimationView_lottie_fileName);
                if (r0 != null) {
                    setAnimation(r0);
                }
            } else if (hasValue3) {
                r0 = attributeSet.getString(C0977a.LottieAnimationView_lottie_url);
                if (r0 != null) {
                    setAnimationFromUrl(r0);
                }
            }
        }
        if (attributeSet.getBoolean(C0977a.LottieAnimationView_lottie_autoPlay, false)) {
            this.f18674i = true;
            this.f18675j = true;
        }
        if (attributeSet.getBoolean(C0977a.LottieAnimationView_lottie_loop, false)) {
            this.f18670e.m4189e(-1);
        }
        if (attributeSet.hasValue(C0977a.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(attributeSet.getInt(C0977a.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (attributeSet.hasValue(C0977a.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(attributeSet.getInt(C0977a.LottieAnimationView_lottie_repeatCount, -1));
        }
        setImageAssetsFolder(attributeSet.getString(C0977a.LottieAnimationView_lottie_imageAssetsFolder));
        setProgress(attributeSet.getFloat(C0977a.LottieAnimationView_lottie_progress, 0.0f));
        m24764a(attributeSet.getBoolean(C0977a.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (attributeSet.hasValue(C0977a.LottieAnimationView_lottie_colorFilter)) {
            C0997n c0997n = new C0997n(attributeSet.getColor(C0977a.LottieAnimationView_lottie_colorFilter, 0));
            m24763a(new C0989e("**"), C0969i.f3234x, new C0961c(c0997n));
        }
        if (attributeSet.hasValue(C0977a.LottieAnimationView_lottie_scale)) {
            this.f18670e.m4188e(attributeSet.getFloat(C0977a.LottieAnimationView_lottie_scale, 1.0f));
        }
        attributeSet.recycle();
        m24761g();
    }

    public void setImageResource(int i) {
        m24762a();
        m24759e();
        super.setImageResource(i);
    }

    public void setImageDrawable(Drawable drawable) {
        m24757a(drawable, true);
    }

    /* renamed from: a */
    private void m24757a(Drawable drawable, boolean z) {
        if (z && drawable != this.f18670e) {
            m24762a();
        }
        m24759e();
        super.setImageDrawable(drawable);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m24762a();
        m24759e();
        super.setImageBitmap(bitmap);
    }

    public void invalidateDrawable(Drawable drawable) {
        if (getDrawable() == this.f18670e) {
            super.invalidateDrawable(this.f18670e);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable savedState = new SavedState(super.onSaveInstanceState());
        savedState.f3087a = this.f18672g;
        savedState.f3088b = this.f18673h;
        savedState.f3089c = this.f18670e.m4204t();
        savedState.f3090d = this.f18670e.m4198n();
        savedState.f3091e = this.f18670e.m4177b();
        savedState.f3092f = this.f18670e.m4196l();
        savedState.f3093g = this.f18670e.m4197m();
        return savedState;
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            this.f18672g = savedState.f3087a;
            if (!TextUtils.isEmpty(this.f18672g)) {
                setAnimation(this.f18672g);
            }
            this.f18673h = savedState.f3088b;
            if (this.f18673h != 0) {
                setAnimation(this.f18673h);
            }
            setProgress(savedState.f3089c);
            if (savedState.f3090d) {
                m24765b();
            }
            this.f18670e.m4172a(savedState.f3091e);
            setRepeatMode(savedState.f3092f);
            setRepeatCount(savedState.f3093g);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f18675j && this.f18674i) {
            m24765b();
        }
    }

    protected void onDetachedFromWindow() {
        if (m24766c()) {
            m24767d();
            this.f18674i = true;
        }
        m24762a();
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    void m24762a() {
        if (this.f18670e != null) {
            this.f18670e.m4181c();
        }
    }

    /* renamed from: a */
    public void m24764a(boolean z) {
        this.f18670e.m4173a(z);
    }

    public boolean getUseHardwareAcceleration() {
        return this.f18676k;
    }

    @Deprecated
    public void setAnimation(int i, CacheStrategy cacheStrategy) {
        setAnimation(i);
    }

    public void setAnimation(final int i) {
        this.f18673h = i;
        this.f18672g = null;
        C0955d a = C0991g.m4275a().m4276a(i);
        if (a != null) {
            setComposition(a);
            return;
        }
        m24760f();
        m24759e();
        this.f18677l = C0963e.m4142a(getContext(), i).m4225a(new C0968h<C0955d>(this) {
            /* renamed from: b */
            final /* synthetic */ LottieAnimationView f14010b;

            /* renamed from: a */
            public void m16943a(C0955d c0955d) {
                C0991g.m4275a().m4278a(i, c0955d);
            }
        }).m4225a(this.f18668c).m4227c(this.f18669d);
    }

    @Deprecated
    public void setAnimation(String str, CacheStrategy cacheStrategy) {
        setAnimation(str);
    }

    public void setAnimation(final String str) {
        this.f18672g = str;
        this.f18673h = 0;
        C0955d a = C0991g.m4275a().m4277a(str);
        if (a != null) {
            setComposition(a);
            return;
        }
        m24760f();
        m24759e();
        this.f18677l = C0963e.m4151b(getContext(), str).m4225a(new C0968h<C0955d>(this) {
            /* renamed from: b */
            final /* synthetic */ LottieAnimationView f14012b;

            /* renamed from: a */
            public void m16945a(C0955d c0955d) {
                C0991g.m4275a().m4279a(str, c0955d);
            }
        }).m4225a(this.f18668c).m4227c(this.f18669d);
    }

    @Deprecated
    public void setAnimation(JSONObject jSONObject) {
        setAnimation(new JsonReader(new StringReader(jSONObject.toString())));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new JsonReader(new StringReader(str)), str2);
    }

    @Deprecated
    public void setAnimation(JsonReader jsonReader) {
        setAnimation(jsonReader, null);
    }

    public void setAnimation(JsonReader jsonReader, String str) {
        m24760f();
        m24759e();
        this.f18677l = C0963e.m4144a(jsonReader, str).m4225a(this.f18668c).m4227c(this.f18669d);
    }

    public void setAnimationFromUrl(String str) {
        m24760f();
        m24759e();
        this.f18677l = C0963e.m4143a(getContext(), str).m4225a(this.f18668c).m4227c(this.f18669d);
    }

    /* renamed from: e */
    private void m24759e() {
        if (this.f18677l != null) {
            this.f18677l.m4226b(this.f18668c);
            this.f18677l.m4228d(this.f18669d);
        }
    }

    public void setComposition(C0955d c0955d) {
        if (C0949c.f3129a) {
            String str = f18667b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Set Composition \n");
            stringBuilder.append(c0955d);
            Log.v(str, stringBuilder.toString());
        }
        this.f18670e.setCallback(this);
        this.f18678m = c0955d;
        c0955d = this.f18670e.m4175a(c0955d);
        m24761g();
        if (getDrawable() != this.f18670e || c0955d != null) {
            setImageDrawable(null);
            setImageDrawable(this.f18670e);
            requestLayout();
        }
    }

    public C0955d getComposition() {
        return this.f18678m;
    }

    /* renamed from: b */
    public void m24765b() {
        this.f18670e.m4190f();
        m24761g();
    }

    public void setMinFrame(int i) {
        this.f18670e.m4166a(i);
    }

    public float getMinFrame() {
        return this.f18670e.m4192h();
    }

    public void setMinProgress(float f) {
        this.f18670e.m4164a(f);
    }

    public void setMaxFrame(int i) {
        this.f18670e.m4179b(i);
    }

    public float getMaxFrame() {
        return this.f18670e.m4193i();
    }

    public void setMaxProgress(float f) {
        this.f18670e.m4178b(f);
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.f18670e.m4167a(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.f18670e.m4165a(f, f2);
    }

    public void setSpeed(float f) {
        this.f18670e.m4182c(f);
    }

    public float getSpeed() {
        return this.f18670e.m4194j();
    }

    public void setRepeatMode(int i) {
        this.f18670e.m4186d(i);
    }

    public int getRepeatMode() {
        return this.f18670e.m4196l();
    }

    public void setRepeatCount(int i) {
        this.f18670e.m4189e(i);
    }

    public int getRepeatCount() {
        return this.f18670e.m4197m();
    }

    /* renamed from: c */
    public boolean m24766c() {
        return this.f18670e.m4198n();
    }

    public void setImageAssetsFolder(String str) {
        this.f18670e.m4172a(str);
    }

    public String getImageAssetsFolder() {
        return this.f18670e.m4177b();
    }

    public void setImageAssetDelegate(C0928b c0928b) {
        this.f18670e.m4169a(c0928b);
    }

    public void setFontAssetDelegate(C0925a c0925a) {
        this.f18670e.m4168a(c0925a);
    }

    public void setTextDelegate(C1001o c1001o) {
        this.f18670e.m4171a(c1001o);
    }

    /* renamed from: a */
    public <T> void m24763a(C0989e c0989e, T t, C0961c<T> c0961c) {
        this.f18670e.m4170a(c0989e, t, c0961c);
    }

    public void setScale(float f) {
        this.f18670e.m4188e(f);
        if (getDrawable() == this.f18670e) {
            m24757a(0.0f, false);
            m24757a(this.f18670e, false);
        }
    }

    public float getScale() {
        return this.f18670e.m4201q();
    }

    /* renamed from: d */
    public void m24767d() {
        this.f18670e.m4203s();
        m24761g();
    }

    public void setFrame(int i) {
        this.f18670e.m4183c(i);
    }

    public int getFrame() {
        return this.f18670e.m4195k();
    }

    public void setProgress(float f) {
        this.f18670e.m4185d(f);
    }

    public float getProgress() {
        return this.f18670e.m4204t();
    }

    public long getDuration() {
        return this.f18678m != null ? (long) this.f18678m.m4116c() : 0;
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f18670e.m4180b(z);
    }

    public C0976l getPerformanceTracker() {
        return this.f18670e.m4184d();
    }

    /* renamed from: f */
    private void m24760f() {
        this.f18678m = null;
        this.f18670e.m4187e();
    }

    /* renamed from: g */
    private void m24761g() {
        int i = 1;
        Object obj = (this.f18676k && this.f18670e.m4198n()) ? 1 : null;
        if (obj != null) {
            i = 2;
        }
        setLayerType(i, null);
    }
}
