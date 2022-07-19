public class Main {
    public static void main(String[] args) {
        // Задание 3\
        int year = 2020;

        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear)
        {
            System.out.println(year + " is a leap year.");
        } else
            System.out.println(year + " is not a leap year.");
    }
}