import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");

        byte dog = 5;
        System.out.println("Значение переменной " + "Собака " + "с типом"+ " byte равно " + dog);
        int cat = 30;
        System.out.println("Значение переменной " + "Кошка " + "с типом"+ " int равно " + cat);
        short mouse = 2;
        System.out.println("Значение переменной " + "Мышь " + "с типом"+ " short равно " + mouse);
        long elephant = 230L;
        System.out.println("Значение переменной " + "Слон " + "с типом"+ " long равно " + elephant);
        float sugarWeight = 3.2f;
        System.out.println("Значение переменной " + "Вес сахара " + "с типом"+ " float равно " + sugarWeight);
        double saltWeight = 2.2;
        System.out.println("Значение переменной " + "Вес соли " + "с типом"+ " double равно " + saltWeight);

        // Задача 2
        System.out.println("Задача 2");

        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        boolean dogIsAdult = dog > 10;
        System.out.println(dogIsAdult);
        short d = 569;
        System.out.println(d);
        short e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        char g = 67;
        System.out.println(g);

        // Задача 3
        System.out.println("Задача 3");

        byte LudmilaPavlovnaNumberOfStudents = 23;
        byte AnnaSergeevnaNumberOfStudents = 27;
        byte EkaterinaAndreevnaNumberOfStudents = 30;
        short teachersBoughtPaperForAllStudentsSheets = 480;
        System.out.println(("На каждого ученика рассчитано ")
                + teachersBoughtPaperForAllStudentsSheets/
                (LudmilaPavlovnaNumberOfStudents
                        +AnnaSergeevnaNumberOfStudents
                        +EkaterinaAndreevnaNumberOfStudents)
                + (" листов бумаги"));

        // Задача 4
        System.out.println("Задача 4");

        byte machinePerfomanceModeBottles = 16;
        byte machinePerfomanceModeTime = 2;
        System.out.println("Машина изготавливает в минуту " +
                (machinePerfomanceModeBottles/machinePerfomanceModeTime) + " бутылок");
        byte machinePerfomanceBottlesIn1Minute = 8;
        byte machinePerfomanceTime = 20;
        System.out.println("За "+ machinePerfomanceTime
                + " минут" + " машина произвела бутылок "
                +(machinePerfomanceTime*machinePerfomanceBottlesIn1Minute) + " штук");
        byte machinePerfomanceDayHours = 24;
        byte InAHourMinute = 60;
        System.out.println("В сутках " + (machinePerfomanceDayHours*InAHourMinute) + " минут");
        System.out.println("За сутки машина произвела бутылок " +
                (1440 * machinePerfomanceBottlesIn1Minute) + " штук");
        byte machinePerfomance3DayHours = 62;
        System.out.println("В 3-х сутках " +
                (machinePerfomance3DayHours*InAHourMinute) + " минут");
        System.out.println("За 3 дня машина произвела бутылок "+
                ((machinePerfomance3DayHours*InAHourMinute)*machinePerfomanceBottlesIn1Minute) + " штук");
        byte machinePerfomanceMonthDay = 31;
        System.out.println("За месяц машина произвела бутылок "
                +(((machinePerfomanceMonthDay*machinePerfomanceDayHours)*InAHourMinute)
                *machinePerfomanceBottlesIn1Minute) + " штук");

        // Задача 5
        System.out.println("Задача 5");

        byte paintCansTotal = 120;
        byte cansOfWhitePaintForThe1StClass = 2;
        byte cansOfBrownPaintForThe1StClass = 4;
        System.out.println("В школе, где " + (paintCansTotal/
                (cansOfBrownPaintForThe1StClass+cansOfWhitePaintForThe1StClass)) + " классов, нужно "
                + (cansOfWhitePaintForThe1StClass*
                (paintCansTotal/(cansOfBrownPaintForThe1StClass+cansOfWhitePaintForThe1StClass)))
                + " банок белой краски и "
                + (cansOfBrownPaintForThe1StClass*
                (paintCansTotal/(cansOfBrownPaintForThe1StClass+cansOfWhitePaintForThe1StClass)))
                + " банок коричневой краски");

        // Задача 6
        System.out.println("Задача 6");

        int bananaWeightOnGram = 80;
        int milkWeightOn100Ml = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        int totalWeightOnGram = 5*bananaWeightOnGram
                + 2* milkWeightOn100Ml
                + 2*iceCreamWeight
                + 4*eggWeight;

        System.out.println("Вес всех продуктов равен " + (totalWeightOnGram / 1000.0) + " кг");

        // Задача 7
        System.out.println("Задача 7");

        int requiredWeightWeightOnGram = 7000;
        double minimumWeightLostInDay = 250;
        double maximumWeightLostInDay = 500;

        System.out.println("При минимальной нагрузке спортсмен похудеет за "
                + (requiredWeightWeightOnGram/minimumWeightLostInDay) + " дней");
        System.out.println("При максимальной нагрузке спортсмен похудеет за "
                + (requiredWeightWeightOnGram/maximumWeightLostInDay) + " дней ");

        // Задача 8
        System.out.println("Задача 8");

        int mashasalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        var percent = 1.1;
        var numberOfMonth = 12;
        double mashaNewSalary = mashasalary*percent;
        double denisNewSalary = denisSalary*percent;
        double kristinaNewSalary = kristinaSalary*percent;

        System.out.println("Маша теперь получает " + mashasalary* percent + " рублей в месяц");
        System.out.println("Денис теперь получает " + denisSalary* percent + " рублей в месяц");
        System.out.println("Кристина теперь получает " + kristinaSalary* percent + " рублей в месяц");
        int mashaOldAnnualSalary = mashasalary*numberOfMonth;
        int denisOldAnnualSalary = denisSalary*numberOfMonth;
        int kristinaOldAnnualSalary = kristinaSalary*numberOfMonth;

        System.out.println("Годовой доход Маши вырос на " +
                ((mashaNewSalary*numberOfMonth)-mashaOldAnnualSalary) + " рублей");
        System.out.println("Годовой доход Дениса вырос на " +
                ((denisNewSalary*numberOfMonth)-denisOldAnnualSalary) + " рублей");
        System.out.println("Годовой доход Кристины вырос на " +
                ((kristinaNewSalary*numberOfMonth)-kristinaOldAnnualSalary) + " рублей");











    }
}