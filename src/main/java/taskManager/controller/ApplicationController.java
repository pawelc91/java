package taskManager.controller;

import taskManager.model.Task;
import taskManager.model.User;

import java.time.LocalDate;
import java.util.List;

public class ApplicationController implements UserManager, TaskManager {

    @Override
    public void addUser(String name, String lastName) {
        // utworzenie obiektu user
        User user = new User(name, lastName);
        // dodanie użytkownika do listy użytkowników
        UserManager.users.add(user);
    }


    @Override
    public List<User> getAllUsers() {
        return UserManager.users;
    }

    @Override
    public User getUserByIndex(int index) {
        return UserManager.users.get(index);
    }

    public void printAllUsers() {
        UserManager.users.forEach(System.out::println);
    }

    @Override
    public Task addTask(String taskName, LocalDate deadline, User user) {
        // utworzenie obiektu task
        Task task = new Task(taskName, deadline, false, user);
        // dodać utworzony taks do listy tasków użytkownika z argumentu metody
        List<Task> tasks = user.getTasks();
        tasks.add(task);
        user.setTasks(tasks);
        return task;
    }

    @Override
    public void setTaskStatus(boolean status, int userIndex, int taskIndex) {
        // 1. znajdź użytkownika w liście po jego ineksie
        // 2. znajdź zadanie po indeksie zadania w liście zadań użytkownika
        // 3. zmododyfikuj status wyszukanego zadania
        User user = UserManager.users.get(userIndex);
        List<Task> userTasks = user.getTasks();
        Task task = userTasks.get(taskIndex);
        task.setStatus(status);
    }

    @Override
    public void countAllTasks(int userIndex) {
        System.out.println("All tasks: " + UserManager.users.get(userIndex).getTasks().size());
    }

    @Override
    public void countClosedTasks(int userIndex) {
        int closedCounter = 0;
        for (Task t : UserManager.users.get(userIndex).getTasks()) {
            if (t.isStatus()) {
                closedCounter++;
            }
        }
        System.out.println("Closed tasks: " + closedCounter);
    }

    @Override
    public void countOpenTasks(int userIndex) {
        int openCounter = 0;
        for (Task t : UserManager.users.get(userIndex).getTasks()) {
            if (!t.isStatus()) {
                openCounter++;
            }
        }
        System.out.println("Open tasks: " + openCounter);
    }

    @Override
    public void countAfterDeadlineTasks(int userIndex) {
        int afterDeadlineCounter = 0;
        for (Task t : UserManager.users.get(userIndex).getTasks()) {
            if (t.getDeadline().isBefore(LocalDate.now())) {
                afterDeadlineCounter++;
            }
        }
        System.out.println("After deadline tasks: " + afterDeadlineCounter);
    }
}