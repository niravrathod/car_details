package com.j256.ormlite.dao;

import com.j256.ormlite.field.FieldType;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.SelectArg;
import com.j256.ormlite.stmt.mapped.MappedPreparedStmt;
import java.io.Serializable;
import java.util.Collection;

public abstract class BaseForeignCollection<T, ID> implements ForeignCollection<T>, Serializable {
    private static final long serialVersionUID = -5158840898186237589L;
    protected final transient Dao<T, ID> dao;
    private final transient FieldType foreignFieldType;
    private final transient boolean orderAscending;
    private final transient String orderColumn;
    private final transient Object parent;
    private final transient Object parentId;
    private transient PreparedQuery<T> preparedQuery;

    public abstract boolean remove(Object obj);

    public abstract boolean removeAll(Collection<?> collection);

    protected BaseForeignCollection(Dao<T, ID> dao, Object obj, Object obj2, FieldType fieldType, String str, boolean z) {
        this.dao = dao;
        this.foreignFieldType = fieldType;
        this.parentId = obj2;
        this.orderColumn = str;
        this.orderAscending = z;
        this.parent = obj;
    }

    public boolean add(T t) {
        try {
            return addElement(t);
        } catch (T t2) {
            throw new IllegalStateException("Could not create data element in dao", t2);
        }
    }

    public boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (Object addElement : collection) {
            try {
                if (addElement(addElement)) {
                    z = true;
                }
            } catch (Collection<? extends T> collection2) {
                throw new IllegalStateException("Could not create data elements in dao", collection2);
            }
        }
        return z;
    }

    public boolean retainAll(java.util.Collection<?> r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r3 = this;
        r0 = r3.dao;
        r1 = 0;
        if (r0 != 0) goto L_0x0006;
    L_0x0005:
        return r1;
    L_0x0006:
        r0 = r3.closeableIterator();
    L_0x000a:
        r2 = r0.hasNext();	 Catch:{ all -> 0x0023 }
        if (r2 == 0) goto L_0x001f;	 Catch:{ all -> 0x0023 }
    L_0x0010:
        r2 = r0.next();	 Catch:{ all -> 0x0023 }
        r2 = r4.contains(r2);	 Catch:{ all -> 0x0023 }
        if (r2 != 0) goto L_0x000a;	 Catch:{ all -> 0x0023 }
    L_0x001a:
        r0.remove();	 Catch:{ all -> 0x0023 }
        r1 = 1;
        goto L_0x000a;
    L_0x001f:
        r0.close();	 Catch:{ SQLException -> 0x0022 }
    L_0x0022:
        return r1;
    L_0x0023:
        r4 = move-exception;
        r0.close();	 Catch:{ SQLException -> 0x0027 }
    L_0x0027:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.BaseForeignCollection.retainAll(java.util.Collection):boolean");
    }

    public void clear() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/509891820.run(Unknown Source)
*/
        /*
        r2 = this;
        r0 = r2.dao;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r0 = r2.closeableIterator();
    L_0x0009:
        r1 = r0.hasNext();	 Catch:{ all -> 0x001a }
        if (r1 == 0) goto L_0x0016;	 Catch:{ all -> 0x001a }
    L_0x000f:
        r0.next();	 Catch:{ all -> 0x001a }
        r0.remove();	 Catch:{ all -> 0x001a }
        goto L_0x0009;
    L_0x0016:
        r0.close();	 Catch:{ SQLException -> 0x0019 }
    L_0x0019:
        return;
    L_0x001a:
        r1 = move-exception;
        r0.close();	 Catch:{ SQLException -> 0x001e }
    L_0x001e:
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.j256.ormlite.dao.BaseForeignCollection.clear():void");
    }

    public int update(T t) {
        if (this.dao == null) {
            return null;
        }
        return this.dao.update((Object) t);
    }

    public int refresh(T t) {
        if (this.dao == null) {
            return null;
        }
        return this.dao.refresh(t);
    }

    protected PreparedQuery<T> getPreparedQuery() {
        if (this.dao == null) {
            return null;
        }
        if (this.preparedQuery == null) {
            SelectArg selectArg = new SelectArg();
            selectArg.setValue(this.parentId);
            QueryBuilder queryBuilder = this.dao.queryBuilder();
            if (this.orderColumn != null) {
                queryBuilder.orderBy(this.orderColumn, this.orderAscending);
            }
            this.preparedQuery = queryBuilder.where().eq(this.foreignFieldType.getColumnName(), selectArg).prepare();
            if (this.preparedQuery instanceof MappedPreparedStmt) {
                ((MappedPreparedStmt) this.preparedQuery).setParentInformation(this.parent, this.parentId);
            }
        }
        return this.preparedQuery;
    }

    private boolean addElement(T t) {
        if (this.dao == null) {
            return null;
        }
        if (this.parent != null && this.foreignFieldType.getFieldValueIfNotDefault(t) == null) {
            this.foreignFieldType.assignField(t, this.parent, true, null);
        }
        this.dao.create(t);
        return true;
    }
}
