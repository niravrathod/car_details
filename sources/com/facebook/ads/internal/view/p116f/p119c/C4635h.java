package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.p116f.C3859a;
import com.facebook.ads.internal.view.p116f.p117a.C2038a;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;
import com.facebook.ads.internal.view.p116f.p118b.C3877l;
import com.facebook.ads.internal.view.p116f.p118b.C3878m;
import com.facebook.ads.internal.view.p116f.p120d.C2072d;

/* renamed from: com.facebook.ads.internal.view.f.c.h */
public class C4635h extends C3858c implements OnTouchListener {
    /* renamed from: a */
    private final C3878m f19209a;
    /* renamed from: b */
    private final C3874i f19210b;
    /* renamed from: c */
    private final C3876k f19211c;
    /* renamed from: d */
    private final C3868c f19212d;
    /* renamed from: e */
    private final C2063m f19213e;

    /* renamed from: com.facebook.ads.internal.view.f.c.h$1 */
    class C46311 extends C3878m {
        /* renamed from: a */
        final /* synthetic */ C4635h f19205a;

        C46311(C4635h c4635h) {
            this.f19205a = c4635h;
        }

        /* renamed from: a */
        public void m25563a(C3877l c3877l) {
            this.f19205a.setVisibility(0);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.h$2 */
    class C46322 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C4635h f19206a;

        C46322(C4635h c4635h) {
            this.f19206a = c4635h;
        }

        /* renamed from: a */
        public void m25565a(C3873h c3873h) {
            this.f19206a.f19213e.setChecked(true);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.h$3 */
    class C46333 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C4635h f19207a;

        C46333(C4635h c4635h) {
            this.f19207a = c4635h;
        }

        /* renamed from: a */
        public void m25567a(C3875j c3875j) {
            this.f19207a.f19213e.setChecked(false);
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.h$4 */
    class C46344 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C4635h f19208a;

        C46344(C4635h c4635h) {
            this.f19208a = c4635h;
        }

        /* renamed from: a */
        public void m25569a(C3867b c3867b) {
            this.f19208a.f19213e.setChecked(true);
        }
    }

    public C4635h(Context context) {
        this(context, null);
    }

    public C4635h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C4635h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19209a = new C46311(this);
        this.f19210b = new C46322(this);
        this.f19211c = new C46333(this);
        this.f19212d = new C46344(this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f19213e = new C2063m(context);
        this.f19213e.setChecked(true);
        LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.f19213e, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    /* renamed from: a */
    protected void mo3984a() {
        super.mo3984a();
        this.f19213e.setOnTouchListener(this);
        setOnTouchListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6830a(this.f19209a, this.f19212d, this.f19210b, this.f19211c);
        }
    }

    /* renamed from: b */
    protected void mo3985b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6832b(this.f19211c, this.f19210b, this.f19212d, this.f19209a);
        }
        setOnTouchListener(null);
        this.f19213e.setOnTouchListener(null);
        super.mo3985b();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return false;
        }
        C3859a videoView = getVideoView();
        if (videoView == null) {
            return false;
        }
        if (!(videoView.getState() == C2072d.PREPARED || videoView.getState() == C2072d.PAUSED)) {
            if (videoView.getState() != C2072d.PLAYBACK_COMPLETED) {
                if (videoView.getState() == C2072d.STARTED) {
                    videoView.m19258a(true);
                }
                return false;
            }
        }
        videoView.m19255a(C2038a.USER_STARTED);
        return true;
    }
}
