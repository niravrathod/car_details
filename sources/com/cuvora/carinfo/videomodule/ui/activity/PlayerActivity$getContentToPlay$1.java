package com.cuvora.carinfo.videomodule.ui.activity;

import com.feedbox.data.network.model.Content;
import java.util.ArrayList;
import kotlin.C2864b;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p154a.C2878b;
import kotlin.text.C4883n;

final class PlayerActivity$getContentToPlay$1 extends Lambda implements C2878b<ArrayList<Content>, C2864b> {
    final /* synthetic */ ObjectRef $content;
    final /* synthetic */ PlayerActivity this$0;

    PlayerActivity$getContentToPlay$1(PlayerActivity playerActivity, ObjectRef objectRef) {
        this.this$0 = playerActivity;
        this.$content = objectRef;
        super(1);
    }

    /* renamed from: a */
    public final void m25184a(ArrayList<Content> arrayList) {
        C2885g.m13910b(arrayList, "list");
        ObjectRef objectRef = this.$content;
        for (Object next : arrayList) {
            if (C4883n.m30196a(((Content) next).m7689a(), this.this$0.m30185l(), false, 2, null)) {
                break;
            }
        }
        Object next2 = null;
        objectRef.element = (Content) next2;
    }
}
