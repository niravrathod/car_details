package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C0949c;
import com.airbnb.lottie.C0966f;
import com.airbnb.lottie.model.layer.C4500a;
import com.airbnb.lottie.p031a.p032a.C0917b;
import com.airbnb.lottie.p031a.p032a.C4479k;

public class MergePaths implements C0985b {
    /* renamed from: a */
    private final String f14080a;
    /* renamed from: b */
    private final MergePathsMode f14081b;

    public enum MergePathsMode {
        Merge,
        Add,
        Subtract,
        Intersect,
        ExcludeIntersections;

        /* renamed from: a */
        public static MergePathsMode m4246a(int i) {
            switch (i) {
                case 1:
                    return Merge;
                case 2:
                    return Add;
                case 3:
                    return Subtract;
                case 4:
                    return Intersect;
                case 5:
                    return ExcludeIntersections;
                default:
                    return Merge;
            }
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode) {
        this.f14080a = str;
        this.f14081b = mergePathsMode;
    }

    /* renamed from: a */
    public String m17037a() {
        return this.f14080a;
    }

    /* renamed from: b */
    public MergePathsMode m17038b() {
        return this.f14081b;
    }

    /* renamed from: a */
    public C0917b mo878a(C0966f c0966f, C4500a c4500a) {
        if (c0966f.m4174a() != null) {
            return new C4479k(this);
        }
        C0949c.m4077b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MergePaths{mode=");
        stringBuilder.append(this.f14081b);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
