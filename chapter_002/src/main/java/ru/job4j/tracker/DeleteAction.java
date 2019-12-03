package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        if (tracker.delete(input.askStr("Enter id selected item:"))) {
            System.out.println("success");
        } else {
            System.out.println("false");
        }
        return true;
    }
}
