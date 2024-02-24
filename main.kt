import java.util.Scanner;

public class MainClass {

}
    public main(String[] args)

lateinit var system: Object
public var system = System
    {
        val int = null
        val value1 = 0;
        val value2 = 0;
        String operation = null;

        System.out.println("Введите 2  целых числа: ");
        Scanner scanner = new Scanner(system);
        if (value1 > 0 || value1 < 10) {
            value1 = scanner.nextInt();
            operation = scanner.next();
            value2 = scanner.nextInt();
        }
        if (operation.equals("+")) {
            System.out.println(value1 + value2);
        }
        if (operation.equals("-")) {
            System.out.println(value1 - value2);
        }
        if (operation.equals("*")) {
            System.out.println(value1 * value2);
        }
        if (operation.equals("/")) { System.out.println(value1 / value2);
        } else { System.out.println("error!");
        }
    }