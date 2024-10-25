package banking.service;

import banking.Account;
import banking.AccountType;
import banking.CustomerWallet;
import banking.MerchantWallet;

public class WalletFactoryService {
    public CustomerWallet createCustomerWallet(String userId) {
        CustomerWallet cw = new CustomerWallet(userId);
        cw.createAccount(new Account(cw, AccountType.CASHBACK, true));
        cw.createAccount(new Account(cw, AccountType.PREPAID, true));
        cw.createAccount(new Account(cw, AccountType.EMONEY, true));
        return cw;
    }
    public MerchantWallet createMerchantWallet(String userId) {
        MerchantWallet mw = new MerchantWallet(userId);
        mw.createAccount(new Account(mw, AccountType.EMONEY, true));
        return mw;
    }
}
