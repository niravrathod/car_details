package com.cuvora.carinfo.models;

import kotlin.jvm.internal.C2885g;

public final class ServerApiResponse<T> {
    private final T data;
    private final ErrorResponse errors;

    public static /* synthetic */ ServerApiResponse copy$default(ServerApiResponse serverApiResponse, ErrorResponse errorResponse, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            errorResponse = serverApiResponse.errors;
        }
        if ((i & 2) != 0) {
            obj = serverApiResponse.data;
        }
        return serverApiResponse.copy(errorResponse, obj);
    }

    public final ErrorResponse component1() {
        return this.errors;
    }

    public final T component2() {
        return this.data;
    }

    public final ServerApiResponse<T> copy(ErrorResponse errorResponse, T t) {
        return new ServerApiResponse(errorResponse, t);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ServerApiResponse) {
                ServerApiResponse serverApiResponse = (ServerApiResponse) obj;
                if (C2885g.m13909a(this.errors, serverApiResponse.errors) && C2885g.m13909a(this.data, serverApiResponse.data)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        ErrorResponse errorResponse = this.errors;
        int i = 0;
        int hashCode = (errorResponse != null ? errorResponse.hashCode() : 0) * 31;
        Object obj = this.data;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ServerApiResponse(errors=");
        stringBuilder.append(this.errors);
        stringBuilder.append(", data=");
        stringBuilder.append(this.data);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public ServerApiResponse(ErrorResponse errorResponse, T t) {
        this.errors = errorResponse;
        this.data = t;
    }

    public final T getData() {
        return this.data;
    }

    public final ErrorResponse getErrors() {
        return this.errors;
    }
}
