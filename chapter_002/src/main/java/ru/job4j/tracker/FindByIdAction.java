package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Enter id selected item:");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item.getId() + " " + item.getName());
        } else {
            System.out.println("item with entered id not found");
        }
        return true;
    }
}
