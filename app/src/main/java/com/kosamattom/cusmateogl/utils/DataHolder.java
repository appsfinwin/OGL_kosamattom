package com.kosamattom.cusmateogl.utils;

import com.kosamattom.cusmateogl.login.pojo.LoginData;
import com.kosamattom.cusmateogl.signup.pojo.otp_response.signup_data.SIgnupData;

public class DataHolder {
   // public  List<BankDetail> bankDetails = new ArrayList<>();
    public LoginData loginData=new LoginData();
    //public BankDetail selectedBankData;
    public SIgnupData sIgnupData;

    private DataHolder() {}

    public static DataHolder getInstance() {

        if( instance == null ) {

            instance = new DataHolder();
        }
        return instance;
    }

    private static DataHolder instance;


}
