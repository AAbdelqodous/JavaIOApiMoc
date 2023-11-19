package q9;

public class Test {
    public static void main(String[] args) {
        var console = System.console();
        var name = console.readLine("What's your name?");
        System.out.printf("You entered: %s", name);
    }
}
