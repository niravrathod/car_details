package com.facebook.ads.internal.adapters;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkActivity.C1691a;
import com.facebook.ads.internal.adapters.C4592k.C1747a;
import com.facebook.ads.internal.p081a.C1713c;
import com.facebook.ads.internal.p101q.p102a.C1936w;
import com.facebook.ads.internal.view.C1980a;
import com.facebook.ads.internal.view.C1980a.C1965a;
import com.facebook.ads.internal.view.p109b.C1991d;
import com.facebook.ads.internal.view.p110c.C1998a;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p117a.C2039b;
import com.facebook.ads.internal.view.p116f.p118b.C3885t;
import com.facebook.ads.internal.view.p116f.p119c.C3894d;
import com.facebook.ads.internal.view.p116f.p119c.C3894d.C2054a;
import com.facebook.ads.internal.view.p116f.p119c.C3899j;
import com.facebook.ads.internal.view.p116f.p119c.C3901n;
import com.facebook.ads.internal.view.p116f.p119c.C4618a.C2049a;
import com.facebook.ads.internal.view.p116f.p119c.C4630g;
import com.facebook.ads.internal.view.p116f.p119c.C4640k;
import com.facebook.ads.internal.view.p116f.p119c.C4644l;
import com.facebook.ads.internal.view.p116f.p120d.C2072d;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.internal.adapters.u */
public class C4812u extends C4596s implements OnTouchListener, C1980a {
    /* renamed from: i */
    static final /* synthetic */ boolean f21091i = (C4812u.class.desiredAssertionStatus() ^ 1);
    /* renamed from: j */
    private static final String f21092j = C4812u.class.getSimpleName();
    /* renamed from: A */
    private int f21093A = -12286980;
    /* renamed from: B */
    private boolean f21094B = false;
    /* renamed from: C */
    private C2038a f21095C;
    /* renamed from: f */
    final int f21096f = 64;
    /* renamed from: g */
    final int f21097g = 64;
    /* renamed from: h */
    final int f21098h = 16;
    /* renamed from: k */
    private C1965a f21099k;
    /* renamed from: l */
    private Activity f21100l;
    /* renamed from: m */
    private C1691a f21101m = new C37881(this);
    /* renamed from: n */
    private final OnTouchListener f21102n = new C17562(this);
    /* renamed from: o */
    private C1747a f21103o = C1747a.UNSPECIFIED;
    /* renamed from: p */
    private C1998a f21104p;
    /* renamed from: q */
    private TextView f21105q;
    /* renamed from: r */
    private TextView f21106r;
    /* renamed from: s */
    private ImageView f21107s;
    /* renamed from: t */
    private C2049a f21108t;
    /* renamed from: u */
    private C3901n f21109u;
    /* renamed from: v */
    private ViewGroup f21110v;
    /* renamed from: w */
    private C3894d f21111w;
    /* renamed from: x */
    private C3899j f21112x;
    /* renamed from: y */
    private int f21113y = -1;
    /* renamed from: z */
    private int f21114z = -10525069;

    /* renamed from: com.facebook.ads.internal.adapters.u$2 */
    class C17562 implements OnTouchListener {
        /* renamed from: a */
        final /* synthetic */ C4812u f5299a;

