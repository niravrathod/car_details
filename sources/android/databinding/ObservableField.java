package android.databinding;

import java.io.Serializable;

public class ObservableField<T> extends C4398b implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField(T t) {
        this.mValue = t;
    }

    /* renamed from: a */
    public T m27554a() {
        return this.mValue;
    }
}
