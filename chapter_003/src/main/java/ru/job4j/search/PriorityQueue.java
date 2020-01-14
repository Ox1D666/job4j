package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позицию определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put (Task task) {
        int index = 0;
        for (Task tsk : tasks) {
            int i = 0;
            if(tasks.get(i).getPriority() >= task.getPriority()) {
                index = i;
                break;
            } else index = i + 1;
        }
//        for (int i = 0; i < tasks.size(); i++) {
//            if (tasks.get(i).getPriority() >= task.getPriority()) {
//                index = i;
//                break;
//            } else index = i + 1;
//        }
        this.tasks.add(index, task);
    }
    public Task take() {
        return tasks.remove(0);
    }
}
