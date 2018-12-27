package android.support.p007c.p008a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.content.p014a.C0388c;
import android.support.v4.p009a.p010a.C0295a;
import android.support.v4.p017f.C3131a;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.c.a.c */
public class C4399c extends C3018h implements C0072b {
    /* renamed from: a */
    final Callback f18303a;
    /* renamed from: c */
    private C0074a f18304c;
    /* renamed from: d */
    private Context f18305d;
    /* renamed from: e */
    private ArgbEvaluator f18306e;
    /* renamed from: f */
    private AnimatorListener f18307f;
    /* renamed from: g */
    private ArrayList<Object> f18308g;

    /* renamed from: android.support.c.a.c$1 */
    class C00731 implements Callback {
        /* renamed from: a */
        final /* synthetic */ C4399c f93a;

        C00731(C4399c c4399c) {
            this.f93a = c4399c;
        }

        public void invalidateDrawable(Drawable drawable) {
            this.f93a.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f93a.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f93a.unscheduleSelf(runnable);
        }
    }

    /* renamed from: android.support.c.a.c$a */
    private static class C0074a extends ConstantState {
        /* renamed from: a */
        int f94a;
        /* renamed from: b */
        C4400i f95b;
        /* renamed from: c */
        AnimatorSet f96c;
        /* renamed from: d */
        C3131a<Animator, String> f97d;
        /* renamed from: e */
        private ArrayList<Animator> f98e;

        public C0074a(Context context, C0074a c0074a, Callback callback, Resources resources) {
            if (c0074a != null) {
                this.f94a = c0074a.f94a;
                int i = 0;
                if (c0074a.f95b != null) {
                    context = c0074a.f95b.getConstantState();
                    if (resources != null) {
                        this.f95b = (C4400i) context.newDrawable(resources);
                    } else {
                        this.f95b = (C4400i) context.newDrawable();
                    }
                    this.f95b = (C4400i) this.f95b.mutate();
                    this.f95b.setCallback(callback);
                    this.f95b.setBounds(c0074a.f95b.getBounds());
                    this.f95b.m24040a(false);
                }
                if (c0074a.f98e != null) {
                    int size = c0074a.f98e.size();
                    this.f98e = new ArrayList(size);
                    this.f97d = new C3131a(size);
                    while (i < size) {
                        Animator animator = (Animator) c0074a.f98e.get(i);
                        resources = animator.clone();
                        String str = (String) c0074a.f97d.get(animator);
                        resources.setTarget(this.f95b.m24039a(str));
                        this.f98e.add(resources);
                        this.f97d.put(resources, str);
                        i++;
                    }
                    m142a();
                }
            }
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public int getChangingConfigurations() {
            return this.f94a;
        }

        /* renamed from: a */
        public void m142a() {
            if (this.f96c == null) {
                this.f96c = new AnimatorSet();
            }
            this.f96c.playTogether(this.f98e);
        }
    }

    /* renamed from: android.support.c.a.c$b */
    private static class C0075b extends ConstantState {
        /* renamed from: a */
        private final ConstantState f99a;

        public C0075b(ConstantState constantState) {
            this.f99a = constantState;
        }

        public Drawable newDrawable() {
            Drawable c4399c = new C4399c();
            c4399c.b = this.f99a.newDrawable();
            c4399c.b.setCallback(c4399c.f18303a);
            return c4399c;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable c4399c = new C4399c();
            c4399c.b = this.f99a.newDrawable(resources);
            c4399c.b.setCallback(c4399c.f18303a);
            return c4399c;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c4399c = new C4399c();
            c4399c.b = this.f99a.newDrawable(resources, theme);
            c4399c.b.setCallback(c4399c.f18303a);
            return c4399c;
        }

        public boolean canApplyTheme() {
            return this.f99a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f99a.getChangingConfigurations();
        }
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    C4399c() {
        this(null, null, null);
    }

    private C4399c(Context context) {
        this(context, null, null);
    }

    private C4399c(Context context, C0074a c0074a, Resources resources) {
        this.f18306e = null;
        this.f18307f = null;
        this.f18308g = null;
        this.f18303a = new C00731(this);
        this.f18305d = context;
        if (c0074a != null) {
            this.f18304c = c0074a;
        } else {
            this.f18304c = new C0074a(context, c0074a, this.f18303a, resources);
        }
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        }
        return this;
    }

