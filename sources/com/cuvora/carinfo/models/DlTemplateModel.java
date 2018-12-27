package com.cuvora.carinfo.models;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.jvm.internal.C2884f;
import kotlin.jvm.internal.C2885g;

public final class DlTemplateModel {
    private final String dlDobIdentifier;
    private final String dlFieldIdentifier;
    private final String dlNumberDoesNotExistIdentifier;
    private final String dlSearchSuccessParam;
    private final String dlSubmitIdentifier;
    private final String dob;
    private final String dobSep;
    private final String dobUiFormat;
    private final String dobUiSep;
    private final int htmlPollCount;
    private final String uiErrorMessage;
    private final String url;
    private final int webviewLoadCount;

    public DlTemplateModel() {
        this(null, null, null, null, null, null, null, null, null, null, 0, 0, null, 8191, null);
    }

    public static /* synthetic */ DlTemplateModel copy$default(DlTemplateModel dlTemplateModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, String str11, int i3, Object obj) {
        DlTemplateModel dlTemplateModel2 = dlTemplateModel;
        int i4 = i3;
        return dlTemplateModel.copy((i4 & 1) != 0 ? dlTemplateModel2.dob : str, (i4 & 2) != 0 ? dlTemplateModel2.dobSep : str2, (i4 & 4) != 0 ? dlTemplateModel2.url : str3, (i4 & 8) != 0 ? dlTemplateModel2.dlFieldIdentifier : str4, (i4 & 16) != 0 ? dlTemplateModel2.dlDobIdentifier : str5, (i4 & 32) != 0 ? dlTemplateModel2.dlSubmitIdentifier : str6, (i4 & 64) != 0 ? dlTemplateModel2.dlNumberDoesNotExistIdentifier : str7, (i4 & 128) != 0 ? dlTemplateModel2.dlSearchSuccessParam : str8, (i4 & 256) != 0 ? dlTemplateModel2.dobUiFormat : str9, (i4 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? dlTemplateModel2.dobUiSep : str10, (i4 & 1024) != 0 ? dlTemplateModel2.htmlPollCount : i, (i4 & 2048) != 0 ? dlTemplateModel2.webviewLoadCount : i2, (i4 & 4096) != 0 ? dlTemplateModel2.uiErrorMessage : str11);
    }

    public final String component1() {
        return this.dob;
    }

    public final String component10() {
        return this.dobUiSep;
    }

    public final int component11() {
        return this.htmlPollCount;
    }

    public final int component12() {
        return this.webviewLoadCount;
    }

    public final String component13() {
        return this.uiErrorMessage;
    }

    public final String component2() {
        return this.dobSep;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.dlFieldIdentifier;
    }

    public final String component5() {
        return this.dlDobIdentifier;
    }

    public final String component6() {
        return this.dlSubmitIdentifier;
    }

    public final String component7() {
        return this.dlNumberDoesNotExistIdentifier;
    }

    public final String component8() {
        return this.dlSearchSuccessParam;
    }

    public final String component9() {
        return this.dobUiFormat;
    }

    public final DlTemplateModel copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, String str11) {
        String str12 = str;
        C2885g.m13910b(str12, "dob");
        String str13 = str2;
        C2885g.m13910b(str13, "dobSep");
        String str14 = str3;
        C2885g.m13910b(str14, ImagesContract.URL);
        String str15 = str4;
        C2885g.m13910b(str15, "dlFieldIdentifier");
        String str16 = str5;
        C2885g.m13910b(str16, "dlDobIdentifier");
        String str17 = str6;
        C2885g.m13910b(str17, "dlSubmitIdentifier");
        String str18 = str7;
        C2885g.m13910b(str18, "dlNumberDoesNotExistIdentifier");
        String str19 = str8;
        C2885g.m13910b(str19, "dlSearchSuccessParam");
        String str20 = str9;
        C2885g.m13910b(str20, "dobUiFormat");
        String str21 = str10;
        C2885g.m13910b(str21, "dobUiSep");
        String str22 = str11;
        C2885g.m13910b(str22, "uiErrorMessage");
        return new DlTemplateModel(str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, i, i2, str22);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DlTemplateModel) {
                DlTemplateModel dlTemplateModel = (DlTemplateModel) obj;
                if (C2885g.m13909a(this.dob, dlTemplateModel.dob) && C2885g.m13909a(this.dobSep, dlTemplateModel.dobSep) && C2885g.m13909a(this.url, dlTemplateModel.url) && C2885g.m13909a(this.dlFieldIdentifier, dlTemplateModel.dlFieldIdentifier) && C2885g.m13909a(this.dlDobIdentifier, dlTemplateModel.dlDobIdentifier) && C2885g.m13909a(this.dlSubmitIdentifier, dlTemplateModel.dlSubmitIdentifier) && C2885g.m13909a(this.dlNumberDoesNotExistIdentifier, dlTemplateModel.dlNumberDoesNotExistIdentifier) && C2885g.m13909a(this.dlSearchSuccessParam, dlTemplateModel.dlSearchSuccessParam) && C2885g.m13909a(this.dobUiFormat, dlTemplateModel.dobUiFormat) && C2885g.m13909a(this.dobUiSep, dlTemplateModel.dobUiSep)) {
                    if ((this.htmlPollCount == dlTemplateModel.htmlPollCount ? 1 : null) != null) {
                        if ((this.webviewLoadCount == dlTemplateModel.webviewLoadCount ? 1 : null) != null && C2885g.m13909a(this.uiErrorMessage, dlTemplateModel.uiErrorMessage)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.dob;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.dobSep;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.url;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dlFieldIdentifier;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dlDobIdentifier;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dlSubmitIdentifier;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dlNumberDoesNotExistIdentifier;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dlSearchSuccessParam;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dobUiFormat;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.dobUiSep;
        hashCode = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.htmlPollCount) * 31) + this.webviewLoadCount) * 31;
        str2 = this.uiErrorMessage;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DlTemplateModel(dob=");
        stringBuilder.append(this.dob);
        stringBuilder.append(", dobSep=");
        stringBuilder.append(this.dobSep);
        stringBuilder.append(", url=");
        stringBuilder.append(this.url);
        stringBuilder.append(", dlFieldIdentifier=");
        stringBuilder.append(this.dlFieldIdentifier);
        stringBuilder.append(", dlDobIdentifier=");
        stringBuilder.append(this.dlDobIdentifier);
        stringBuilder.append(", dlSubmitIdentifier=");
        stringBuilder.append(this.dlSubmitIdentifier);
        stringBuilder.append(", dlNumberDoesNotExistIdentifier=");
        stringBuilder.append(this.dlNumberDoesNotExistIdentifier);
        stringBuilder.append(", dlSearchSuccessParam=");
        stringBuilder.append(this.dlSearchSuccessParam);
        stringBuilder.append(", dobUiFormat=");
        stringBuilder.append(this.dobUiFormat);
        stringBuilder.append(", dobUiSep=");
        stringBuilder.append(this.dobUiSep);
        stringBuilder.append(", htmlPollCount=");
        stringBuilder.append(this.htmlPollCount);
        stringBuilder.append(", webviewLoadCount=");
        stringBuilder.append(this.webviewLoadCount);
        stringBuilder.append(", uiErrorMessage=");
        stringBuilder.append(this.uiErrorMessage);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public DlTemplateModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, String str11) {
        C2885g.m13910b(str, "dob");
        C2885g.m13910b(str2, "dobSep");
        C2885g.m13910b(str3, ImagesContract.URL);
        C2885g.m13910b(str4, "dlFieldIdentifier");
        C2885g.m13910b(str5, "dlDobIdentifier");
        C2885g.m13910b(str6, "dlSubmitIdentifier");
        C2885g.m13910b(str7, "dlNumberDoesNotExistIdentifier");
        C2885g.m13910b(str8, "dlSearchSuccessParam");
        C2885g.m13910b(str9, "dobUiFormat");
        C2885g.m13910b(str10, "dobUiSep");
        C2885g.m13910b(str11, "uiErrorMessage");
        this.dob = str;
        this.dobSep = str2;
        this.url = str3;
        this.dlFieldIdentifier = str4;
        this.dlDobIdentifier = str5;
        this.dlSubmitIdentifier = str6;
        this.dlNumberDoesNotExistIdentifier = str7;
        this.dlSearchSuccessParam = str8;
        this.dobUiFormat = str9;
        this.dobUiSep = str10;
        this.htmlPollCount = i;
        this.webviewLoadCount = i2;
        this.uiErrorMessage = str11;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getDobSep() {
        return this.dobSep;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getDlFieldIdentifier() {
        return this.dlFieldIdentifier;
    }

    public final String getDlDobIdentifier() {
        return this.dlDobIdentifier;
    }

    public final String getDlSubmitIdentifier() {
        return this.dlSubmitIdentifier;
    }

    public final String getDlNumberDoesNotExistIdentifier() {
        return this.dlNumberDoesNotExistIdentifier;
    }

    public final String getDlSearchSuccessParam() {
        return this.dlSearchSuccessParam;
    }

    public final String getDobUiFormat() {
        return this.dobUiFormat;
    }

    public final String getDobUiSep() {
        return this.dobUiSep;
    }

    public final int getHtmlPollCount() {
        return this.htmlPollCount;
    }

    public final int getWebviewLoadCount() {
        return this.webviewLoadCount;
    }

    public /* synthetic */ DlTemplateModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, String str11, int i3, C2884f c2884f) {
        int i4 = i3;
        String str12 = (i4 & 1) != 0 ? "dd-mm-yyyy" : str;
        String str13 = (i4 & 2) != 0 ? "-" : str2;
        String str14 = (i4 & 4) != 0 ? "https://parivahan.gov.in/rcdlstatus/?pur_cd=101" : str3;
        String str15 = (i4 & 8) != 0 ? "form_rcdl:tf_dlNO" : str4;
        String str16 = (i4 & 16) != 0 ? "form_rcdl:tf_dob_input" : str5;
        String str17 = (i4 & 32) != 0 ? "check status" : str6;
        String str18 = (i4 & 64) != 0 ? "No DL Details Found" : str7;
        String str19 = (i4 & 128) != 0 ? "Holder's Name" : str8;
        String str20 = (i4 & 256) != 0 ? "dd mm yyyy" : str9;
        String str21 = (i4 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? " " : str10;
        int i5 = 3;
        int i6 = (i4 & 1024) != 0 ? 3 : i;
        if ((i4 & 2048) == 0) {
            i5 = i2;
        }
        this(str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, i6, i5, (i4 & 4096) != 0 ? "ui-messages-error-summary" : str11);
    }

    public final String getUiErrorMessage() {
        return this.uiErrorMessage;
    }
}
