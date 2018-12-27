package com.cuvora.carinfo.videomodule.ui.fragment;

import android.arch.lifecycle.C0023f;
import android.arch.lifecycle.C0028l;
import android.arch.lifecycle.C3006k;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.C1587a;
import com.feedbox.C2109c;
import com.google.android.youtube.player.C2530c;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.C2521a;
import com.google.android.youtube.player.YouTubePlayer.C2522b;
import com.google.android.youtube.player.YouTubePlayer.C2523c;
import com.google.android.youtube.player.YouTubePlayer.C2524d;
import com.google.android.youtube.player.YouTubePlayer.C2525e;
import com.google.android.youtube.player.YouTubePlayer.ErrorReason;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.C2888j;

/* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.c */
public final class C4811c extends C4577a implements C2522b {
    /* renamed from: a */
    public static final C1604b f21074a = new C1604b();
    /* renamed from: b */
    private C3006k<String> f21075b = new C3006k();
    /* renamed from: c */
    private C3006k<ArrayList<String>> f21076c = new C3006k();
    /* renamed from: d */
    private C3006k<Boolean> f21077d = new C3006k();
    /* renamed from: e */
    private YouTubePlayer f21078e;
    /* renamed from: f */
    private C1603a f21079f;
    /* renamed from: g */
    private HashMap f21080g;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.c$a */
    public interface C1603a {
        /* renamed from: b */
        void mo5043b(boolean z);

