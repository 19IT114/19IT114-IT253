package SGP_HybridCalc;

import java.awt.font.TextHitInfo;
import java.util.Scanner;


public class HybridCalc {

    public static void main(String[] args) {
        int repeatchoice = 1;
        HybridCalc hc = new HybridCalc();
        Scanner sc = new Scanner(System.in);
        System.out.println("********************************************");
        System.out.println("***** WELCOME TO THE HYBRID CALCULATOR *****");
        while (repeatchoice == 1)
        {
        System.out.println("********************************************");
        System.out.println("1.  Resistance Calculator.");
        System.out.println("2.  Day Calculator.");
        System.out.println("3.  Angle Calculator.");
        System.out.println("4.  Pressure Calculator.");
        System.out.println("5.  Data Calculator.");
        System.out.println("6.  Speed Calculator.");
        System.out.println("7.  Time Calculator.");
        System.out.println("8.  Power Calculator.");
        System.out.println("9.  Area Calculator.");
        System.out.println("10. Energy Calculator.");
        System.out.println("********************************************");
        System.out.print("Your choice : ");
        int choice = sc.nextInt();
        System.out.println("********************************************");
        System.out.println("");

            switch (choice) {
                case 1: {
                    Ressistance r = new Ressistance();
                    r.Resistor();
                    break;
                }
                case 2: {
                    DayCalculator dc = new DayCalculator();
                    dc.DayCalc();
                    break;
                }
                case 3: {
                    angle a = new angle();
                    a.Angle();
                    break;
                }
                case 4: {
                    Pressure p = new Pressure();
                    p.Pressure();
                    break;
                }
                case 5: {
                    Data d = new Data();
                    d.Data();
                    break;
                }
                case 6: {
                    Speed s = new Speed();
                    s.Speed();
                    break;
                }
                case 7:
                {
                    Time t = new Time();
                    t.Time();
                    break;
                }
                case 8:
                {
                    Power p = new Power();
                    p.Power();
                    break;
                }
                case 9:
                {
                    Area a = new Area();
                    a.Area();
                    break;
                }
                case 10:
                {
                    Energy e = new Energy();
                    e.Energy();
                    break;
                }
                default: {
                    System.out.println("Please enter a valid choice..!!.");
                    break;
                }
            }
            System.out.println();
            System.out.println("********************************************");
            System.out.print("To use the Hybrid Calculator Again press 1 or press 0 to exit : ");
            repeatchoice = sc.nextInt();
        }
    }
}