    /* renamed from: a */
    public static C4399c m24028a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C4399c c4399c = new C4399c(context);
        c4399c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c4399c;
    }

    public ConstantState getConstantState() {
        return (this.b == null || VERSION.SDK_INT < 24) ? null : new C0075b(this.b.getConstantState());
    }

    public int getChangingConfigurations() {
        if (this.b != null) {
            return this.b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f18304c.f94a;
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.f18304c.f95b.draw(canvas);
        if (this.f18304c.f96c.isStarted() != null) {
            invalidateSelf();
        }
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.f18304c.f95b.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        return this.f18304c.f95b.setState(iArr);
    }

    protected boolean onLevelChange(int i) {
        if (this.b != null) {
            return this.b.setLevel(i);
        }
        return this.f18304c.f95b.setLevel(i);
    }

    public int getAlpha() {
        if (this.b != null) {
            return C0295a.m1057c(this.b);
        }
        return this.f18304c.f95b.getAlpha();
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.f18304c.f95b.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
        } else {
            this.f18304c.f95b.setColorFilter(colorFilter);
        }
    }

    public void setTint(int i) {
        if (this.b != null) {
            C0295a.m1048a(this.b, i);
        } else {
            this.f18304c.f95b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0295a.m1050a(this.b, colorStateList);
        } else {
            this.f18304c.f95b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            C0295a.m1053a(this.b, mode);
        } else {
            this.f18304c.f95b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.f18304c.f95b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public boolean isStateful() {
        if (this.b != null) {
            return this.b.isStateful();
        }
        return this.f18304c.f95b.isStateful();
    }

    public int getOpacity() {
        if (this.b != null) {
            return this.b.getOpacity();
        }
        return this.f18304c.f95b.getOpacity();
    }

    public int getIntrinsicWidth() {
        if (this.b != null) {
            return this.b.getIntrinsicWidth();
        }
        return this.f18304c.f95b.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        if (this.b != null) {
            return this.b.getIntrinsicHeight();
        }
        return this.f18304c.f95b.getIntrinsicHeight();
    }

    public boolean isAutoMirrored() {
        if (this.b != null) {
            return C0295a.m1055b(this.b);
        }
        return this.f18304c.f95b.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        if (this.b != null) {
            C0295a.m1054a(this.b, z);
        } else {
            this.f18304c.f95b.setAutoMirrored(z);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0295a.m1052a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                TypedArray a;
                if ("animated-vector".equals(name)) {
                    a = C0388c.m1422a(resources, theme, attributeSet, C0071a.f85e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C4400i a2 = C4400i.m24033a(resources, resourceId, theme);
                        a2.m24040a(false);
                        a2.setCallback(this.f18303a);
                        if (this.f18304c.f95b != null) {
                            this.f18304c.f95b.setCallback(null);
                        }
                        this.f18304c.f95b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    a = resources.obtainAttributes(attributeSet, C0071a.f86f);
                    String string = a.getString(0);
                    int resourceId2 = a.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f18305d != null) {
                            m24030a(string, C0079e.m148a(this.f18305d, resourceId2));
                        } else {
                            a.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f18304c.m142a();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void applyTheme(Theme theme) {
        if (this.b != null) {
            C0295a.m1051a(this.b, theme);
        }
    }

    public boolean canApplyTheme() {
        return this.b != null ? C0295a.m1058d(this.b) : false;
    }

    /* renamed from: a */
    private void m24029a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m24029a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f18306e == null) {
                    this.f18306e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f18306e);
            }
        }
    }

    /* renamed from: a */
    private void m24030a(String str, Animator animator) {
        animator.setTarget(this.f18304c.f95b.m24039a(str));
        if (VERSION.SDK_INT < 21) {
            m24029a(animator);
        }
        if (this.f18304c.f98e == null) {
            this.f18304c.f98e = new ArrayList();
            this.f18304c.f97d = new C3131a();
        }
        this.f18304c.f98e.add(animator);
        this.f18304c.f97d.put(animator, str);
    }

    public boolean isRunning() {
        if (this.b != null) {
            return ((AnimatedVectorDrawable) this.b).isRunning();
        }
        return this.f18304c.f96c.isRunning();
    }

    public void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!this.f18304c.f96c.isStarted()) {
            this.f18304c.f96c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
        } else {
            this.f18304c.f96c.end();
        }
    }
}
