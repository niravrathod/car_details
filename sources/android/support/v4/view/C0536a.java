package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.p018a.C0532b;
import android.support.v4.view.p018a.C0534c;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: android.support.v4.view.a */
public class C0536a {
    /* renamed from: a */
    private static final C0527b f1739a;
    /* renamed from: c */
    private static final AccessibilityDelegate f1740c = new AccessibilityDelegate();
    /* renamed from: b */
    final AccessibilityDelegate f1741b = f1739a.mo441a(this);

    /* renamed from: android.support.v4.view.a$b */
    static class C0527b {
        /* renamed from: a */
        public C0534c mo440a(AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        /* renamed from: a */
        public boolean mo442a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return false;
        }

        C0527b() {
        }

        /* renamed from: a */
        public AccessibilityDelegate mo441a(final C0536a c0536a) {
            return new AccessibilityDelegate(this) {
                /* renamed from: b */
                final /* synthetic */ C0527b f1700b;

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0536a.mo456d(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0536a.mo119a(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0536a.mo87a(view, C0532b.m1951a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0536a.mo143b(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0536a.mo455a(viewGroup, view, accessibilityEvent);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    c0536a.m2014a(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0536a.m2020c(view, accessibilityEvent);
                }
            };
        }
    }

    /* renamed from: android.support.v4.view.a$a */
    static class C3160a extends C0527b {
        C3160a() {
        }

        /* renamed from: a */
        public AccessibilityDelegate mo441a(final C0536a c0536a) {
            return new AccessibilityDelegate(this) {
                /* renamed from: b */
                final /* synthetic */ C3160a f1698b;

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return c0536a.mo456d(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0536a.mo119a(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    c0536a.mo87a(view, C0532b.m1951a(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    c0536a.mo143b(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return c0536a.mo455a(viewGroup, view, accessibilityEvent);
                }

                public void sendAccessibilityEvent(View view, int i) {
                    c0536a.m2014a(view, i);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    c0536a.m2020c(view, accessibilityEvent);
                }

                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    view = c0536a.m2012a(view);
                    return view != null ? (AccessibilityNodeProvider) view.m2006a() : null;
                }

                public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                    return c0536a.mo439a(view, i, bundle);
                }
            };
        }

        /* renamed from: a */
        public C0534c mo440a(AccessibilityDelegate accessibilityDelegate, View view) {
            accessibilityDelegate = accessibilityDelegate.getAccessibilityNodeProvider(view);
            return accessibilityDelegate != null ? new C0534c(accessibilityDelegate) : null;
        }

        /* renamed from: a */
        public boolean mo442a(AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f1739a = new C3160a();
        } else {
            f1739a = new C0527b();
        }
    }

    /* renamed from: a */
    AccessibilityDelegate m2013a() {
        return this.f1741b;
    }

    /* renamed from: a */
    public void m2014a(View view, int i) {
        f1740c.sendAccessibilityEvent(view, i);
    }

    /* renamed from: c */
    public void m2020c(View view, AccessibilityEvent accessibilityEvent) {
        f1740c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: d */
    public boolean mo456d(View view, AccessibilityEvent accessibilityEvent) {
        return f1740c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public void mo143b(View view, AccessibilityEvent accessibilityEvent) {
        f1740c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo119a(View view, AccessibilityEvent accessibilityEvent) {
        f1740c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo87a(View view, C0532b c0532b) {
        f1740c.onInitializeAccessibilityNodeInfo(view, c0532b.m1953a());
    }

    /* renamed from: a */
    public boolean mo455a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return f1740c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public C0534c m2012a(View view) {
        return f1739a.mo440a(f1740c, view);
    }

    /* renamed from: a */
    public boolean mo439a(View view, int i, Bundle bundle) {
        return f1739a.mo442a(f1740c, view, i, bundle);
    }
}
