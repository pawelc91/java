package taskManager.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface FileManager {
    public final String FILE_PATH = "/Users/catalina/Desktop/projects/java/src/main/java/taskManager/resource/tasks.csv";
    // metoda zapisująca dane o taskach i użytkownikach do pliku
    void saveTasksToFile() throws FileNotFoundException, IOException;
    void getDataFromFile() throws FileNotFoundException;
}
