package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3867b;
import com.facebook.ads.internal.view.p116f.p118b.C3868c;
import com.facebook.ads.internal.view.p116f.p118b.C3873h;
import com.facebook.ads.internal.view.p116f.p118b.C3874i;
import com.facebook.ads.internal.view.p116f.p118b.C3875j;
import com.facebook.ads.internal.view.p116f.p118b.C3876k;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.internal.view.f.c.b */
public class C4622b extends C3858c implements OnAudioFocusChangeListener {
    /* renamed from: a */
    private WeakReference<OnAudioFocusChangeListener> f19184a = null;
    /* renamed from: b */
    private final C3868c f19185b = new C46191(this);
    /* renamed from: c */
    private final C3874i f19186c = new C46202(this);
    /* renamed from: d */
    private final C3876k f19187d = new C46213(this);

    /* renamed from: com.facebook.ads.internal.view.f.c.b$1 */
    class C46191 extends C3868c {
        /* renamed from: a */
        final /* synthetic */ C4622b f19181a;

        C46191(C4622b c4622b) {
            this.f19181a = c4622b;
        }

        /* renamed from: a */
        public void m25523a(C3867b c3867b) {
            ((AudioManager) this.f19181a.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.f19181a.f19184a == null ? null : (OnAudioFocusChangeListener) this.f19181a.f19184a.get());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.b$2 */
    class C46202 extends C3874i {
        /* renamed from: a */
        final /* synthetic */ C4622b f19182a;

        C46202(C4622b c4622b) {
            this.f19182a = c4622b;
        }

        /* renamed from: a */
        public void m25525a(C3873h c3873h) {
            ((AudioManager) this.f19182a.getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.f19182a.f19184a == null ? null : (OnAudioFocusChangeListener) this.f19182a.f19184a.get());
        }
    }

    /* renamed from: com.facebook.ads.internal.view.f.c.b$3 */
    class C46213 extends C3876k {
        /* renamed from: a */
        final /* synthetic */ C4622b f19183a;

        /* renamed from: com.facebook.ads.internal.view.f.c.b$3$1 */
        class C20501 implements OnAudioFocusChangeListener {
            /* renamed from: a */
            final /* synthetic */ C46213 f6346a;

            C20501(C46213 c46213) {
                this.f6346a = c46213;
            }

            public void onAudioFocusChange(int i) {
                if (this.f6346a.f19183a.getVideoView() != null && i <= 0) {
                    this.f6346a.f19183a.getVideoView().m19258a(false);
                }
            }
        }

        C46213(C4622b c4622b) {
            this.f19183a = c4622b;
        }

        /* renamed from: a */
        public void m25527a(C3875j c3875j) {
            if (this.f19183a.f19184a == null || this.f19183a.f19184a.get() == null) {
                this.f19183a.f19184a = new WeakReference(new C20501(this));
            }
            ((AudioManager) this.f19183a.getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus((OnAudioFocusChangeListener) this.f19183a.f19184a.get(), 3, 1);
        }
    }

    public C4622b(Context context) {
        super(context);
    }

    /* renamed from: a */
    protected void mo3984a() {
        super.mo3984a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6830a(this.f19187d, this.f19185b, this.f19186c);
        }
    }

    /* renamed from: b */
    protected void mo3985b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6832b(this.f19186c, this.f19185b, this.f19187d);
        }
        super.mo3985b();
    }

    public void onAudioFocusChange(int i) {
        if (getVideoView() != null && i <= 0) {
            getVideoView().m19258a(false);
        }
    }

    protected void onDetachedFromWindow() {
        ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).abandonAudioFocus(this.f19184a == null ? null : (OnAudioFocusChangeListener) this.f19184a.get());
        super.onDetachedFromWindow();
    }
}
