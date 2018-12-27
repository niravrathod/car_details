package com.crashlytics.android.answers;

import android.os.Bundle;
import io.fabric.sdk.android.C2766c;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirebaseAnalyticsEventMapper {
    private static final Set<String> EVENT_NAMES = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));
    private static final String FIREBASE_LEVEL_NAME = "level_name";
    private static final String FIREBASE_METHOD = "method";
    private static final String FIREBASE_RATING = "rating";
    private static final String FIREBASE_SUCCESS = "success";

    public FirebaseAnalyticsEvent mapEvent(SessionEvent sessionEvent) {
        boolean z = true;
        Object obj = (!Type.CUSTOM.equals(sessionEvent.f4162c) || sessionEvent.f4164e == null) ? null : 1;
        Object obj2 = (!Type.PREDEFINED.equals(sessionEvent.f4162c) || sessionEvent.f4166g == null) ? null : 1;
        if (obj == null && obj2 == null) {
            return null;
        }
        Bundle mapPredefinedEvent;
        if (obj2 != null) {
            mapPredefinedEvent = mapPredefinedEvent(sessionEvent);
        } else {
            mapPredefinedEvent = new Bundle();
            if (sessionEvent.f4165f != null) {
                mapCustomEventAttributes(mapPredefinedEvent, sessionEvent.f4165f);
            }
        }
        if (obj2 != null) {
            String str = (String) sessionEvent.f4167h.get(FIREBASE_SUCCESS);
            if (str == null || Boolean.parseBoolean(str)) {
                z = false;
            }
            sessionEvent = mapPredefinedEventName(sessionEvent.f4166g, z);
        } else {
            sessionEvent = mapCustomEventName(sessionEvent.f4164e);
        }
        C2766c.m13524h().mo3554a(Answers.TAG, "Logging event into firebase...");
        return new FirebaseAnalyticsEvent(sessionEvent, mapPredefinedEvent);
    }

    private String mapCustomEventName(String str) {
        if (str != null) {
            if (str.length() != 0) {
                StringBuilder stringBuilder;
                if (EVENT_NAMES.contains(str)) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("fabric_");
                    stringBuilder.append(str);
                    return stringBuilder.toString();
                }
                str = str.replaceAll("[^\\p{Alnum}_]+", "_");
                if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("fabric_");
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                }
                if (str.length() > 40) {
                    str = str.substring(0, 40);
                }
                return str;
            }
        }
        return "fabric_unnamed_event";
    }

    private String mapAttribute(String str) {
        if (str != null) {
            if (str.length() != 0) {
                str = str.replaceAll("[^\\p{Alnum}_]+", "_");
                if (str.startsWith("ga_") || str.startsWith("google_") || str.startsWith("firebase_") || !Character.isLetter(str.charAt(0))) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("fabric_");
                    stringBuilder.append(str);
                    str = stringBuilder.toString();
                }
                return str.length() > 40 ? str.substring(0, 40) : str;
            }
        }
        return "fabric_unnamed_parameter";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String mapPredefinedEventName(java.lang.String r6, boolean r7) {
        /*
        r5 = this;
        r0 = 0;
        r1 = 2;
        r2 = 1;
        r3 = -1;
        if (r7 == 0) goto L_0x0046;
    L_0x0006:
        r7 = r6.hashCode();
        r4 = -902468296; // 0xffffffffca356d38 float:-2972494.0 double:NaN;
        if (r7 == r4) goto L_0x002e;
    L_0x000f:
        r4 = 103149417; // 0x625ef69 float:3.1208942E-35 double:5.09625833E-316;
        if (r7 == r4) goto L_0x0024;
    L_0x0014:
        r4 = 1743324417; // 0x67e90501 float:2.2008074E24 double:8.61316704E-315;
        if (r7 == r4) goto L_0x001a;
    L_0x0019:
        goto L_0x0038;
    L_0x001a:
        r7 = "purchase";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x0038;
    L_0x0022:
        r7 = 0;
        goto L_0x0039;
    L_0x0024:
        r7 = "login";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x0038;
    L_0x002c:
        r7 = 2;
        goto L_0x0039;
    L_0x002e:
        r7 = "signUp";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x0038;
    L_0x0036:
        r7 = 1;
        goto L_0x0039;
    L_0x0038:
        r7 = -1;
    L_0x0039:
        switch(r7) {
            case 0: goto L_0x0043;
            case 1: goto L_0x0040;
            case 2: goto L_0x003d;
            default: goto L_0x003c;
        };
    L_0x003c:
        goto L_0x0046;
    L_0x003d:
        r6 = "failed_login";
        return r6;
    L_0x0040:
        r6 = "failed_sign_up";
        return r6;
    L_0x0043:
        r6 = "failed_ecommerce_purchase";
        return r6;
    L_0x0046:
        r7 = r6.hashCode();
        switch(r7) {
            case -2131650889: goto L_0x00c1;
            case -1183699191: goto L_0x00b6;
            case -938102371: goto L_0x00ac;
            case -906336856: goto L_0x00a2;
            case -902468296: goto L_0x0098;
            case -389087554: goto L_0x008e;
            case 23457852: goto L_0x0084;
            case 103149417: goto L_0x0079;
            case 109400031: goto L_0x006f;
            case 196004670: goto L_0x0064;
            case 1664021448: goto L_0x0059;
            case 1743324417: goto L_0x004f;
            default: goto L_0x004d;
        };
    L_0x004d:
        goto L_0x00cc;
    L_0x004f:
        r7 = "purchase";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x0057:
        goto L_0x00cd;
    L_0x0059:
        r7 = "startCheckout";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x0061:
        r0 = 2;
        goto L_0x00cd;
    L_0x0064:
        r7 = "levelStart";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x006c:
        r0 = 10;
        goto L_0x00cd;
    L_0x006f:
        r7 = "share";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x0077:
        r0 = 5;
        goto L_0x00cd;
    L_0x0079:
        r7 = "login";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x0081:
        r0 = 8;
        goto L_0x00cd;
    L_0x0084:
        r7 = "addToCart";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x008c:
        r0 = 1;
        goto L_0x00cd;
    L_0x008e:
        r7 = "contentView";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x0096:
        r0 = 3;
        goto L_0x00cd;
    L_0x0098:
        r7 = "signUp";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x00a0:
        r0 = 7;
        goto L_0x00cd;
    L_0x00a2:
        r7 = "search";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x00aa:
        r0 = 4;
        goto L_0x00cd;
    L_0x00ac:
        r7 = "rating";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x00b4:
        r0 = 6;
        goto L_0x00cd;
    L_0x00b6:
        r7 = "invite";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x00be:
        r0 = 9;
        goto L_0x00cd;
    L_0x00c1:
        r7 = "levelEnd";
        r7 = r6.equals(r7);
        if (r7 == 0) goto L_0x00cc;
    L_0x00c9:
        r0 = 11;
        goto L_0x00cd;
    L_0x00cc:
        r0 = -1;
    L_0x00cd:
        switch(r0) {
            case 0: goto L_0x00f6;
            case 1: goto L_0x00f3;
            case 2: goto L_0x00f0;
            case 3: goto L_0x00ed;
            case 4: goto L_0x00ea;
            case 5: goto L_0x00e7;
            case 6: goto L_0x00e4;
            case 7: goto L_0x00e1;
            case 8: goto L_0x00de;
            case 9: goto L_0x00db;
            case 10: goto L_0x00d8;
            case 11: goto L_0x00d5;
            default: goto L_0x00d0;
        };
    L_0x00d0:
        r6 = r5.mapCustomEventName(r6);
        return r6;
    L_0x00d5:
        r6 = "level_end";
        return r6;
    L_0x00d8:
        r6 = "level_start";
        return r6;
    L_0x00db:
        r6 = "invite";
        return r6;
    L_0x00de:
        r6 = "login";
        return r6;
    L_0x00e1:
        r6 = "sign_up";
        return r6;
    L_0x00e4:
        r6 = "rate_content";
        return r6;
    L_0x00e7:
        r6 = "share";
        return r6;
    L_0x00ea:
        r6 = "search";
        return r6;
    L_0x00ed:
        r6 = "select_content";
        return r6;
    L_0x00f0:
        r6 = "begin_checkout";
        return r6;
    L_0x00f3:
        r6 = "add_to_cart";
        return r6;
    L_0x00f6:
        r6 = "ecommerce_purchase";
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.answers.FirebaseAnalyticsEventMapper.mapPredefinedEventName(java.lang.String, boolean):java.lang.String");
    }

    private Bundle mapPredefinedEvent(SessionEvent sessionEvent) {
        Bundle bundle = new Bundle();
        if ("purchase".equals(sessionEvent.f4166g)) {
            putString(bundle, "item_id", (String) sessionEvent.f4167h.get("itemId"));
            putString(bundle, "item_name", (String) sessionEvent.f4167h.get("itemName"));
            putString(bundle, "item_category", (String) sessionEvent.f4167h.get("itemType"));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.f4167h.get("itemPrice")));
            putString(bundle, "currency", (String) sessionEvent.f4167h.get("currency"));
        } else if ("addToCart".equals(sessionEvent.f4166g)) {
            putString(bundle, "item_id", (String) sessionEvent.f4167h.get("itemId"));
            putString(bundle, "item_name", (String) sessionEvent.f4167h.get("itemName"));
            putString(bundle, "item_category", (String) sessionEvent.f4167h.get("itemType"));
            putDouble(bundle, "price", mapPriceValue(sessionEvent.f4167h.get("itemPrice")));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.f4167h.get("itemPrice")));
            putString(bundle, "currency", (String) sessionEvent.f4167h.get("currency"));
            bundle.putLong("quantity", 1);
        } else if ("startCheckout".equals(sessionEvent.f4166g)) {
            putLong(bundle, "quantity", Long.valueOf((long) ((Integer) sessionEvent.f4167h.get("itemCount")).intValue()));
            putDouble(bundle, "value", mapPriceValue(sessionEvent.f4167h.get("totalPrice")));
            putString(bundle, "currency", (String) sessionEvent.f4167h.get("currency"));
        } else if ("contentView".equals(sessionEvent.f4166g)) {
            putString(bundle, "content_type", (String) sessionEvent.f4167h.get("contentType"));
            putString(bundle, "item_id", (String) sessionEvent.f4167h.get("contentId"));
            putString(bundle, "item_name", (String) sessionEvent.f4167h.get("contentName"));
        } else if ("search".equals(sessionEvent.f4166g)) {
            putString(bundle, "search_term", (String) sessionEvent.f4167h.get("query"));
        } else if ("share".equals(sessionEvent.f4166g)) {
            putString(bundle, FIREBASE_METHOD, (String) sessionEvent.f4167h.get(FIREBASE_METHOD));
            putString(bundle, "content_type", (String) sessionEvent.f4167h.get("contentType"));
            putString(bundle, "item_id", (String) sessionEvent.f4167h.get("contentId"));
            putString(bundle, "item_name", (String) sessionEvent.f4167h.get("contentName"));
        } else if (FIREBASE_RATING.equals(sessionEvent.f4166g)) {
            putString(bundle, FIREBASE_RATING, String.valueOf(sessionEvent.f4167h.get(FIREBASE_RATING)));
            putString(bundle, "content_type", (String) sessionEvent.f4167h.get("contentType"));
            putString(bundle, "item_id", (String) sessionEvent.f4167h.get("contentId"));
            putString(bundle, "item_name", (String) sessionEvent.f4167h.get("contentName"));
        } else if ("signUp".equals(sessionEvent.f4166g)) {
            putString(bundle, FIREBASE_METHOD, (String) sessionEvent.f4167h.get(FIREBASE_METHOD));
        } else if ("login".equals(sessionEvent.f4166g)) {
            putString(bundle, FIREBASE_METHOD, (String) sessionEvent.f4167h.get(FIREBASE_METHOD));
        } else if ("invite".equals(sessionEvent.f4166g)) {
            putString(bundle, FIREBASE_METHOD, (String) sessionEvent.f4167h.get(FIREBASE_METHOD));
        } else if ("levelStart".equals(sessionEvent.f4166g)) {
            putString(bundle, FIREBASE_LEVEL_NAME, (String) sessionEvent.f4167h.get("levelName"));
        } else if ("levelEnd".equals(sessionEvent.f4166g)) {
            putDouble(bundle, "score", mapDouble(sessionEvent.f4167h.get("score")));
            putString(bundle, FIREBASE_LEVEL_NAME, (String) sessionEvent.f4167h.get("levelName"));
            putInt(bundle, FIREBASE_SUCCESS, mapBooleanValue((String) sessionEvent.f4167h.get(FIREBASE_SUCCESS)));
        }
        mapCustomEventAttributes(bundle, sessionEvent.f4165f);
        return bundle;
    }

    private void putLong(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    private void putInt(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    private void putString(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    private void putDouble(Bundle bundle, String str, Double d) {
        d = mapDouble(d);
        if (d != null) {
            bundle.putDouble(str, d.doubleValue());
        }
    }

    private Double mapDouble(Object obj) {
        obj = String.valueOf(obj);
        if (obj == null) {
            return null;
        }
        return Double.valueOf(obj);
    }

    private Integer mapBooleanValue(String str) {
        return str == null ? null : Integer.valueOf(str.equals("true"));
    }

    private Double mapPriceValue(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(AddToCartEvent.MICRO_CONSTANT).doubleValue());
    }

    private void mapCustomEventAttributes(Bundle bundle, Map<String, Object> map) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            Object value = entry.getValue();
            String mapAttribute = mapAttribute((String) entry.getKey());
            if (value instanceof String) {
                bundle.putString(mapAttribute, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(mapAttribute, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(mapAttribute, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(mapAttribute, ((Integer) entry.getValue()).intValue());
            }
        }
    }
}
