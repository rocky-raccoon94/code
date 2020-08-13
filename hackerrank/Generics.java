package hackerrank;

public class Generics {
    public static void main(String[] args) {
        var printer = new Printer<String>();
        printer.printArray(new String[] { "haha", "YOur" });
    }
}

class Printer<T> {
    public void printArray(T[] x) {
        for (T t : x)
            System.out.println(t);
    }
}