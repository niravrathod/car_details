package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.view.menu.C0722g;
import android.support.v7.view.menu.C3224h;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import java.lang.reflect.Method;

public class MenuPopupWindow extends ListPopupWindow implements ag {
    /* renamed from: a */
    private static Method f18589a;
    /* renamed from: b */
    private ag f18590b;

    public static class MenuDropDownListView extends C0888z {
        /* renamed from: a */
        final int f13798a;
        /* renamed from: b */
        final int f13799b;
        /* renamed from: c */
        private ag f13800c;
        /* renamed from: d */
        private MenuItem f13801d;

        /* renamed from: a */
        public /* bridge */ /* synthetic */ int mo698a(int i, int i2, int i3, int i4, int i5) {
            return super.mo698a(i, i2, i3, i4, i5);
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ boolean mo699a(MotionEvent motionEvent, int i) {
            return super.mo699a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }

        public MenuDropDownListView(Context context, boolean z) {
            super(context, z);
            context = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < true || true != context.getLayoutDirection()) {
                this.f13798a = 22;
                this.f13799b = 21;
                return;
            }
            this.f13798a = 21;
            this.f13799b = 22;
        }

        public void setHoverListener(ag agVar) {
            this.f13800c = agVar;
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f13798a) {
                if (!(listMenuItemView.isEnabled() == 0 || listMenuItemView.getItemData().hasSubMenu() == 0)) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f13799b) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0722g) getAdapter()).m2813a().m16161b((boolean) null);
                return true;
            }
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            if (this.f13800c != null) {
                int headersCount;
                C0722g c0722g;
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0722g = (C0722g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    c0722g = (C0722g) adapter;
                }
                MenuItem menuItem = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        pointToPosition -= headersCount;
                        if (pointToPosition >= 0 && pointToPosition < c0722g.getCount()) {
                            menuItem = c0722g.m2814a(pointToPosition);
                        }
                    }
                }
                MenuItem menuItem2 = this.f13801d;
                if (menuItem2 != menuItem) {
                    C3224h a = c0722g.m2813a();
                    if (menuItem2 != null) {
                        this.f13800c.mo607a(a, menuItem2);
                    }
                    this.f13801d = menuItem;
                    if (menuItem != null) {
                        this.f13800c.mo608b(a, menuItem);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }
    }

    static {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r0 = android.widget.PopupWindow.class;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r1 = "setTouchModal";	 Catch:{ NoSuchMethodException -> 0x0013 }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r2 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x0013 }
        r3 = 0;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r4 = java.lang.Boolean.TYPE;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r2[r3] = r4;	 Catch:{ NoSuchMethodException -> 0x0013 }
        r0 = r0.getDeclaredMethod(r1, r2);	 Catch:{ NoSuchMethodException -> 0x0013 }
        f18589a = r0;	 Catch:{ NoSuchMethodException -> 0x0013 }
        goto L_0x001a;
    L_0x0013:
        r0 = "MenuPopupWindow";
        r1 = "Could not find method setTouchModal() on PopupWindow. Oh well.";
        android.util.Log.i(r0, r1);
    L_0x001a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.MenuPopupWindow.<clinit>():void");
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    C0888z mo3858a(Context context, boolean z) {
        C0888z menuDropDownListView = new MenuDropDownListView(context, z);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    /* renamed from: a */
    public void m24579a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.g.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: b */
    public void m24581b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.g.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: a */
    public void m24578a(ag agVar) {
        this.f18590b = agVar;
    }

    /* renamed from: c */
    public void mo3859c(boolean r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r4 = this;
        r0 = f18589a;
        if (r0 == 0) goto L_0x001d;
    L_0x0004:
        r0 = f18589a;	 Catch:{ Exception -> 0x0016 }
        r1 = r4.g;	 Catch:{ Exception -> 0x0016 }
        r2 = 1;	 Catch:{ Exception -> 0x0016 }
        r2 = new java.lang.Object[r2];	 Catch:{ Exception -> 0x0016 }
        r3 = 0;	 Catch:{ Exception -> 0x0016 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ Exception -> 0x0016 }
        r2[r3] = r5;	 Catch:{ Exception -> 0x0016 }
        r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0016 }
        goto L_0x001d;
    L_0x0016:
        r5 = "MenuPopupWindow";
        r0 = "Could not invoke setTouchModal() on PopupWindow. Oh well.";
        android.util.Log.i(r5, r0);
    L_0x001d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.MenuPopupWindow.c(boolean):void");
    }

    /* renamed from: b */
    public void mo608b(C3224h c3224h, MenuItem menuItem) {
        if (this.f18590b != null) {
            this.f18590b.mo608b(c3224h, menuItem);
        }
    }

    /* renamed from: a */
    public void mo607a(C3224h c3224h, MenuItem menuItem) {
        if (this.f18590b != null) {
            this.f18590b.mo607a(c3224h, menuItem);
        }
    }
}
