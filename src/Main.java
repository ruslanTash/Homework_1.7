import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int mounth = 15_000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + mounth;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        //Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
        int top = 0;
        while (top < 10) {
            top++;
            System.out.print(top + " ");
        }
        //На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
        int low = 11;
        System.out.println();
        for (; low > 1; ) {
            low--;
            System.out.print(low + " ");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        //В стране Y население равно 12 миллионов человек.
        //
        //Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
        // Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
        int population, mortality, fertility;
        population = 12_000_000;
        mortality = population / 1000 * 8;
        fertility = population / 1000 * 17;
        for (int i = 0; i < 10; i++) {
            population = population + fertility - mortality;
            //В консоль выведите результат операции на каждый год в формате: «Год …, численность населения составляет …».
            System.out.println("Год " + i + " численность населения составляет " + population);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        //Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%. Первоначальная сумма вклада — 15 тысяч рублей.
        //
        //Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        //
        //Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
        int depositAmount = 0;
        int mounth = 0;
        while (depositAmount <= 12_000_000) {
            mounth++;
            depositAmount = depositAmount + 15_000 + depositAmount / 100 * 7;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + depositAmount + " рублей");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int depositAmount = 0;
        int mounth = 0;
        while (depositAmount <= 12_000_000) {
            mounth++;
            depositAmount = depositAmount + 15_000 + depositAmount / 100 * 7;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений равна " + depositAmount + " рублей");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int depositAmount = 0;
        int mounth = 0;
        while (mounth <= 12 * 9) {
            mounth++;
            depositAmount = depositAmount + 15_000 + depositAmount / 100 * 7;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений равна " + depositAmount + " рублей");
            }
        }
    }
    public static void task7(){
        System.out.println("Задача 7");
        int firstFraday = 2;
        for (int i = 0; i < 31; i++){
            if ((i - firstFraday) % 7 == 0){
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
    }
    public static void task8(){
        System.out.println("Задача 8");
        //Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        //
        //В консоль нужно вывести все годы за последние 200 лет, когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).
        for (int i = 0; i < 2122; i++){
            if (i % 79 == 0 && i >= 2022 - 200 && i <= 2022 + 100){
                System.out.println(i);
            }
        }
    }
}