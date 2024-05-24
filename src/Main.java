import java.time.LocalDate;

public class Main {

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("Год " + year + " — високосный год");
        } else {
            System.out.println("Год " + year + " — невисокосный год");
        }
    }

    public static void checkSmartphone(int deviceOs, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (deviceOs == 0) {
            System.out.print("Операционная система — Android, ");
        } else {
            System.out.print("Операционная система — IOS, ");
        }
        if (clientDeviceYear == currentYear){
            System.out.print("установите обычную версию приложения");
        } else {
            System.out.print("установите облегченную версию приложения");
        }
    }
    public static int showDeliveryTime (int distance) {
        int days = 0;
        if (distance < 20) {
            days = 1;
        } else if (distance >= 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        checkYear(1928);
        System.out.println();

        System.out.println("Задание 2");
        checkSmartphone(0, 2024);
        System.out.println(); /// почему-то строка игнорируется!!!
        System.out.println();

        System.out.println("Задание 3");
        int distance = 10;
        if (distance > 100){
            System.out.println("Доставки нет");
        } else{
            System.out.println("Потребуется дней: " + showDeliveryTime(distance));
        }
    }
}