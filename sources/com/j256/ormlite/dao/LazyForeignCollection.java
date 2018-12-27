package com.j256.ormlite.dao;

import com.j256.ormlite.field.FieldType;
import java.io.Serializable;

public class LazyForeignCollection<T, ID> extends BaseForeignCollection<T, ID> implements ForeignCollection<T>, Serializable {
    private static final long serialVersionUID = -5460708106909626233L;
    private transient CloseableIterator<T> lastIterator;

    public boolean isEager() {
        return false;
    }

    public int refreshCollection() {
        return 0;
    }

    public LazyForeignCollection(Dao<T, ID> dao, Object obj, Object obj2, FieldType fieldType, String str, boolean z) {
        super(dao, obj, obj2, fieldType, str, z);
    }

    public CloseableIterator<T> iterator() {
        return closeableIterator(-1);
    }

    public CloseableIterator<T> iterator(int i) {
        return closeableIterator(i);
    }

    public CloseableIterator<T> closeableIterator() {
        return closeableIterator(-1);
    }

    public CloseableIterator<T> closeableIterator(int i) {
        try {
            return iteratorThrow(i);
        } catch (int i2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Could not build lazy iterator for ");
            stringBuilder.append(this.dao.getDataClass());
            throw new IllegalStateException(stringBuilder.toString(), i2);
        }
    }

    public CloseableIterator<T> iteratorThrow() {
        return iteratorThrow(-1);
    }

    public CloseableIterator<T> iteratorThrow(int i) {
        this.lastIterator = seperateIteratorThrow(i);
        return this.lastIterator;
    }

    public CloseableWrappedIterable<T> getWrappedIterable() {
        return getWrappedIterable(-1);
    }

    public CloseableWrappedIterable<T> getWrappedIterable(final int i) {
        return new CloseableWrappedIterableImpl(new CloseableIterable<T>() {
            public CloseableIterator<T> iterator() {
                return closeableIterator();
            }

            public CloseableIterator<T> closeableIterator() {
                try {
                    return LazyForeignCollection.this.seperateIteratorThrow(i);
                } catch (Throwable e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not build lazy iterator for ");
                    stringBuilder.append(LazyForeignCollection.this.dao.getDataClass());
                    throw new IllegalStateException(stringBuilder.toString(), e);
                }
            }
        });
    }

    public void closeLastIterator() {
        if (this.lastIterator != null) {
            this.lastIterator.close();
            this.lastIterator = null;
        }
    }

