package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api.Client;
import java.util.ArrayList;

final class zaaq extends zaau {
    private final /* synthetic */ zaak zagi;
    private final ArrayList<Client> zago;

    public zaaq(zaak zaak, ArrayList<Client> arrayList) {
        this.zagi = zaak;
        super(zaak);
        this.zago = arrayList;
    }

    public final void zaan() {
        this.zagi.zafs.zaed.zagz = this.zagi.zaat();
        ArrayList arrayList = this.zago;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Client) obj).getRemoteService(this.zagi.zage, this.zagi.zafs.zaed.zagz);
        }
    }
}
