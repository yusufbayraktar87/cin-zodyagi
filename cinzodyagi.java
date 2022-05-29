import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args){

        // Doğum yılına göre Çin zodyağı bulma

        int yil;
        String burc;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz : ");
        yil = inp.nextInt();

        switch (yil % 12){
            case 0:
                burc ="Maymun";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 1:
                burc ="Horoz";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 2:
                burc ="Köpek";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 3:
                burc ="Domuz";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 4:
                burc ="Fare";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 5:
                burc ="Öküz";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 6:
                burc ="Kaplan";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 7:
                burc ="Tavşan";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 8:
                burc ="Ejderha";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 9:
                burc ="Yılan";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 10:
                burc ="At";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
            case 11:
                burc ="Koyun";
                System.out.println("Cin Zodyagi Burcunuz : " + burc);
                break;
        }

    }
}
