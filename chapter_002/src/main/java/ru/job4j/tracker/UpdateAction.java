package ru.job4j.tracker;

public class UpdateAction implements UserAction {
    @Override
    public String name() {
        return "Change item name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        if (tracker.replace(input.askStr("Enter id selected item:"), new Item(input.askStr("Enter new name:")))) {
            System.out.println("success");
        } else {
            System.out.println("false");
        }
        return true;
    }
}
