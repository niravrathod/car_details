package com.google.android.youtube.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import com.google.android.youtube.player.YouTubePlayer.C2522b;
import com.google.android.youtube.player.YouTubePlayer.C2525e;
import com.google.android.youtube.player.internal.C2533b;
import com.google.android.youtube.player.internal.C2534c;
import com.google.android.youtube.player.internal.C2543n;
import com.google.android.youtube.player.internal.C2554v.C2552a;
import com.google.android.youtube.player.internal.C2554v.C2553b;
import com.google.android.youtube.player.internal.C4157e;
import com.google.android.youtube.player.internal.C4180u;
import com.google.android.youtube.player.internal.aa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class YouTubePlayerView extends ViewGroup implements C2525e {
    /* renamed from: a */
    private final C2526a f17662a;
    /* renamed from: b */
    private final Set<View> f17663b;
    /* renamed from: c */
    private final C2527b f17664c;
    /* renamed from: d */
    private C4157e f17665d;
    /* renamed from: e */
    private C4180u f17666e;
    /* renamed from: f */
    private View f17667f;
    /* renamed from: g */
    private C2543n f17668g;
    /* renamed from: h */
    private C2525e f17669h;
    /* renamed from: i */
    private Bundle f17670i;
    /* renamed from: j */
    private C2522b f17671j;
    /* renamed from: k */
    private boolean f17672k;
    /* renamed from: l */
    private boolean f17673l;

    /* renamed from: com.google.android.youtube.player.YouTubePlayerView$a */
    private final class C2526a implements OnGlobalFocusChangeListener {
        /* renamed from: a */
        final /* synthetic */ YouTubePlayerView f10876a;

        private C2526a(YouTubePlayerView youTubePlayerView) {
            this.f10876a = youTubePlayerView;
        }

        public final void onGlobalFocusChanged(View view, View view2) {
            if (this.f10876a.f17666e != null && this.f10876a.f17663b.contains(view2) && !this.f10876a.f17663b.contains(view)) {
                this.f10876a.f17666e.m23019g();
            }
        }
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayerView$b */
    interface C2527b {
        /* renamed from: a */
        void mo3220a(YouTubePlayerView youTubePlayerView);
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayerView$2 */
    class C41542 implements C2553b {
        /* renamed from: a */
        final /* synthetic */ YouTubePlayerView f17661a;

        C41542(YouTubePlayerView youTubePlayerView) {
            this.f17661a = youTubePlayerView;
        }

        /* renamed from: a */
        public final void mo3223a(YouTubeInitializationResult youTubeInitializationResult) {
            this.f17661a.m22872a(youTubeInitializationResult);
            this.f17661a.f17665d = null;
        }
    }

    public YouTubePlayerView(Context context) {
        this(context, null);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public YouTubePlayerView(Context context, AttributeSet attributeSet, int i) {
        if (context instanceof YouTubeBaseActivity) {
            this(context, attributeSet, i, ((YouTubeBaseActivity) context).m12433a());
            return;
        }
        throw new IllegalStateException("A YouTubePlayerView can only be created with an Activity  which extends YouTubeBaseActivity as its context.");
    }

    YouTubePlayerView(Context context, AttributeSet attributeSet, int i, C2527b c2527b) {
        super((Context) C2534c.m12478a((Object) context, (Object) "context cannot be null"), attributeSet, i);
        this.f17664c = (C2527b) C2534c.m12478a((Object) c2527b, (Object) "listener cannot be null");
        if (getBackground() == null) {
            setBackgroundColor(-16777216);
        }
        setClipToPadding(false);
        this.f17668g = new C2543n(context);
        requestTransparentRegion(this.f17668g);
        addView(this.f17668g);
        this.f17663b = new HashSet();
        this.f17662a = new C2526a();
    }

    /* renamed from: a */
    private void m22871a(View view) {
        Object obj;
        if (view != this.f17668g) {
            if (this.f17666e == null || view != this.f17667f) {
                obj = null;
                if (obj != null) {
                    throw new UnsupportedOperationException("No views can be added on top of the player");
                }
            }
        }
        obj = 1;
        if (obj != null) {
            throw new UnsupportedOperationException("No views can be added on top of the player");
        }
    }

    /* renamed from: a */
    private void m22872a(YouTubeInitializationResult youTubeInitializationResult) {
        this.f17666e = null;
        this.f17668g.m12545c();
        if (this.f17671j != null) {
            this.f17671j.mo4649a(this.f17669h, youTubeInitializationResult);
            this.f17671j = null;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m22873a(YouTubePlayerView youTubePlayerView, Activity activity) {
        try {
            youTubePlayerView.f17666e = new C4180u(youTubePlayerView.f17665d, C2533b.m12473a().mo3225a(activity, youTubePlayerView.f17665d, youTubePlayerView.f17672k));
            youTubePlayerView.f17667f = youTubePlayerView.f17666e.m22998a();
            youTubePlayerView.addView(youTubePlayerView.f17667f);
            youTubePlayerView.removeView(youTubePlayerView.f17668g);
            youTubePlayerView.f17664c.mo3220a(youTubePlayerView);
            if (youTubePlayerView.f17671j != null) {
                boolean z = false;
                if (youTubePlayerView.f17670i != null) {
                    z = youTubePlayerView.f17666e.m23010a(youTubePlayerView.f17670i);
                    youTubePlayerView.f17670i = null;
                }
                youTubePlayerView.f17671j.mo4650a(youTubePlayerView.f17669h, youTubePlayerView.f17666e, z);
                youTubePlayerView.f17671j = null;
            }
        } catch (Throwable e) {
            aa.m12463a("Error creating YouTubePlayerView", e);
            youTubePlayerView.m22872a(YouTubeInitializationResult.INTERNAL_ERROR);
        }
    }

    /* renamed from: a */
    final void m22883a() {
        if (this.f17666e != null) {
            this.f17666e.m23011b();
        }
    }

    /* renamed from: a */
    final void m22884a(final Activity activity, C2525e c2525e, String str, C2522b c2522b, Bundle bundle) {
        if (this.f17666e != null) {
            return;
        }
        if (this.f17671j == null) {
            C2534c.m12478a((Object) activity, (Object) "activity cannot be null");
            this.f17669h = (C2525e) C2534c.m12478a((Object) c2525e, (Object) "provider cannot be null");
            this.f17671j = (C2522b) C2534c.m12478a((Object) c2522b, (Object) "listener cannot be null");
            this.f17670i = bundle;
            this.f17668g.m12544b();
            this.f17665d = C2533b.m12473a().mo3224a(getContext(), str, new C2552a(this) {
                /* renamed from: b */
                final /* synthetic */ YouTubePlayerView f17660b;

                /* renamed from: a */
                public final void mo3221a() {
                    if (this.f17660b.f17665d != null) {
                        YouTubePlayerView.m22873a(this.f17660b, activity);
                    }
                    this.f17660b.f17665d = null;
                }

                /* renamed from: b */
                public final void mo3222b() {
                    if (!(this.f17660b.f17673l || this.f17660b.f17666e == null)) {
                        this.f17660b.f17666e.m23018f();
                    }
                    this.f17660b.f17668g.m12543a();
                    if (this.f17660b.indexOfChild(this.f17660b.f17668g) < 0) {
                        this.f17660b.addView(this.f17660b.f17668g);
                        this.f17660b.removeView(this.f17660b.f17667f);
                    }
                    this.f17660b.f17667f = null;
                    this.f17660b.f17666e = null;
                    this.f17660b.f17665d = null;
                }
            }, new C41542(this));
            this.f17665d.mo3299e();
        }
    }

    /* renamed from: a */
    final void m22885a(boolean z) {
        if (!z || VERSION.SDK_INT >= 14) {
            this.f17672k = z;
            return;
        }
        aa.m12464a("Could not enable TextureView because API level is lower than 14", new Object[0]);
        this.f17672k = false;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i) {
        Collection arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i);
        arrayList.addAll(arrayList2);
        this.f17663b.clear();
        this.f17663b.addAll(arrayList2);
    }

    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        Collection arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        arrayList.addAll(arrayList2);
        this.f17663b.clear();
        this.f17663b.addAll(arrayList2);
    }

    public final void addView(View view) {
        m22871a(view);
        super.addView(view);
    }

    public final void addView(View view, int i) {
        m22871a(view);
        super.addView(view, i);
    }

    public final void addView(View view, int i, int i2) {
        m22871a(view);
        super.addView(view, i, i2);
    }

    public final void addView(View view, int i, LayoutParams layoutParams) {
        m22871a(view);
        super.addView(view, i, layoutParams);
    }

    public final void addView(View view, LayoutParams layoutParams) {
        m22871a(view);
        super.addView(view, layoutParams);
    }

    /* renamed from: b */
    final void m22886b() {
        if (this.f17666e != null) {
            this.f17666e.m23014c();
        }
    }

    /* renamed from: b */
    final void m22887b(boolean z) {
        if (this.f17666e != null) {
            this.f17666e.m23015c(z);
            m22889c(z);
        }
    }

    /* renamed from: c */
    final void m22888c() {
        if (this.f17666e != null) {
            this.f17666e.m23016d();
        }
    }

    /* renamed from: c */
    final void m22889c(boolean z) {
        this.f17673l = true;
        if (this.f17666e != null) {
            this.f17666e.m23012b(z);
        }
    }

    public final void clearChildFocus(View view) {
        if (hasFocusable()) {
            requestFocus();
        } else {
            super.clearChildFocus(view);
        }
    }

    /* renamed from: d */
    final void m22890d() {
        if (this.f17666e != null) {
            this.f17666e.m23017e();
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.f17666e != null) {
            if (keyEvent.getAction() == 0) {
                if (!this.f17666e.m23009a(keyEvent.getKeyCode(), keyEvent)) {
                    if (!super.dispatchKeyEvent(keyEvent)) {
                        return false;
                    }
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                if (!this.f17666e.m23013b(keyEvent.getKeyCode(), keyEvent)) {
                    if (!super.dispatchKeyEvent(keyEvent)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: e */
    final Bundle m22891e() {
        return this.f17666e == null ? this.f17670i : this.f17666e.m23020h();
    }

    public final void focusableViewAvailable(View view) {
        super.focusableViewAvailable(view);
        this.f17663b.add(view);
    }

    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalFocusChangeListener(this.f17662a);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f17666e != null) {
            this.f17666e.m23000a(configuration);
        }
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalFocusChangeListener(this.f17662a);
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            getChildAt(0).layout(0, 0, i3 - i, i4 - i2);
        }
    }

    protected final void onMeasure(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.measure(i, i2);
            setMeasuredDimension(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f17663b.add(view2);
    }

    public final void setClipToPadding(boolean z) {
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }
}
