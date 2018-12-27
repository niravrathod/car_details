package com.franmontiel.persistentcookiejar.persistence;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import okhttp3.C2971l;

@SuppressLint({"CommitPrefEdits"})
public class SharedPrefsCookiePersistor implements CookiePersistor {
    /* renamed from: a */
    private final SharedPreferences f15666a;

    public SharedPrefsCookiePersistor(Context context) {
        this(context.getSharedPreferences("CookiePersistence", 0));
    }

    public SharedPrefsCookiePersistor(SharedPreferences sharedPreferences) {
        this.f15666a = sharedPreferences;
    }

    /* renamed from: a */
    public List<C2971l> mo1494a() {
        List<C2971l> arrayList = new ArrayList(this.f15666a.getAll().size());
        for (Entry value : this.f15666a.getAll().entrySet()) {
            C2971l a = new SerializableCookie().m7724a((String) value.getValue());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo1495a(Collection<C2971l> collection) {
        Editor edit = this.f15666a.edit();
        for (C2971l c2971l : collection) {
            edit.putString(m19581a(c2971l), new SerializableCookie().m7723a(c2971l));
        }
        edit.commit();
    }

    /* renamed from: b */
    public void mo1496b(Collection<C2971l> collection) {
        Editor edit = this.f15666a.edit();
        for (C2971l a : collection) {
            edit.remove(m19581a(a));
        }
        edit.commit();
    }

    /* renamed from: a */
    private static String m19581a(C2971l c2971l) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c2971l.m14492i() ? "https" : "http");
        stringBuilder.append("://");
        stringBuilder.append(c2971l.m14489f());
        stringBuilder.append(c2971l.m14490g());
        stringBuilder.append("|");
        stringBuilder.append(c2971l.m14482a());
        return stringBuilder.toString();
    }
}
