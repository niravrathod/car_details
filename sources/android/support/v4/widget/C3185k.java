package android.support.v4.widget;

import android.widget.ListView;

/* renamed from: android.support.v4.widget.k */
public class C3185k extends C0596a {
    /* renamed from: f */
    private final ListView f13387f;

    /* renamed from: e */
    public boolean mo482e(int i) {
        return false;
    }

    public C3185k(ListView listView) {
        super(listView);
        this.f13387f = listView;
    }

    /* renamed from: a */
    public void mo481a(int i, int i2) {
        C0615l.m2459a(this.f13387f, i2);
    }

    /* renamed from: f */
    public boolean mo483f(int i) {
        ListView listView = this.f13387f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight()) {
                return true;
            }
            return false;
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition > 0 || listView.getChildAt(0).getTop() < 0) {
                return true;
            }
            return false;
        }
        return true;
    }
}
