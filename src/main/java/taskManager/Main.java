package taskManager;

import taskManager.controller.ApplicationController;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ApplicationController ac = new ApplicationController();
        ac.addUser("Paweł", "Cieślak");
        ac.addTask("Nauka programowania", LocalDate.of(2020, 02, 01), ac.getUserByIndex(2));
        ac.addTask("Nauka programowania zaawansowanego", LocalDate.of(2020, 02, 23), ac.getUserByIndex(2));
        ac.addTask("Nauka GITa", LocalDate.of(2019, 02, 23), ac.getUserByIndex(2));
        ac.setTaskStatus(true, 2, 0);

        ac.countAllTasks(2);
        ac.countClosedTasks(2);
        ac.countOpenTasks(2);
        ac.countAfterDeadlineTasks(2);

        ac.printAllUsers();
    }
}