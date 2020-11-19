package ru.job4j.tracker;

public class StartUI {
    public static void main(String[] args) {
        Input input = new ValidateInput(new ConsoleInput());
        Tracker tracker = new Tracker();
        MenuTracker menuTracker = new MenuTracker(input, tracker);
        menuTracker.init();
    }
}
