//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //tusk 1
        byte num = 30;
        short thousand = 1000;
        int bill = 1000000;
        long minus = -100000000L;
        float p = 3.14f;
        double pp = 3.14159265;
        //int sum = num + thousand +  bill;
        //System.out.println(sum);

        //tusk 2
        float notP = 27.12f;
        long trill = 987678965549L;
        float f = 2.786f;
        short s = 569;
        short minusShort = -159;
        short s2 = 27897;
        byte b = 67;

        //tusk 3
        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        // тут вопрос не смог поставить тип данных short allSudents
        // почемуто заставил поставить int. вопрос - почему??
        int allStudents = lydmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        short paper = 480;
        float paperPerStudent = (float) paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги.");

        //tusk 4
        byte bottlePerMinute = 8;
        byte m20 = 20;
        short minutesInDay = 1440;
        //int minutesIn3Days = minutesInDay * 3;
        //int minutesInMonth = minutesInDay * 30;

        int production20Minutes = m20 * bottlePerMinute;
        int productionPer1Day = minutesInDay * bottlePerMinute;
        int productionPer3Day = productionPer1Day * 3;
        int productionPerMonth = productionPer1Day * 30;
        System.out.println("За " + m20 + " минут машина произвела " + production20Minutes + " штук бутылок");
        System.out.println("За 1 день машина произвела " + productionPer1Day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productionPer3Day + " штук бутылок");
        System.out.println("За Месяц машина произвела " + productionPerMonth + " штук бутылок");

        //tusk 5
        byte cansOfPaints = 120;
        byte whitePaintNeedPerClass = 2;
        byte braunPaintNeedPerClass = 4;
        int numberOfClasses = cansOfPaints / (whitePaintNeedPerClass + braunPaintNeedPerClass);
        int whitePaintNeed = numberOfClasses * whitePaintNeedPerClass;
        int braunPaintNeed = numberOfClasses * braunPaintNeedPerClass;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintNeed + " банок белой краски и " + braunPaintNeed + " банок коричневой краски.");

        //tusk 6
        byte banana =5;
        byte bananaWeight = 80;
        byte milkPortion100Ml = 105;
        byte numMilkPortion = 2;
        byte iceCreamBriquette = 100;
        byte numIceCreamBriquette = 2;
        byte eggs = 4;
        byte eggsWeight = 70;
        int sportCocktail =banana * bananaWeight + milkPortion100Ml * numMilkPortion + iceCreamBriquette * numIceCreamBriquette + eggs * eggsWeight;
        float sportCocktailInKg = (float) sportCocktail/ 1000;
        System.out.println("Вес завтрака составил " + sportCocktail + " в граммах и " + sportCocktailInKg + " в килограммах.");

        //tusk 7
        short loseWeightNeed = 7000;
        short weightLosePerDay250 = 250;
        short weightLosePerDay500 = 500;
        int needDayToWin250 = loseWeightNeed / weightLosePerDay250;
        int needDayToWin500 = loseWeightNeed / weightLosePerDay500;
        int needDayToWinAverageValue = (needDayToWin250 + needDayToWin500) / 2;
        System.out.println("При потери веса в " + weightLosePerDay250 + " гр в день потребуется " + needDayToWin250 + " дней.");
        System.out.println("При потери веса в " + weightLosePerDay500 + " гр в день потребуется " + needDayToWin500 + " дней.");
        System.out.println("При потери веса в средних значениях потребуется " + needDayToWinAverageValue + " дней.");

        //tusk 8
        //Маша получает 67 760 рублей в месяц.
        // Денис получает 83 690 рублей в месяц.
        //Кристина получает 76 230 рублей в месяц.
        int currentSalaryMaria = 67760;
        int currentSalaryDen = 83690;
        int currentSalaryKris = 76230;
        int increasedSalaryMaria = currentSalaryMaria / 100 * 110;
        int increasedSalaryDen = currentSalaryDen / 10 * 11;
        int increasedSalaryKris = currentSalaryKris * 110 / 100;
        int incomeDifferencePerYearMaria = (increasedSalaryMaria * 12) - (currentSalaryMaria * 12);
        int incomeDifferencePerYearDen = (increasedSalaryDen * 12) - (currentSalaryDen * 12);
        int incomeDifferencePerYearKris = (increasedSalaryKris * 12) - (currentSalaryKris * 12);
        System.out.println("Маша теперь получает " + increasedSalaryMaria + " рублей. Годовой доход вырос на " + incomeDifferencePerYearMaria + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDen + " рублей. Годовой доход вырос на " + incomeDifferencePerYearDen + " рублей");
        System.out.println("Кристига теперь получает " + increasedSalaryKris + " рублей. Годовой доход вырос на " + incomeDifferencePerYearKris + " рублей");




    }
}