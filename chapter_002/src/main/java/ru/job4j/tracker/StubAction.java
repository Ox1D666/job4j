package ru.job4j.tracker;

public class StubAction implements UserAction {
    private boolean call = false;
    //класс больше не работает

    @Override
    public int key() {
        return 0;
    }

    @Override
    public String info() {
        return null;
    }

    @Override
    public void execute(Input input, Tracker tracker) {
        call = true;
    }

    public boolean isCall() {
        return call;
    }
}
