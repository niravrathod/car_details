package com.cuvora.carinfo.models.homepage;

import java.io.Serializable;
import java.util.Objects;

public class Element implements Serializable {
    private Action action;
    private Content content;
    private ElementType elementType = ElementType.DEFAULT;

    public ElementType getElementType() {
        return this.elementType;
    }

    public void setElementType(ElementType elementType) {
        this.elementType = elementType;
    }

    public Action getAction() {
        return this.action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Content getContent() {
        return this.content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Element)) {
            return false;
        }
        Element element = (Element) obj;
        if (!Objects.equals(this.action, element.action) || Objects.equals(this.content, element.content) == null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.action, this.content});
    }
}