        C17562(C4812u c4812u) {
            this.f5299a = c4812u;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return true;
            }
            if (this.f5299a.f21112x != null) {
                if (!this.f5299a.f21112x.m19358a()) {
                    return true;
                }
                if (!(this.f5299a.f21112x.getSkipSeconds() == 0 || this.f5299a.b == null)) {
                    this.f5299a.b.m19260c();
                }
                if (this.f5299a.b != null) {
                    this.f5299a.b.m19261d();
                }
            }
            this.f5299a.f21100l.finish();
            return true;
        }
    }

    /* renamed from: com.facebook.ads.internal.adapters.u$1 */
    class C37881 implements C1691a {
        /* renamed from: a */
        final /* synthetic */ C4812u f15169a;

        C37881(C4812u c4812u) {
            this.f15169a = c4812u;
        }

        /* renamed from: a */
        public boolean mo1343a() {
            if (this.f15169a.f21112x == null) {
                return false;
            }
            if (!this.f15169a.f21112x.m19358a()) {
                return true;
            }
            if (!(this.f15169a.f21112x.getSkipSeconds() == 0 || this.f15169a.b == null)) {
                this.f15169a.b.m19260c();
            }
            if (this.f15169a.b != null) {
                this.f15169a.b.m19261d();
            }
            return false;
        }
    }

    /* renamed from: a */
    private void m27893a(int i) {
        View view;
        int i2;
        int i3 = i;
        float f = C1936w.f5934b;
        int i4 = (int) (56.0f * f);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams(i4, i4);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i5 = (int) (16.0f * f);
        this.f21112x.setPadding(i5, i5, i5, i5);
        this.f21112x.setLayoutParams(layoutParams);
        C2054a c2054a = mo4663j() ? C2054a.FADE_OUT_ON_PLAY : C2054a.VISIBLE;
        int id = r0.b.getId();
        Drawable gradientDrawable;
        LayoutParams layoutParams2;
        int i6;
        if (i3 == 1 && (m27898o() || m27899p())) {
            gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
            gradientDrawable.setCornerRadius(0.0f);
            LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(10);
            r0.b.setLayoutParams(layoutParams3);
            m27894a(r0.b);
            m27894a(r0.f21112x);
            if (r0.f21108t != null) {
                m27894a(r0.f21108t);
            }
            layoutParams3 = new RelativeLayout.LayoutParams(-1, (int) (((float) (((((r0.f21104p != null ? 64 : 0) + 60) + 16) + 16) + 16)) * f));
            layoutParams3.addRule(12);
            View relativeLayout = new RelativeLayout(r0.d);
            C1936w.m7329a(relativeLayout, gradientDrawable);
            relativeLayout.setLayoutParams(layoutParams3);
            relativeLayout.setPadding(i5, 0, i5, (int) (((float) (((r0.f21104p != null ? 64 : 0) + 16) + 16)) * f));
            r0.f21110v = relativeLayout;
            if (!r0.f21094B) {
                r0.f21111w.m19330a(relativeLayout, c2054a);
            }
            m27894a(relativeLayout);
            if (r0.f21109u != null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (6.0f * f));
                layoutParams2.addRule(12);
                layoutParams2.topMargin = (int) (-6.0f * f);
                r0.f21109u.setLayoutParams(layoutParams2);
                m27894a(r0.f21109u);
            }
            if (r0.f21104p != null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (64.0f * f));
                layoutParams2.bottomMargin = i5;
                layoutParams2.leftMargin = i5;
                layoutParams2.rightMargin = i5;
                layoutParams2.addRule(1);
                layoutParams2.addRule(12);
                r0.f21104p.setLayoutParams(layoutParams2);
                m27894a(r0.f21104p);
            }
            if (r0.f21107s != null) {
                i6 = (int) (60.0f * f);
                layoutParams2 = new RelativeLayout.LayoutParams(i6, i6);
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
                r0.f21107s.setLayoutParams(layoutParams2);
                m27895a(relativeLayout, r0.f21107s);
            }
            if (r0.f21105q != null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.bottomMargin = (int) (36.0f * f);
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
                r0.f21105q.setEllipsize(TruncateAt.END);
                r0.f21105q.setGravity(8388611);
                r0.f21105q.setLayoutParams(layoutParams2);
                r0.f21105q.setMaxLines(1);
                r0.f21105q.setPadding((int) (72.0f * f), 0, 0, 0);
                r0.f21105q.setTextColor(-1);
                r0.f21105q.setTextSize(18.0f);
                m27895a(relativeLayout, r0.f21105q);
            }
            if (r0.f21106r != null) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
                layoutParams2.bottomMargin = (int) (4.0f * f);
                r0.f21106r.setEllipsize(TruncateAt.END);
                r0.f21106r.setGravity(8388611);
                r0.f21106r.setLayoutParams(layoutParams2);
                r0.f21106r.setMaxLines(1);
                r0.f21106r.setPadding((int) (f * 72.0f), 0, 0, 0);
                r0.f21106r.setTextColor(-1);
                m27895a(relativeLayout, r0.f21106r);
            }
            view = (View) r0.b.getParent();
            i2 = -16777216;
        } else {
            if (i3 == 1) {
                layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(10);
                r0.b.setLayoutParams(layoutParams2);
                m27894a(r0.b);
                m27894a(r0.f21112x);
                if (r0.f21108t != null) {
                    m27894a(r0.f21108t);
                }
                view = new LinearLayout(r0.d);
                r0.f21110v = view;
                view.setGravity(112);
                view.setOrientation(1);
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                i4 = (int) (33.0f * f);
                layoutParams.leftMargin = i4;
                layoutParams.rightMargin = i4;
                layoutParams.topMargin = (int) (8.0f * f);
                if (r0.f21104p == null) {
                    layoutParams.bottomMargin = i5;
                } else {
                    layoutParams.bottomMargin = (int) (f * 80.0f);
                }
                layoutParams.addRule(3, id);
                view.setLayoutParams(layoutParams);
                m27894a(view);
                if (r0.f21104p != null) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, (int) (f * 64.0f));
                    layoutParams.bottomMargin = i5;
                    layoutParams.leftMargin = i4;
                    layoutParams.rightMargin = i4;
                    layoutParams.addRule(1);
                    layoutParams.addRule(12);
                    r0.f21104p.setLayoutParams(layoutParams);
                    m27894a(r0.f21104p);
                }
                if (r0.f21105q != null) {
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.weight = 2.0f;
                    layoutParams.gravity = 17;
                    r0.f21105q.setEllipsize(TruncateAt.END);
                    r0.f21105q.setGravity(17);
                    r0.f21105q.setLayoutParams(layoutParams);
                    r0.f21105q.setMaxLines(2);
                    r0.f21105q.setPadding(0, 0, 0, 0);
                    r0.f21105q.setTextColor(r0.f21114z);
                    r0.f21105q.setTextSize(24.0f);
                    m27895a(view, r0.f21105q);
                }
                if (r0.f21107s != null) {
                    i4 = (int) (64.0f * f);
                    layoutParams = new LinearLayout.LayoutParams(i4, i4);
                    layoutParams.weight = 0.0f;
                    layoutParams.gravity = 17;
                    r0.f21107s.setLayoutParams(layoutParams);
                    m27895a(view, r0.f21107s);
                }
                if (r0.f21106r != null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.weight = 2.0f;
                    layoutParams.gravity = 16;
                    r0.f21106r.setEllipsize(TruncateAt.END);
                    r0.f21106r.setGravity(16);
                    r0.f21106r.setLayoutParams(layoutParams);
                    r0.f21106r.setMaxLines(2);
                    r0.f21106r.setPadding(0, 0, 0, 0);
                    r0.f21106r.setTextColor(r0.f21114z);
                    m27895a(view, r0.f21106r);
                }
                if (r0.f21109u != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams2.addRule(3, id);
                    r0.f21109u.setLayoutParams(layoutParams2);
                    view = r0.f21109u;
                }
                view = (View) r0.b.getParent();
                i2 = r0.f21113y;
            } else if (!m27900q() || m27899p()) {
                TextView textView;
                int i7;
                gradientDrawable = new GradientDrawable(Orientation.TOP_BOTTOM, new int[]{0, -15658735});
                gradientDrawable.setCornerRadius(0.0f);
                r0.b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
                m27894a(r0.b);
                m27894a(r0.f21112x);
                if (r0.f21108t != null) {
                    m27894a(r0.f21108t);
                }
                LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, (int) (124.0f * f));
                layoutParams4.addRule(12);
                View relativeLayout2 = new RelativeLayout(r0.d);
                C1936w.m7329a(relativeLayout2, gradientDrawable);
                relativeLayout2.setLayoutParams(layoutParams4);
                relativeLayout2.setPadding(i5, 0, i5, i5);
                r0.f21110v = relativeLayout2;
                if (!r0.f21094B) {
                    r0.f21111w.m19330a(relativeLayout2, c2054a);
                }
                m27894a(relativeLayout2);
                if (r0.f21104p != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams((int) (110.0f * f), i4);
                    layoutParams2.rightMargin = i5;
                    layoutParams2.bottomMargin = i5;
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(11);
                    r0.f21104p.setLayoutParams(layoutParams2);
                    m27894a(r0.f21104p);
                }
                if (r0.f21107s != null) {
                    i6 = (int) (64.0f * f);
                    layoutParams2 = new RelativeLayout.LayoutParams(i6, i6);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(9);
                    layoutParams2.bottomMargin = (int) (8.0f * f);
                    r0.f21107s.setLayoutParams(layoutParams2);
                    m27895a(relativeLayout2, r0.f21107s);
                }
                if (r0.f21105q != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = (int) (48.0f * f);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(9);
                    r0.f21105q.setEllipsize(TruncateAt.END);
                    r0.f21105q.setGravity(8388611);
                    r0.f21105q.setLayoutParams(layoutParams2);
                    r0.f21105q.setMaxLines(1);
                    textView = r0.f21105q;
                    i6 = (int) (f * 80.0f);
                    if (r0.f21104p != null) {
                        i7 = (int) (126.0f * f);
                        i4 = 0;
                    } else {
                        i4 = 0;
                        i7 = 0;
                    }
                    textView.setPadding(i6, i4, i7, i4);
                    r0.f21105q.setTextColor(-1);
                    r0.f21105q.setTextSize(24.0f);
                    m27895a(relativeLayout2, r0.f21105q);
                }
                if (r0.f21106r != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(9);
                    r0.f21106r.setEllipsize(TruncateAt.END);
                    r0.f21106r.setGravity(8388611);
                    r0.f21106r.setLayoutParams(layoutParams2);
                    r0.f21106r.setMaxLines(2);
                    r0.f21106r.setTextColor(-1);
                    textView = r0.f21106r;
                    i6 = (int) (f * 80.0f);
                    if (r0.f21104p != null) {
                        i7 = (int) (126.0f * f);
                        i4 = 0;
                    } else {
                        i4 = 0;
                        i7 = 0;
                    }
                    textView.setPadding(i6, i4, i7, i4);
                    m27895a(relativeLayout2, r0.f21106r);
                }
                if (r0.f21109u != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams2.addRule(12);
                    r0.f21109u.setLayoutParams(layoutParams2);
                    m27894a(r0.f21109u);
                }
                view = (View) r0.b.getParent();
                i2 = -16777216;
            } else {
                layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
                layoutParams2.addRule(9);
                r0.b.setLayoutParams(layoutParams2);
                m27894a(r0.b);
                m27894a(r0.f21112x);
                if (r0.f21108t != null) {
                    m27894a(r0.f21108t);
                }
                view = new LinearLayout(r0.d);
                r0.f21110v = view;
                view.setGravity(112);
                view.setOrientation(1);
                layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.leftMargin = i5;
                layoutParams.rightMargin = i5;
                layoutParams.topMargin = (int) (8.0f * f);
                layoutParams.bottomMargin = (int) (f * 80.0f);
                layoutParams.addRule(1, id);
                view.setLayoutParams(layoutParams);
                m27894a(view);
                if (r0.f21109u != null) {
                    layoutParams = new RelativeLayout.LayoutParams(-1, (int) (f * 6.0f));
                    layoutParams.addRule(5, id);
                    layoutParams.addRule(7, id);
                    layoutParams.addRule(3, id);
                    layoutParams.topMargin = (int) (-6.0f * f);
                    r0.f21109u.setLayoutParams(layoutParams);
                    m27894a(r0.f21109u);
                }
                if (r0.f21105q != null) {
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.weight = 2.0f;
                    layoutParams.gravity = 17;
                    r0.f21105q.setEllipsize(TruncateAt.END);
                    r0.f21105q.setGravity(17);
                    r0.f21105q.setLayoutParams(layoutParams);
                    r0.f21105q.setMaxLines(10);
                    r0.f21105q.setPadding(0, 0, 0, 0);
                    r0.f21105q.setTextColor(r0.f21114z);
                    r0.f21105q.setTextSize(24.0f);
                    m27895a(view, r0.f21105q);
                }
                if (r0.f21107s != null) {
                    i4 = (int) (f * 64.0f);
                    layoutParams = new LinearLayout.LayoutParams(i4, i4);
                    layoutParams.weight = 0.0f;
                    layoutParams.gravity = 17;
                    r0.f21107s.setLayoutParams(layoutParams);
                    m27895a(view, r0.f21107s);
                }
                if (r0.f21106r != null) {
                    layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.weight = 2.0f;
                    layoutParams.gravity = 16;
                    r0.f21106r.setEllipsize(TruncateAt.END);
                    r0.f21106r.setGravity(17);
                    r0.f21106r.setLayoutParams(layoutParams);
                    r0.f21106r.setMaxLines(10);
                    r0.f21106r.setPadding(0, 0, 0, 0);
                    r0.f21106r.setTextColor(r0.f21114z);
                    m27895a(view, r0.f21106r);
                }
                if (r0.f21104p != null) {
                    layoutParams2 = new RelativeLayout.LayoutParams(-1, (int) (f * 64.0f));
                    layoutParams2.bottomMargin = i5;
                    layoutParams2.leftMargin = i5;
                    layoutParams2.rightMargin = i5;
                    layoutParams2.addRule(1);
                    layoutParams2.addRule(12);
                    layoutParams2.addRule(1, id);
                    r0.f21104p.setLayoutParams(layoutParams2);
                    view = r0.f21104p;
                }
                view = (View) r0.b.getParent();
                i2 = r0.f21113y;
            }
            m27894a(view);
            view = (View) r0.b.getParent();
            i2 = r0.f21113y;
        }
        C1936w.m7328a(view, i2);
        view = r0.b.getRootView();
        if (view != null) {
            view.setOnTouchListener(r0);
        }
    }

    /* renamed from: a */
    private void m27894a(View view) {
        if (this.f21099k != null) {
            this.f21099k.mo1279a(view);
        }
    }

    /* renamed from: a */
    private void m27895a(ViewGroup viewGroup, View view) {
        if (viewGroup != null) {
            viewGroup.addView(view);
        }
    }

    /* renamed from: b */
    private void m27897b(View view) {
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: o */
    private boolean m27898o() {
        return ((double) (this.b.getVideoHeight() > 0 ? ((float) this.b.getVideoWidth()) / ((float) this.b.getVideoHeight()) : -1.0f)) <= 0.9d;
    }

    /* renamed from: p */
    private boolean m27899p() {
        boolean z = false;
        if (this.b.getVideoHeight() <= 0) {
            return false;
        }
        Rect rect = new Rect();
        this.f21100l.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.width() > rect.height()) {
            if (((float) (rect.width() - ((rect.height() * this.b.getVideoWidth()) / this.b.getVideoHeight()))) - (C1936w.f5934b * 192.0f) < 0.0f) {
                z = true;
            }
            return z;
        }
        if (((((float) (rect.height() - ((rect.width() * this.b.getVideoHeight()) / this.b.getVideoWidth()))) - (C1936w.f5934b * 64.0f)) - (C1936w.f5934b * 64.0f)) - (C1936w.f5934b * 40.0f) < 0.0f) {
            z = true;
        }
        return z;
    }

    /* renamed from: q */
    private boolean m27900q() {
        double videoWidth = (double) (this.b.getVideoHeight() > 0 ? ((float) this.b.getVideoWidth()) / ((float) this.b.getVideoHeight()) : -1.0f);
        return videoWidth > 0.9d && videoWidth < 1.1d;
    }

    /* renamed from: r */
    private void m27901r() {
        m27897b(this.b);
        m27897b(this.f21104p);
        m27897b(this.f21105q);
        m27897b(this.f21106r);
        m27897b(this.f21107s);
        m27897b(this.f21109u);
        m27897b(this.f21110v);
        m27897b(this.f21112x);
        if (this.f21108t != null) {
            m27897b(this.f21108t);
        }
    }

    /* renamed from: a */
    protected void mo4662a() {
        if (this.c == null) {
            Log.e(f21092j, "Unable to add UI without a valid ad response.");
            return;
        }
        JSONObject jSONObject;
        String string = this.c.getString("ct");
        String optString = this.c.getJSONObject("context").optString("orientation");
        if (!optString.isEmpty()) {
            this.f21103o = C1747a.m6624a(Integer.parseInt(optString));
        }
        if (this.c.has("layout") && !this.c.isNull("layout")) {
            jSONObject = this.c.getJSONObject("layout");
            this.f21113y = (int) jSONObject.optLong("bgColor", (long) this.f21113y);
            this.f21114z = (int) jSONObject.optLong("textColor", (long) this.f21114z);
            this.f21093A = (int) jSONObject.optLong("accentColor", (long) this.f21093A);
            this.f21094B = jSONObject.optBoolean("persistentAdDetails", this.f21094B);
        }
        jSONObject = this.c.getJSONObject("text");
        this.b.setId(VERSION.SDK_INT >= 17 ? View.generateViewId() : C1936w.m7325a());
        int c = m25375c();
        Context context = this.d;
        if (c < 0) {
            c = 0;
        }
        this.f21112x = new C3899j(context, c, this.f21093A);
        this.f21112x.setOnTouchListener(this.f21102n);
        this.b.m19256a(this.f21112x);
        if (this.c.has("cta") && !this.c.isNull("cta")) {
            JSONObject jSONObject2 = this.c.getJSONObject("cta");
            this.f21104p = new C1998a(this.d, jSONObject2.getString(ImagesContract.URL), jSONObject2.getString("text"), this.f21093A, this.b, this.a, string);
            C1713c.m6462a(this.d, this.a, string, Uri.parse(jSONObject2.getString(ImagesContract.URL)), new HashMap());
        }
        if (this.c.has("icon") && !this.c.isNull("icon")) {
            JSONObject jSONObject3 = this.c.getJSONObject("icon");
            this.f21107s = new ImageView(this.d);
            new C1991d(this.f21107s).m7500a((int) (C1936w.f5934b * 64.0f), (int) (C1936w.f5934b * 64.0f)).m7503a(jSONObject3.getString(ImagesContract.URL));
        }
        if (this.c.has("image") && !this.c.isNull("image")) {
            jSONObject3 = this.c.getJSONObject("image");
            C2039b c4630g = new C4630g(this.d);
            this.b.m19256a(c4630g);
            c4630g.setImage(jSONObject3.getString(ImagesContract.URL));
        }
        CharSequence optString2 = jSONObject.optString("title");
        if (!optString2.isEmpty()) {
            this.f21105q = new TextView(this.d);
            this.f21105q.setText(optString2);
            this.f21105q.setTypeface(Typeface.defaultFromStyle(1));
        }
        CharSequence optString3 = jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET);
        if (!optString3.isEmpty()) {
            this.f21106r = new TextView(this.d);
            this.f21106r.setText(optString3);
            this.f21106r.setTextSize(16.0f);
        }
        this.f21109u = new C3901n(this.d);
        this.b.m19256a(this.f21109u);
        Object f = m25377f();
        if (!TextUtils.isEmpty(f)) {
            this.f21108t = new C2049a(this.d, "AdChoices", f, new float[]{0.0f, 0.0f, 8.0f, 0.0f}, string);
            LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(10);
            layoutParams.addRule(9);
            this.f21108t.setLayoutParams(layoutParams);
        }
        this.b.m19256a(new C4640k(this.d));
        C2039b c4644l = new C4644l(this.d);
        this.b.m19256a(c4644l);
        C2054a c2054a = mo4663j() ? C2054a.FADE_OUT_ON_PLAY : C2054a.VISIBLE;
        this.b.m19256a(new C3894d(c4644l, c2054a));
        this.f21111w = new C3894d(new RelativeLayout(this.d), c2054a);
        this.b.m19256a(this.f21111w);
    }

    @TargetApi(17)
    /* renamed from: a */
    public void mo1420a(Intent intent, Bundle bundle, AudienceNetworkActivity audienceNetworkActivity) {
        this.f21100l = audienceNetworkActivity;
        if (!f21091i) {
            if (this.f21099k == null) {
                throw new AssertionError();
            }
        }
        audienceNetworkActivity.m6412a(this.f21101m);
        m27901r();
        m27893a(this.f21100l.getResources().getConfiguration().orientation);
        if (mo4663j()) {
            mo3972g();
        } else {
            m25379h();
        }
    }

    /* renamed from: a */
    public void m27904a(Configuration configuration) {
        m27901r();
        m27893a(configuration.orientation);
    }

    /* renamed from: a */
    public void mo1421a(Bundle bundle) {
    }

    /* renamed from: e */
    public void mo3946e() {
        if (!(this.c == null || this.a == null)) {
            Object optString = this.c.optString("ct");
            if (!TextUtils.isEmpty(optString)) {
                this.a.mo1364i(optString, new HashMap());
            }
        }
        if (this.b != null) {
            this.b.m19261d();
        }
        C4592k.m25303a((C1980a) this);
    }

    /* renamed from: j */
    protected boolean mo4663j() {
        if (!f21091i) {
            if (this.c == null) {
                throw new AssertionError();
            }
        }
        try {
            return this.c.getJSONObject("video").getBoolean(FacebookAdapter.KEY_AUTOPLAY);
        } catch (Throwable e) {
            Log.w(String.valueOf(C4812u.class), "Invalid JSON", e);
            return true;
        }
    }

    /* renamed from: k */
    public void mo1423k() {
        if (this.b != null && this.b.getState() == C2072d.STARTED) {
            this.f21095C = this.b.getVideoStartReason();
            this.b.m19258a(false);
        }
    }

    /* renamed from: l */
    public void mo1424l() {
        if (this.b != null && this.f21095C != null) {
            this.b.m19255a(this.f21095C);
        }
    }

    /* renamed from: m */
    public C1747a m27910m() {
        return this.f21103o;
    }

    /* renamed from: n */
    public void m27911n() {
        if (this.f21100l != null) {
            this.f21100l.finish();
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.b != null) {
            this.b.getEventBus().m6829a(new C3885t(view, motionEvent));
        }
        return true;
    }

    public void setListener(C1965a c1965a) {
        this.f21099k = c1965a;
    }
}
