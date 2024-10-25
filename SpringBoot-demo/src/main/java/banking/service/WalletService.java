package banking.service;

import banking.CustomerWallet;
import banking.DTO.WalletDTO;
import banking.MerchantWallet;
import banking.Wallet;
import banking.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class WalletService {
    @Autowired
    private WalletFactoryService walletFactoryService;
    @Autowired
    private WalletRepository walletRepository;

    public WalletDTO saveWallet(String userId,String type ) {
        Wallet wallet = null;
        if(type.equals("CUSTOMER")){
            wallet = this.createCustomerWallet(userId);
        }else if(type.equals("MERCHANT")){
            wallet = this.createMerchantWallet(userId);
        }else{
            throw new RuntimeException("Not supported type");
        }
        return wallet.convertToDTO();
    }

    @Transactional
    public Wallet createCustomerWallet(String userId) {
        CustomerWallet wallet = walletFactoryService.createCustomerWallet(userId);

        Wallet result = walletRepository.save(wallet);

        return result;
    }

    @Transactional
    public Wallet createMerchantWallet(String userId) {
        MerchantWallet wallet = walletFactoryService.createMerchantWallet(userId);

        Wallet result = walletRepository.save(wallet);

        return result;
    }
}