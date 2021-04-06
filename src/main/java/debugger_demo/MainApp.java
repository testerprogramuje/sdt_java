package debugger_demo;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("Witaj w programie!");

        User user = new User("Jo", "Black");

        String fullName = user.getFullName();

        System.out.println("Pełna nazwa użytkownika to: " + fullName);
    }
}
