package com.cuvora.carinfo.videomodule.ui.activity;

import com.feedbox.data.network.model.Content;
import java.util.ArrayList;
import kotlin.C2864b;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p154a.C2878b;
import kotlin.text.C4883n;

final class PlayerActivity$getPlayerCueList$2 extends Lambda implements C2878b<ArrayList<Content>, C2864b> {
    final /* synthetic */ ObjectRef $relatedList;
    final /* synthetic */ PlayerActivity this$0;

    PlayerActivity$getPlayerCueList$2(PlayerActivity playerActivity, ObjectRef objectRef) {
        this.this$0 = playerActivity;
        this.$relatedList = objectRef;
        super(1);
    }

    /* renamed from: a */
    public final void m25186a(ArrayList<Content> arrayList) {
        C2885g.m13910b(arrayList, "list");
        for (Object next : arrayList) {
            if (C4883n.m30196a(((Content) next).m7689a(), this.this$0.m30185l(), false, 2, null)) {
                break;
            }
        }
        Object next2 = null;
        Content content = (Content) next2;
        if (content != null) {
            String d;
            int indexOf = arrayList.indexOf(content);
            next2 = arrayList.subList(0, indexOf);
            Object subList = arrayList.subList(indexOf + 1, arrayList.size());
            C2885g.m13907a(subList, "listHead");
            for (Content d2 : (Iterable) subList) {
                d = d2.m7692d();
                if (d != null) {
                    ArrayList arrayList2 = (ArrayList) this.$relatedList.element;
                    if (arrayList2 != null) {
                        arrayList2.add(d);
                    }
                }
            }
            C2885g.m13907a(next2, "listTail");
            for (Content d22 : (Iterable) next2) {
                d = d22.m7692d();
                if (d != null) {
                    ArrayList arrayList3 = (ArrayList) this.$relatedList.element;
                    if (arrayList3 != null) {
                        arrayList3.add(d);
                    }
                }
            }
        }
    }
}
