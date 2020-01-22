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
        if (!users.get(findByPassport(passport)).contains(account)) {
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
            if (element.getRequisite().contains(requisite)) {
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
        for (Account srcElement : users.get(findByPassport(srcPassport))) {
            if (srcElement.getRequisite().contains(srcRequisite) && srcElement.getBalance() >= amount) {
                for (Account destElement : users.get(findByPassport(destPassport))) {
                    if (destElement.getRequisite().contains(destRequisite)) {
                        destElement.setBalance(destElement.getBalance() + amount);
                    }
                }
            }
        }
        return rsl;
    }
}