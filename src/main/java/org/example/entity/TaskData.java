package org.example.entity;

import java.util.HashSet;
import java.util.Set;

public class TaskData {
    private Set<Task> annsTasks;
    private Set<Task> bobsTasks;
    private Set<Task> carolsTasks;
    private Set<Task> unassignedTasks;

    public TaskData(Set<Task> annsTasks, Set<Task> bobsTasks,
                    Set<Task> carolsTasks, Set<Task> unassignedTasks) {
        this.annsTasks = annsTasks;
        this.bobsTasks = bobsTasks;
        this.carolsTasks = carolsTasks;
        this.unassignedTasks = unassignedTasks;
    }

    public Set<Task> getAnnsTasks() {
        return annsTasks;
    }

    public Set<Task> getBobsTasks() {
        return bobsTasks;
    }

    public Set<Task> getCarolsTasks() {
        return carolsTasks;
    }

    public Set<Task> getUnassignedTasks() {
        return unassignedTasks;
    }

    public Set<Task> getTasks(String name){
        switch (name){
            case "ann":
                return getAnnsTasks();
            case "bob":
                return getBobsTasks();
            case "carol":
                return getCarolsTasks();
            case "all":
                return getUnassignedTasks();
            default:
                return null;
        }
    }
    public Set<Task> getUnion(Set<Task>... task){
        Set<Task> union = new HashSet<>();
        for(Set<Task> t:task){
            union.addAll(t);
        }
        return union;
    }
    public Set<Task> getIntersection(Set<Task> task1, Set<Task> task2){
        Set<Task> intersection = new HashSet<>(task1);
        intersection.retainAll(task2);
        return intersection;
    }
    public Set<Task> getDifferences(Set<Task> task1,Set<Task> task2){
        Set<Task> removal = new HashSet<>(task1);
        removal.removeAll(task2);
        return removal;
    }
}
