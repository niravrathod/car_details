package com.cuvora.carinfo.models;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import kotlin.jvm.internal.C2885g;

public final class KeyValueModel implements Serializable {
    public static final Companion Companion = new Companion();
    private static final String KEY_HOLDERS_NAME = KEY_HOLDERS_NAME;
    private static final String KEY_LICENCE_NO = KEY_LICENCE_NO;
    @C2621c(a = "key")
    @C2619a
    private final String key;
    @C2621c(a = "value")
    @C2619a
    private final String value;

    public static final class Companion {
        private Companion() {
        }

        public final String getKEY_LICENCE_NO() {
            return KeyValueModel.KEY_LICENCE_NO;
        }

        public final String getKEY_HOLDERS_NAME() {
            return KeyValueModel.KEY_HOLDERS_NAME;
        }
    }

    public static /* synthetic */ KeyValueModel copy$default(KeyValueModel keyValueModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = keyValueModel.key;
        }
        if ((i & 2) != 0) {
            str2 = keyValueModel.value;
        }
        return keyValueModel.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final KeyValueModel copy(String str, String str2) {
        C2885g.m13910b(str, "key");
        C2885g.m13910b(str2, "value");
        return new KeyValueModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KeyValueModel) {
                KeyValueModel keyValueModel = (KeyValueModel) obj;
                if (C2885g.m13909a(this.key, keyValueModel.key) && C2885g.m13909a(this.value, keyValueModel.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.key;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("KeyValueModel(key=");
        stringBuilder.append(this.key);
        stringBuilder.append(", value=");
        stringBuilder.append(this.value);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public KeyValueModel(String str, String str2) {
        C2885g.m13910b(str, "key");
        C2885g.m13910b(str2, "value");
        this.key = str;
        this.value = str2;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }
}
