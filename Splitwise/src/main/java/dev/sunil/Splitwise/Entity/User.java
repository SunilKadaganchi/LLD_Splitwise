package dev.sunil.Splitwise.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity(name ="SPLITWISE_USER")
@Getter
@Setter
public class User extends BaseModel{
    private String name;
    @Column(unique = true)
    private String email;
    private String password;
    private List<User> friends;
    private List<Group> groups;
}
