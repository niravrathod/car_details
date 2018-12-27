package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class mp extends mo<FieldDescriptorType, Object> {
    mp(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo2122a() {
        if (!m9174b()) {
            Entry b;
            for (int i = 0; i < m9175c(); i++) {
                b = m9173b(i);
                if (((zzbcw) b.getKey()).m10321d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry b2 : m9176d()) {
                if (((zzbcw) b2.getKey()).m10321d()) {
                    b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                }
            }
        }
        super.mo2122a();
    }
}
