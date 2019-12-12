package taskManager.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// adnotacja generująca getery i setery do wszystkich pól klasowych + toString

@Data

public class User {
    private String name;
    private String lastName;
    // każdy użytkownik ma swoją listę zadań
    private List<Task> tasks = new LinkedList<>();

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
