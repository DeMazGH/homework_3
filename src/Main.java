public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
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
            System.out.println("Потребуется дней: " + deliveryDays + "\n");
        } else {
            System.out.println("Срок доставки более 3 дней!\n");
        }
    }

    public static void task5() {

        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Сейчас зима!\n");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Сейчас весна!\n");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Сейчас лето!\n");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Сейчас осень!\n");
                break;

            default:
                System.out.println("Такого месяца не существует!");
        }
    }

    public static void task6() {

        //И снова дела банковские, уже сложнее.
        //В нашем банке можно, кроме дебетовых, получать еще и кредитные карты.
        // У таких карт есть допустимый лимит средств, который рассчитывается исходя из
        // возраста клиента и его зарплаты.

        //Правила расчета следующие:
        //Людям старше (или равно) 23 лет мы предоставляем лимит в размере 3 зарплат.
        //Людям младше 23 лет мы предоставляем лимит в размере 2 зарплат.
        //Если заработная плата клиента выше (или равно) 50 тысяч, мы увеличиваем лимит в 1.2 раза.
        //Если заработная плата выше (или равно) 80 тысяч, мы увеличиваем лимит в 1.5 раза.
        //Наша задача: написать программу, которая показывает, какую сумму на кредитке может
        // получить клиент.
        //Вводные данные: переменная age = 19 для обозначения возраста
        // клиента, salary = 58_000 для обозначения зарплаты клиента.
        //Увеличения не могут быть применены одновременно.
        // Необходимо вывести максимальный лимит в консоль в формате:
        // «Мы готовы выдать вам кредитную карту с лимитом *** рублей».


        int age = 19;
        int salary = 58_000;
        double multiplier = 1.0;

        if (age >= 23) {
            multiplier = multiplier * 3;
        } else {
            multiplier = multiplier * 2;
        }

        if (salary >= 80_000) {
            multiplier = multiplier * 1.5;
        } else if (salary >= 50_000) {
            multiplier = multiplier * 1.2;
        }

        int limitToCreditCard = (int)((double) salary * multiplier);

        System.out.println("Мы готовы выдать вам карту с лимитом " + limitToCreditCard + " рублей.\n");
    }

}