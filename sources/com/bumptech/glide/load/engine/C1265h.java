package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* renamed from: com.bumptech.glide.load.engine.h */
public abstract class C1265h {
    /* renamed from: a */
    public static final C1265h f4008a = new C34821();
    /* renamed from: b */
    public static final C1265h f4009b = new C34832();
    /* renamed from: c */
    public static final C1265h f4010c = new C34843();
    /* renamed from: d */
    public static final C1265h f4011d = new C34854();
    /* renamed from: e */
    public static final C1265h f4012e = new C34865();

    /* renamed from: com.bumptech.glide.load.engine.h$1 */
    class C34821 extends C1265h {
        /* renamed from: a */
        public boolean mo1033a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo1036b() {
            return true;
        }

        C34821() {
        }

        /* renamed from: a */
        public boolean mo1034a(DataSource dataSource) {
            return dataSource == DataSource.REMOTE ? true : null;
        }

        /* renamed from: a */
        public boolean mo1035a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$2 */
    class C34832 extends C1265h {
        /* renamed from: a */
        public boolean mo1033a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo1034a(DataSource dataSource) {
            return false;
        }

        /* renamed from: a */
        public boolean mo1035a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1036b() {
            return false;
        }

        C34832() {
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$3 */
    class C34843 extends C1265h {
        /* renamed from: a */
        public boolean mo1033a() {
            return false;
        }

        /* renamed from: a */
        public boolean mo1035a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1036b() {
            return true;
        }

        C34843() {
        }

        /* renamed from: a */
        public boolean mo1034a(DataSource dataSource) {
            return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? null : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$4 */
    class C34854 extends C1265h {
        /* renamed from: a */
        public boolean mo1033a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo1034a(DataSource dataSource) {
            return false;
        }

        /* renamed from: b */
        public boolean mo1036b() {
            return false;
        }

        C34854() {
        }

        /* renamed from: a */
        public boolean mo1035a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.h$5 */
    class C34865 extends C1265h {
        /* renamed from: a */
        public boolean mo1033a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo1036b() {
            return true;
        }

        C34865() {
        }

        /* renamed from: a */
        public boolean mo1034a(DataSource dataSource) {
            return dataSource == DataSource.REMOTE ? true : null;
        }

        /* renamed from: a */
        public boolean mo1035a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
            return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo1033a();

    /* renamed from: a */
    public abstract boolean mo1034a(DataSource dataSource);

    /* renamed from: a */
    public abstract boolean mo1035a(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);

    /* renamed from: b */
    public abstract boolean mo1036b();
}
