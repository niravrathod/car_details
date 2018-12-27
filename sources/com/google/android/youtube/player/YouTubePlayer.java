package com.google.android.youtube.player;

import java.util.List;

public interface YouTubePlayer {

    public enum ErrorReason {
        EMBEDDING_DISABLED,
        BLOCKED_FOR_APP,
        NOT_PLAYABLE,
        NETWORK_ERROR,
        UNAUTHORIZED_OVERLAY,
        PLAYER_VIEW_TOO_SMALL,
        PLAYER_VIEW_NOT_VISIBLE,
        EMPTY_PLAYLIST,
        AUTOPLAY_DISABLED,
        USER_DECLINED_RESTRICTED_CONTENT,
        USER_DECLINED_HIGH_BANDWIDTH,
        UNEXPECTED_SERVICE_DISCONNECTION,
        INTERNAL_ERROR,
        UNKNOWN
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayer$a */
    public interface C2521a {
        /* renamed from: a */
        void mo1237a(boolean z);
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayer$b */
    public interface C2522b {
        /* renamed from: a */
        void mo4649a(C2525e c2525e, YouTubeInitializationResult youTubeInitializationResult);

        /* renamed from: a */
        void mo4650a(C2525e c2525e, YouTubePlayer youTubePlayer, boolean z);
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayer$c */
    public interface C2523c {
        /* renamed from: a */
        void mo1238a();

        /* renamed from: a */
        void mo1239a(ErrorReason errorReason);

        /* renamed from: a */
        void mo1240a(String str);

        /* renamed from: b */
        void mo1241b();

        /* renamed from: c */
        void mo1242c();

        /* renamed from: d */
        void mo1243d();
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayer$d */
    public interface C2524d {
        /* renamed from: a */
        void mo1244a();

        /* renamed from: b */
        void mo1245b();

        /* renamed from: c */
        void mo1246c();
    }

    /* renamed from: com.google.android.youtube.player.YouTubePlayer$e */
    public interface C2525e {
    }

    /* renamed from: a */
    void mo3300a(int i);

    /* renamed from: a */
    void mo3301a(C2521a c2521a);

    /* renamed from: a */
    void mo3302a(C2523c c2523c);

    /* renamed from: a */
    void mo3303a(C2524d c2524d);

    /* renamed from: a */
    void mo3304a(String str);

    /* renamed from: a */
    void mo3305a(List<String> list);

    /* renamed from: a */
    void mo3306a(boolean z);
}