    public int size() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.iterator();
        r1 = 0;
    L_0x0005:
        r2 = r0.hasNext();	 Catch:{ all -> 0x0015 }
        if (r2 == 0) goto L_0x0011;	 Catch:{ all -> 0x0015 }
    L_0x000b:
        r0.moveToNext();	 Catch:{ all -> 0x0015 }
        r1 = r1 + 1;
        goto L_0x0005;
    L_0x0011:
        r0.close();	 Catch:{ SQLException -> 0x0014 }
    L_0x0014:
        return r1;
    L_0x0015:
        r1 = move-exception;
        r0.close();	 Catch:{ SQLException -> 0x0019 }
    L_0x0019:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.LazyForeignCollection.size():int");
    }

    public boolean isEmpty() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.iterator();
        r1 = r0.hasNext();	 Catch:{ all -> 0x000e }
        r1 = r1 ^ 1;
        r0.close();	 Catch:{ SQLException -> 0x000d }
    L_0x000d:
        return r1;
    L_0x000e:
        r1 = move-exception;
        r0.close();	 Catch:{ SQLException -> 0x0012 }
    L_0x0012:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.LazyForeignCollection.isEmpty():boolean");
    }

    public boolean contains(java.lang.Object r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.iterator();
    L_0x0004:
        r1 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x0019;	 Catch:{ all -> 0x001e }
    L_0x000a:
        r1 = r0.next();	 Catch:{ all -> 0x001e }
        r1 = r1.equals(r3);	 Catch:{ all -> 0x001e }
        if (r1 == 0) goto L_0x0004;
    L_0x0014:
        r3 = 1;
        r0.close();	 Catch:{ SQLException -> 0x0018 }
    L_0x0018:
        return r3;
    L_0x0019:
        r3 = 0;
        r0.close();	 Catch:{ SQLException -> 0x001d }
    L_0x001d:
        return r3;
    L_0x001e:
        r3 = move-exception;
        r0.close();	 Catch:{ SQLException -> 0x0022 }
    L_0x0022:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.LazyForeignCollection.contains(java.lang.Object):boolean");
    }

    public boolean containsAll(java.util.Collection<?> r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new java.util.HashSet;
        r0.<init>(r3);
        r3 = r2.iterator();
    L_0x0009:
        r1 = r3.hasNext();	 Catch:{ all -> 0x001f }
        if (r1 == 0) goto L_0x0017;	 Catch:{ all -> 0x001f }
    L_0x000f:
        r1 = r3.next();	 Catch:{ all -> 0x001f }
        r0.remove(r1);	 Catch:{ all -> 0x001f }
        goto L_0x0009;	 Catch:{ all -> 0x001f }
    L_0x0017:
        r0 = r0.isEmpty();	 Catch:{ all -> 0x001f }
        r3.close();	 Catch:{ SQLException -> 0x001e }
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = move-exception;
        r3.close();	 Catch:{ SQLException -> 0x0023 }
    L_0x0023:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.LazyForeignCollection.containsAll(java.util.Collection):boolean");
    }

    public boolean remove(java.lang.Object r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = r2.iterator();
    L_0x0004:
        r1 = r0.hasNext();	 Catch:{ all -> 0x0021 }
        if (r1 == 0) goto L_0x001c;	 Catch:{ all -> 0x0021 }
    L_0x000a:
        r1 = r0.next();	 Catch:{ all -> 0x0021 }
        r1 = r1.equals(r3);	 Catch:{ all -> 0x0021 }
        if (r1 == 0) goto L_0x0004;	 Catch:{ all -> 0x0021 }
    L_0x0014:
        r0.remove();	 Catch:{ all -> 0x0021 }
        r3 = 1;
        r0.close();	 Catch:{ SQLException -> 0x001b }
    L_0x001b:
        return r3;
    L_0x001c:
        r3 = 0;
        r0.close();	 Catch:{ SQLException -> 0x0020 }
    L_0x0020:
        return r3;
    L_0x0021:
        r3 = move-exception;
        r0.close();	 Catch:{ SQLException -> 0x0025 }
    L_0x0025:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.LazyForeignCollection.remove(java.lang.Object):boolean");
    }

    public boolean removeAll(java.util.Collection<?> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.iterator();
        r1 = 0;
    L_0x0005:
        r2 = r0.hasNext();	 Catch:{ all -> 0x001e }
        if (r2 == 0) goto L_0x001a;	 Catch:{ all -> 0x001e }
    L_0x000b:
        r2 = r0.next();	 Catch:{ all -> 0x001e }
        r2 = r4.contains(r2);	 Catch:{ all -> 0x001e }
        if (r2 == 0) goto L_0x0005;	 Catch:{ all -> 0x001e }
    L_0x0015:
        r0.remove();	 Catch:{ all -> 0x001e }
        r1 = 1;
        goto L_0x0005;
    L_0x001a:
        r0.close();	 Catch:{ SQLException -> 0x001d }
    L_0x001d:
        return r1;
    L_0x001e:
        r4 = move-exception;
        r0.close();	 Catch:{ SQLException -> 0x0022 }
    L_0x0022:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.LazyForeignCollection.removeAll(java.util.Collection):boolean");
    }

    public java.lang.Object[] toArray() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r1 = r3.iterator();
    L_0x0009:
        r2 = r1.hasNext();	 Catch:{ all -> 0x001f }
        if (r2 == 0) goto L_0x0017;	 Catch:{ all -> 0x001f }
    L_0x000f:
        r2 = r1.next();	 Catch:{ all -> 0x001f }
        r0.add(r2);	 Catch:{ all -> 0x001f }
        goto L_0x0009;	 Catch:{ all -> 0x001f }
    L_0x0017:
        r0 = r0.toArray();	 Catch:{ all -> 0x001f }
        r1.close();	 Catch:{ SQLException -> 0x001e }
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = move-exception;
        r1.close();	 Catch:{ SQLException -> 0x0023 }
    L_0x0023:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.LazyForeignCollection.toArray():java.lang.Object[]");
    }

    public <E> E[] toArray(E[] r10) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r9 = this;
        r0 = r9.iterator();
        r1 = 0;
        r2 = 0;
        r4 = r2;
        r3 = 0;
    L_0x0008:
        r5 = r0.hasNext();	 Catch:{ all -> 0x0043 }
        if (r5 == 0) goto L_0x0031;	 Catch:{ all -> 0x0043 }
    L_0x000e:
        r5 = r0.next();	 Catch:{ all -> 0x0043 }
        r6 = r10.length;	 Catch:{ all -> 0x0043 }
        if (r3 < r6) goto L_0x002c;	 Catch:{ all -> 0x0043 }
    L_0x0015:
        if (r4 != 0) goto L_0x0028;	 Catch:{ all -> 0x0043 }
    L_0x0017:
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0043 }
        r4.<init>();	 Catch:{ all -> 0x0043 }
        r6 = r10.length;	 Catch:{ all -> 0x0043 }
        r7 = 0;	 Catch:{ all -> 0x0043 }
    L_0x001e:
        if (r7 >= r6) goto L_0x0028;	 Catch:{ all -> 0x0043 }
    L_0x0020:
        r8 = r10[r7];	 Catch:{ all -> 0x0043 }
        r4.add(r8);	 Catch:{ all -> 0x0043 }
        r7 = r7 + 1;	 Catch:{ all -> 0x0043 }
        goto L_0x001e;	 Catch:{ all -> 0x0043 }
    L_0x0028:
        r4.add(r5);	 Catch:{ all -> 0x0043 }
        goto L_0x002e;	 Catch:{ all -> 0x0043 }
    L_0x002c:
        r10[r3] = r5;	 Catch:{ all -> 0x0043 }
    L_0x002e:
        r3 = r3 + 1;
        goto L_0x0008;
    L_0x0031:
        r0.close();	 Catch:{ SQLException -> 0x0034 }
    L_0x0034:
        if (r4 != 0) goto L_0x003e;
    L_0x0036:
        r0 = r10.length;
        r0 = r0 + -1;
        if (r3 >= r0) goto L_0x003d;
    L_0x003b:
        r10[r3] = r2;
    L_0x003d:
        return r10;
    L_0x003e:
        r10 = r4.toArray(r10);
        return r10;
    L_0x0043:
        r10 = move-exception;
        r0.close();	 Catch:{ SQLException -> 0x0047 }
    L_0x0047:
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.LazyForeignCollection.toArray(java.lang.Object[]):E[]");
    }

    public int updateAll() {
        throw new UnsupportedOperationException("Cannot call updateAll() on a lazy collection.");
    }

    public int refreshAll() {
        throw new UnsupportedOperationException("Cannot call updateAll() on a lazy collection.");
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public int hashCode() {
        return super.hashCode();
    }

    private CloseableIterator<T> seperateIteratorThrow(int i) {
        if (this.dao != null) {
            return this.dao.iterator(getPreparedQuery(), i);
        }
        throw new IllegalStateException("Internal DAO object is null.  Lazy collections cannot be used if they have been deserialized.");
    }
}
