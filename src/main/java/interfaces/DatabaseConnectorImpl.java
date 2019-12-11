package interfaces;

public class DatabaseConnectorImpl implements DatabaseConnector {
    private boolean isDriverInstalled = true;


    @Override
    public boolean databaseDriverCheck() {
        return isDriverInstalled; // sprawdza czy jest zainstalowany driver w projekcie
    }

    @Override
    public void setConnection(String host, String port, String username, String password, String databaseName) {
        System.out.println("CONNECTED");
        // odwołanie do składowej finalnej interfejsu
        // Odwołanie do składowej statycznej
        System.out.println(DatabaseConnector.HOST + ":" + DatabaseConnector.PORT);
    }

    @Override
    public void closeConnection() {

    }
}
