package banking.controller;

import banking.DTO.WalletDTO;
import banking.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletController {
    @Autowired
    private WalletService walletService;

    @PostMapping("/api/wallet/customer/{userId}")
    public ResponseEntity<WalletDTO> createCustomerWallet(@PathVariable String userId) {
        WalletDTO result = walletService.saveWallet(userId,"CUSTOMER");
        return ResponseEntity.ok(result);
    }

    @PostMapping("/api/wallet/merchant/{userId}")
    public ResponseEntity<WalletDTO> createMerchantWallet(@PathVariable String userId) {
        WalletDTO result = walletService.saveWallet(userId, "MERCHANT");
        return ResponseEntity.ok(result);
    }
}