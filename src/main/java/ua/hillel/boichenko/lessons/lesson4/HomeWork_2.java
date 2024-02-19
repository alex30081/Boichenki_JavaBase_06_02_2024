package ua.hillel.boichenko.lessons.lesson4;public class HomeWork_2
{

    public static void main(String[] args)
    {
        int Li_Warrior = 13;
        int Li_Archer = 24;
        int Li_Horsemen = 46;
        int Li_General_Troops = 860;
        int a = Li_Warrior;
        int b = Li_Archer;
        int c = Li_Horsemen;
        int q = Li_General_Troops;
        int Li_Sum_Strenght_Warrior = a * q;
        int Li_Sum_Strenght_Archer = b * q;
        int Li_Sum_Strenght_Horsemen = c * q;
        int d = Li_Sum_Strenght_Warrior;
        int e = Li_Sum_Strenght_Archer;
        int f = Li_Sum_Strenght_Horsemen;
        int Li_Totap_Power = d + e +f;
        int $ = Li_Totap_Power;

        int Min_Warrior = 9;
        int Min_Archer = 35;
        int Min_Horsemen = 12;
        int a1 = Min_Warrior;
        int b1 = Min_Archer;
        int c1 = Min_Horsemen;
        double Min_General_Troops = (q * 1.5);
        double p = Min_General_Troops;
        double Min_Sum_Strenght_Warrior = a1 * p;
        double Min_Sum_Strenght_Archer = b1 * p;
        double Min_Sum_Strenght_Horsemen = c1 *p;
        double d1 = Min_Sum_Strenght_Warrior;
        double e1 = Min_Sum_Strenght_Archer;
        double f1 = Min_Sum_Strenght_Horsemen;
        double Min_Totap_Power = (d1 + e1 + f1);
        double k = Min_Totap_Power;

        String str = ("Li_Totap_Power" + $);
        String str1 = ("Min_Totap_Power" + k);
        System.out.println(str + "\n" +  str1);



    }
}
