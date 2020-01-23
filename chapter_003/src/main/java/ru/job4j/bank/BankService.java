package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());

    }

    public void addAccount(String passport, Account account) {
        if (!users.get(findByPassport(passport)).contains(account) & findByPassport(passport) != null) {
            users.get(findByPassport(passport)).add(account);
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User element : users.keySet()) {
            if (element.getPassport().equals(passport)) {
                user = element;
                break;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        for (Account element : users.get(findByPassport(passport))) {
            if (element.getRequisite().contains(requisite) & findByPassport(passport) != null) {
                account = element;
                break;
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 int amount) {
        boolean rsl = false;
        Account src = findByRequisite(srcPassport, srcRequisite);
        Account dest = findByRequisite(destPassport, destRequisite);
        if (src != null && dest != null) {
            dest.setBalance(dest.getBalance() + amount);
        }
        return rsl;
    }
}
