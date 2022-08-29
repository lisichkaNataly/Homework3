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








    }
}