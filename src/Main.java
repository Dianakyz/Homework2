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
        System.out.println("Общий вес спорт-завтрака составляет " + cocktail + " грамм.");

        // Задача 4
        int weight = 7000;
        int min = 250;
        int max = 500;
        System.out.println("Если спортсмен будет терять по 250 грамм ежедневно, то уйдет " + (weight / min) + " дней на похудение.");
        System.out.println("Если спортсмен будет терять по 500 грамм ежедневно, то уйдет " + (weight / max) + " дней на похудение.");

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

            int Christina = 76230;
            int ChristinaNow = Christina + (Christina * 10 / 100);
            int ChristinaYear = Christina * 12;
            int ChristinaYearNow = ChristinaNow * 12;
            System.out.println("Теперь зарплата Кристины составляет " + ChristinaNow + " рублей. Годовой доход вырос на " + (ChristinaYearNow - ChristinaYear) + " рублей.");
    }
}