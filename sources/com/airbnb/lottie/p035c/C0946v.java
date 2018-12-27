package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.model.content.MergePaths.MergePathsMode;

/* renamed from: com.airbnb.lottie.c.v */
class C0946v {
    /* renamed from: a */
    static MergePaths m4073a(JsonReader jsonReader) {
        String str = null;
        MergePathsMode mergePathsMode = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            Object obj = -1;
            int hashCode = nextName.hashCode();
            if (hashCode != 3488) {
                if (hashCode == 3519) {
                    if (nextName.equals("nm")) {
                        obj = null;
                    }
                }
            } else if (nextName.equals("mm")) {
                obj = 1;
            }
            switch (obj) {
                case null:
                    str = jsonReader.nextString();
                    break;
                case 1:
                    mergePathsMode = MergePathsMode.m4246a(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new MergePaths(str, mergePathsMode);
    }
}
