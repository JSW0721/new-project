package banking.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;

@AllArgsConstructor
@Getter
public class WalletDTO {
    private Long id;
    private String walletownerId;
    private String walletType;
    private long balance;
    private Collection<AccountDTO> accounts;
}
