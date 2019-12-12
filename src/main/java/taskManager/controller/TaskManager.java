package taskManager.controller;

import taskManager.model.Task;
import taskManager.model.User;

import java.time.LocalDate;

public interface TaskManager {
    // METODY ABSTRAKCYJNE
    // metoda do utworzenia taska
    Task addTask(String taskName, LocalDate deadline, User user);

    // metoda do zmiany statusu taska
    void setTaskStatus(boolean status, int userIndex, int taskIndex);

    // metody do statystyk wynkonania zadań
    void countAllTasks(int userIndex);

    void countClosedTasks(int userIndex);

    void countOpenTasks(int userIndex);

    void countAfterDeadlineTasks(int userIndex);
}