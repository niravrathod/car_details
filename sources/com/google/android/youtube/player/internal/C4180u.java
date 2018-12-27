package com.google.android.youtube.player.internal;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.KeyEvent;
import android.view.View;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.C2521a;
import com.google.android.youtube.player.YouTubePlayer.C2523c;
import com.google.android.youtube.player.YouTubePlayer.C2524d;
import com.google.android.youtube.player.internal.C2537h.C4163a;
import com.google.android.youtube.player.internal.C2539j.C4167a;
import com.google.android.youtube.player.internal.C2540k.C4169a;
import java.util.List;

/* renamed from: com.google.android.youtube.player.internal.u */
public final class C4180u implements YouTubePlayer {
    /* renamed from: a */
    private C4157e f17700a;
    /* renamed from: b */
    private C2536g f17701b;

    public C4180u(C4157e c4157e, C2536g c2536g) {
        this.f17700a = (C4157e) C2534c.m12478a((Object) c4157e, (Object) "connectionClient cannot be null");
        this.f17701b = (C2536g) C2534c.m12478a((Object) c2536g, (Object) "embeddedPlayer cannot be null");
    }

    /* renamed from: a */
    public final View m22998a() {
        try {
            return (View) C4721y.m27414a(this.f17701b.mo3269s());
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final void mo3300a(int i) {
        try {
            this.f17701b.mo3248c(i);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final void m23000a(Configuration configuration) {
        try {
            this.f17701b.mo3229a(configuration);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final void mo3301a(final C2521a c2521a) {
        try {
            this.f17701b.mo3230a(new C4163a(this) {
                /* renamed from: b */
                final /* synthetic */ C4180u f20769b;

                /* renamed from: a */
                public final void mo3270a(boolean z) {
                    c2521a.mo1237a(z);
                }
            });
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final void mo3302a(final C2523c c2523c) {
        try {
            this.f17701b.mo3232a(new C4167a(this) {
                /* renamed from: b */
                final /* synthetic */ C4180u f20773b;

                /* renamed from: a */
                public final void mo3276a() {
                    c2523c.mo1241b();
                }

                /* renamed from: a */
                public final void mo3277a(String str) {
                    c2523c.mo1240a(str);
                }

                /* renamed from: b */
                public final void mo3278b() {
                    c2523c.mo1238a();
                }

                /* renamed from: b */
                public final void mo3279b(java.lang.String r2) {
                    /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
                    /*
                    r1 = this;
                    r2 = com.google.android.youtube.player.YouTubePlayer.ErrorReason.valueOf(r2);	 Catch:{ IllegalArgumentException -> 0x0005, IllegalArgumentException -> 0x0005 }
                    goto L_0x0007;
                L_0x0005:
                    r2 = com.google.android.youtube.player.YouTubePlayer.ErrorReason.UNKNOWN;
                L_0x0007:
                    r0 = r3;
                    r0.mo1239a(r2);
                    return;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.u.3.b(java.lang.String):void");
                }

                /* renamed from: c */
                public final void mo3280c() {
                    c2523c.mo1242c();
                }

                /* renamed from: d */
                public final void mo3281d() {
                    c2523c.mo1243d();
                }
            });
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final void mo3303a(final C2524d c2524d) {
        try {
            this.f17701b.mo3233a(new C4169a(this) {
                /* renamed from: b */
                final /* synthetic */ C4180u f20771b;

                /* renamed from: a */
                public final void mo3282a() {
                    c2524d.mo1245b();
                }

                /* renamed from: b */
                public final void mo3283b() {
                    c2524d.mo1246c();
                }

                /* renamed from: c */
                public final void mo3284c() {
                    c2524d.mo1244a();
                }
            });
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final void mo3304a(String str) {
        m23005a(str, 0);
    }

    /* renamed from: a */
    public final void m23005a(String str, int i) {
        try {
            this.f17701b.mo3243b(str, i);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final void mo3305a(List<String> list) {
        m23007a(list, 0, 0);
    }

    /* renamed from: a */
    public final void m23007a(List<String> list, int i, int i2) {
        try {
            this.f17701b.mo3245b((List) list, i, i2);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final void mo3306a(boolean z) {
        try {
            this.f17701b.mo3246b(z);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final boolean m23009a(int i, KeyEvent keyEvent) {
        try {
            return this.f17701b.mo3239a(i, keyEvent);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: a */
    public final boolean m23010a(Bundle bundle) {
        try {
            return this.f17701b.mo3240a(bundle);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: b */
    public final void m23011b() {
        try {
            this.f17701b.mo3263m();
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: b */
    public final void m23012b(boolean z) {
        try {
            this.f17701b.mo3238a(z);
            this.f17700a.mo4409a(z);
            this.f17700a.mo3298d();
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: b */
    public final boolean m23013b(int i, KeyEvent keyEvent) {
        try {
            return this.f17701b.mo3247b(i, keyEvent);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: c */
    public final void m23014c() {
        try {
            this.f17701b.mo3264n();
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: c */
    public final void m23015c(boolean z) {
        try {
            this.f17701b.mo3254e(z);
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: d */
    public final void m23016d() {
        try {
            this.f17701b.mo3265o();
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: e */
    public final void m23017e() {
        try {
            this.f17701b.mo3266p();
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: f */
    public final void m23018f() {
        try {
            this.f17701b.mo3267q();
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: g */
    public final void m23019g() {
        try {
            this.f17701b.mo3262l();
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }

    /* renamed from: h */
    public final Bundle m23020h() {
        try {
            return this.f17701b.mo3268r();
        } catch (RemoteException e) {
            throw new C2546q(e);
        }
    }
}