        /* renamed from: q */
        void mo5044q();
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.c$b */
    public static final class C1604b {
        private C1604b() {
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.c$c */
    static final class C3724c implements C2521a {
        /* renamed from: a */
        final /* synthetic */ C4811c f14947a;

        C3724c(C4811c c4811c) {
            this.f14947a = c4811c;
        }

        /* renamed from: a */
        public final void mo1237a(boolean z) {
            C1603a d = this.f14947a.m27881d();
            if (d != null) {
                d.mo5043b(z);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.c$d */
    public static final class C3725d implements C2523c {
        /* renamed from: a */
        final /* synthetic */ C4811c f14948a;

        /* renamed from: a */
        public void mo1238a() {
        }

        /* renamed from: a */
        public void mo1239a(ErrorReason errorReason) {
        }

        /* renamed from: a */
        public void mo1240a(String str) {
        }

        /* renamed from: b */
        public void mo1241b() {
        }

        /* renamed from: d */
        public void mo1243d() {
        }

        C3725d(C4811c c4811c) {
            this.f14948a = c4811c;
        }

        /* renamed from: c */
        public void mo1242c() {
            C1603a d = this.f14948a.m27881d();
            if (d != null) {
                d.mo5044q();
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.c$e */
    public static final class C3726e implements C2524d {
        /* renamed from: a */
        public void mo1244a() {
        }

        /* renamed from: b */
        public void mo1245b() {
        }

        /* renamed from: c */
        public void mo1246c() {
        }

        C3726e() {
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.c$f */
    static final class C3727f<T> implements C0028l<ArrayList<String>> {
        /* renamed from: a */
        final /* synthetic */ C4811c f14949a;

        C3727f(C4811c c4811c) {
            this.f14949a = c4811c;
        }

        /* renamed from: a */
        public final void m18580a(ArrayList<String> arrayList) {
            YouTubePlayer a = this.f14949a.f21078e;
            if (a != null) {
                a.mo3305a((List) arrayList);
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.c$g */
    static final class C3728g<T> implements C0028l<Boolean> {
        /* renamed from: a */
        final /* synthetic */ C4811c f14950a;

        C3728g(C4811c c4811c) {
            this.f14950a = c4811c;
        }

        /* renamed from: a */
        public final void m18581a(Boolean bool) {
            ArrayList arrayList = (ArrayList) this.f14950a.m27880c().m40a();
            if (arrayList != null) {
                C1587a.m6120a(arrayList, new PlayerFragment$onViewCreated$2$1(this));
            }
        }
    }

    /* renamed from: a */
    public View mo4642a(int i) {
        if (this.f21080g == null) {
            this.f21080g = new HashMap();
        }
        View view = (View) this.f21080g.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f21080g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo4643a() {
        if (this.f21080g != null) {
            this.f21080g.clear();
        }
    }

    /* renamed from: f */
    public final void m27883f() {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo4643a();
    }

    /* renamed from: b */
    public final C3006k<String> m27879b() {
        return this.f21075b;
    }

    /* renamed from: c */
    public final C3006k<ArrayList<String>> m27880c() {
        return this.f21076c;
    }

    /* renamed from: a */
    public final void m27876a(C1603a c1603a) {
        this.f21079f = c1603a;
    }

    /* renamed from: d */
    public final C1603a m27881d() {
        return this.f21079f;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_player, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C2885g.m13910b(view, "view");
        super.onViewCreated(view, bundle);
        view = getChildFragmentManager().mo289a((int) R.id.youtube_fragment);
        if (view != null) {
            ((YouTubePlayerSupportFragment) view).m27393a(C2109c.f6446a.m7674a().m7654a(), this);
            C0023f c0023f = this;
            this.f21076c.m41a(c0023f, (C0028l) new C3727f(this));
            this.f21077d.m41a(c0023f, (C0028l) new C3728g(this));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.google.android.youtube.player.YouTubePlayerSupportFragment");
    }

    /* renamed from: a */
    public void mo4650a(C2525e c2525e, YouTubePlayer youTubePlayer, boolean z) {
        C2885g.m13910b(youTubePlayer, "player");
        if (!z) {
            this.f21078e = youTubePlayer;
            c2525e = this.f21078e;
            if (c2525e != null) {
                c2525e.mo3301a((C2521a) new C3724c(this));
            }
            c2525e = this.f21078e;
            if (c2525e != null) {
                c2525e.mo3302a((C2523c) new C3725d(this));
            }
            c2525e = this.f21078e;
            if (c2525e != null) {
                c2525e.mo3303a((C2524d) new C3726e());
            }
            this.f21077d.mo19b(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public void mo4649a(C2525e c2525e, YouTubeInitializationResult youTubeInitializationResult) {
        c2525e = getContext();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ");
        stringBuilder.append(youTubeInitializationResult != null ? youTubeInitializationResult.name() : null);
        Toast.makeText(c2525e, stringBuilder.toString(), 1).show();
        if (youTubeInitializationResult == null) {
            C2885g.m13906a();
        }
        if (youTubeInitializationResult.m12436a() != null) {
            youTubeInitializationResult.m12434a(getActivity(), 1);
            return;
        }
        c2525e = C2888j.f12093a;
        Object string = getString(R.string.error_player);
        C2885g.m13907a(string, "getString(R.string.error_player)");
        Object[] objArr = new Object[]{youTubeInitializationResult.toString()};
        C2885g.m13907a(String.format(string, Arrays.copyOf(objArr, objArr.length)), "java.lang.String.format(format, *args)");
        try {
            startActivityForResult(C2530c.m12460a(getActivity(), C2109c.f6446a.m7674a().m7654a(), (String) this.f21075b.m40a()), 11);
        } catch (C2525e c2525e2) {
            c2525e2.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 11) {
            i = getFragmentManager().mo289a(C1487a.youtube_fragment);
            if ((i instanceof YouTubePlayerSupportFragment) == 0) {
                i = 0;
            }
            YouTubePlayerSupportFragment youTubePlayerSupportFragment = (YouTubePlayerSupportFragment) i;
            if (youTubePlayerSupportFragment != null) {
                youTubePlayerSupportFragment.m27393a(C2109c.f6446a.m7674a().m7654a(), this);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration == null || configuration.orientation != 2) {
            configuration = this.f21078e;
            if (configuration != null) {
                configuration.mo3306a(false);
                return;
            }
            return;
        }
        configuration = this.f21078e;
        if (configuration != null) {
            configuration.mo3306a(true);
        }
    }

    /* renamed from: e */
    public final void m27882e() {
        YouTubePlayer youTubePlayer = this.f21078e;
        if (youTubePlayer != null) {
            youTubePlayer.mo3306a(false);
        }
    }
}
