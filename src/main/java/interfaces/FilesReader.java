package interfaces;

public abstract class FilesReader {
    String fileName;
    // metody abstrakcyjne
    public abstract void readFile();

    public void closeFile(){
        System.out.println("FILE IS CLOSED");
    }

    public FilesReader(String fileName) {
        System.out.println("Jestem w konstruktorze");
        this.fileName = fileName;
    }
}