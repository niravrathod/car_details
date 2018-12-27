package com.google.android.youtube.player;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.youtube.player.YouTubePlayerView.C2527b;

public class YouTubeBaseActivity extends Activity {
    /* renamed from: a */
    private C4151a f10840a;
    /* renamed from: b */
    private YouTubePlayerView f10841b;
    /* renamed from: c */
    private int f10842c;
    /* renamed from: d */
    private Bundle f10843d;

    /* renamed from: com.google.android.youtube.player.YouTubeBaseActivity$a */
    private final class C4151a implements C2527b {
        /* renamed from: a */
        final /* synthetic */ YouTubeBaseActivity f17657a;

        private C4151a(YouTubeBaseActivity youTubeBaseActivity) {
            this.f17657a = youTubeBaseActivity;
        }

        /* renamed from: a */
        public final void mo3220a(YouTubePlayerView youTubePlayerView) {
            if (!(this.f17657a.f10841b == null || this.f17657a.f10841b == youTubePlayerView)) {
                this.f17657a.f10841b.m22889c(true);
            }
            this.f17657a.f10841b = youTubePlayerView;
            if (this.f17657a.f10842c > 0) {
                youTubePlayerView.m22883a();
            }
            if (this.f17657a.f10842c >= 2) {
                youTubePlayerView.m22886b();
            }
        }
    }

    /* renamed from: a */
    final C2527b m12433a() {
        return this.f10840a;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10840a = new C4151a();
        this.f10843d = bundle != null ? bundle.getBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE") : null;
    }

    protected void onDestroy() {
        if (this.f10841b != null) {
            this.f10841b.m22887b(isFinishing());
        }
        super.onDestroy();
    }

    protected void onPause() {
        this.f10842c = 1;
        if (this.f10841b != null) {
            this.f10841b.m22888c();
        }
        super.onPause();
    }

    protected void onResume() {
        super.onResume();
        this.f10842c = 2;
        if (this.f10841b != null) {
            this.f10841b.m22886b();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE", this.f10841b != null ? this.f10841b.m22891e() : this.f10843d);
    }

    protected void onStart() {
        super.onStart();
        this.f10842c = 1;
        if (this.f10841b != null) {
            this.f10841b.m22883a();
        }
    }

    protected void onStop() {
        this.f10842c = 0;
        if (this.f10841b != null) {
            this.f10841b.m22890d();
        }
        super.onStop();
    }
}
