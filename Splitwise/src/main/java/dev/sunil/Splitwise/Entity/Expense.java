package dev.sunil.Splitwise.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Currency;

@Entity
@Getter
@Setter
public class Expense extends BaseModel{
    private String description;
    private Currency currency;
    private double amount;
    private LocalDateTime dateOfExpense;
    private User addedByUser;
}
