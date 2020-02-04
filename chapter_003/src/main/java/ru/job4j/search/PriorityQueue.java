package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позицию определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     *
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task tsk : tasks) {
            if (tsk.getPriority() <= task.getPriority()) {
                index = tasks.size();
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}
