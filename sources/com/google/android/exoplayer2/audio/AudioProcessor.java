package com.google.android.exoplayer2.audio;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface AudioProcessor {
    /* renamed from: a */
    public static final ByteBuffer f6531a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class UnhandledFormatException extends Exception {
        public UnhandledFormatException(int i, int i2, int i3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unhandled format: ");
            stringBuilder.append(i);
            stringBuilder.append(" Hz, ");
            stringBuilder.append(i2);
            stringBuilder.append(" channels in encoding ");
            stringBuilder.append(i3);
            super(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    void mo1530a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo1531a();

    /* renamed from: a */
    boolean mo1532a(int i, int i2, int i3);

    /* renamed from: b */
    int mo1533b();

    /* renamed from: c */
    int mo1534c();

    /* renamed from: d */
    void mo1535d();

    /* renamed from: e */
    ByteBuffer mo1536e();

    /* renamed from: f */
    boolean mo1537f();

    /* renamed from: g */
    void mo1538g();

    /* renamed from: h */
    void mo1539h();
}
