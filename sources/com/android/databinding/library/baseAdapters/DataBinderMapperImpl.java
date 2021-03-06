package com.android.databinding.library.baseAdapters;

import android.databinding.C0058d;
import android.databinding.C0059e;
import android.databinding.ViewDataBinding;
import android.util.SparseIntArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends C0058d {
    /* renamed from: a */
    private static final SparseIntArray f14162a = new SparseIntArray(0);

    /* renamed from: a */
    public ViewDataBinding mo24a(C0059e c0059e, View view, int i) {
        if (f14162a.get(i) > null) {
            if (view.getTag() == null) {
                throw new RuntimeException("view must have a tag");
            }
        }
        return null;
    }

    /* renamed from: a */
    public ViewDataBinding mo25a(C0059e c0059e, View[] viewArr, int i) {
        if (viewArr != null) {
            if (viewArr.length != 0) {
                if (f14162a.get(i) > 0) {
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
        return new ArrayList(0);
    }
}
