package com.google.android.youtube.player;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.player.YouTubePlayer.C2522b;
import com.google.android.youtube.player.YouTubePlayer.C2525e;
import com.google.android.youtube.player.YouTubePlayerView.C2527b;
import com.google.android.youtube.player.internal.C2534c;

public class YouTubePlayerSupportFragment extends Fragment implements C2525e {
    /* renamed from: a */
    private final C4152a f20757a = new C4152a();
    /* renamed from: b */
    private Bundle f20758b;
    /* renamed from: c */
    private YouTubePlayerView f20759c;
    /* renamed from: d */
    private String f20760d;
    /* renamed from: e */
    private C2522b f20761e;
    /* renamed from: f */
    private boolean f20762f;

    /* renamed from: com.google.android.youtube.player.YouTubePlayerSupportFragment$a */
    private final class C4152a implements C2527b {
        /* renamed from: a */
        final /* synthetic */ YouTubePlayerSupportFragment f17658a;

        private C4152a(YouTubePlayerSupportFragment youTubePlayerSupportFragment) {
            this.f17658a = youTubePlayerSupportFragment;
        }

        /* renamed from: a */
        public final void mo3220a(YouTubePlayerView youTubePlayerView) {
        }
    }

    /* renamed from: a */
    private void m27392a() {
        if (this.f20759c != null && this.f20761e != null) {
            this.f20759c.m22885a(this.f20762f);
            this.f20759c.m22884a(getActivity(), this, this.f20760d, this.f20761e, this.f20758b);
            this.f20758b = null;
            this.f20761e = null;
        }
    }

    /* renamed from: a */
    public void m27393a(String str, C2522b c2522b) {
        this.f20760d = C2534c.m12479a(str, (Object) "Developer key cannot be null or empty");
        this.f20761e = c2522b;
        m27392a();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20758b = bundle != null ? bundle.getBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE") : null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f20759c = new YouTubePlayerView(getActivity(), null, 0, this.f20757a);
        m27392a();
        return this.f20759c;
    }

    public void onDestroy() {
        if (this.f20759c != null) {
            boolean z;
            Activity activity = getActivity();
            YouTubePlayerView youTubePlayerView = this.f20759c;
            if (activity != null) {
                if (!activity.isFinishing()) {
                    z = false;
                    youTubePlayerView.m22887b(z);
                }
            }
            z = true;
            youTubePlayerView.m22887b(z);
        }
        super.onDestroy();
    }

    public void onDestroyView() {
        this.f20759c.m22889c(getActivity().isFinishing());
        this.f20759c = null;
        super.onDestroyView();
    }

    public void onPause() {
        this.f20759c.m22888c();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f20759c.m22886b();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("YouTubePlayerSupportFragment.KEY_PLAYER_VIEW_STATE", this.f20759c != null ? this.f20759c.m22891e() : this.f20758b);
    }

    public void onStart() {
        super.onStart();
        this.f20759c.m22883a();
    }

    public void onStop() {
        this.f20759c.m22890d();
        super.onStop();
    }
}
