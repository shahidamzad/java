package basic;

public class Variables {
    static void main(String[] args) {
        int age = 25;           // declare + assign in one line
        String name;            // declare first
        name = "Alice";         // assign later

        int x = 10, y = 20;     // multiple variables, same type
        final double PI = 3.14; // 'final' = constant (cannot change)

        System.out.println(name + " is " + age + " years old.");
    }
}
