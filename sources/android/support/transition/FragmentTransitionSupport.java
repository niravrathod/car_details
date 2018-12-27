package android.support.transition;

import android.graphics.Rect;
import android.support.transition.Transition.C0261b;
import android.support.transition.Transition.C0262c;
import android.support.v4.app.C0361t;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

public class FragmentTransitionSupport extends C0361t {
    /* renamed from: a */
    public boolean mo187a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo188b(Object obj) {
        return obj != null ? ((Transition) obj).mo214n() : null;
    }

    /* renamed from: c */
    public Object mo193c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.m15193b((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo183a(Object obj, View view, ArrayList<View> arrayList) {
        obj = (TransitionSet) obj;
        List g = obj.m956g();
        g.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0361t.m1294a(g, (View) arrayList.get(i));
        }
        g.add(view);
        arrayList.add(view);
        mo185a(obj, (ArrayList) arrayList);
    }

    /* renamed from: a */
    public void mo182a(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            final Rect rect = new Rect();
            m1299a(view, rect);
            transition.mo202a(new C0261b(this) {
                /* renamed from: b */
                final /* synthetic */ FragmentTransitionSupport f13039b;

                /* renamed from: a */
                public Rect mo174a(Transition transition) {
                    return rect;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo185a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            int p;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                p = transitionSet.mo215p();
                while (i < p) {
                    mo185a(transitionSet.m15189b(i), (ArrayList) arrayList);
                    i++;
                }
            } else if (!m15151a(transition) && C0361t.m1295a(transition.m956g())) {
                p = arrayList.size();
                while (i < p) {
                    transition.mo207c((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m15151a(Transition transition) {
        if (C0361t.m1295a(transition.m954f()) && C0361t.m1295a(transition.m957h())) {
            if (C0361t.m1295a((List) transition.m958i()) != null) {
                return null;
            }
        }
        return true;
    }

    /* renamed from: a */
    public Object mo179a(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.m15193b((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.m15193b((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.m15193b((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: b */
    public void mo191b(Object obj, final View view, final ArrayList<View> arrayList) {
        ((Transition) obj).mo199a(new C0262c(this) {
            /* renamed from: c */
            final /* synthetic */ FragmentTransitionSupport f13042c;

            /* renamed from: b */
            public void mo176b(Transition transition) {
            }

            /* renamed from: c */
            public void mo177c(Transition transition) {
            }

            /* renamed from: d */
            public void mo178d(Transition transition) {
            }

            /* renamed from: a */
            public void mo175a(Transition transition) {
                transition.mo206b((C0262c) this);
                view.setVisibility(8);
                transition = arrayList.size();
                for (int i = 0; i < transition; i++) {
                    ((View) arrayList.get(i)).setVisibility(0);
                }
            }
        });
    }

    /* renamed from: b */
    public Object mo189b(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().m15193b(transition).m15193b(transition2).mo200a(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        obj2 = new TransitionSet();
        if (transition != null) {
            obj2.m15193b(transition);
        }
        obj2.m15193b(transition3);
        return obj2;
    }

    /* renamed from: a */
    public void mo180a(ViewGroup viewGroup, Object obj) {
        ae.m973a(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo184a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        final Object obj5 = obj2;
        final ArrayList<View> arrayList4 = arrayList;
        final Object obj6 = obj3;
        final ArrayList<View> arrayList5 = arrayList2;
        final Object obj7 = obj4;
        final ArrayList<View> arrayList6 = arrayList3;
        ((Transition) obj).mo199a(new C0262c(this) {
            /* renamed from: g */
            final /* synthetic */ FragmentTransitionSupport f13049g;

            /* renamed from: a */
            public void mo175a(Transition transition) {
            }

            /* renamed from: b */
            public void mo176b(Transition transition) {
            }

            /* renamed from: c */
            public void mo177c(Transition transition) {
            }

            /* renamed from: d */
            public void mo178d(Transition transition) {
                if (obj5 != null) {
                    this.f13049g.mo192b(obj5, arrayList4, null);
                }
                if (obj6 != null) {
                    this.f13049g.mo192b(obj6, arrayList5, null);
                }
                if (obj7 != null) {
                    this.f13049g.mo192b(obj7, arrayList6, null);
                }
            }
        });
    }

    /* renamed from: a */
    public void mo186a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        obj = (TransitionSet) obj;
        if (obj != null) {
            obj.m956g().clear();
            obj.m956g().addAll(arrayList2);
            mo192b(obj, (ArrayList) arrayList, (ArrayList) arrayList2);
        }
    }

    /* renamed from: b */
    public void mo192b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        int p;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            p = transitionSet.mo215p();
            while (i < p) {
                mo192b(transitionSet.m15189b(i), (ArrayList) arrayList, (ArrayList) arrayList2);
                i++;
            }
        } else if (!m15151a(transition)) {
            List g = transition.m956g();
            if (g.size() == arrayList.size() && g.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    p = 0;
                } else {
                    p = arrayList2.size();
                }
                while (i < p) {
                    transition.mo207c((View) arrayList2.get(i));
                    i++;
                }
                for (arrayList2 = arrayList.size() - 1; arrayList2 >= null; arrayList2--) {
                    transition.mo210d((View) arrayList.get(arrayList2));
                }
            }
        }
    }

    /* renamed from: b */
    public void mo190b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo207c(view);
        }
    }

    /* renamed from: c */
    public void mo194c(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo210d(view);
        }
    }

    /* renamed from: a */
    public void mo181a(Object obj, final Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo202a(new C0261b(this) {
                /* renamed from: b */
                final /* synthetic */ FragmentTransitionSupport f13051b;

                /* renamed from: a */
                public Rect mo174a(Transition transition) {
                    if (rect != null) {
                        if (rect.isEmpty() == null) {
                            return rect;
                        }
                    }
                    return null;
                }
            });
        }
    }
}
