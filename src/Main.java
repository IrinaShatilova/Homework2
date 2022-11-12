public class Main {
    public static void main(String[] args) {
        System.out.println("Homework2");

        double dog = 8;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println("friend = " + friend);

        friend = friend + 2;
        System.out.println("friend = " + friend);

        friend = friend / 7;
        System.out.println("friend = " + friend);

        var frog = 3.5;
        System.out.println("frog = " + frog);

        frog = frog * 10;
        System.out.println("frog = " + frog);

        frog = frog / 3.5;
        System.out.println("frog = " + frog);

        frog = frog + 4;
        System.out.println("frog = " + frog);

        var SportsmanWeight1 = 78.2;
        var SportsmanWeight2 = 82.7;
        var SummaWeight = SportsmanWeight1 + SportsmanWeight2;
        System.out.println("Общий вес спортсменов " + SummaWeight + " кг");
        var DifferenceWeight = SportsmanWeight2 - SportsmanWeight1;
        System.out.println("Разница веса спортсменов " + DifferenceWeight + " кг");

        var DifferenceWeightSubtraction = SportsmanWeight2 - SportsmanWeight1;
        System.out.println("Разница веса спортсменов (с помощью вычитания) " + DifferenceWeightSubtraction + " кг");
        var DifferenceWeightDivision = SportsmanWeight2 % SportsmanWeight1;
        System.out.println("Разница веса спортсменов (с помощью остатка от деления) " + DifferenceWeightDivision + " кг");

        var TotalHours = 640;
        var HoursDay = 8;

        var TotalEmployees = TotalHours / HoursDay;
        System.out.println("Всего работников в компании – " + TotalEmployees + " человек");

        var TotalEmployees1 = TotalEmployees + 94;
        var TotalHours1 = TotalEmployees1 * HoursDay;
        System.out.println("Если в компании работает " + TotalEmployees1 + " человека, то всего " + TotalHours1 + " часа работы может быть поделено между сотрудниками");
    }
}