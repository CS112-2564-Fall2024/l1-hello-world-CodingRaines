public class Main {
    public static void main(String[] args) {
        System.out.println("Hello " + Main.Name() + "!");
        Main.Text();
    }

    public static String Name() {
        return "Chase";
    }

    public static void Text() {
        System.out.println("Welcome to CS 112!");
    }
}