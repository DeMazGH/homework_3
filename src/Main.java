public class Main {
    public static void main(String[] args) {

        int clientOs = 0;

        task1(clientOs);
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(int clientOs) {

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
            System.out.println("«Установите облегченную версию приложения для iOS по ссылке».\n");
        } else if (isIOS && !isPhoneOld) {
            System.out.println("«Установите версию приложения для iOS по ссылке».\n");
        } else if (isAndroid && isPhoneOld) {
            System.out.println("«Установите облегченную версию приложения для Android по ссылке».\n");
        } else if (isAndroid && !isPhoneOld) {
            System.out.println("«Установите версию приложения для Android по ссылке».\n");
        }
    }

    public static void task3() {

        int year = 2022;

        if ((((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0)) {
            System.out.println(year + " год является високосным.\n");
        } else {
            System.out.println(year + " год не является високосным.\n");
        }
    }

    public static void task4() {

        int deliveryDistance = 95;
        int deliveryDays = 1;

        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays + "\n");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1) + "\n");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2) + "\n");
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

    public static void task7() {

        //Расширим задачу с кредитованием. Прежде чем выдавать кредиты наш банк проводит аудит
        // и оценивает клиентов и их возможность выплачивать кредит. Для того, чтобы вывести
        // предварительное решение, нам необходимо использовать данные о возрасте, зарплате и желаемой сумме.

        //Правила следующие:
        //Базовая ставка для клиента — 10% годовых. Срок кредитования — 12 месяцев.
        // Максимальный ежемесячный платеж — 50% от ЗП. Если возраст меньше 23, то добавляем 1% к ставке.
        // Если возраст меньше 30, то добавляем 0.5% к ставке. Если зарплата больше 80_000, уменьшаем ставку на 0.7%.

        //Нам нужно написать программу для предварительного одобрения/отказа заявки по кредиту.
        //Вводные данные: используйте переменные age = 25 для обозначения возраста,
        // salary = 60_000 для обозначения зарплаты,wantedSum = 330_000 для обозначения желаемой суммы кредита.

        //Подсчитайте и выведите ответ, одобрен кредит или нет.
        // На основании зарплаты подсчитайте максимальный допустимый платеж.
        // Если максимальный допустимый платеж по ЗП больше стандартного платежа по кредиту согласно
        // процентной ставке, то кредит одобрен, если меньше — отказан.

        //Пример ответа в консоль:
        // «Максимальный платеж при ЗП *** равен *** рублей. Платеж по кредиту *** рублей. Одобрено/отказано».

        int age = 25;
        int salary = 60_000;
        int wantedSum = 330_000;

        double baseAnnualRate = 0.1;
        int loanTerms = 12;

        if (age < 23) {
            baseAnnualRate = baseAnnualRate + 0.01;
        } else if (age < 30) {
            baseAnnualRate = baseAnnualRate + 0.005;
        }

        if (salary > 80_000) {
            baseAnnualRate = baseAnnualRate - 0.007;
        }

        int maxMonthlyPayment = (int)(((salary * 1.0) / 100) * 50);
        int loanPayment = (int)((wantedSum + (wantedSum * baseAnnualRate)) / loanTerms);

        if (maxMonthlyPayment > loanPayment) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. " +
                    "Платеж по кредиту " + loanPayment + " рублей. Одобрено.");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthlyPayment + " рублей. " +
                    "Платеж по кредиту " + loanPayment + " рублей. Отказано.");
        }
    }

}