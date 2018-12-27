package com.cuvora.carinfo.videomodule.ui.model;

import com.feedbox.data.network.model.C2112b;
import com.feedbox.data.network.model.C2113c;
import com.feedbox.data.network.model.C2114d;
import com.feedbox.data.network.model.Content;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C2885g;
import kotlin.text.C4883n;

/* renamed from: com.cuvora.carinfo.videomodule.ui.model.c */
public final class C1607c {
    /* renamed from: a */
    public static final ArrayList<C3729b> m6142a(C2112b c2112b) {
        C2885g.m13910b(c2112b, "$receiver");
        ArrayList<C3729b> arrayList = new ArrayList();
        if (c2112b.m7705a().m7704a() != null) {
            List<C2114d> a = c2112b.m7705a().m7704a();
            if (a == null) {
                C2885g.m13906a();
            }
            for (C2114d c2114d : a) {
                String a2 = c2114d.m7708a();
                int i = 0;
                boolean d = C4883n.m30195a("CARD", c2114d.m7709b(), true) ? false : c2114d.m7711d();
                String c = c2114d.m7710c();
                ArrayList arrayList2 = new ArrayList();
                C2113c c2113c = (C2113c) c2112b.m7706b().get(c2114d.m7710c());
                if (c2113c != null) {
                    String str = "4:3";
                    ArrayList a3 = c2113c.m7707a();
                    if (a3 != null && (a3.isEmpty() ^ 1) == 1) {
                        ArrayList<Content> a4 = c2113c.m7707a();
                        if (a4 == null) {
                            C2885g.m13906a();
                        }
                        for (Content a5 : a4) {
                            String j;
                            C3730d a6 = C1608e.m6143a(a5, c2114d.m7709b(), i, c);
                            if (a6 != null) {
                                j = a6.m18600j();
                                if (j != null) {
                                    if (a6 != null) {
                                        arrayList2.add(a6);
                                    }
                                    i++;
                                    str = j;
                                }
                            }
                            j = "4:3";
                            if (a6 != null) {
                                arrayList2.add(a6);
                            }
                            i++;
                            str = j;
                        }
                        if ((arrayList2.isEmpty() ^ 1) != 0) {
                            arrayList.add(new C3729b(a2, d, c, c2114d.m7709b(), arrayList2, str));
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
