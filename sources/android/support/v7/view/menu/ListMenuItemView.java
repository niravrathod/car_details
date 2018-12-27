package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.C0560r;
import android.support.v7.p020a.C0637a.C0627a;
import android.support.v7.p020a.C0637a.C0632f;
import android.support.v7.p020a.C0637a.C0633g;
import android.support.v7.p020a.C0637a.C0636j;
import android.support.v7.view.menu.C0730p.C0729a;
import android.support.v7.widget.ay;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements C0729a {
    /* renamed from: a */
    private C3227j f13512a;
    /* renamed from: b */
    private ImageView f13513b;
    /* renamed from: c */
    private RadioButton f13514c;
    /* renamed from: d */
    private TextView f13515d;
    /* renamed from: e */
    private CheckBox f13516e;
    /* renamed from: f */
    private TextView f13517f;
    /* renamed from: g */
    private ImageView f13518g;
    /* renamed from: h */
    private Drawable f13519h;
    /* renamed from: i */
    private int f13520i;
    /* renamed from: j */
    private Context f13521j;
    /* renamed from: k */
    private boolean f13522k;
    /* renamed from: l */
    private Drawable f13523l;
    /* renamed from: m */
    private int f13524m;
    /* renamed from: n */
    private LayoutInflater f13525n;
    /* renamed from: o */
    private boolean f13526o;

    /* renamed from: a */
    public boolean mo72a() {
        return false;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0627a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        attributeSet = ay.m3543a(getContext(), attributeSet, C0636j.MenuView, i, 0);
        this.f13519h = attributeSet.m3547a(C0636j.MenuView_android_itemBackground);
        this.f13520i = attributeSet.m3560g(C0636j.MenuView_android_itemTextAppearance, -1);
        this.f13522k = attributeSet.m3549a(C0636j.MenuView_preserveIconSpacing, false);
        this.f13521j = context;
        this.f13523l = attributeSet.m3547a(C0636j.MenuView_subMenuArrow);
        attributeSet.m3548a();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        C0560r.m2174a((View) this, this.f13519h);
        this.f13515d = (TextView) findViewById(C0632f.title);
        if (this.f13520i != -1) {
            this.f13515d.setTextAppearance(this.f13521j, this.f13520i);
        }
        this.f13517f = (TextView) findViewById(C0632f.shortcut);
        this.f13518g = (ImageView) findViewById(C0632f.submenuarrow);
        if (this.f13518g != null) {
            this.f13518g.setImageDrawable(this.f13523l);
        }
    }

    /* renamed from: a */
    public void mo71a(C3227j c3227j, int i) {
        this.f13512a = c3227j;
        this.f13524m = i;
        setVisibility(c3227j.isVisible() != 0 ? 0 : 8);
        setTitle(c3227j.m16198a((C0729a) this));
        setCheckable(c3227j.isCheckable());
        setShortcut(c3227j.m16212f(), c3227j.m16208d());
        setIcon(c3227j.getIcon());
        setEnabled(c3227j.isEnabled());
        setSubMenuArrowVisible(c3227j.hasSubMenu());
        setContentDescription(c3227j.getContentDescription());
    }

    public void setForceShowIcon(boolean z) {
        this.f13526o = z;
        this.f13522k = z;
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f13515d.setText(charSequence);
            if (this.f13515d.getVisibility() != null) {
                this.f13515d.setVisibility(0);
            }
        } else if (this.f13515d.getVisibility() != 8) {
            this.f13515d.setVisibility(8);
        }
    }

    public C3227j getItemData() {
        return this.f13512a;
    }

    public void setCheckable(boolean z) {
        if (z || this.f13514c != null || this.f13516e != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f13512a.m16213g()) {
                if (this.f13514c == null) {
                    m16076c();
                }
                compoundButton = this.f13514c;
                compoundButton2 = this.f13516e;
            } else {
                if (this.f13516e == null) {
                    m16077d();
                }
                compoundButton = this.f13516e;
                compoundButton2 = this.f13514c;
            }
            if (z) {
                compoundButton.setChecked(this.f13512a.isChecked());
                z = z ? false : true;
                if (compoundButton.getVisibility() != z) {
                    compoundButton.setVisibility(z);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility())) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (this.f13516e) {
                    this.f13516e.setVisibility(8);
                }
                if (this.f13514c) {
                    this.f13514c.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f13512a.m16213g()) {
            if (this.f13514c == null) {
                m16076c();
            }
            compoundButton = this.f13514c;
        } else {
            if (this.f13516e == null) {
                m16077d();
            }
            compoundButton = this.f13516e;
        }
        compoundButton.setChecked(z);
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f13518g != null) {
            this.f13518g.setVisibility(z ? false : true);
        }
    }

    public void setShortcut(boolean z, char c) {
        z = (z && this.f13512a.m16212f()) ? false : true;
        if (!z) {
            this.f13517f.setText(this.f13512a.m16210e());
        }
        if (this.f13517f.getVisibility() != z) {
            this.f13517f.setVisibility(z);
        }
    }

    public void setIcon(Drawable drawable) {
        Object obj;
        ImageView imageView;
        if (!this.f13512a.m16215i()) {
            if (!this.f13526o) {
                obj = null;
                if (obj != null && !this.f13522k) {
                    return;
                }
                if (this.f13513b == null || drawable != null || this.f13522k) {
                    if (this.f13513b == null) {
                        m16075b();
                    }
                    if (drawable == null) {
                        if (this.f13522k) {
                            this.f13513b.setVisibility(8);
                        }
                    }
                    imageView = this.f13513b;
                    if (obj != null) {
                        drawable = null;
                    }
                    imageView.setImageDrawable(drawable);
                    if (this.f13513b.getVisibility() != null) {
                        this.f13513b.setVisibility(0);
                    }
                }
                return;
            }
        }
        obj = 1;
        if (obj != null) {
        }
        if (this.f13513b == null) {
        }
        if (this.f13513b == null) {
            m16075b();
        }
        if (drawable == null) {
            if (this.f13522k) {
                this.f13513b.setVisibility(8);
            }
        }
        imageView = this.f13513b;
        if (obj != null) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        if (this.f13513b.getVisibility() != null) {
            this.f13513b.setVisibility(0);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f13513b != null && this.f13522k) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13513b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: b */
    private void m16075b() {
        this.f13513b = (ImageView) getInflater().inflate(C0633g.abc_list_menu_item_icon, this, false);
        addView(this.f13513b, 0);
    }

    /* renamed from: c */
    private void m16076c() {
        this.f13514c = (RadioButton) getInflater().inflate(C0633g.abc_list_menu_item_radio, this, false);
        addView(this.f13514c);
    }

    /* renamed from: d */
    private void m16077d() {
        this.f13516e = (CheckBox) getInflater().inflate(C0633g.abc_list_menu_item_checkbox, this, false);
        addView(this.f13516e);
    }

    private LayoutInflater getInflater() {
        if (this.f13525n == null) {
            this.f13525n = LayoutInflater.from(getContext());
        }
        return this.f13525n;
    }
}
