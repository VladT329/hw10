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
        String nameOs = "";
        if (deviceOs == 0) {
            nameOs = "iOS";
        } else {
            nameOs = "Android";
        }
        if (clientDeviceYear >= 2015 && clientDeviceYear <= currentYear){
            System.out.print("Установите обычную версию приложения для " + nameOs + " по ссылке");
        } else if (clientDeviceYear < 2015){
            System.out.print("Установите облегченную версию приложения для " + nameOs + " по ссылке");
        } else if (clientDeviceYear > currentYear) {
            System.out.println("Ваш телефон на " + nameOs + " из будущего " + clientDeviceYear + " года. Установите обычную версию приложения");
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
        } else if (distance > 100) {
            days = -1;
        }
        return days;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        checkYear(1928);
        System.out.println();

        System.out.println("Задание 2");
        checkSmartphone(0, 2025);
        System.out.println();

        System.out.println("Задание 3");
        int distance = 101;
        if (showDeliveryTime(distance) > 0){
            System.out.println("Потребуется дней: " + showDeliveryTime(distance));
        } else{
            System.out.println("Доставки нет");
        }
    }
}