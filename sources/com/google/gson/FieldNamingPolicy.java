package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

public enum FieldNamingPolicy implements C2628d {
    IDENTITY {
        /* renamed from: a */
        public String mo4413a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo4413a(Field field) {
            return FieldNamingPolicy.m23083a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo4413a(Field field) {
            return FieldNamingPolicy.m23083a(FieldNamingPolicy.m23084a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo4413a(Field field) {
            return FieldNamingPolicy.m23084a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo4413a(Field field) {
            return FieldNamingPolicy.m23084a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: a */
        public String mo4413a(Field field) {
            return FieldNamingPolicy.m23084a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    static String m23084a(String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && stringBuilder.length() != 0) {
                stringBuilder.append(str2);
            }
            stringBuilder.append(charAt);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    static String m23083a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1) {
            if (Character.isLetter(charAt)) {
                break;
            }
            stringBuilder.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        stringBuilder.append(m23082a(Character.toUpperCase(charAt), str, i + 1));
        return stringBuilder.toString();
    }

    /* renamed from: a */
    private static String m23082a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c);
        stringBuilder.append(str.substring(i));
        return stringBuilder.toString();
    }
}
