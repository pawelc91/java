package exceptions;

import java.util.InputMismatchException;

public class Reception {
    public void bookRoom(int roomNo) {
        try {

            if (roomNo == 13) {
                // ręczne zgłoszenie wyjątku -> po to by go obsłużyć
                throw new ReservationException(); // tworzę obiekt wyjątku
            }
            System.out.println("Przypisano gości do pokoju numer " + roomNo);
        } catch (ReservationException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        new Reception().bookRoom(13);
    }
}