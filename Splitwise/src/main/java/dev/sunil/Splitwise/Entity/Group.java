package dev.sunil.Splitwise.Entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Group extends BaseModel{
    private String groupName;
    private User groupCreatedBy;
    private List<User> groupMembers;
    private List<Expense> expenses;
    private double totalAmountSpend;

}
