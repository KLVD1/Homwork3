public class Main {
    static void main() {

        System.out.println ("\n\tЗадание#1\n");

        byte byteMeaning =0;
        short shortMeaning =129;
        int intMeaning =35000;
        long londMeaning =1000L;
        float floatMeaning = 45.7814597f;
        double doubleMeaning = 12.815171518146;
        System.out.println("Значение переменной a с типом byte "+ byteMeaning);
        System.out.println("Значение переменной b с типом short "+ shortMeaning);
        System.out.println("Значение переменной c с типом int "+ intMeaning);
        System.out.println("Значение переменной d с типом long "+ londMeaning);
        System.out.println("Значение переменной f с типом float "+ floatMeaning);
        System.out.println("Значение переменной e с типом double "+ doubleMeaning);

        System.out.println ("\n\tЗадание#2\n");

        byte byteValue =67;
        int negativeInt =-159;
        int intValue =569;
        long londValue =987_678_965_549L;
        double doubleOne = 2.786;
        double doubletValue = 27.12;
        int intOne =27897;
        System.out.println(byteValue);
        System.out.println(negativeInt);
        System.out.println(intValue);
        System.out.println(londValue);
        System.out.println(doubleOne);
        System.out.println(doubletValue);
        System.out.println(intOne);

        System.out.println ("\n\tЗадание#3\n");

        int lyudmilaPavlovna =23;
        int annaSergeevna =27;
        int ekaterinaAndreevna =30;
        int paperTreeClass =480;
        int allStudents =lyudmilaPavlovna+annaSergeevna+ekaterinaAndreevna;
        int sheetStudent=paperTreeClass/allStudents;
        System.out.println("На каждого ученика рассчитано  "+sheetStudent+"  листов бумаги");

        System.out.println ("\n\tЗадание#4\n");

        int productivityInTwoMinutes =16;
        int workingHours2Min =2;
        int productivityInOneMin =productivityInTwoMinutes/workingHours2Min;

        int workingHours20Min =20;
        int productivityIn20Minutes=productivityInOneMin * workingHours20Min;
        System.out.println("За 20 минут машина произвела "+productivityIn20Minutes+" штук бутылок");

        int workingHoursOneDay =60*24;
        int productivityInOneDay=productivityInOneMin * workingHoursOneDay;
        System.out.println("За 1 сутки машина произвела "+ productivityInOneDay +" штук бутылок");

        int workingHoursTreeDay =60*24*3;
        int productivityInTreeDay=productivityInOneMin * workingHoursTreeDay;
        System.out.println("За 3 суток машина произвела "+ productivityInTreeDay +" штук бутылок");

        int workingHours31Day =60*24*31;
        int productivityIn31Day=productivityInOneMin * workingHours31Day;
        System.out.println("За 1 месяц машина произвела "+ productivityIn31Day +" штук бутылок");

        System.out.println ("\n\tЗадание#5\n");

        int allColorBanks =120;
        int white =2;
        int brown =4;
        int classToSchool = allColorBanks / (white+brown);
        int purchasedWhite =classToSchool * white;
        int purchasedBrown =classToSchool * brown;
        System.out.println("В школе,где "+ classToSchool +" классов, "+"\nнужно "+purchasedWhite+" банок белой краски " +
                "и "+purchasedBrown+" банок коричневой краски");

        System.out.println ("\n\tЗадание#6\n");

        int banane= 5;
        int gramsOneBanane= 80;
        int milk=2;
        int grams100Milk=105;
        int icecream=2;
        int grams100Icecream=100;
        int eggs=4;
        int gramsOneEggs=70;
        int sportsbreakfastgrams= (banane*gramsOneBanane)+(milk*grams100Milk)+(icecream*grams100Icecream)+(eggs*gramsOneEggs);
        double kg=1000.0;
        double sportsbreakfastKg=sportsbreakfastgrams/kg;
        System.out.println("Вес спортзавтрака "+sportsbreakfastgrams+" в граммах "+"\nВес спортзавтрака "+ sportsbreakfastKg+" в киллограмах");

        System.out.println ("\n\tЗадание#7\n");

        int weightLossG =7000;
        int weight250G =250;
        int weight500G =500;
        int inTheDay250 = weightLossG/weight250G;
        int inTheDay500 = weightLossG/weight500G;
        int dayOnAverage =(inTheDay250+inTheDay500)/2;
        System.out.println("При потере 250 г в день потребуется: " + inTheDay250 + " дней");
        System.out.println("При потере 500 г в день потребуется: " + inTheDay500 + " дней");
        System.out.println("В среднем потребуется: " + dayOnAverage + " дней");

        System.out.println ("\n\tЗадание#8\n");

        int year = 12;
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        double increasePercent =0.1; // 10% от зарплаты
        double newSalaryMasha = salaryMasha * (increasePercent+1);
        double newIncomeMasha = (salaryMasha*year) * increasePercent;
        double newSalaryDenis = salaryDenis * (increasePercent+1);
        double newIncomeDenis = (salaryDenis*year) * increasePercent;
        double newSalaryChristina = salaryChristina * (increasePercent+1);
        double newIncomeChistina = (salaryChristina*year) * increasePercent;
        System.out.println("Маша теперь получает " + newSalaryMasha+" рублей." + "\nГодовой доход вырос на " + newIncomeMasha +  "рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis+" рублей." + "\nГодовой доход вырос на " + newIncomeDenis +  "рублей.");
        System.out.println("Кристина теперь получает " + newSalaryChristina+" рублей." + "\nГодовой доход вырос на " + newIncomeChistina +  "рублей.");
    }}