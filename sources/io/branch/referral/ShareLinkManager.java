package io.branch.referral;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.ClipboardManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import io.branch.referral.Branch.C2701b;
import io.branch.referral.Branch.C2702c;
import io.branch.referral.Branch.C2707j;
import io.branch.referral.Branch.C2709l;
import io.branch.referral.SharingHelper.SHARE_WITH;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ShareLinkManager {
    /* renamed from: k */
    private static int f11459k = 100;
    /* renamed from: a */
    C2727a f11460a;
    /* renamed from: b */
    C2702c f11461b;
    /* renamed from: c */
    C2707j f11462c;
    /* renamed from: d */
    Context f11463d;
    /* renamed from: e */
    final int f11464e = 5;
    /* renamed from: f */
    final int f11465f = 100;
    /* renamed from: g */
    private List<ResolveInfo> f11466g;
    /* renamed from: h */
    private Intent f11467h;
    /* renamed from: i */
    private final int f11468i = Color.argb(60, 17, 4, 56);
    /* renamed from: j */
    private final int f11469j = Color.argb(20, 17, 4, 56);
    /* renamed from: l */
    private boolean f11470l = false;
    /* renamed from: m */
    private int f11471m = -1;
    /* renamed from: n */
    private int f11472n = 50;
    /* renamed from: o */
    private C2709l f11473o;
    /* renamed from: p */
    private List<String> f11474p = new ArrayList();
    /* renamed from: q */
    private List<String> f11475q = new ArrayList();

    /* renamed from: io.branch.referral.ShareLinkManager$2 */
    class C27162 implements OnDismissListener {
        /* renamed from: a */
        final /* synthetic */ ShareLinkManager f11451a;

        C27162(ShareLinkManager shareLinkManager) {
            this.f11451a = shareLinkManager;
        }

        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f11451a.f11461b != null) {
                this.f11451a.f11461b.mo1235b();
                this.f11451a.f11461b = null;
            }
            if (this.f11451a.f11470l == null) {
                this.f11451a.f11463d = null;
                this.f11451a.f11473o = null;
            }
            this.f11451a.f11460a = null;
        }
    }

    private class CopyLinkItem extends ResolveInfo {
        /* renamed from: a */
        final /* synthetic */ ShareLinkManager f11452a;

        private CopyLinkItem(ShareLinkManager shareLinkManager) {
            this.f11452a = shareLinkManager;
        }

        public CharSequence loadLabel(PackageManager packageManager) {
            return this.f11452a.f11473o.m13120n();
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return this.f11452a.f11473o.m13119m();
        }
    }

    private class MoreShareItem extends ResolveInfo {
        /* renamed from: a */
        final /* synthetic */ ShareLinkManager f11453a;

        private MoreShareItem(ShareLinkManager shareLinkManager) {
            this.f11453a = shareLinkManager;
        }

        public CharSequence loadLabel(PackageManager packageManager) {
            return this.f11453a.f11473o.m13118l();
        }

        public Drawable loadIcon(PackageManager packageManager) {
            return this.f11453a.f11473o.m13117k();
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$a */
    private class C2717a extends BaseAdapter {
        /* renamed from: a */
        public int f11454a;
        /* renamed from: b */
        final /* synthetic */ ShareLinkManager f11455b;

        public long getItemId(int i) {
            return (long) i;
        }

        private C2717a(ShareLinkManager shareLinkManager) {
            this.f11455b = shareLinkManager;
            this.f11454a = -1;
        }

        public int getCount() {
            return this.f11455b.f11466g.size();
        }

        public Object getItem(int i) {
            return this.f11455b.f11466g.get(i);
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = new C2718b(this.f11455b, this.f11455b.f11463d);
            } else {
                view = (C2718b) view;
            }
            ResolveInfo resolveInfo = (ResolveInfo) this.f11455b.f11466g.get(i);
            view.m13178a(resolveInfo.loadLabel(this.f11455b.f11463d.getPackageManager()).toString(), resolveInfo.loadIcon(this.f11455b.f11463d.getPackageManager()), i == this.f11454a ? 1 : 0);
            view.setTag(resolveInfo);
            view.setClickable(false);
            return view;
        }

        public boolean isEnabled(int i) {
            return this.f11454a < 0;
        }
    }

    /* renamed from: io.branch.referral.ShareLinkManager$b */
    private class C2718b extends TextView {
        /* renamed from: a */
        Context f11456a;
        /* renamed from: b */
        int f11457b;
        /* renamed from: c */
        final /* synthetic */ ShareLinkManager f11458c;

        public C2718b(ShareLinkManager shareLinkManager, Context context) {
            this.f11458c = shareLinkManager;
            super(context);
            this.f11456a = context;
            setPadding(100, 5, 5, 5);
            setGravity(8388627);
            setMinWidth(this.f11456a.getResources().getDisplayMetrics().widthPixels);
            this.f11457b = shareLinkManager.f11472n != 0 ? C2742i.m13288b(context, shareLinkManager.f11472n) : null;
        }

        /* renamed from: a */
        public void m13178a(String str, Drawable drawable, boolean z) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\t");
            stringBuilder.append(str);
            setText(stringBuilder.toString());
            setTag(str);
            if (drawable == null) {
                setTextAppearance(this.f11456a, 16973890);
                setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
            } else {
                if (this.f11457b != 0) {
                    drawable.setBounds(0, 0, this.f11457b, this.f11457b);
                    setCompoundDrawables(drawable, null, null, null);
                } else {
                    setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
                }
                setTextAppearance(this.f11456a, 16973892);
                ShareLinkManager.f11459k = Math.max(ShareLinkManager.f11459k, drawable.getIntrinsicHeight() + 5);
            }
            setMinHeight(ShareLinkManager.f11459k);
            setTextColor(this.f11456a.getResources().getColor(17170444));
            if (z) {
                setBackgroundColor(this.f11458c.f11468i);
            } else {
                setBackgroundColor(this.f11458c.f11469j);
            }
        }
    }

    ShareLinkManager() {
    }

    /* renamed from: a */
    public Dialog m13196a(C2709l c2709l) {
        this.f11473o = c2709l;
        this.f11463d = c2709l.m13101b();
        this.f11461b = c2709l.m13114h();
        this.f11462c = c2709l.m13115i();
        this.f11467h = new Intent("android.intent.action.SEND");
        this.f11467h.setType("text/plain");
        this.f11471m = c2709l.m13128v();
        this.f11474p = c2709l.m13111e();
        this.f11475q = c2709l.m13109d();
        this.f11472n = c2709l.m13129w();
        try {
            m13189a(c2709l.m13107c());
        } catch (C2709l c2709l2) {
            c2709l2.printStackTrace();
            if (this.f11461b != null) {
                this.f11461b.mo1234a(null, null, new C2734d("Trouble sharing link", -110));
            } else {
                Log.i("BranchSDK", "Unable create share options. Couldn't find applications on device to share the link.");
            }
        }
        return this.f11460a;
    }

    /* renamed from: a */
    public void m13197a(boolean z) {
        if (this.f11460a != null && this.f11460a.isShowing()) {
            if (z) {
                this.f11460a.cancel();
            } else {
                this.f11460a.dismiss();
            }
        }
    }

    /* renamed from: a */
    private void m13189a(List<SHARE_WITH> list) {
        View listView;
        PackageManager packageManager = this.f11463d.getPackageManager();
        List arrayList = new ArrayList();
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(this.f11467h, 65536);
        List arrayList2 = new ArrayList();
        final List arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList(list);
        Iterator it = queryIntentActivities.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            ResolveInfo resolveInfo = (ResolveInfo) it.next();
            String str = resolveInfo.activityInfo.packageName;
            Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                SHARE_WITH share_with = (SHARE_WITH) it2.next();
                if (resolveInfo.activityInfo != null && str.toLowerCase().contains(share_with.toString().toLowerCase())) {
                    obj = share_with;
                    break;
                }
            }
            if (obj != null) {
                arrayList.add(resolveInfo);
                list.remove(obj);
            }
        }
        queryIntentActivities.removeAll(arrayList);
        queryIntentActivities.addAll(0, arrayList);
        if (this.f11474p.size() > 0) {
            for (ResolveInfo resolveInfo2 : queryIntentActivities) {
                if (this.f11474p.contains(resolveInfo2.activityInfo.packageName)) {
                    arrayList2.add(resolveInfo2);
                }
            }
        } else {
            arrayList2 = queryIntentActivities;
        }
        for (ResolveInfo resolveInfo3 : r2) {
            if (!this.f11475q.contains(resolveInfo3.activityInfo.packageName)) {
                arrayList3.add(resolveInfo3);
            }
        }
        for (ResolveInfo resolveInfo32 : queryIntentActivities) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                if (((SHARE_WITH) it3.next()).toString().equalsIgnoreCase(resolveInfo32.activityInfo.packageName)) {
                    arrayList3.add(resolveInfo32);
                }
            }
        }
        arrayList3.add(new CopyLinkItem());
        queryIntentActivities.add(new CopyLinkItem());
        arrayList.add(new CopyLinkItem());
        if (arrayList.size() > 1) {
            if (queryIntentActivities.size() > arrayList.size()) {
                arrayList.add(new MoreShareItem());
            }
            this.f11466g = arrayList;
        } else {
            this.f11466g = arrayList3;
        }
        final Object c2717a = new C2717a();
        if (this.f11471m <= 1 || VERSION.SDK_INT < 21) {
            listView = new ListView(this.f11463d);
        } else {
            listView = new ListView(this.f11463d, null, 0, this.f11471m);
        }
        listView.setHorizontalFadingEdgeEnabled(false);
        listView.setBackgroundColor(-1);
        listView.setSelector(new ColorDrawable(0));
        if (this.f11473o.m13127u() != null) {
            listView.addHeaderView(this.f11473o.m13127u(), null, false);
        } else if (!TextUtils.isEmpty(this.f11473o.m13126t())) {
            View textView = new TextView(this.f11463d);
            textView.setText(this.f11473o.m13126t());
            textView.setBackgroundColor(this.f11469j);
            textView.setTextColor(this.f11469j);
            textView.setTextAppearance(this.f11463d, 16973892);
            textView.setTextColor(this.f11463d.getResources().getColor(17170432));
            textView.setPadding(100, 5, 5, 5);
            listView.addHeaderView(textView, null, false);
        }
        listView.setAdapter(c2717a);
        if (this.f11473o.m13125s() >= 0) {
            listView.setDividerHeight(this.f11473o.m13125s());
        } else if (this.f11473o.m13123q()) {
            listView.setDividerHeight(0);
        }
        listView.setOnItemClickListener(new OnItemClickListener(this) {
            /* renamed from: d */
            final /* synthetic */ ShareLinkManager f11450d;

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                if ((view.getTag() instanceof MoreShareItem) != null) {
                    this.f11450d.f11466g = arrayList3;
                    c2717a.notifyDataSetChanged();
                    return;
                }
                if (this.f11450d.f11461b != null) {
                    adapterView = "";
                    if (!(view.getTag() == null || this.f11450d.f11463d == null || ((ResolveInfo) view.getTag()).loadLabel(this.f11450d.f11463d.getPackageManager()) == null)) {
                        adapterView = ((ResolveInfo) view.getTag()).loadLabel(this.f11450d.f11463d.getPackageManager()).toString();
                    }
                    this.f11450d.f11473o.m13122p().m23480b(((ResolveInfo) view.getTag()).loadLabel(this.f11450d.f11463d.getPackageManager()).toString());
                    this.f11450d.f11461b.mo1233a(adapterView);
                }
                c2717a.f11454a = i - listView.getHeaderViewsCount();
                c2717a.notifyDataSetChanged();
                this.f11450d.m13184a((ResolveInfo) view.getTag());
                if (this.f11450d.f11460a != null) {
                    this.f11450d.f11460a.cancel();
                }
            }
        });
        if (this.f11473o.m13124r() > null) {
            this.f11460a = new C2727a(this.f11463d, this.f11473o.m13124r());
        } else {
            this.f11460a = new C2727a(this.f11463d, this.f11473o.m13123q());
        }
        this.f11460a.setContentView(listView);
        this.f11460a.show();
        if (this.f11461b != null) {
            this.f11461b.mo1232a();
        }
        this.f11460a.setOnDismissListener(new C27162(this));
    }

    /* renamed from: a */
    private void m13184a(final ResolveInfo resolveInfo) {
        this.f11470l = true;
        final String charSequence = resolveInfo.loadLabel(this.f11463d.getPackageManager()).toString();
        this.f11473o.m13122p().m23479a(new C2701b(this) {
            /* renamed from: c */
            final /* synthetic */ ShareLinkManager f17953c;

            /* renamed from: a */
            public void mo1226a(String str, C2734d c2734d) {
                if (c2734d == null) {
                    this.f17953c.m13185a(resolveInfo, str, charSequence);
                    return;
                }
                String j = this.f17953c.f11473o.m13116j();
                if (j == null || j.trim().length() <= 0) {
                    if (this.f17953c.f11461b != null) {
                        this.f17953c.f11461b.mo1234a(str, charSequence, c2734d);
                    } else {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unable to share link ");
                        stringBuilder.append(c2734d.m13253a());
                        Log.i("BranchSDK", stringBuilder.toString());
                    }
                    if (c2734d.m13254b() != -113) {
                        if (c2734d.m13254b() != -117) {
                            this.f17953c.m13197a(false);
                            this.f17953c.f11470l = false;
                            return;
                        }
                    }
                    this.f17953c.m13185a(resolveInfo, str, charSequence);
                    return;
                }
                this.f17953c.m13185a(resolveInfo, j, charSequence);
            }
        }, true);
    }

    /* renamed from: a */
    private void m13185a(ResolveInfo resolveInfo, String str, String str2) {
        if (this.f11461b != null) {
            this.f11461b.mo1234a(str, str2, null);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Shared link with ");
            stringBuilder.append(str2);
            Log.i("BranchSDK", stringBuilder.toString());
        }
        if (resolveInfo instanceof CopyLinkItem) {
            m13188a(str, this.f11473o.m13112f());
            return;
        }
        this.f11467h.setPackage(resolveInfo.activityInfo.packageName);
        resolveInfo = this.f11473o.m13113g();
        String f = this.f11473o.m13112f();
        if (this.f11462c != null) {
            CharSequence a = this.f11462c.m13086a(str2);
            str2 = this.f11462c.m13087b(str2);
            if (!TextUtils.isEmpty(a)) {
                resolveInfo = a;
            }
            if (!TextUtils.isEmpty(str2)) {
                f = str2;
            }
        }
        if (resolveInfo != null && resolveInfo.trim().length() > null) {
            this.f11467h.putExtra("android.intent.extra.SUBJECT", resolveInfo);
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(f);
        stringBuilder.append("\n");
        stringBuilder.append(str);
        this.f11467h.putExtra("android.intent.extra.TEXT", stringBuilder.toString());
        this.f11463d.startActivity(this.f11467h);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    private void m13188a(String str, String str2) {
        if (VERSION.SDK_INT < 11) {
            ((ClipboardManager) this.f11463d.getSystemService("clipboard")).setText(str);
        } else {
            ((android.content.ClipboardManager) this.f11463d.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str2, str));
        }
        Toast.makeText(this.f11463d, this.f11473o.m13121o(), 0).show();
    }
}
