package interfaces;
// definicja interfajsu
public interface DatabaseConnector extends TransactionManager{
    // pole finalne -> stała
    public final String PORT = "3306";
    // pole statyczne -> zmienna statyczna
    public static final String HOST = "localhost";

    // metoda abstrakcyjna -> bez ciała metody {implementacji}
    boolean databaseDriverCheck();
    void setConnection(String username, String password, String databaseName);
    void closeConnecion();

}