package com.google.android.gms.internal.ads;

import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

@zzaer
public final class zzhd {
    /* renamed from: a */
    private final zzgt f9522a;
    /* renamed from: b */
    private final int f9523b;
    /* renamed from: c */
    private String f9524c;
    /* renamed from: d */
    private String f9525d;
    /* renamed from: e */
    private final boolean f9526e = false;
    /* renamed from: f */
    private final int f9527f;
    /* renamed from: g */
    private final int f9528g;

    public zzhd(int i, int i2, int i3) {
        this.f9523b = i;
        if (i2 <= 64) {
            if (i2 >= 0) {
                this.f9527f = i2;
                if (i3 > 0) {
                    this.f9528g = 1;
                } else {
                    this.f9528g = i3;
                }
                this.f9522a = new zzhc(this.f9527f);
            }
        }
        this.f9527f = 64;
        if (i3 > 0) {
            this.f9528g = i3;
        } else {
            this.f9528g = 1;
        }
        this.f9522a = new zzhc(this.f9527f);
    }

    /* renamed from: a */
    public final String m10663a(ArrayList<String> arrayList, ArrayList<zzgs> arrayList2) {
        ArrayList<zzgs> arrayList3 = arrayList2;
        Collections.sort(arrayList3, new zzhe(this));
        HashSet hashSet = new HashSet();
        for (int i = 0; i < arrayList2.size(); i++) {
            String[] split = Normalizer.normalize((CharSequence) arrayList.get(((zzgs) arrayList3.get(i)).m10648e()), Form.NFKC).toLowerCase(Locale.US).split("\n");
            boolean z = true;
            if (split.length != 0) {
                for (String str : split) {
                    int i2;
                    String stringBuilder;
                    String[] a;
                    int i3;
                    Object obj;
                    int i4;
                    Object obj2;
                    String valueOf;
                    String valueOf2;
                    if (str.indexOf("'") != -1) {
                        StringBuilder stringBuilder2 = new StringBuilder(str);
                        int i5 = 1;
                        Object obj3 = null;
                        while (true) {
                            int i6 = i5 + 2;
                            if (i6 > stringBuilder2.length()) {
                                break;
                            }
                            if (stringBuilder2.charAt(i5) == '\'') {
                                if (stringBuilder2.charAt(i5 - 1) != ' ') {
                                    i2 = i5 + 1;
                                    if ((stringBuilder2.charAt(i2) == 's' || stringBuilder2.charAt(i2) == 'S') && (i6 == stringBuilder2.length() || stringBuilder2.charAt(i6) == ' ')) {
                                        stringBuilder2.insert(i5, ' ');
                                        i5 = i6;
                                        obj3 = 1;
                                    }
                                }
                                stringBuilder2.setCharAt(i5, ' ');
                                obj3 = 1;
                            }
                            i5++;
                        }
                        stringBuilder = obj3 != null ? stringBuilder2.toString() : null;
                        if (stringBuilder != null) {
                            r1.f9525d = stringBuilder;
                            a = zzgx.m10654a(stringBuilder, true);
                            if (a.length >= r1.f9528g) {
                                for (i3 = 0; i3 < a.length; i3++) {
                                    obj = "";
                                    for (i4 = 0; i4 < r1.f9528g; i4++) {
                                        i2 = i3 + i4;
                                        if (i2 >= a.length) {
                                            obj2 = null;
                                            break;
                                        }
                                        if (i4 > 0) {
                                            obj = String.valueOf(obj).concat(" ");
                                        }
                                        valueOf = String.valueOf(obj);
                                        valueOf2 = String.valueOf(a[i2]);
                                        obj = valueOf2.length() == 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                                    }
                                    obj2 = 1;
                                    if (obj2 == null) {
                                        break;
                                    }
                                    hashSet.add(obj);
                                    if (hashSet.size() >= r1.f9523b) {
                                        break;
                                    }
                                }
                                if (hashSet.size() >= r1.f9523b) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                    }
                    stringBuilder = str;
                    a = zzgx.m10654a(stringBuilder, true);
                    if (a.length >= r1.f9528g) {
                        while (i3 < a.length) {
                            obj = "";
                            for (i4 = 0; i4 < r1.f9528g; i4++) {
                                i2 = i3 + i4;
                                if (i2 >= a.length) {
                                    obj2 = null;
                                    break;
                                }
                                if (i4 > 0) {
                                    obj = String.valueOf(obj).concat(" ");
                                }
                                valueOf = String.valueOf(obj);
                                valueOf2 = String.valueOf(a[i2]);
                                if (valueOf2.length() == 0) {
                                }
                            }
                            obj2 = 1;
                            if (obj2 == null) {
                                hashSet.add(obj);
                                if (hashSet.size() >= r1.f9523b) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (hashSet.size() >= r1.f9523b) {
                            z = false;
                            break;
                        }
                    }
                }
            }
            if (!z) {
                break;
            }
        }
        qo qoVar = new qo();
        r1.f9524c = "";
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            try {
                qoVar.m9367a(r1.f9522a.mo2452a((String) it.next()));
            } catch (Throwable e) {
                zzaok.m10002b("Error while writing hash to byteStream", e);
            }
        }
        return qoVar.toString();
    }
}
