package banking.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
@AllArgsConstructor
@Getter
public class AccountDTO {
    private Long id;
    private boolean visible;
    private String currency;
    private long balance;
    private String type;
}
