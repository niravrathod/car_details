package com.cuvora.carinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.Toolbar.C0829b;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.cuvora.carinfo.helpers.C1533a;
import com.cuvora.carinfo.models.homepage.VideoData;
import com.google.android.gms.ads.AdView;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.C2522b;
import com.google.android.youtube.player.YouTubePlayer.C2525e;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;

public class VideoActivity extends AppCompatActivity implements C2522b {
    /* renamed from: n */
    private VideoData f21837n;
    /* renamed from: o */
    private AdView f21838o;
    /* renamed from: p */
    private Toolbar f21839p;

    /* renamed from: com.cuvora.carinfo.VideoActivity$1 */
    class C14491 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ VideoActivity f4430a;

        C14491(VideoActivity videoActivity) {
            this.f4430a = videoActivity;
        }

        public void onClick(View view) {
            this.f4430a.finish();
        }
    }

    /* renamed from: com.cuvora.carinfo.VideoActivity$2 */
    class C36132 implements C0829b {
        /* renamed from: a */
        final /* synthetic */ VideoActivity f14784a;

        C36132(VideoActivity videoActivity) {
            this.f14784a = videoActivity;
        }

        /* renamed from: a */
        public boolean mo524a(MenuItem menuItem) {
            if (menuItem.getItemId() == 1) {
                menuItem = new Intent("android.intent.action.SEND");
                menuItem.setType("text/plain");
                menuItem.putExtra("android.intent.extra.TEXT", this.f14784a.f21837n.getShareText());
                menuItem.putExtra("android.intent.extra.SUBJECT", this.f14784a.f21837n.getHeading());
                this.f14784a.startActivity(menuItem);
            }
            return true;
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_video);
        this.f21839p = (Toolbar) findViewById(R.id.toolbar);
        this.f21837n = (VideoData) getIntent().getSerializableExtra("KEY_VIDEO_DATA");
        m30083l();
        ((YouTubePlayerSupportFragment) m28707f().mo289a((int) R.id.youtube_fragment)).m27393a("AIzaSyC6FRlRO87Chp9sSxf0oKd30D3j9HBHAS0", this);
        this.f21838o = (AdView) findViewById(R.id.adView);
        C1533a.m5787a(this.f21838o, (Context) this);
    }

    /* renamed from: l */
    private void m30083l() {
        this.f21839p.setTitle(this.f21837n.getHeading());
        this.f21839p.setNavigationOnClickListener(new C14491(this));
        this.f21839p.getMenu().add(0, 1, 1, "Share").setIcon(2131165396).setShowAsAction(2);
        this.f21839p.setOnMenuItemClickListener(new C36132(this));
    }

    protected void onDestroy() {
        this.f21838o.destroy();
        super.onDestroy();
    }

    /* renamed from: a */
    public void mo4650a(C2525e c2525e, YouTubePlayer youTubePlayer, boolean z) {
        if (!z) {
            youTubePlayer.mo3304a(this.f21837n.getVideoId());
            youTubePlayer.mo3300a(5);
        }
    }

    /* renamed from: a */
    public void mo4649a(C2525e c2525e, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(this, "Unable to load video!", 1).show();
    }
}
