package com.cuvora.carinfo.videomodule.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.C0389b;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.cuvora.carinfo.C1491f.C1487a;
import com.cuvora.carinfo.R;
import com.cuvora.carinfo.videomodule.utils.C1621b;
import com.feedbox.data.network.model.Content;
import com.feedbox.data.network.model.Images;
import io.branch.indexing.BranchUniversalObject;
import io.branch.indexing.BranchUniversalObject.CONTENT_INDEX_MODE;
import io.branch.referral.Branch.C2702c;
import io.branch.referral.C2734d;
import io.branch.referral.SharingHelper.SHARE_WITH;
import io.branch.referral.util.C2758a;
import io.branch.referral.util.ContentMetadata;
import io.branch.referral.util.LinkProperties;
import java.util.Calendar;
import java.util.HashMap;
import kotlin.jvm.internal.C2885g;

public final class ContentDetailFragment extends Fragment {
    /* renamed from: a */
    private HashMap f18957a;

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.ContentDetailFragment$a */
    static final class C1598a implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ ContentDetailFragment f4814a;
        /* renamed from: b */
        final /* synthetic */ Content f4815b;

        C1598a(ContentDetailFragment contentDetailFragment, Content content) {
            this.f4814a = contentDetailFragment;
            this.f4815b = content;
        }

