package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
public class Strings {
    private static final Pattern zzhf = Pattern.compile("\\$\\{(.*?)\\}");

    private Strings() {
    }

    @KeepForSdk
    public static String emptyToNull(String str) {
        return TextUtils.isEmpty(str) ? null : str;
    }

    @KeepForSdk
    public static boolean isEmptyOrWhitespace(String str) {
        if (str != null) {
            if (str.trim().isEmpty() == null) {
                return null;
            }
        }
        return true;
    }
}
