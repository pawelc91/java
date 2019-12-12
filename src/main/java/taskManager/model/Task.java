package taskManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor // generuje konstruktor z wszystkimi obiektami

public class Task {
    private String taskName;
    private LocalDate deadline;
    private boolean status;

    // do każdego zadania przypisany jest konkretny obiekt
    private User user;


    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", deadline=" + deadline +
                ", status=" + status +
                '}';
    }

}
