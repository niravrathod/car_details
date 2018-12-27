package com.feedbox.data.network.model;

import com.google.gson.p140a.C2619a;
import com.google.gson.p140a.C2621c;
import java.io.Serializable;
import kotlin.jvm.internal.C2885g;

public final class Content implements Serializable {
    @C2621c(a = "action")
    @C2619a
    private final Action action;
    @C2621c(a = "aspectRatio")
    @C2619a
    private final String aspectRatio;
    @C2621c(a = "type")
    @C2619a
    private final String contentType;
    @C2621c(a = "dislikeCount")
    @C2619a
    private final String dislike;
    @C2621c(a = "duration")
    @C2619a
    private final String duration;
    @C2621c(a = "id")
    @C2619a
    private final String id;
    @C2621c(a = "images")
    @C2619a
    private final Images images;
    @C2621c(a = "likeCount")
    @C2619a
    private final String like;
    @C2621c(a = "longDescription")
    @C2619a
    private final String longDescription;
    @C2621c(a = "longTitle")
    @C2619a
    private final String longTitle;
    @C2621c(a = "videoId")
    @C2619a
    private final String playId;
    @C2621c(a = "subtitle")
    @C2619a
    private final String subtitle;
    @C2621c(a = "title")
    @C2619a
    private final String title;
    @C2621c(a = "views")
    @C2619a
    private final String views;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Content) {
                Content content = (Content) obj;
                if (C2885g.m13909a(this.id, content.id) && C2885g.m13909a(this.contentType, content.contentType) && C2885g.m13909a(this.action, content.action) && C2885g.m13909a(this.playId, content.playId) && C2885g.m13909a(this.images, content.images) && C2885g.m13909a(this.title, content.title) && C2885g.m13909a(this.longDescription, content.longDescription) && C2885g.m13909a(this.views, content.views) && C2885g.m13909a(this.duration, content.duration) && C2885g.m13909a(this.like, content.like) && C2885g.m13909a(this.dislike, content.dislike) && C2885g.m13909a(this.subtitle, content.subtitle) && C2885g.m13909a(this.aspectRatio, content.aspectRatio) && C2885g.m13909a(this.longTitle, content.longTitle)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.contentType;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Action action = this.action;
        hashCode = (hashCode + (action != null ? action.hashCode() : 0)) * 31;
        str2 = this.playId;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Images images = this.images;
        hashCode = (hashCode + (images != null ? images.hashCode() : 0)) * 31;
        str2 = this.title;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.longDescription;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.views;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.duration;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.like;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dislike;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.subtitle;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.aspectRatio;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.longTitle;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Content(id=");
        stringBuilder.append(this.id);
        stringBuilder.append(", contentType=");
        stringBuilder.append(this.contentType);
        stringBuilder.append(", action=");
        stringBuilder.append(this.action);
        stringBuilder.append(", playId=");
        stringBuilder.append(this.playId);
        stringBuilder.append(", images=");
        stringBuilder.append(this.images);
        stringBuilder.append(", title=");
        stringBuilder.append(this.title);
        stringBuilder.append(", longDescription=");
        stringBuilder.append(this.longDescription);
        stringBuilder.append(", views=");
        stringBuilder.append(this.views);
        stringBuilder.append(", duration=");
        stringBuilder.append(this.duration);
        stringBuilder.append(", like=");
        stringBuilder.append(this.like);
        stringBuilder.append(", dislike=");
        stringBuilder.append(this.dislike);
        stringBuilder.append(", subtitle=");
        stringBuilder.append(this.subtitle);
        stringBuilder.append(", aspectRatio=");
        stringBuilder.append(this.aspectRatio);
        stringBuilder.append(", longTitle=");
        stringBuilder.append(this.longTitle);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m7689a() {
        return this.id;
    }

    /* renamed from: b */
    public final String m7690b() {
        return this.contentType;
    }

    /* renamed from: c */
    public final Action m7691c() {
        return this.action;
    }

    /* renamed from: d */
    public final String m7692d() {
        return this.playId;
    }

    /* renamed from: e */
    public final Images m7693e() {
        return this.images;
    }

    /* renamed from: f */
    public final String m7694f() {
        return this.title;
    }

    /* renamed from: g */
    public final String m7695g() {
        return this.longDescription;
    }

    /* renamed from: h */
    public final String m7696h() {
        return this.views;
    }

    /* renamed from: i */
    public final String m7697i() {
        return this.duration;
    }

    /* renamed from: j */
    public final String m7698j() {
        return this.like;
    }

    /* renamed from: k */
    public final String m7699k() {
        return this.dislike;
    }

    /* renamed from: l */
    public final String m7700l() {
        return this.subtitle;
    }

    /* renamed from: m */
    public final String m7701m() {
        return this.aspectRatio;
    }

    /* renamed from: n */
    public final String m7702n() {
        return this.longTitle;
    }
}
