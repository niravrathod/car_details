package com.cuvora.carinfo;

import android.databinding.C0058d;
import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.util.SparseIntArray;
import android.view.View;
import com.cuvora.carinfo.p172b.C4848b;
import com.cuvora.carinfo.p172b.C4849d;
import com.cuvora.carinfo.p172b.C4850f;
import com.cuvora.carinfo.p172b.C4851h;
import com.cuvora.carinfo.p172b.C4852j;
import com.cuvora.carinfo.p172b.C4853l;
import com.cuvora.carinfo.p172b.C4854n;
import com.cuvora.carinfo.p172b.C4855p;
import com.cuvora.carinfo.p172b.C4856r;
import com.cuvora.carinfo.p172b.C4857t;
import com.cuvora.carinfo.p172b.C4858v;
import com.cuvora.carinfo.p172b.C4859x;
import com.cuvora.carinfo.p172b.C4860z;
import com.cuvora.carinfo.p172b.ab;
import com.cuvora.carinfo.p172b.ad;
import com.cuvora.carinfo.p172b.af;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends C0058d {
    /* renamed from: a */
    private static final SparseIntArray f14762a = new SparseIntArray(16);

    static {
        f14762a.put(R.layout.fragment_home, 1);
        f14762a.put(R.layout.fragment_related_list, 2);
        f14762a.put(R.layout.fragment_seeall, 3);
        f14762a.put(R.layout.row_album, 4);
        f14762a.put(R.layout.row_banner, 5);
        f14762a.put(R.layout.row_caraousal, 6);
        f14762a.put(R.layout.row_card, 7);
        f14762a.put(R.layout.row_collection, 8);
        f14762a.put(R.layout.row_detail, 9);
        f14762a.put(R.layout.row_home_rail, 10);
        f14762a.put(R.layout.row_home_rail_banner, 11);
        f14762a.put(R.layout.row_home_rail_caraosal, 12);
        f14762a.put(R.layout.row_home_rail_card, 13);
        f14762a.put(R.layout.row_home_rail_collection, 14);
        f14762a.put(R.layout.row_home_rail_html, 15);
        f14762a.put(R.layout.row_related_item, 16);
    }

    /* renamed from: a */
    public ViewDataBinding mo24a(C0059e c0059e, View view, int i) {
        i = f14762a.get(i);
        if (i > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i) {
                    case 1:
                        if ("layout/fragment_home_0".equals(tag) != 0) {
                            return new C4848b(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for fragment_home is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 2:
                        if ("layout/fragment_related_list_0".equals(tag) != 0) {
                            return new C4849d(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for fragment_related_list is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 3:
                        if ("layout/fragment_seeall_0".equals(tag) != 0) {
                            return new C4850f(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for fragment_seeall is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 4:
                        if ("layout/row_album_0".equals(tag) != 0) {
                            return new C4851h(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_album is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 5:
                        if ("layout/row_banner_0".equals(tag) != 0) {
                            return new C4852j(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_banner is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 6:
                        if ("layout/row_caraousal_0".equals(tag) != 0) {
                            return new C4853l(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_caraousal is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 7:
                        if ("layout/row_card_0".equals(tag) != 0) {
                            return new C4854n(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_card is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 8:
                        if ("layout/row_collection_0".equals(tag) != 0) {
                            return new C4855p(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_collection is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 9:
                        if ("layout/row_detail_0".equals(tag) != 0) {
                            return new C4856r(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_detail is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 10:
                        if ("layout/row_home_rail_0".equals(tag) != 0) {
                            return new C4858v(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_home_rail is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 11:
                        if ("layout/row_home_rail_banner_0".equals(tag) != 0) {
                            return new C4857t(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_home_rail_banner is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 12:
                        if ("layout/row_home_rail_caraosal_0".equals(tag) != 0) {
                            return new C4859x(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_home_rail_caraosal is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 13:
                        if ("layout/row_home_rail_card_0".equals(tag) != 0) {
                            return new C4860z(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_home_rail_card is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 14:
                        if ("layout/row_home_rail_collection_0".equals(tag) != 0) {
                            return new ab(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_home_rail_collection is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 15:
                        if ("layout/row_home_rail_html_0".equals(tag) != 0) {
                            return new ad(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_home_rail_html is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    case 16:
                        if ("layout/row_related_item_0".equals(tag) != 0) {
                            return new af(c0059e, view);
                        }
                        view = new StringBuilder();
                        view.append("The tag for row_related_item is invalid. Received: ");
                        view.append(tag);
                        throw new IllegalArgumentException(view.toString());
                    default:
                        break;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    /* renamed from: a */
    public ViewDataBinding mo25a(C0059e c0059e, View[] viewArr, int i) {
        if (viewArr != null) {
            if (viewArr.length != 0) {
                if (f14762a.get(i) > 0) {
                    if (viewArr[0].getTag() == null) {
                        throw new RuntimeException("view must have a tag");
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public List<C0058d> mo897a() {
        List arrayList = new ArrayList(2);
        arrayList.add(new com.android.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.feedbox.DataBinderMapperImpl());
        return arrayList;
    }
}
