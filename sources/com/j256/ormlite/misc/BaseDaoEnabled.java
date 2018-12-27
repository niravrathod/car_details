package com.j256.ormlite.misc;

import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;

public abstract class BaseDaoEnabled<T, ID> {
    protected transient Dao<T, ID> dao;

    public int create() {
        checkForDao();
        return this.dao.create(this);
    }

    public int refresh() {
        checkForDao();
        return this.dao.refresh(this);
    }

    public int update() {
        checkForDao();
        return this.dao.update((Object) this);
    }

    public int updateId(ID id) {
        checkForDao();
        return this.dao.updateId(this, id);
    }

    public int delete() {
        checkForDao();
        return this.dao.delete((Object) this);
    }

    public String objectToString() {
        try {
            checkForDao();
            return this.dao.objectToString(this);
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public ID extractId() {
        checkForDao();
        return this.dao.extractId(this);
    }

    public boolean objectsEqual(T t) {
        checkForDao();
        return this.dao.objectsEqual(this, t);
    }

    public void setDao(Dao<T, ID> dao) {
        this.dao = dao;
    }

    public Dao<T, ID> getDao() {
        return this.dao;
    }

    private void checkForDao() {
        if (this.dao == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Dao has not been set on ");
            stringBuilder.append(getClass());
            stringBuilder.append(" object: ");
            stringBuilder.append(this);
            throw new SQLException(stringBuilder.toString());
        }
    }
}
