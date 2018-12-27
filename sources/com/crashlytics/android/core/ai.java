package com.crashlytics.android.core;

import android.app.ActivityManager.RunningAppProcessInfo;
import io.fabric.sdk.android.C2766c;
import io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class ai {
    /* renamed from: a */
    private static final C1357d f4252a = C1357d.m5533a("0");
    /* renamed from: b */
    private static final C1357d f4253b = C1357d.m5533a("Unity");

    /* renamed from: a */
    public static void m5508a(CodedOutputStream codedOutputStream, String str, String str2, long j) {
        codedOutputStream.m5419a(1, C1357d.m5533a(str2));
        codedOutputStream.m5419a(2, C1357d.m5533a(str));
        codedOutputStream.m5418a(3, j);
    }

    /* renamed from: a */
    public static void m5510a(CodedOutputStream codedOutputStream, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        C1357d a = C1357d.m5533a(str);
        C1357d a2 = C1357d.m5533a(str2);
        C1357d a3 = C1357d.m5533a(str3);
        C1357d a4 = C1357d.m5533a(str4);
        C1357d a5 = C1357d.m5533a(str5);
        C1357d a6 = str6 != null ? C1357d.m5533a(str6) : null;
        codedOutputStream.m5434g(7, 2);
        codedOutputStream.m5436k(m5492a(a, a2, a3, a4, a5, i, a6));
        codedOutputStream.m5419a(1, a);
        codedOutputStream.m5419a(2, a3);
        codedOutputStream.m5419a(3, a4);
        codedOutputStream.m5434g(5, 2);
        codedOutputStream.m5436k(m5490a(a2));
        codedOutputStream.m5419a(1, a2);
        codedOutputStream.m5419a(6, a5);
        if (a6 != null) {
            codedOutputStream.m5419a(8, f4253b);
            codedOutputStream.m5419a(9, a6);
        }
        codedOutputStream.m5428b(10, i);
    }

    /* renamed from: a */
    public static void m5511a(CodedOutputStream codedOutputStream, String str, String str2, boolean z) {
        C1357d a = C1357d.m5533a(str);
        C1357d a2 = C1357d.m5533a(str2);
        codedOutputStream.m5434g(8, 2);
        codedOutputStream.m5436k(m5493a(a, a2, z));
        codedOutputStream.m5428b(1, 3);
        codedOutputStream.m5419a(2, a);
        codedOutputStream.m5419a(3, a2);
        codedOutputStream.m5420a(4, z);
    }

    /* renamed from: a */
    public static void m5501a(CodedOutputStream codedOutputStream, int i, String str, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, String str2, String str3) {
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        C1357d a = m5499a(str);
        C1357d a2 = m5499a(str3);
        C1357d a3 = m5499a(str2);
        codedOutputStream2.m5434g(9, 2);
        C1357d c1357d = a3;
        codedOutputStream2.m5436k(m5485a(i, a, i2, j, j2, z, map, i3, a3, a2));
        codedOutputStream2.m5428b(3, i);
        codedOutputStream2.m5419a(4, a);
        codedOutputStream2.m5417a(5, i2);
        codedOutputStream2.m5418a(6, j);
        codedOutputStream2.m5418a(7, j2);
        codedOutputStream2.m5420a(10, z);
        for (Entry entry : map.entrySet()) {
            codedOutputStream2.m5434g(11, 2);
            codedOutputStream2.m5436k(m5494a((DeviceIdentifierType) entry.getKey(), (String) entry.getValue()));
            codedOutputStream2.m5428b(1, ((DeviceIdentifierType) entry.getKey()).protobufIndex);
            codedOutputStream2.m5419a(2, C1357d.m5533a((String) entry.getValue()));
        }
        codedOutputStream2.m5417a(12, i3);
        if (c1357d != null) {
            codedOutputStream2.m5419a(13, c1357d);
        }
        if (a2 != null) {
            codedOutputStream2.m5419a(14, a2);
        }
    }

    /* renamed from: a */
    public static void m5509a(CodedOutputStream codedOutputStream, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        C1357d a = C1357d.m5533a(str);
        C1357d a2 = m5499a(str2);
        C1357d a3 = m5499a(str3);
        int b = CodedOutputStream.m5397b(1, a) + 0;
        if (str2 != null) {
            b += CodedOutputStream.m5397b(2, a2);
        }
        if (str3 != null) {
            b += CodedOutputStream.m5397b(3, a3);
        }
        codedOutputStream.m5434g(6, 2);
        codedOutputStream.m5436k(b);
        codedOutputStream.m5419a(1, a);
        if (str2 != null) {
            codedOutputStream.m5419a(2, a2);
        }
        if (str3 != null) {
            codedOutputStream.m5419a(3, a3);
        }
    }

    /* renamed from: a */
    public static void m5502a(CodedOutputStream codedOutputStream, long j, String str, am amVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, LogFileManager logFileManager, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) {
        C1357d c1357d;
        CodedOutputStream codedOutputStream2 = codedOutputStream;
        String str4 = str3;
        C1357d a = C1357d.m5533a(str2);
        if (str4 == null) {
            c1357d = null;
        } else {
            c1357d = C1357d.m5533a(str4.replace("-", ""));
        }
        C1357d c1357d2 = c1357d;
        C1357d a2 = logFileManager.m5444a();
        if (a2 == null) {
            C2766c.m13524h().mo3554a(CrashlyticsCore.TAG, "No log data to include with this event.");
        }
        logFileManager.m5450c();
        codedOutputStream2.m5434g(10, 2);
        codedOutputStream2.m5436k(m5486a(j, str, amVar, thread, stackTraceElementArr, threadArr, (List) list, 8, (Map) map, runningAppProcessInfo, i, a, c1357d2, f, i2, z, j2, j3, a2));
        codedOutputStream2.m5418a(1, j);
        codedOutputStream2.m5419a(2, C1357d.m5533a(str));
        C1357d c1357d3 = a2;
        m5505a(codedOutputStream, amVar, thread, stackTraceElementArr, threadArr, list, 8, a, c1357d2, map, runningAppProcessInfo, i);
        m5507a(codedOutputStream, f, i2, z, i, j2, j3);
        m5506a(codedOutputStream2, c1357d3);
    }

    /* renamed from: a */
    private static void m5505a(CodedOutputStream codedOutputStream, am amVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C1357d c1357d, C1357d c1357d2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        codedOutputStream.m5434g(3, 2);
        codedOutputStream.m5436k(m5489a(amVar, thread, stackTraceElementArr, threadArr, (List) list, i, c1357d, c1357d2, (Map) map, runningAppProcessInfo, i2));
        m5504a(codedOutputStream, amVar, thread, stackTraceElementArr, threadArr, list, i, c1357d, c1357d2);
        if (map != null && map.isEmpty() == null) {
            m5513a(codedOutputStream, (Map) map);
        }
        if (runningAppProcessInfo != null) {
            codedOutputStream.m5420a(3, runningAppProcessInfo.importance != 100 ? true : null);
        }
        codedOutputStream.m5417a(4, i2);
    }

    /* renamed from: a */
    private static void m5504a(CodedOutputStream codedOutputStream, am amVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C1357d c1357d, C1357d c1357d2) {
        codedOutputStream.m5434g(1, 2);
        codedOutputStream.m5436k(m5488a(amVar, thread, stackTraceElementArr, threadArr, (List) list, i, c1357d, c1357d2));
        m5512a(codedOutputStream, thread, stackTraceElementArr, 4, true);
        thread = threadArr.length;
        for (int i2 = 0; i2 < thread; i2++) {
            m5512a(codedOutputStream, threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
        }
        m5503a(codedOutputStream, amVar, 1, i, 2);
        codedOutputStream.m5434g(3, 2);
        codedOutputStream.m5436k(m5484a());
        codedOutputStream.m5419a(1, f4252a);
        codedOutputStream.m5419a(2, f4252a);
        codedOutputStream.m5418a(3, 0);
        codedOutputStream.m5434g(4, 2);
        codedOutputStream.m5436k(m5491a(c1357d, c1357d2));
        codedOutputStream.m5418a(1, 0);
        codedOutputStream.m5418a(2, 0);
        codedOutputStream.m5419a(3, c1357d);
        if (c1357d2 != null) {
            codedOutputStream.m5419a(4, c1357d2);
        }
    }

    /* renamed from: a */
    private static void m5513a(CodedOutputStream codedOutputStream, Map<String, String> map) {
        map = map.entrySet().iterator();
        while (map.hasNext()) {
            Entry entry = (Entry) map.next();
            codedOutputStream.m5434g(2, 2);
            codedOutputStream.m5436k(m5497a((String) entry.getKey(), (String) entry.getValue()));
            codedOutputStream.m5419a(1, C1357d.m5533a((String) entry.getKey()));
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            codedOutputStream.m5419a(2, C1357d.m5533a(str));
        }
    }

    /* renamed from: a */
    private static void m5503a(CodedOutputStream codedOutputStream, am amVar, int i, int i2, int i3) {
        codedOutputStream.m5434g(i3, 2);
        codedOutputStream.m5436k(m5487a(amVar, 1, i2));
        codedOutputStream.m5419a(1, C1357d.m5533a(amVar.f4255b));
        String str = amVar.f4254a;
        if (str != null) {
            codedOutputStream.m5419a(3, C1357d.m5533a(str));
        }
        int i4 = 0;
        for (StackTraceElement a : amVar.f4256c) {
            m5500a(codedOutputStream, 4, a, true);
        }
        amVar = amVar.f4257d;
        if (amVar == null) {
            return;
        }
        if (i < i2) {
            m5503a(codedOutputStream, amVar, i + 1, i2, 6);
            return;
        }
        while (amVar != null) {
            amVar = amVar.f4257d;
            i4++;
        }
        codedOutputStream.m5417a(7, i4);
    }

    /* renamed from: a */
    private static void m5512a(CodedOutputStream codedOutputStream, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        codedOutputStream.m5434g(1, 2);
        codedOutputStream.m5436k(m5498a(thread, stackTraceElementArr, i, z));
        codedOutputStream.m5419a(1, C1357d.m5533a(thread.getName()));
        codedOutputStream.m5417a(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            m5500a(codedOutputStream, 3, a, z);
        }
    }

    /* renamed from: a */
    private static void m5500a(CodedOutputStream codedOutputStream, int i, StackTraceElement stackTraceElement, boolean z) {
        codedOutputStream.m5434g(i, 2);
        codedOutputStream.m5436k(m5496a(stackTraceElement, z));
        if (stackTraceElement.isNativeMethod() != 0) {
            codedOutputStream.m5418a(1, (long) Math.max(stackTraceElement.getLineNumber(), 0));
        } else {
            codedOutputStream.m5418a(1, 0);
        }
        i = new StringBuilder();
        i.append(stackTraceElement.getClassName());
        i.append(".");
        i.append(stackTraceElement.getMethodName());
        codedOutputStream.m5419a(2, C1357d.m5533a(i.toString()));
        if (stackTraceElement.getFileName() != 0) {
            codedOutputStream.m5419a(3, C1357d.m5533a(stackTraceElement.getFileName()));
        }
        int i2 = 4;
        if (stackTraceElement.isNativeMethod() == 0 && stackTraceElement.getLineNumber() > 0) {
            codedOutputStream.m5418a(4, (long) stackTraceElement.getLineNumber());
        }
        if (!z) {
            i2 = 0;
        }
        codedOutputStream.m5417a(5, i2);
    }

    /* renamed from: a */
    private static void m5507a(CodedOutputStream codedOutputStream, Float f, int i, boolean z, int i2, long j, long j2) {
        codedOutputStream.m5434g(5, 2);
        codedOutputStream.m5436k(m5495a(f, i, z, i2, j, j2));
        if (f != null) {
            codedOutputStream.m5416a(1, f.floatValue());
        }
        codedOutputStream.m5430c(2, i);
        codedOutputStream.m5420a(3, z);
        codedOutputStream.m5417a(4, i2);
        codedOutputStream.m5418a(5, j);
        codedOutputStream.m5418a(6, j2);
    }

    /* renamed from: a */
    private static void m5506a(CodedOutputStream codedOutputStream, C1357d c1357d) {
        if (c1357d != null) {
            codedOutputStream.m5434g(6, 2);
            codedOutputStream.m5436k(m5514b(c1357d));
            codedOutputStream.m5419a(1, c1357d);
        }
    }

    /* renamed from: a */
    private static int m5492a(C1357d c1357d, C1357d c1357d2, C1357d c1357d3, C1357d c1357d4, C1357d c1357d5, int i, C1357d c1357d6) {
        c1357d = ((CodedOutputStream.m5397b(1, c1357d) + 0) + CodedOutputStream.m5397b(2, c1357d3)) + CodedOutputStream.m5397b(3, c1357d4);
        c1357d2 = m5490a(c1357d2);
        c1357d = (c1357d + ((CodedOutputStream.m5410j(5) + CodedOutputStream.m5411l(c1357d2)) + c1357d2)) + CodedOutputStream.m5397b(6, c1357d5);
        if (c1357d6 != null) {
            c1357d = (c1357d + CodedOutputStream.m5397b(8, f4253b)) + CodedOutputStream.m5397b(9, c1357d6);
        }
        return c1357d + CodedOutputStream.m5405e(10, i);
    }

    /* renamed from: a */
    private static int m5490a(C1357d c1357d) {
        return CodedOutputStream.m5397b(1, c1357d) + 0;
    }

    /* renamed from: a */
    private static int m5493a(C1357d c1357d, C1357d c1357d2, boolean z) {
        return (((CodedOutputStream.m5405e(1, 3) + 0) + CodedOutputStream.m5397b(2, c1357d)) + CodedOutputStream.m5397b(3, c1357d2)) + CodedOutputStream.m5398b(4, z);
    }

    /* renamed from: a */
    private static int m5494a(DeviceIdentifierType deviceIdentifierType, String str) {
        return CodedOutputStream.m5405e(1, deviceIdentifierType.protobufIndex) + CodedOutputStream.m5397b(2, C1357d.m5533a(str));
    }

    /* renamed from: a */
    private static int m5485a(int i, C1357d c1357d, int i2, long j, long j2, boolean z, Map<DeviceIdentifierType, String> map, int i3, C1357d c1357d2, C1357d c1357d3) {
        int i4 = 0;
        i = CodedOutputStream.m5405e(3, i) + 0;
        if (c1357d == null) {
            c1357d = null;
        } else {
            c1357d = CodedOutputStream.m5397b(4, c1357d);
        }
        i = ((((i + c1357d) + CodedOutputStream.m5402d(5, i2)) + CodedOutputStream.m5396b(6, j)) + CodedOutputStream.m5396b(7, j2)) + CodedOutputStream.m5398b(10, z);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                i2 = m5494a((DeviceIdentifierType) entry.getKey(), (String) entry.getValue());
                i += (CodedOutputStream.m5410j(11) + CodedOutputStream.m5411l(i2)) + i2;
            }
        }
        i += CodedOutputStream.m5402d(12, i3);
        if (c1357d2 == null) {
            c1357d = null;
        } else {
            c1357d = CodedOutputStream.m5397b(13, c1357d2);
        }
        i += c1357d;
        if (c1357d3 != null) {
            i4 = CodedOutputStream.m5397b(14, c1357d3);
        }
        return i + i4;
    }

    /* renamed from: a */
    private static int m5491a(C1357d c1357d, C1357d c1357d2) {
        int b = ((CodedOutputStream.m5396b(1, 0) + 0) + CodedOutputStream.m5396b(2, 0)) + CodedOutputStream.m5397b(3, c1357d);
        return c1357d2 != null ? b + CodedOutputStream.m5397b(4, c1357d2) : b;
    }

    /* renamed from: a */
    private static int m5486a(long j, String str, am amVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2, C1357d c1357d, C1357d c1357d2, Float f, int i3, boolean z, long j2, long j3, C1357d c1357d3) {
        long j4 = j;
        int b = (CodedOutputStream.m5396b(1, j) + 0) + CodedOutputStream.m5397b(2, C1357d.m5533a(str));
        int a = m5489a(amVar, thread, stackTraceElementArr, threadArr, (List) list, i, c1357d, c1357d2, (Map) map, runningAppProcessInfo, i2);
        b += (CodedOutputStream.m5410j(3) + CodedOutputStream.m5411l(a)) + a;
        a = m5495a(f, i3, z, i2, j2, j3);
        b += (CodedOutputStream.m5410j(5) + CodedOutputStream.m5411l(a)) + a;
        if (c1357d3 == null) {
            return b;
        }
        a = m5514b(c1357d3);
        return b + ((CodedOutputStream.m5410j(6) + CodedOutputStream.m5411l(a)) + a);
    }

    /* renamed from: a */
    private static int m5489a(am amVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C1357d c1357d, C1357d c1357d2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        amVar = m5488a(amVar, thread, stackTraceElementArr, threadArr, (List) list, i, c1357d, c1357d2);
        stackTraceElementArr = (CodedOutputStream.m5410j(1) + CodedOutputStream.m5411l(amVar)) + amVar;
        boolean z = null;
        stackTraceElementArr += null;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                list = m5497a((String) entry.getKey(), (String) entry.getValue());
                stackTraceElementArr += (CodedOutputStream.m5410j(2) + CodedOutputStream.m5411l(list)) + list;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z = true;
            }
            stackTraceElementArr += CodedOutputStream.m5398b((int) 3, z);
        }
        return stackTraceElementArr + CodedOutputStream.m5402d(4, i2);
    }

    /* renamed from: a */
    private static int m5488a(am amVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C1357d c1357d, C1357d c1357d2) {
        thread = m5498a(thread, stackTraceElementArr, 4, true);
        stackTraceElementArr = ((CodedOutputStream.m5410j(1) + CodedOutputStream.m5411l(thread)) + thread) + null;
        int length = threadArr.length;
        int i2 = stackTraceElementArr;
        for (stackTraceElementArr = null; stackTraceElementArr < length; stackTraceElementArr++) {
            int a = m5498a(threadArr[stackTraceElementArr], (StackTraceElement[]) list.get(stackTraceElementArr), 0, false);
            i2 += (CodedOutputStream.m5410j(1) + CodedOutputStream.m5411l(a)) + a;
        }
        amVar = m5487a(amVar, 1, i);
        i2 += (CodedOutputStream.m5410j(2) + CodedOutputStream.m5411l(amVar)) + amVar;
        amVar = m5484a();
        i2 += (CodedOutputStream.m5410j(3) + CodedOutputStream.m5411l(amVar)) + amVar;
        amVar = m5491a(c1357d, c1357d2);
        return i2 + ((CodedOutputStream.m5410j(3) + CodedOutputStream.m5411l(amVar)) + amVar);
    }

    /* renamed from: a */
    private static int m5497a(String str, String str2) {
        str = CodedOutputStream.m5397b(1, C1357d.m5533a(str));
        if (str2 == null) {
            str2 = "";
        }
        return str + CodedOutputStream.m5397b(2, C1357d.m5533a(str2));
    }

    /* renamed from: a */
    private static int m5495a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + CodedOutputStream.m5395b(1, f.floatValue());
        }
        return ((((i3 + CodedOutputStream.m5407f(2, i)) + CodedOutputStream.m5398b(3, z)) + CodedOutputStream.m5402d(4, i2)) + CodedOutputStream.m5396b(5, j)) + CodedOutputStream.m5396b(6, j2);
    }

    /* renamed from: b */
    private static int m5514b(C1357d c1357d) {
        return CodedOutputStream.m5397b(1, c1357d);
    }

    /* renamed from: a */
    private static int m5487a(am amVar, int i, int i2) {
        int i3 = 0;
        int b = CodedOutputStream.m5397b(1, C1357d.m5533a(amVar.f4255b)) + 0;
        String str = amVar.f4254a;
        if (str != null) {
            b += CodedOutputStream.m5397b(3, C1357d.m5533a(str));
        }
        int i4 = b;
        for (StackTraceElement a : amVar.f4256c) {
            int a2 = m5496a(a, true);
            i4 += (CodedOutputStream.m5410j(4) + CodedOutputStream.m5411l(a2)) + a2;
        }
        amVar = amVar.f4257d;
        if (amVar == null) {
            return i4;
        }
        if (i < i2) {
            amVar = m5487a(amVar, i + 1, i2);
            return i4 + ((CodedOutputStream.m5410j(6) + CodedOutputStream.m5411l(amVar)) + amVar);
        }
        while (amVar != null) {
            amVar = amVar.f4257d;
            i3++;
        }
        return i4 + CodedOutputStream.m5402d(7, i3);
    }

    /* renamed from: a */
    private static int m5484a() {
        return ((CodedOutputStream.m5397b(1, f4252a) + 0) + CodedOutputStream.m5397b(2, f4252a)) + CodedOutputStream.m5396b(3, 0);
    }

    /* renamed from: a */
    private static int m5496a(StackTraceElement stackTraceElement, boolean z) {
        int b;
        int i = 0;
        if (stackTraceElement.isNativeMethod()) {
            b = CodedOutputStream.m5396b(1, (long) Math.max(stackTraceElement.getLineNumber(), 0)) + 0;
        } else {
            b = CodedOutputStream.m5396b(1, 0) + 0;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stackTraceElement.getClassName());
        stringBuilder.append(".");
        stringBuilder.append(stackTraceElement.getMethodName());
        b += CodedOutputStream.m5397b(2, C1357d.m5533a(stringBuilder.toString()));
        if (stackTraceElement.getFileName() != null) {
            b += CodedOutputStream.m5397b(3, C1357d.m5533a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b += CodedOutputStream.m5396b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return b + CodedOutputStream.m5402d(5, i);
    }

    /* renamed from: a */
    private static int m5498a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        thread = CodedOutputStream.m5397b(1, C1357d.m5533a(thread.getName())) + CodedOutputStream.m5402d(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            int a2 = m5496a(a, z);
            thread += (CodedOutputStream.m5410j(3) + CodedOutputStream.m5411l(a2)) + a2;
        }
        return thread;
    }

    /* renamed from: a */
    private static C1357d m5499a(String str) {
        return str == null ? null : C1357d.m5533a(str);
    }
}
