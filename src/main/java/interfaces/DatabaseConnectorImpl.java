package interfaces;
// klasa implementująca interfejs
public class DatabaseConnectorImpl implements DatabaseConnector{
    private boolean isDriverInstalled = true;
    @Override
    public boolean databaseDriverCheck() {
        return isDriverInstalled;   // sprawdza czy jest zainstalowany driver w projekcie
    }
    @Override
    public void setConnection(String username, String password, String databaseName) {
        System.out.println("CONNECTED");
        // Odwołanie do składowej finalnej interfejsu
        // Odowłanie do składowej statycznej
        System.out.println(DatabaseConnector.HOST + ":" + DatabaseConnector.PORT + "/" + databaseName);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
    @Override
    public void setAutoCommit(boolean autoCommit) {
        if(autoCommit){
            System.out.println("TRANSAKCJE");
        } else {
            System.out.println("BRAK TRANSAKCJI");
        }
    }
    @Override
    public void closeConnecion() {
        System.out.println("CONNECION IS CLOSED");
    }
    public void executeQuerry(String SQL){
        System.out.println("Query: " + SQL + " is executed");
    }


}