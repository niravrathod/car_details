package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.p038a.C4495d;
import com.airbnb.lottie.model.p038a.C4498h;

public class Mask {
    /* renamed from: a */
    private final MaskMode f3280a;
    /* renamed from: b */
    private final C4498h f3281b;
    /* renamed from: c */
    private final C4495d f3282c;

    public enum MaskMode {
        MaskModeAdd,
        MaskModeSubtract,
        MaskModeIntersect
    }

    public Mask(MaskMode maskMode, C4498h c4498h, C4495d c4495d) {
        this.f3280a = maskMode;
        this.f3281b = c4498h;
        this.f3282c = c4495d;
    }

    /* renamed from: a */
    public MaskMode m4243a() {
        return this.f3280a;
    }

    /* renamed from: b */
    public C4498h m4244b() {
        return this.f3281b;
    }

    /* renamed from: c */
    public C4495d m4245c() {
        return this.f3282c;
    }
}
