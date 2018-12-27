package com.cuvora.carinfo.videomodule.ui.fragment;

import com.cuvora.carinfo.videomodule.ui.fragment.C4811c.C3728g;
import com.google.android.youtube.player.YouTubePlayer;
import java.util.ArrayList;
import java.util.List;
import kotlin.C2864b;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p154a.C2878b;

final class PlayerFragment$onViewCreated$2$1 extends Lambda implements C2878b<ArrayList<String>, C2864b> {
    final /* synthetic */ C3728g this$0;

    PlayerFragment$onViewCreated$2$1(C3728g c3728g) {
        this.this$0 = c3728g;
        super(1);
    }

    /* renamed from: a */
    public final void m25205a(ArrayList<String> arrayList) {
        C2885g.m13910b(arrayList, "playList");
        YouTubePlayer a = this.this$0.f14950a.f21078e;
        if (a != null) {
            a.mo3305a((List) arrayList);
        }
    }
}
