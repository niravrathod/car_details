package android.support.v4.widget;

import android.os.Build.VERSION;
import android.view.View;
import android.widget.ListView;

/* renamed from: android.support.v4.widget.l */
public final class C0615l {
    /* renamed from: a */
    public static void m2459a(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            listView.scrollListBy(i);
        } else {
            int firstVisiblePosition = listView.getFirstVisiblePosition();
            if (firstVisiblePosition != -1) {
                View childAt = listView.getChildAt(0);
                if (childAt != null) {
                    listView.setSelectionFromTop(firstVisiblePosition, childAt.getTop() - i);
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m2460b(ListView listView, int i) {
        if (VERSION.SDK_INT >= 19) {
            return listView.canScrollList(i);
        }
        int childCount = listView.getChildCount();
        boolean z = false;
        if (childCount == 0) {
            return false;
        }
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            i = listView.getChildAt(childCount - 1).getBottom();
            if (firstVisiblePosition + childCount < listView.getCount() || i > listView.getHeight() - listView.getListPaddingBottom()) {
                z = true;
            }
            return z;
        }
        i = listView.getChildAt(0).getTop();
        if (firstVisiblePosition > 0 || i < listView.getListPaddingTop()) {
            z = true;
        }
        return z;
    }
}
