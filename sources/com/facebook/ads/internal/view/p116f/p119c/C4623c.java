package com.facebook.ads.internal.view.p116f.p119c;

import android.content.Context;
import android.widget.TextView;
import com.facebook.ads.internal.p091j.C1817f;
import com.facebook.ads.internal.view.p116f.p117a.C3858c;
import com.facebook.ads.internal.view.p116f.p118b.C3879n;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.internal.view.f.c.c */
public class C4623c extends C3858c {
    /* renamed from: a */
    private final TextView f19188a;
    /* renamed from: b */
    private final String f19189b;
    /* renamed from: c */
    private final C1817f<C3879n> f19190c = new C38931(this);

    /* renamed from: com.facebook.ads.internal.view.f.c.c$1 */
    class C38931 extends C1817f<C3879n> {
        /* renamed from: a */
        final /* synthetic */ C4623c f15436a;

        C38931(C4623c c4623c) {
            this.f15436a = c4623c;
        }

        /* renamed from: a */
        public Class<C3879n> mo1340a() {
            return C3879n.class;
        }

        /* renamed from: a */
        public void m19315a(C3879n c3879n) {
            if (this.f15436a.getVideoView() != null) {
                this.f15436a.f19188a.setText(this.f15436a.m25535a((long) (this.f15436a.getVideoView().getDuration() - this.f15436a.getVideoView().getCurrentPositionInMillis())));
            }
        }
    }

    public C4623c(Context context, String str) {
        super(context);
        this.f19188a = new TextView(context);
        this.f19189b = str;
        addView(this.f19188a);
    }

    /* renamed from: a */
    private String m25535a(long j) {
        if (j <= 0) {
            return "00:00";
        }
        long toMinutes = TimeUnit.MILLISECONDS.toMinutes(j);
        j = TimeUnit.MILLISECONDS.toSeconds(j % 60000);
        if (this.f19189b.isEmpty()) {
            return String.format("%02d:%02d", new Object[]{Long.valueOf(toMinutes), Long.valueOf(j)});
        }
        return this.f19189b.replace("{{REMAINING_TIME}}", String.format("%02d:%02d", new Object[]{Long.valueOf(toMinutes), Long.valueOf(j)}));
    }

    /* renamed from: a */
    protected void mo3984a() {
        super.mo3984a();
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6831a(this.f19190c);
        }
    }

    /* renamed from: b */
    protected void mo3985b() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().m6833b(this.f19190c);
        }
        super.mo3985b();
    }

    public void setCountdownTextColor(int i) {
        this.f19188a.setTextColor(i);
    }
}
