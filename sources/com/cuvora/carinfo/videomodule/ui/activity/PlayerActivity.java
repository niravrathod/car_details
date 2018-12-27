package com.cuvora.carinfo.videomodule.ui.activity;

import android.view.View;
import com.cuvora.carinfo.videomodule.C1587a;
import com.cuvora.carinfo.videomodule.ui.base.BaseActivity;
import com.feedbox.data.network.model.Content;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Ref.ObjectRef;

public abstract class PlayerActivity extends BaseActivity {
    /* renamed from: n */
    private String f21908n;
    /* renamed from: p */
    private ArrayList<Content> f21909p;
    /* renamed from: q */
    private HashMap f21910q;

    /* renamed from: c */
    public View mo5039c(int i) {
        if (this.f21910q == null) {
            this.f21910q = new HashMap();
        }
        View view = (View) this.f21910q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        view = findViewById(i);
        this.f21910q.put(Integer.valueOf(i), view);
        return view;
    }

    /* renamed from: a */
    public final void m30182a(String str) {
        this.f21908n = str;
    }

    /* renamed from: l */
    public final String m30185l() {
        return this.f21908n;
    }

    /* renamed from: a */
    public final void m30183a(ArrayList<Content> arrayList) {
        this.f21909p = arrayList;
    }

    /* renamed from: m */
    public final ArrayList<Content> m30186m() {
        return this.f21909p;
    }

    /* renamed from: n */
    public final ArrayList<Content> m30187n() {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (ArrayList) null;
        ArrayList arrayList = this.f21909p;
        if (arrayList != null) {
            C1587a.m6120a(arrayList, new PlayerActivity$getRelatedList$1(this, objectRef));
        }
        return (ArrayList) objectRef.element;
    }

    /* renamed from: o */
    public final ArrayList<String> m30188o() {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (ArrayList) null;
        String str = this.f21908n;
        if (str != null) {
            objectRef.element = new ArrayList();
            ArrayList arrayList = (ArrayList) objectRef.element;
            if (arrayList != null) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = this.f21909p;
        if (arrayList2 != null) {
            C1587a.m6120a(arrayList2, new PlayerActivity$getPlayerCueList$2(this, objectRef));
        }
        return (ArrayList) objectRef.element;
    }

    /* renamed from: p */
    public final Content m30189p() {
        ObjectRef objectRef = new ObjectRef();
        objectRef.element = (Content) null;
        ArrayList arrayList = this.f21909p;
        if (arrayList != null) {
            C1587a.m6120a(arrayList, new PlayerActivity$getContentToPlay$1(this, objectRef));
        }
        return (Content) objectRef.element;
    }
}
