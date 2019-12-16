package exceptions;

public class ReservationException extends Exception {   // jeżeli wyjątek rozszerza Exception
                                                        // będzie możliwy do zgłoszenia w klauzuli throw
                                                        // będziemy mogli go obsługiwać w try-catch


    public ReservationException() {
        System.out.println("W naszym hotelu nie można przypisać gości do pokoju nr 13");
    }

    public String getMessage() {
        return "Podałeś pokój nr 13. Jest to numer zabroniony w naszym hotelu";
    }
}
