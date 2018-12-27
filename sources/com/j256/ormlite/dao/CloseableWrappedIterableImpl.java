package com.j256.ormlite.dao;

public class CloseableWrappedIterableImpl<T> implements CloseableWrappedIterable<T> {
    private final CloseableIterable<T> iterable;
    private CloseableIterator<T> iterator;

    public CloseableWrappedIterableImpl(CloseableIterable<T> closeableIterable) {
        this.iterable = closeableIterable;
    }

    public CloseableIterator<T> iterator() {
        return closeableIterator();
    }

    public com.j256.ormlite.dao.CloseableIterator<T> closeableIterator() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r1 = this;
        r1.close();	 Catch:{ SQLException -> 0x0003 }
    L_0x0003:
        r0 = r1.iterable;
        r0 = r0.closeableIterator();
        r1.iterator = r0;
        r0 = r1.iterator;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.CloseableWrappedIterableImpl.closeableIterator():com.j256.ormlite.dao.CloseableIterator<T>");
    }

    public void close() {
        if (this.iterator != null) {
            this.iterator.close();
            this.iterator = null;
        }
    }
}
