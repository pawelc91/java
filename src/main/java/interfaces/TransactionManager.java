package interfaces;

public interface TransactionManager {
    // metoda zarządzająca transakcjami
    // jeżeli autoCommit == true -> transakcje aktywne
    // jeżeli autoCommit == false -> transakcje są nieaktywne
    void setAutoCommit(boolean autoCommit);
}