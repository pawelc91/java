import repetition.Repetition;

public class Main {
    public static void main(String[] args) {
        Repetition repetition = new Repetition();
//        repetition.getElements();
//        repetition.getUniqElements();
        System.out.println("Daodano element: " + repetition.addElement("paulina"));
////        System.out.println(repetition.deleteOneElement("a"));
////        System.out.println(repetition.deleteOneElement("abba"));
//        repetition.swapEllementsByIndex(1,3);
////        repetition.deleteSameElement("b");
//        repetition.getElements();
//        repetition.getElementsQuantity();
//        System.out.println(repetition.getElementsRevers());
//        repetition.getElements();
//        System.out.println(repetition.getElementsQuantityInMap());
        repetition.addElement("linaaup");
        repetition.getElements();
        System.out.println(repetition.getSortedElements(true));
        System.out.println(repetition.getSortedElements(false));
//        System.out.println(repetition.getSortedElementsByCollections(true));
//        System.out.println(repetition.getSortedElementsByCollections(false));
    }
}
