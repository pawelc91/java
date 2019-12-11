package interfaces;

// definicja interfejsu
public interface DatabaseConnector {
    // pole finalne
    public final String PORT = "3306";
    // pole statyczne -> zmienna statyczna
    public static final String HOST = "localhost";

    // metoda abstrakcyjna -> bez ciała metody (implementacji)
    boolean databaseDriverCheck();

    void setConnection(String host, String port, String username, String password, String databaseName);

    void closeConnection();

}
