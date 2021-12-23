package basic.java_cursor.education;

public class OutputValueASCI {
    public void outputValueASCI(int x, int y) {
        System.out.print("Cимволи ASCII(" + x + " - " + y + "):");
        for (int i = x; i <= y; i++) {
            System.out.print((char) i + ", ");
        }
        System.out.println();
    }
}
