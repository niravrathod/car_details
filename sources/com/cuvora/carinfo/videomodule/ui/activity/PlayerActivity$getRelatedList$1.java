package com.cuvora.carinfo.videomodule.ui.activity;

import com.feedbox.data.network.model.Content;
import java.util.ArrayList;
import java.util.List;
import kotlin.C2864b;
import kotlin.jvm.internal.C2885g;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.jvm.p154a.C2878b;
import kotlin.text.C4883n;

final class PlayerActivity$getRelatedList$1 extends Lambda implements C2878b<ArrayList<Content>, C2864b> {
    final /* synthetic */ ObjectRef $relatedList;
    final /* synthetic */ PlayerActivity this$0;

    PlayerActivity$getRelatedList$1(PlayerActivity playerActivity, ObjectRef objectRef) {
        this.this$0 = playerActivity;
        this.$relatedList = objectRef;
        super(1);
    }

    /* renamed from: a */
    public final void m25188a(ArrayList<Content> arrayList) {
        C2885g.m13910b(arrayList, "list");
        for (Object next : arrayList) {
            if (C4883n.m30196a(((Content) next).m7689a(), this.this$0.m30185l(), false, 2, null)) {
                break;
            }
        }
        Object next2 = null;
        Content content = (Content) next2;
        if (content != null) {
            int indexOf = arrayList.indexOf(content);
            List subList = arrayList.subList(0, indexOf);
            arrayList = arrayList.subList(indexOf + 1, arrayList.size());
            this.$relatedList.element = new ArrayList();
            ArrayList arrayList2 = (ArrayList) this.$relatedList.element;
            if (arrayList2 != null) {
                arrayList2.addAll(arrayList);
            }
            arrayList = this.$relatedList.element;
            if (arrayList != null) {
                arrayList.addAll(subList);
            }
        }
    }
}
