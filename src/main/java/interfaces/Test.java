package interfaces;

public class Test extends FilesReader {

    public Test(String fileName) {
        super(fileName);
    }

    @Override
    public void readFile() {
        System.out.println("FILE IS READY TO READ");
    }

    public static void main(String[] args) {
//        FilesReader r = new FilesReader(); -> nie można utworzyć instancji klasy abstrakcyjnej
        Test t = new Test("test.txt");
        t.readFile();
        t.closeFile();
        System.out.println(t.fileName);
    }
}