package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

@KeepForSdk
public final class DataUtils {
    @KeepForSdk
    public static void copyStringToBuffer(String str, CharArrayBuffer charArrayBuffer) {
        if (TextUtils.isEmpty(str)) {
            charArrayBuffer.sizeCopied = 0;
        } else {
            if (charArrayBuffer.data != null) {
                if (charArrayBuffer.data.length >= str.length()) {
                    str.getChars(0, str.length(), charArrayBuffer.data, 0);
                }
            }
            charArrayBuffer.data = str.toCharArray();
        }
        charArrayBuffer.sizeCopied = str.length();
    }

    @KeepForSdk
    public static byte[] loadImageBytes(Bitmap bitmap) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}