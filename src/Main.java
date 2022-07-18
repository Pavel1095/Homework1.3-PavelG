public class Main {
    public static void main(String[] args) {
        // Задание 2
        int clientOs = 0;
        int clientDeviceYear = 2016;
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 0 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию для IOS по ссылке");
        if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs == 1 && clientDeviceYear < 2015)
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }
}
