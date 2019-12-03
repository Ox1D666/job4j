package ru.job4j.tracker;

public class CreateAListAction implements UserAction {
    @Override
    public String name() {
        return "Create a list of items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] items = tracker.findAll();
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i].getId() + " " + items[i].getName());
        }
        return true;
    }
}
