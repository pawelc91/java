package taskManager.controller;

import taskManager.model.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public interface UserManager {
    // statyczna lista agregująca użytkowników
    public static List<User> users = new LinkedList<>(Arrays.asList(
            new User("Jan", "Kowalski"),
            new User("Adam", "Nowak")
    ));

    // METODY ABSTRAKCYJNE
    // metoda do dodawania użytkowników
    void addUser(String name, String lastName);

    // metoda do pobierania aktualnej listy użytkowników
    List<User> getAllUsers();

    // metoda wyszukująca użytkownika po indeksie
    User getUserByIndex(int index);
}