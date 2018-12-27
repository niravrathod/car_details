package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

final class cy extends cx<FieldDescriptorType, Object> {
    cy(int i) {
        super(i);
    }

    /* renamed from: a */
    public final void mo3076a() {
        if (!m11695b()) {
            Entry b;
            for (int i = 0; i < m11696c(); i++) {
                b = m11694b(i);
                if (((zzvf) b.getKey()).m12062d()) {
                    b.setValue(Collections.unmodifiableList((List) b.getValue()));
                }
            }
            for (Entry b2 : m11697d()) {
                if (((zzvf) b2.getKey()).m12062d()) {
                    b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                }
            }
        }
        super.mo3076a();
    }
}
