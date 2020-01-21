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
        for (Map.Entry<User, List<Account>> element : users.entrySet()) {
            if (element.getKey().getPassport().contains(passport)) {
                if (!element.getValue().contains(account)) {
                    element.getValue().add(account);
                }
            }
        }
    }

    public User findByPassport(String passport) {
        User user = null;
        for (User element : users.keySet()) {
            if (element.getPassport().equals(passport)) {
                user = element;
            }
        }
        return user;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account account = null;
        for (Map.Entry<User, List<Account>> element : users.entrySet()) {
            if (element.getKey().getPassport().contains(passport)) {
                for (Account value : element.getValue()) {
                    if (value.getRequisite().equals(requisite)) {
                        account = value;
                    }
                }
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite,
                                 int amount) {
        boolean rsl = false;
        BankService bankService = new BankService();
        if (bankService.findByRequisite(srcPassport, srcRequisite).getBalance() >= amount) {
            Account dest = bankService.findByRequisite(destPassport, destRequisite);
            dest.setBalance(amount + dest.getBalance());
        }
        return rsl;
    }
}
