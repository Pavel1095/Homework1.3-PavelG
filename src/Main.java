public class Main {
    public static void main(String[] args) {
        // Задание 4
        int deliveryDictance = 95;
        if (deliveryDictance <= 20) {
            System.out.println("Доставка карты займет 1 день");
        } else if (deliveryDictance >20 && deliveryDictance <= 60) {
                System.out.println("Доставка карты займет 2 дня");
        } else if (deliveryDictance > 60 && deliveryDictance <= 100)
            System.out.println("доставка карты зймет 3 дня");
    }
}