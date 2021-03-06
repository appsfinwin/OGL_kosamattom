package com.kosamattom.cusmateogl.account_details.dialog_accounts;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.lifecycle.MutableLiveData;

import com.kosamattom.cusmateogl.account_details.pojo.Table;

public class RowDialogAccountsViewmodel extends BaseObservable {

    Table bankDetail;
    MutableLiveData<ActionDialogAccounts> mAction;
    public RowDialogAccountsViewmodel(Table bankDetail, MutableLiveData<ActionDialogAccounts> mAction) {
        this.bankDetail=bankDetail;
        this.mAction=mAction;
    }

    public void setBankDetails(Table bankDetail) {
        this.bankDetail=bankDetail;
        notifyChange();
    }

    public void clickSelectAccount(View view)
    {
        mAction.setValue(new ActionDialogAccounts(ActionDialogAccounts.SELECT_BANK_DATA,bankDetail));
    }
}
