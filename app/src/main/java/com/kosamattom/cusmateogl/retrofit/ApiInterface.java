package com.kosamattom.cusmateogl.retrofit;


import com.kosamattom.cusmateogl.account_details.closed_loans.pojo.ClosedLoansResponse;
import com.kosamattom.cusmateogl.account_details.pojo.GetBankDetailsResponse;
import com.kosamattom.cusmateogl.account_list.pojo.account_response.AccountDetailsResponse;
import com.kosamattom.cusmateogl.account_list.pojo.inventory_response.InventoryDetailResponse;
import com.kosamattom.cusmateogl.calculator.pojo.CalculatorResponse;
import com.kosamattom.cusmateogl.contact.pojo.branch.BranchResponse;
import com.kosamattom.cusmateogl.contact.pojo.contact.ContactResponse;
import com.kosamattom.cusmateogl.final_confirmation.pojo.ApplictaionDetailsResponse;
import com.kosamattom.cusmateogl.gold_loan.pojo.terms_and_conditions.TermsResponse;
import com.kosamattom.cusmateogl.gold_loan.select_scheme.pojo.SchemesResponse;
import com.kosamattom.cusmateogl.login.pojo.LoginResponse;
import com.kosamattom.cusmateogl.payment.axis_payment.pojo.PaymentResponse;
import com.kosamattom.cusmateogl.payment.axis_payment.pojo.TokenResponse;
import com.kosamattom.cusmateogl.payment.paytm.pojo.SettlementDetailsResponse;
import com.kosamattom.cusmateogl.payment.paytm.pojo.checksum.ChecksumResponse;
import com.kosamattom.cusmateogl.renew_loan.pojo.RenewalResponse;
import com.kosamattom.cusmateogl.renew_loan.pojo.gold_loan.GoldLoanResponse;
import com.kosamattom.cusmateogl.reset_password.forgot_password.pojo.ResetPasswordResponse;
import com.kosamattom.cusmateogl.reset_password.otp.pojo.Signup_response.SignUpResponse;
import com.kosamattom.cusmateogl.reset_password.otp.pojo.otp_creation.OtpCreationResponse;
import com.kosamattom.cusmateogl.reset_password.otp.pojo.validate_otp.ValidateOtpResponse;
import com.kosamattom.cusmateogl.signup.pojo.Response;
import com.kosamattom.cusmateogl.signup.pojo.otp_response.OtpGenerateResponse;

import io.reactivex.Single;
import okhttp3.RequestBody;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @POST("GLlogin")
    Single<LoginResponse> login(@Body RequestBody body);

    @POST("GetGLaccDetails")
    Single<AccountDetailsResponse> getAccountDetails(@Body RequestBody body);

    @POST("GetInventoryDetails")
    Single<InventoryDetailResponse> getInventoryDetails(@Body RequestBody body);

    @POST("GetSettlementDetails")
    Single<SettlementDetailsResponse> getSettlementDetails(@Body RequestBody body);

    @POST("Closedloans")
    Single<ClosedLoansResponse> getClosedLoans(@Body RequestBody body);

    @POST("GetTerms_Conditions")
    Single<TermsResponse> getTermsAndConditions();

    @POST("GetAvlblschemes")
    Single<SchemesResponse> getCSchemes(@Body RequestBody body);

    @POST("Calculator")
    Single<CalculatorResponse> getCalculation(@Body RequestBody body);

    @POST("Applicationdetails")
    Single<ApplictaionDetailsResponse> getApplicationDetails(@Body RequestBody body);

    @POST("Moneytransfer")
    Single<RenewalResponse> renewLoan(@Body RequestBody body);

    @POST("OnlineGoldLoan_Api")
    Single<GoldLoanResponse> renewGoldLoan(@Body RequestBody body);

    @POST("Branches")
    Single<BranchResponse> getBranch();

    @POST("Contact")
    Single<ContactResponse> getContact(@Body RequestBody body);

    @POST("ChecksumGenerator")
    Single<ChecksumResponse> getChecksum(@Body RequestBody body);

    @POST("getAccountHolder")
    Single<Response> getAccountHolder(@Body RequestBody body);

    @POST("OTPGenerate")
    Single<OtpGenerateResponse> otpGenerate(@Body RequestBody body);

    @POST("userSignUp")
    Single<SignUpResponse> signUp(@Body RequestBody body);

    @POST("generatetocken")
    Single<TokenResponse> generateToken(@Body RequestBody body);

    @POST("recresponse")
    Single<PaymentResponse> getPaymentResponse(@Query("i") String i);

    @POST("OTPCreation")
    Single<OtpCreationResponse> createOtp(@Body RequestBody body);

    @POST("OTPCreation")
    Single<ValidateOtpResponse> validateOtp(@Body RequestBody body);

    @POST("ResetPassword_Api")
    Single<ResetPasswordResponse> resetPassword(@Body RequestBody body);

    @POST("GetBankDetails")
    Single<GetBankDetailsResponse> getBankDetails(@Body RequestBody body);
}