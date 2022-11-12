public class Main {
    public static void main(String[] args) {
        System.out.println("Homework2");

        //Задача 1
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        //Задача 2
        System.out.println("Задача 2");
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        //Задача 3
        System.out.println("Задача 3");
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        //Задача 4
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println("friend = " + friend);
        friend = friend + 2;
        System.out.println("friend = " + friend);
        friend = friend / 7;
        System.out.println("friend = " + friend);

        //Задача 5
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog = frog * 10;
        System.out.println("frog = " + frog);
        frog = frog / 3.5;
        System.out.println("frog = " + frog);
        frog = frog + 4;
        System.out.println("frog = " + frog);

        //Задача 6
        System.out.println("Задача 6");
        var sportsmanWeight1 = 78.2;
        var sportsmanWeight2 = 82.7;
        var summaWeight = sportsmanWeight1 + sportsmanWeight2;
        System.out.println("Общий вес двух спортсменов " + summaWeight + " кг");
        var differenceWeight = sportsmanWeight2 - sportsmanWeight1;
        System.out.println("Разница весов двух спортсменов " + differenceWeight + " кг");

        //Задача 7
        System.out.println("Задача 7");
        var differenceWeightSubtraction = sportsmanWeight2 - sportsmanWeight1;
        System.out.println("Разница веса спортсменов (с помощью вычитания) " + differenceWeightSubtraction + " кг");
        var differenceWeightDivision = sportsmanWeight2 % sportsmanWeight1;
        System.out.println("Разница веса спортсменов (с помощью остатка от деления) " + differenceWeightDivision + " кг");

        //Задача 8
        System.out.println("Задача 8");
        var totalHours = 640;
        var hoursDay = 8;
        var totalEmployees = totalHours / hoursDay;
        System.out.println("Всего работников в компании – " + totalEmployees + " человек");
        var totalEmployees1 = totalEmployees + 94;
        var totalHours1 = totalEmployees1 * hoursDay;
        System.out.println("Если в компании работает " + totalEmployees1 + " человека, то всего " + totalHours1 + " часа работы может быть поделено между сотрудниками");
    }
}