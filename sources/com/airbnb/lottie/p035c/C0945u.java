package com.airbnb.lottie.p035c;

import android.util.JsonReader;
import android.util.Log;
import com.airbnb.lottie.C0955d;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.content.Mask.MaskMode;
import com.airbnb.lottie.model.p038a.C4495d;
import com.airbnb.lottie.model.p038a.C4498h;
import com.facebook.ads.internal.p084c.C1769a;

/* renamed from: com.airbnb.lottie.c.u */
class C0945u {
    /* renamed from: a */
    static Mask m4072a(JsonReader jsonReader, C0955d c0955d) {
        jsonReader.beginObject();
        MaskMode maskMode = null;
        C4498h c4498h = null;
        C4495d c4495d = c4498h;
        while (jsonReader.hasNext()) {
            Object obj;
            String nextString;
            StringBuilder stringBuilder;
            String nextName = jsonReader.nextName();
            int hashCode = nextName.hashCode();
            Object obj2 = null;
            if (hashCode == 111) {
                if (nextName.equals("o")) {
                    obj = 2;
                    switch (obj) {
                        case null:
                            nextString = jsonReader.nextString();
                            hashCode = nextString.hashCode();
                            if (hashCode == 97) {
                                if (nextString.equals(C1769a.f5340a)) {
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            } else if (hashCode == 105) {
                                if (nextString.equals("i")) {
                                    obj2 = 2;
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            } else if (hashCode == 115) {
                                if (nextString.equals("s")) {
                                    obj2 = 1;
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            }
                            obj2 = -1;
                            switch (obj2) {
                                case null:
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                                case 1:
                                    maskMode = MaskMode.MaskModeSubtract;
                                    break;
                                case 2:
                                    c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    maskMode = MaskMode.MaskModeIntersect;
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown mask mode ");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(". Defaulting to Add.");
                                    Log.w("LOTTIE", stringBuilder.toString());
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                            }
                        case 1:
                            c4498h = C0932d.m4041e(jsonReader, c0955d);
                            break;
                        case 2:
                            c4495d = C0932d.m4038b(jsonReader, c0955d);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 3588) {
                if (nextName.equals("pt")) {
                    obj = 1;
                    switch (obj) {
                        case null:
                            nextString = jsonReader.nextString();
                            hashCode = nextString.hashCode();
                            if (hashCode == 97) {
                                if (nextString.equals(C1769a.f5340a)) {
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            } else if (hashCode == 105) {
                                if (nextString.equals("i")) {
                                    obj2 = 2;
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            } else if (hashCode == 115) {
                                if (nextString.equals("s")) {
                                    obj2 = 1;
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            }
                            obj2 = -1;
                            switch (obj2) {
                                case null:
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                                case 1:
                                    maskMode = MaskMode.MaskModeSubtract;
                                    break;
                                case 2:
                                    c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    maskMode = MaskMode.MaskModeIntersect;
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown mask mode ");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(". Defaulting to Add.");
                                    Log.w("LOTTIE", stringBuilder.toString());
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                            }
                        case 1:
                            c4498h = C0932d.m4041e(jsonReader, c0955d);
                            break;
                        case 2:
                            c4495d = C0932d.m4038b(jsonReader, c0955d);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            } else if (hashCode == 3357091) {
                if (nextName.equals("mode")) {
                    obj = null;
                    switch (obj) {
                        case null:
                            nextString = jsonReader.nextString();
                            hashCode = nextString.hashCode();
                            if (hashCode == 97) {
                                if (nextString.equals(C1769a.f5340a)) {
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            } else if (hashCode == 105) {
                                if (nextString.equals("i")) {
                                    obj2 = 2;
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            } else if (hashCode == 115) {
                                if (nextString.equals("s")) {
                                    obj2 = 1;
                                    switch (obj2) {
                                        case null:
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                        case 1:
                                            maskMode = MaskMode.MaskModeSubtract;
                                            break;
                                        case 2:
                                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                            maskMode = MaskMode.MaskModeIntersect;
                                            break;
                                        default:
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append("Unknown mask mode ");
                                            stringBuilder.append(nextName);
                                            stringBuilder.append(". Defaulting to Add.");
                                            Log.w("LOTTIE", stringBuilder.toString());
                                            maskMode = MaskMode.MaskModeAdd;
                                            break;
                                    }
                                }
                            }
                            obj2 = -1;
                            switch (obj2) {
                                case null:
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                                case 1:
                                    maskMode = MaskMode.MaskModeSubtract;
                                    break;
                                case 2:
                                    c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    maskMode = MaskMode.MaskModeIntersect;
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown mask mode ");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(". Defaulting to Add.");
                                    Log.w("LOTTIE", stringBuilder.toString());
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                            }
                        case 1:
                            c4498h = C0932d.m4041e(jsonReader, c0955d);
                            break;
                        case 2:
                            c4495d = C0932d.m4038b(jsonReader, c0955d);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                }
            }
            obj = -1;
            switch (obj) {
                case null:
                    nextString = jsonReader.nextString();
                    hashCode = nextString.hashCode();
                    if (hashCode == 97) {
                        if (nextString.equals(C1769a.f5340a)) {
                            switch (obj2) {
                                case null:
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                                case 1:
                                    maskMode = MaskMode.MaskModeSubtract;
                                    break;
                                case 2:
                                    c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    maskMode = MaskMode.MaskModeIntersect;
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown mask mode ");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(". Defaulting to Add.");
                                    Log.w("LOTTIE", stringBuilder.toString());
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                            }
                        }
                    } else if (hashCode == 105) {
                        if (nextString.equals("i")) {
                            obj2 = 2;
                            switch (obj2) {
                                case null:
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                                case 1:
                                    maskMode = MaskMode.MaskModeSubtract;
                                    break;
                                case 2:
                                    c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    maskMode = MaskMode.MaskModeIntersect;
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown mask mode ");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(". Defaulting to Add.");
                                    Log.w("LOTTIE", stringBuilder.toString());
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                            }
                        }
                    } else if (hashCode == 115) {
                        if (nextString.equals("s")) {
                            obj2 = 1;
                            switch (obj2) {
                                case null:
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                                case 1:
                                    maskMode = MaskMode.MaskModeSubtract;
                                    break;
                                case 2:
                                    c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                                    maskMode = MaskMode.MaskModeIntersect;
                                    break;
                                default:
                                    stringBuilder = new StringBuilder();
                                    stringBuilder.append("Unknown mask mode ");
                                    stringBuilder.append(nextName);
                                    stringBuilder.append(". Defaulting to Add.");
                                    Log.w("LOTTIE", stringBuilder.toString());
                                    maskMode = MaskMode.MaskModeAdd;
                                    break;
                            }
                        }
                    }
                    obj2 = -1;
                    switch (obj2) {
                        case null:
                            maskMode = MaskMode.MaskModeAdd;
                            break;
                        case 1:
                            maskMode = MaskMode.MaskModeSubtract;
                            break;
                        case 2:
                            c0955d.m4112a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            maskMode = MaskMode.MaskModeIntersect;
                            break;
                        default:
                            stringBuilder = new StringBuilder();
                            stringBuilder.append("Unknown mask mode ");
                            stringBuilder.append(nextName);
                            stringBuilder.append(". Defaulting to Add.");
                            Log.w("LOTTIE", stringBuilder.toString());
                            maskMode = MaskMode.MaskModeAdd;
                            break;
                    }
                case 1:
                    c4498h = C0932d.m4041e(jsonReader, c0955d);
                    break;
                case 2:
                    c4495d = C0932d.m4038b(jsonReader, c0955d);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new Mask(maskMode, c4498h, c4495d);
    }
}
