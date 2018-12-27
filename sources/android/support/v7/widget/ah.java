package android.support.v7.widget;

import android.support.v7.widget.C3261e.C0858b;
import java.util.List;

class ah {
    /* renamed from: a */
    final C0840a f2784a;

    /* renamed from: android.support.v7.widget.ah$a */
    interface C0840a {
        /* renamed from: a */
        C0858b mo822a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo823a(C0858b c0858b);
    }

    ah(C0840a c0840a) {
        this.f2784a = c0840a;
    }

    /* renamed from: a */
    void m3469a(List<C0858b> list) {
        while (true) {
            int b = m3467b(list);
            if (b != -1) {
                m3466a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m3466a(List<C0858b> list, int i, int i2) {
        C0858b c0858b = (C0858b) list.get(i);
        C0858b c0858b2 = (C0858b) list.get(i2);
        int i3 = c0858b2.f2911a;
        if (i3 != 4) {
            switch (i3) {
                case 1:
                    m3468c(list, i, c0858b, i2, c0858b2);
                    return;
                case 2:
                    m3470a(list, i, c0858b, i2, c0858b2);
                    return;
                default:
                    return;
            }
        }
        m3471b(list, i, c0858b, i2, c0858b2);
    }

    /* renamed from: a */
    void m3470a(List<C0858b> list, int i, C0858b c0858b, int i2, C0858b c0858b2) {
        Object obj;
        C0858b c0858b3;
        Object obj2 = null;
        if (c0858b.f2912b < c0858b.f2914d) {
            if (c0858b2.f2912b == c0858b.f2912b && c0858b2.f2914d == c0858b.f2914d - c0858b.f2912b) {
                obj = null;
            } else {
                obj = null;
                if (c0858b.f2914d >= c0858b2.f2912b) {
                    c0858b2.f2912b--;
                } else if (c0858b.f2914d < c0858b2.f2912b + c0858b2.f2914d) {
                    c0858b2.f2914d--;
                    c0858b.f2911a = 2;
                    c0858b.f2914d = 1;
                    if (c0858b2.f2914d == 0) {
                        list.remove(i2);
                        this.f2784a.mo823a(c0858b2);
                    }
                    return;
                }
                c0858b3 = null;
                if (c0858b.f2912b > c0858b2.f2912b) {
                    c0858b2.f2912b++;
                } else if (c0858b.f2912b < c0858b2.f2912b + c0858b2.f2914d) {
                    c0858b3 = this.f2784a.mo822a(2, c0858b.f2912b + 1, (c0858b2.f2912b + c0858b2.f2914d) - c0858b.f2912b, null);
                    c0858b2.f2914d = c0858b.f2912b - c0858b2.f2912b;
                }
                if (obj2 != null) {
                    list.set(i, c0858b2);
                    list.remove(i2);
                    this.f2784a.mo823a(c0858b);
                    return;
                }
                if (obj != null) {
                    if (c0858b3 != null) {
                        if (c0858b.f2912b > c0858b3.f2912b) {
                            c0858b.f2912b -= c0858b3.f2914d;
                        }
                        if (c0858b.f2914d > c0858b3.f2912b) {
                            c0858b.f2914d -= c0858b3.f2914d;
                        }
                    }
                    if (c0858b.f2912b > c0858b2.f2912b) {
                        c0858b.f2912b -= c0858b2.f2914d;
                    }
                    if (c0858b.f2914d > c0858b2.f2912b) {
                        c0858b.f2914d -= c0858b2.f2914d;
                    }
                } else {
                    if (c0858b3 != null) {
                        if (c0858b.f2912b >= c0858b3.f2912b) {
                            c0858b.f2912b -= c0858b3.f2914d;
                        }
                        if (c0858b.f2914d >= c0858b3.f2912b) {
                            c0858b.f2914d -= c0858b3.f2914d;
                        }
                    }
                    if (c0858b.f2912b >= c0858b2.f2912b) {
                        c0858b.f2912b -= c0858b2.f2914d;
                    }
                    if (c0858b.f2914d >= c0858b2.f2912b) {
                        c0858b.f2914d -= c0858b2.f2914d;
                    }
                }
                list.set(i, c0858b2);
                if (c0858b.f2912b != c0858b.f2914d) {
                    list.set(i2, c0858b);
                } else {
                    list.remove(i2);
                }
                if (c0858b3 != null) {
                    list.add(i, c0858b3);
                }
            }
        } else if (c0858b2.f2912b == c0858b.f2914d + 1 && c0858b2.f2914d == c0858b.f2912b - c0858b.f2914d) {
            obj = 1;
        } else {
            obj = 1;
            if (c0858b.f2914d >= c0858b2.f2912b) {
                c0858b2.f2912b--;
            } else if (c0858b.f2914d < c0858b2.f2912b + c0858b2.f2914d) {
                c0858b2.f2914d--;
                c0858b.f2911a = 2;
                c0858b.f2914d = 1;
                if (c0858b2.f2914d == 0) {
                    list.remove(i2);
                    this.f2784a.mo823a(c0858b2);
                }
                return;
            }
            c0858b3 = null;
            if (c0858b.f2912b > c0858b2.f2912b) {
                c0858b2.f2912b++;
            } else if (c0858b.f2912b < c0858b2.f2912b + c0858b2.f2914d) {
                c0858b3 = this.f2784a.mo822a(2, c0858b.f2912b + 1, (c0858b2.f2912b + c0858b2.f2914d) - c0858b.f2912b, null);
                c0858b2.f2914d = c0858b.f2912b - c0858b2.f2912b;
            }
            if (obj2 != null) {
                if (obj != null) {
                    if (c0858b3 != null) {
                        if (c0858b.f2912b >= c0858b3.f2912b) {
                            c0858b.f2912b -= c0858b3.f2914d;
                        }
                        if (c0858b.f2914d >= c0858b3.f2912b) {
                            c0858b.f2914d -= c0858b3.f2914d;
                        }
                    }
                    if (c0858b.f2912b >= c0858b2.f2912b) {
                        c0858b.f2912b -= c0858b2.f2914d;
                    }
                    if (c0858b.f2914d >= c0858b2.f2912b) {
                        c0858b.f2914d -= c0858b2.f2914d;
                    }
                } else {
                    if (c0858b3 != null) {
                        if (c0858b.f2912b > c0858b3.f2912b) {
                            c0858b.f2912b -= c0858b3.f2914d;
                        }
                        if (c0858b.f2914d > c0858b3.f2912b) {
                            c0858b.f2914d -= c0858b3.f2914d;
                        }
                    }
                    if (c0858b.f2912b > c0858b2.f2912b) {
                        c0858b.f2912b -= c0858b2.f2914d;
                    }
                    if (c0858b.f2914d > c0858b2.f2912b) {
                        c0858b.f2914d -= c0858b2.f2914d;
                    }
                }
                list.set(i, c0858b2);
                if (c0858b.f2912b != c0858b.f2914d) {
                    list.remove(i2);
                } else {
                    list.set(i2, c0858b);
                }
                if (c0858b3 != null) {
                    list.add(i, c0858b3);
                }
            }
            list.set(i, c0858b2);
            list.remove(i2);
            this.f2784a.mo823a(c0858b);
            return;
        }
        obj2 = 1;
        if (c0858b.f2914d >= c0858b2.f2912b) {
            c0858b2.f2912b--;
        } else if (c0858b.f2914d < c0858b2.f2912b + c0858b2.f2914d) {
            c0858b2.f2914d--;
            c0858b.f2911a = 2;
            c0858b.f2914d = 1;
            if (c0858b2.f2914d == 0) {
                list.remove(i2);
                this.f2784a.mo823a(c0858b2);
            }
            return;
        }
        c0858b3 = null;
        if (c0858b.f2912b > c0858b2.f2912b) {
            c0858b2.f2912b++;
        } else if (c0858b.f2912b < c0858b2.f2912b + c0858b2.f2914d) {
            c0858b3 = this.f2784a.mo822a(2, c0858b.f2912b + 1, (c0858b2.f2912b + c0858b2.f2914d) - c0858b.f2912b, null);
            c0858b2.f2914d = c0858b.f2912b - c0858b2.f2912b;
        }
        if (obj2 != null) {
            list.set(i, c0858b2);
            list.remove(i2);
            this.f2784a.mo823a(c0858b);
            return;
        }
        if (obj != null) {
            if (c0858b3 != null) {
                if (c0858b.f2912b > c0858b3.f2912b) {
                    c0858b.f2912b -= c0858b3.f2914d;
                }
                if (c0858b.f2914d > c0858b3.f2912b) {
                    c0858b.f2914d -= c0858b3.f2914d;
                }
            }
            if (c0858b.f2912b > c0858b2.f2912b) {
                c0858b.f2912b -= c0858b2.f2914d;
            }
            if (c0858b.f2914d > c0858b2.f2912b) {
                c0858b.f2914d -= c0858b2.f2914d;
            }
        } else {
            if (c0858b3 != null) {
                if (c0858b.f2912b >= c0858b3.f2912b) {
                    c0858b.f2912b -= c0858b3.f2914d;
                }
                if (c0858b.f2914d >= c0858b3.f2912b) {
                    c0858b.f2914d -= c0858b3.f2914d;
                }
            }
            if (c0858b.f2912b >= c0858b2.f2912b) {
                c0858b.f2912b -= c0858b2.f2914d;
            }
            if (c0858b.f2914d >= c0858b2.f2912b) {
                c0858b.f2914d -= c0858b2.f2914d;
            }
        }
        list.set(i, c0858b2);
        if (c0858b.f2912b != c0858b.f2914d) {
            list.set(i2, c0858b);
        } else {
            list.remove(i2);
        }
        if (c0858b3 != null) {
            list.add(i, c0858b3);
        }
    }

    /* renamed from: c */
    private void m3468c(List<C0858b> list, int i, C0858b c0858b, int i2, C0858b c0858b2) {
        int i3 = c0858b.f2914d < c0858b2.f2912b ? -1 : 0;
        if (c0858b.f2912b < c0858b2.f2912b) {
            i3++;
        }
        if (c0858b2.f2912b <= c0858b.f2912b) {
            c0858b.f2912b += c0858b2.f2914d;
        }
        if (c0858b2.f2912b <= c0858b.f2914d) {
            c0858b.f2914d += c0858b2.f2914d;
        }
        c0858b2.f2912b += i3;
        list.set(i, c0858b2);
        list.set(i2, c0858b);
    }

    /* renamed from: b */
    void m3471b(List<C0858b> list, int i, C0858b c0858b, int i2, C0858b c0858b2) {
        Object a;
        Object obj = null;
        if (c0858b.f2914d < c0858b2.f2912b) {
            c0858b2.f2912b--;
        } else if (c0858b.f2914d < c0858b2.f2912b + c0858b2.f2914d) {
            c0858b2.f2914d--;
            a = this.f2784a.mo822a(4, c0858b.f2912b, 1, c0858b2.f2913c);
            if (c0858b.f2912b <= c0858b2.f2912b) {
                c0858b2.f2912b++;
            } else if (c0858b.f2912b < c0858b2.f2912b + c0858b2.f2914d) {
                int i3 = (c0858b2.f2912b + c0858b2.f2914d) - c0858b.f2912b;
                obj = this.f2784a.mo822a(4, c0858b.f2912b + 1, i3, c0858b2.f2913c);
                c0858b2.f2914d -= i3;
            }
            list.set(i2, c0858b);
            if (c0858b2.f2914d <= null) {
                list.set(i, c0858b2);
            } else {
                list.remove(i);
                this.f2784a.mo823a(c0858b2);
            }
            if (a != null) {
                list.add(i, a);
            }
            if (obj != null) {
                list.add(i, obj);
            }
        }
        a = null;
        if (c0858b.f2912b <= c0858b2.f2912b) {
            c0858b2.f2912b++;
        } else if (c0858b.f2912b < c0858b2.f2912b + c0858b2.f2914d) {
            int i32 = (c0858b2.f2912b + c0858b2.f2914d) - c0858b.f2912b;
            obj = this.f2784a.mo822a(4, c0858b.f2912b + 1, i32, c0858b2.f2913c);
            c0858b2.f2914d -= i32;
        }
        list.set(i2, c0858b);
        if (c0858b2.f2914d <= null) {
            list.remove(i);
            this.f2784a.mo823a(c0858b2);
        } else {
            list.set(i, c0858b2);
        }
        if (a != null) {
            list.add(i, a);
        }
        if (obj != null) {
            list.add(i, obj);
        }
    }

    /* renamed from: b */
    private int m3467b(List<C0858b> list) {
        Object obj = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C0858b) list.get(size)).f2911a != 8) {
                obj = 1;
            } else if (obj != null) {
                return size;
            }
        }
        return -1;
    }
}
