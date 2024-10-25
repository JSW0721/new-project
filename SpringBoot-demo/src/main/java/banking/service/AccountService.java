package banking.service;

import banking.*;
import banking.repository.CustomerWalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;

@Service
public class AccountService {
    @Autowired
    private CustomerWalletRepository customerWalletRepository;
    @Autowired
    private TransactionRepository transactionRepository;

    @Transactional
    public void credit(String userId, AccountType accountType, Money amount) {
        if (amount.getAmounts() <= 0) {
            throw new RuntimeException("credit amount must be greater than 0");
        }

        CustomerWallet customerWallet = customerWalletRepository.findByUserId(userId);
        Account account = customerWallet.charageableAccount(accountType);
        account.credit(amount);

        CentralWallet centralWallet = centralWalletRepository.findByIdAndUserId(1L, "0").get();

        Long pid = Generators.timeBasedGenerator().generate().timestamp();
        Transaction tx = new Transaction(pid
                , centralWallet.source().getId(),
                Currency.WON, amount.getAmounts(),
                centralWallet.getUserId(),
                centralWallet.source().balance().getAmounts(),
                AccountType.SOURCE,
                account.getId(),
                Currency.WON,
                amount.getAmounts(),
                customerWallet.getUserId(),
                account.balance().getAmounts(),
                accountType,
                new HashMap());

        transactionRepository.save(tx);
    }
}