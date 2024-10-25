package banking.repository;

import banking.CustomerWallet;
import banking.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerWalletRepository extends JpaRepository<Wallet, Long> {
    CustomerWallet findByUserId(String userId);
}
