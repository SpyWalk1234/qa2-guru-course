package model.mansrimi;

import java.math.BigDecimal;

public class Card {
    private long id;
    private User user;
    private BigDecimal balance;

    public Card(long id, User user, BigDecimal balance) {
        this.id = id;
        this.user = user;
        this.balance = balance;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
