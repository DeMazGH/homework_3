public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        int clientOs = 0;

        switch (clientOs) {
            case 0:
                System.out.println("«Установите версию приложения для iOS по ссылке».\n");
                break;
            case 1:
                System.out.println("«Установите версию приложения для Android по ссылке».\n");
                break;
            default:
                System.out.println("Ваша операционная система не опознана, обратитесь в тех. поддержку!\n");
        }
    }

    public static void task2() {

        int clientOs = 1;
        int clientYear = 2011;

        boolean isIOS = clientOs == 0;
        boolean isAndroid = clientOs == 1;
        boolean isPhoneOld = clientYear < 2015;

        if (isIOS && isPhoneOld) {
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».");
        }
        if (isIOS && !isPhoneOld) {
            System.out.println("«Установите версию приложения для iOS по ссылке».");
        }

        if (isAndroid && isPhoneOld) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».");
        }
        if (isAndroid && !isPhoneOld) {
            System.out.println("«Установите версию приложения для Android по ссылке».");
        }
        System.out.println();
    }

    public static void task3() {

        int year = 2022;

        if (((year % 100) == 0) && ((year % 400) != 0)) {
            System.out.println(year + "« год не является високосным».\n");
        } else if ((year % 4) == 0) {
            System.out.println(year + "« год является високосным».\n");
        } else {
            System.out.println(year + "« год не является високосным».\n");
        }
    }

    public static void task4() {

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        }

        if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Срок доставки более 3 дней!");
        }
    }
}