public class Main {
    public static void main(String[] args) {
        //Задача 1
byte a = 124;
short b = 3333;
int c = 25000;
long d = 1000000L;
float e = 1.006f;
double f = 23.12345678;
char g = 35;
boolean h = b > 5;

// Задача 2
        float weightFirstFighter = 78.2f;
        float weightSecondFighter = 82.7f;
        System.out.println("Общий вес двух бойцов равен " + (weightFirstFighter + weightSecondFighter) + " кг.");
        System.out.println("Разница между весом двух бойцов равна " + (weightSecondFighter - weightFirstFighter) + " кг.");

        //Задача 3
        int banana = 80;
        int milk = 105;
        int icecream = 100;
        int egg = 70;
        int cocktail = banana * 5 + milk * 2 + icecream * 2 + egg * 4;
        int grPerKg = 1000;
        float weighKg = cocktail / (float)grPerKg;
                System.out.println("Общий вес спорт-завтрака составляет " + weighKg + " кг.");

        // Задача 4
        int gramm = 1000;
        int weight = 7 * gramm;
        int min = 250;
        int max = 500;
        int weightMin = weight / min;
        double remaindermin = weight % min;
        int weightMax = weight / max;
        double remainderMax = weight % max;
        System.out.println("Если спортсмен будет терять по 250 грамм ежедневно, то уйдет " + (weight / min) + " дней на похудение.");
        System.out.println("Если спортсмен будет терять по 500 грамм ежедневно, то уйдет " + (weight / max) + " дней на похудение.");
        System.out.println("В среднем уйдет " + ((weightMin + weightMax) / 2) + " день на похудение.");
        System.out.println("Операция остатка: " + remainderMax + " " + remaindermin);


        // Задача 5
            int Masha = 67_760;
            int MashaNow = Masha + (Masha * 10 / 100);
            int MashaYear = Masha * 12;
            int MashaNowYear = MashaNow * 12;
            System.out.println("Теперь зарплата Маши составляет " + MashaNow + " рублей. Годовой доход вырос на " + (MashaNowYear - MashaYear) + " рублей.");

            int Denis = 83_890;
            int DenisNow = Denis + (Denis * 10 / 100);
            int DenisYear = Denis * 12;
            int DenisYearNow = DenisNow * 12;
            System.out.println("Теперь зарплата Дениса составляет " + DenisNow + " рубля. Годовой доход вырос на " + (DenisYearNow - DenisYear) + " рублей.");

            int Christina = 76_230;
            int ChristinaNow = Christina + (Christina * 10 / 100);
            int ChristinaYear = Christina * 12;
            int ChristinaYearNow = ChristinaNow * 12;
            System.out.println("Теперь зарплата Кристины составляет " + ChristinaNow + " рублей. Годовой доход вырос на " + (ChristinaYearNow - ChristinaYear) + " рублей.");

            // Задача 5 (другой вариант решения)
        int percent = 10;
        double multiplayer = percent / (100 * 1.0);
        int MashaSalary = 67_760;
        int DenisSalary = 83_890;
        int ChristinaSalary = 76_230;

        int MashaNewSalary = (int) (MashaSalary + (MashaSalary * multiplayer));
        int DenisNewSalary = (int) (DenisSalary + (DenisSalary * multiplayer));
        int ChristinaNewSalary = (int) (ChristinaSalary + (ChristinaSalary * multiplayer));

        int MashaDifference = (MashaNewSalary - MashaSalary) * 12;
        int DenisDifference = (DenisNewSalary - DenisSalary) * 12;
        int ChristinaDifference = (ChristinaNewSalary - ChristinaSalary) * 12;

        System.out.println("Теперь зарплата Маши составляет " + MashaNewSalary + " рублей. Годовой доход вырос на " + MashaDifference + " рублей.");
        System.out.println("Теперь зарплата Дениса составляет " + DenisNewSalary + " рублей. Годовой доход вырос на " + DenisDifference + " рублей.");
        System.out.println("Теперь зарплата Кристины составляет " + ChristinaNewSalary + " рублей. Годовой доход вырос на " + ChristinaDifference + " рублей.");
    }

}