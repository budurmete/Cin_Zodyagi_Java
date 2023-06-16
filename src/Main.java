import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner imp = new Scanner(System.in);
    int dogumYilli,modAlinmasi;
    boolean issError=false;
    System.out.print("Lütfen Doğum YILINIZI giriniz: ");
    dogumYilli=imp.nextInt();
    modAlinmasi=dogumYilli%12;

    if (modAlinmasi==0)
    {
        System.out.print(modAlinmasi+" ➜ Maymun");
    }

    else if (modAlinmasi==1)
    {
        System.out.print(modAlinmasi+" ➜ Horoz");
    }

    else if (modAlinmasi==2)
    {
        System.out.print(modAlinmasi+" ➜ Köpek");
    }
    else if (modAlinmasi==3)
    {
        System.out.print(modAlinmasi+" ➜ Domuz");
    }

    else if (modAlinmasi==4)
    {
        System.out.print(modAlinmasi+" ➜ Fare");
    }

    else if (modAlinmasi==5)
    {
        System.out.print(modAlinmasi+" ➜ Öküz");
    }

    else if (modAlinmasi==6)
    {
        System.out.print(modAlinmasi+" ➜ Kaplan");
    }

    else if (modAlinmasi==7)
    {
        System.out.print(modAlinmasi+" ➜ Tavşan");
    }

    else if (modAlinmasi==8)
    {
        System.out.print(modAlinmasi+" ➜ Ejderha");
    }

    else if (modAlinmasi==9)
    {
        System.out.print(modAlinmasi+" ➜ Yılan");
    }

    else if (modAlinmasi==10)
    {
        System.out.print(modAlinmasi+" ➜ At");
    }

    else if (modAlinmasi==11)
    {
        System.out.print(modAlinmasi+" ➜ Koyun");
    }
    issError=true;

    //if(issError) System.out.print("Lütfen Terkar Deneyiniz");





    }
}