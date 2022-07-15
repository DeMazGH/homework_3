public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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

    }
}