        public final void onClick(View view) {
            view = this.f4815b.m7692d();
            if (view != null) {
                if ((((CharSequence) view).length() > null ? true : null) == 1) {
                    String a;
                    String d;
                    view = this.f4814a;
                    String f = this.f4815b.m7694f();
                    String g = this.f4815b.m7695g();
                    Images e = this.f4815b.m7693e();
                    if (e != null) {
                        a = e.m7703a();
                        if (a != null) {
                            d = this.f4815b.m7692d();
                            if (d == null) {
                                C2885g.m13906a();
                            }
                            view.m25192a(f, g, a, d);
                        }
                    }
                    a = "";
                    d = this.f4815b.m7692d();
                    if (d == null) {
                        C2885g.m13906a();
                    }
                    view.m25192a(f, g, a, d);
                }
            }
        }
    }

    /* renamed from: com.cuvora.carinfo.videomodule.ui.fragment.ContentDetailFragment$b */
    public static final class C3718b implements C2702c {
        /* renamed from: a */
        public void mo1232a() {
        }

        /* renamed from: a */
        public void mo1233a(String str) {
            C2885g.m13910b(str, "channelName");
        }

        /* renamed from: a */
        public void mo1234a(String str, String str2, C2734d c2734d) {
            C2885g.m13910b(str, "sharedLink");
            C2885g.m13910b(str2, "sharedChannel");
        }

        /* renamed from: b */
        public void mo1235b() {
        }

        C3718b() {
        }
    }

    /* renamed from: a */
    public View m25199a(int i) {
        if (this.f18957a == null) {
            this.f18957a = new HashMap();
        }
        View view = (View) this.f18957a.get(Integer.valueOf(i));
        if (view == null) {
            view = getView();
            if (view == null) {
                return null;
            }
            view = view.findViewById(i);
            this.f18957a.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void m25200a() {
        if (this.f18957a != null) {
            this.f18957a.clear();
        }
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m25200a();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C2885g.m13910b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_content_detail, viewGroup, false);
    }

    /* renamed from: a */
    public final void m25201a(Content content) {
        C2885g.m13910b(content, "content");
        Object obj = (TextView) m25199a(C1487a.tv_video_title);
        C2885g.m13907a(obj, "tv_video_title");
        obj.setText(content.m7702n());
        String l = content.m7700l();
        if (l != null) {
            if ((((CharSequence) l).length() > 0 ? 1 : 0) == 1) {
                obj = (TextView) m25199a(C1487a.video_artist);
                C2885g.m13907a(obj, "video_artist");
                obj.setText(content.m7700l());
                obj = (TextView) m25199a(C1487a.video_artist);
                C2885g.m13907a(obj, "video_artist");
                obj.setVisibility(0);
                l = content.m7696h();
                if (l != null) {
                    l = "0";
                }
                m25193b(l);
                l = content.m7699k();
                if (l != null) {
                    l = "0";
                }
                m25195d(l);
                l = content.m7698j();
                if (l != null) {
                    l = "0";
                }
                m25194c(l);
                m25191a(content.m7695g());
                ((AppCompatImageView) m25199a(C1487a.ivShare)).setOnClickListener(new C1598a(this, content));
            }
        }
        obj = (TextView) m25199a(C1487a.video_artist);
        C2885g.m13907a(obj, "video_artist");
        obj.setVisibility(8);
        l = content.m7696h();
        if (l != null) {
            l = "0";
        }
        m25193b(l);
        l = content.m7699k();
        if (l != null) {
            l = "0";
        }
        m25195d(l);
        l = content.m7698j();
        if (l != null) {
            l = "0";
        }
        m25194c(l);
        m25191a(content.m7695g());
        ((AppCompatImageView) m25199a(C1487a.ivShare)).setOnClickListener(new C1598a(this, content));
    }

    /* renamed from: a */
    private final void m25191a(String str) {
        CharSequence charSequence = str;
        if (TextUtils.isEmpty(charSequence)) {
            Object obj = (TextView) m25199a(C1487a.video_description);
            C2885g.m13907a(obj, "video_description");
            obj.setVisibility(8);
            return;
        }
        Object obj2 = (TextView) m25199a(C1487a.video_description);
        C2885g.m13907a(obj2, "video_description");
        obj2.setVisibility(0);
        obj2 = (TextView) m25199a(C1487a.video_description);
        C2885g.m13907a(obj2, "video_description");
        obj2.setText(charSequence);
        C1621b c1621b = C1621b.f4881a;
        Object context = getContext();
        if (context == null) {
            C2885g.m13906a();
        }
        C2885g.m13907a(context, "context!!");
        Object obj3 = (TextView) m25199a(C1487a.video_description);
        C2885g.m13907a(obj3, "video_description");
        c1621b.m6199a(context, obj3, 2, -16776961, "more", true, null);
    }

    /* renamed from: b */
    private final void m25193b(String str) {
        if (C2885g.m13909a((Object) str, (Object) "0")) {
            m25196e("--");
        } else {
            m25196e(C1621b.f4881a.m6198a(Long.parseLong(str)));
        }
    }

    /* renamed from: c */
    private final void m25194c(String str) {
        if (C2885g.m13909a((Object) str, (Object) "0")) {
            m25197f("--");
        } else {
            m25197f(C1621b.f4881a.m6198a(Long.parseLong(str)));
        }
    }

    /* renamed from: d */
    private final void m25195d(String str) {
        if (C2885g.m13909a((Object) str, (Object) "0")) {
            m25198g("--");
        } else {
            m25198g(C1621b.f4881a.m6198a(Long.parseLong(str)));
        }
    }

    /* renamed from: e */
    private final void m25196e(String str) {
        Object obj = (TextView) m25199a(C1487a.videoViews);
        C2885g.m13907a(obj, "videoViews");
        obj.setText(str);
    }

    /* renamed from: f */
    private final void m25197f(String str) {
        Object obj = (TextView) m25199a(C1487a.videoLikes);
        C2885g.m13907a(obj, "videoLikes");
        obj.setText(str);
    }

    /* renamed from: g */
    private final void m25198g(String str) {
        Object obj = (TextView) m25199a(C1487a.videoDislikes);
        C2885g.m13907a(obj, "videoDislikes");
        obj.setText(str);
    }

    /* renamed from: a */
    private final void m25192a(String str, String str2, String str3, String str4) {
        BranchUniversalObject branchUniversalObject = new BranchUniversalObject();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("video/");
        stringBuilder.append(str4);
        Object a = branchUniversalObject.m13019a(stringBuilder.toString()).m13026b(str).m13028c(str2).m13030d(str3).m13017a(CONTENT_INDEX_MODE.PUBLIC).m13025b(CONTENT_INDEX_MODE.PUBLIC).m13018a(new ContentMetadata().m13437a("videoID", str4)).m13018a(new ContentMetadata().m13437a("title", str));
        Object instance = Calendar.getInstance();
        C2885g.m13907a(instance, "Calendar.getInstance()");
        Object a2 = new LinkProperties().m13442a("Sharing").m13443a("time_stamp", String.valueOf(instance.getTimeInMillis()));
        C2885g.m13907a(a2, "lp");
        C2885g.m13907a(a, "buo");
        m25190a(a2, a);
    }

    /* renamed from: a */
    private final void m25190a(LinkProperties linkProperties, BranchUniversalObject branchUniversalObject) {
        Context context = getContext();
        if (context == null) {
            C2885g.m13906a();
        }
        C2758a c2758a = new C2758a(context, "Check this Video", "This stuff is awesome: ");
        context = getContext();
        if (context == null) {
            C2885g.m13906a();
        }
        c2758a = c2758a.m13456a(C0389b.m1429a(context, 17301584), "Copy", "Added to clipboard");
        context = getContext();
        if (context == null) {
            C2885g.m13906a();
        }
        c2758a = c2758a.m13455a(C0389b.m1429a(context, 17301583), "Show more").m13457a(SHARE_WITH.FACEBOOK).m13457a(SHARE_WITH.EMAIL).m13457a(SHARE_WITH.MESSAGE).m13457a(SHARE_WITH.HANGOUT).m13457a(SHARE_WITH.INSTAGRAM).m13457a(SHARE_WITH.WHATS_APP).m13459a(true).m13458a("Share With");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C2885g.m13906a();
        }
        branchUniversalObject.m13020a(activity, linkProperties, c2758a, new C3718b());
    }
}
