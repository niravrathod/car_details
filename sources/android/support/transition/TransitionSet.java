package android.support.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.transition.Transition.C0261b;
import android.support.transition.Transition.C0262c;
import android.support.v4.content.p014a.C0388c;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {
    /* renamed from: g */
    private ArrayList<Transition> f13055g = new ArrayList();
    /* renamed from: h */
    private boolean f13056h = true;
    /* renamed from: i */
    private int f13057i;
    /* renamed from: j */
    private boolean f13058j = false;

    /* renamed from: android.support.transition.TransitionSet$a */
    static class C4423a extends ad {
        /* renamed from: a */
        TransitionSet f18395a;

        C4423a(TransitionSet transitionSet) {
            this.f18395a = transitionSet;
        }

        /* renamed from: d */
        public void mo178d(Transition transition) {
            if (this.f18395a.f13058j == null) {
                this.f18395a.m959j();
                this.f18395a.f13058j = true;
            }
        }

        /* renamed from: a */
        public void mo175a(Transition transition) {
            TransitionSet.m15176b(this.f18395a);
            if (this.f18395a.f13057i == 0) {
                this.f18395a.f13058j = false;
                this.f18395a.m960k();
            }
            transition.mo206b((C0262c) this);
        }
    }

    /* renamed from: b */
    static /* synthetic */ int m15176b(TransitionSet transitionSet) {
        int i = transitionSet.f13057i - 1;
        transitionSet.f13057i = i;
        return i;
    }

    /* renamed from: a */
    public /* synthetic */ Transition mo197a(long j) {
        return m15196c(j);
    }

    /* renamed from: a */
    public /* synthetic */ Transition mo198a(TimeInterpolator timeInterpolator) {
        return m15192b(timeInterpolator);
    }

    /* renamed from: a */
    public /* synthetic */ Transition mo199a(C0262c c0262c) {
        return m15197c(c0262c);
    }

    /* renamed from: b */
    public /* synthetic */ Transition mo205b(long j) {
        return m15200d(j);
    }

    /* renamed from: b */
    public /* synthetic */ Transition mo206b(C0262c c0262c) {
        return m15201d(c0262c);
    }

    /* renamed from: c */
    public /* synthetic */ Transition mo207c(View view) {
        return m15183a(view);
    }

    public /* synthetic */ Object clone() {
        return mo214n();
    }

    /* renamed from: d */
    public /* synthetic */ Transition mo210d(View view) {
        return m15205g(view);
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ac.f983i);
        mo200a(C0388c.m1421a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public TransitionSet mo200a(int i) {
        switch (i) {
            case 0:
                this.f13056h = true;
                break;
            case 1:
                this.f13056h = false;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid parameter for TransitionSet ordering: ");
                stringBuilder.append(i);
                throw new AndroidRuntimeException(stringBuilder.toString());
        }
        return this;
    }

    /* renamed from: b */
    public TransitionSet m15193b(Transition transition) {
        this.f13055g.add(transition);
        transition.f943d = this;
        if (this.a >= 0) {
            transition.mo197a(this.a);
        }
        return this;
    }

    /* renamed from: p */
    public int mo215p() {
        return this.f13055g.size();
    }

    /* renamed from: b */
    public Transition m15189b(int i) {
        if (i >= 0) {
            if (i < this.f13055g.size()) {
                return (Transition) this.f13055g.get(i);
            }
        }
        return 0;
    }

    /* renamed from: c */
    public TransitionSet m15196c(long j) {
        super.mo197a(j);
        if (this.a >= 0) {
            int size = this.f13055g.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.f13055g.get(i)).mo197a(j);
            }
        }
        return this;
    }

    /* renamed from: d */
    public TransitionSet m15200d(long j) {
        return (TransitionSet) super.mo205b(j);
    }

    /* renamed from: b */
    public TransitionSet m15192b(TimeInterpolator timeInterpolator) {
        return (TransitionSet) super.mo198a(timeInterpolator);
    }

    /* renamed from: a */
    public TransitionSet m15183a(View view) {
        for (int i = 0; i < this.f13055g.size(); i++) {
            ((Transition) this.f13055g.get(i)).mo207c(view);
        }
        return (TransitionSet) super.mo207c(view);
    }

    /* renamed from: c */
    public TransitionSet m15197c(C0262c c0262c) {
        return (TransitionSet) super.mo199a(c0262c);
    }

    /* renamed from: g */
    public TransitionSet m15205g(View view) {
        for (int i = 0; i < this.f13055g.size(); i++) {
            ((Transition) this.f13055g.get(i)).mo210d(view);
        }
        return (TransitionSet) super.mo210d(view);
    }

    /* renamed from: d */
    public TransitionSet m15201d(C0262c c0262c) {
        return (TransitionSet) super.mo206b(c0262c);
    }

    /* renamed from: q */
    private void m15178q() {
        C0262c c4423a = new C4423a(this);
        Iterator it = this.f13055g.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).mo199a(c4423a);
        }
        this.f13057i = this.f13055g.size();
    }

    /* renamed from: a */
    protected void mo204a(ViewGroup viewGroup, ai aiVar, ai aiVar2, ArrayList<ah> arrayList, ArrayList<ah> arrayList2) {
        long c = m947c();
        int size = this.f13055g.size();
        int i = 0;
        while (i < size) {
            Transition transition = (Transition) r0.f13055g.get(i);
            if (c > 0 && (r0.f13056h || i == 0)) {
                long c2 = transition.m947c();
                if (c2 > 0) {
                    transition.mo205b(c2 + c);
                } else {
                    transition.mo205b(c);
                }
            }
            transition.mo204a(viewGroup, aiVar, aiVar2, arrayList, arrayList2);
            i++;
        }
    }

    /* renamed from: e */
    protected void mo211e() {
        if (this.f13055g.isEmpty()) {
            m959j();
            m960k();
            return;
        }
        m15178q();
        if (this.f13056h) {
            Iterator it = this.f13055g.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo211e();
            }
        } else {
            for (int i = 1; i < this.f13055g.size(); i++) {
                final Transition transition = (Transition) this.f13055g.get(i);
                ((Transition) this.f13055g.get(i - 1)).mo199a(new ad(this) {
                    /* renamed from: b */
                    final /* synthetic */ TransitionSet f18394b;

                    /* renamed from: a */
                    public void mo175a(Transition transition) {
                        transition.mo211e();
                        transition.mo206b((C0262c) this);
                    }
                });
            }
            Transition transition2 = (Transition) this.f13055g.get(0);
            if (transition2 != null) {
                transition2.mo211e();
            }
        }
    }

    /* renamed from: a */
    public void mo98a(ah ahVar) {
        if (m946b(ahVar.f995b)) {
            Iterator it = this.f13055g.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m946b(ahVar.f995b)) {
                    transition.mo98a(ahVar);
                    ahVar.f996c.add(transition);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo99b(ah ahVar) {
        if (m946b(ahVar.f995b)) {
            Iterator it = this.f13055g.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.m946b(ahVar.f995b)) {
                    transition.mo99b(ahVar);
                    ahVar.f996c.add(transition);
                }
            }
        }
    }

    /* renamed from: c */
    void mo208c(ah ahVar) {
        super.mo208c(ahVar);
        int size = this.f13055g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f13055g.get(i)).mo208c(ahVar);
        }
    }

    /* renamed from: e */
    public void mo212e(View view) {
        super.mo212e(view);
        int size = this.f13055g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f13055g.get(i)).mo212e(view);
        }
    }

    /* renamed from: f */
    public void mo213f(View view) {
        super.mo213f(view);
        int size = this.f13055g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f13055g.get(i)).mo213f(view);
        }
    }

    /* renamed from: a */
    public void mo203a(af afVar) {
        super.mo203a(afVar);
        int size = this.f13055g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f13055g.get(i)).mo203a(afVar);
        }
    }

    /* renamed from: a */
    public void mo202a(C0261b c0261b) {
        super.mo202a(c0261b);
        int size = this.f13055g.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f13055g.get(i)).mo202a(c0261b);
        }
    }

    /* renamed from: a */
    String mo201a(String str) {
        String a = super.mo201a(str);
        for (int i = 0; i < this.f13055g.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a);
            stringBuilder.append("\n");
            Transition transition = (Transition) this.f13055g.get(i);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(str);
            stringBuilder2.append("  ");
            stringBuilder.append(transition.mo201a(stringBuilder2.toString()));
            a = stringBuilder.toString();
        }
        return a;
    }

    /* renamed from: n */
    public Transition mo214n() {
        TransitionSet transitionSet = (TransitionSet) super.mo214n();
        transitionSet.f13055g = new ArrayList();
        int size = this.f13055g.size();
        for (int i = 0; i < size; i++) {
            transitionSet.m15193b(((Transition) this.f13055g.get(i)).mo214n());
        }
        return transitionSet;
    }
}
