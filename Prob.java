package calc;
class  Iter{
    int sno;
    String name;
    int uid;
}
public class Prob {
    public static void main(String[] args) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ITER-BH6");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Iter Abhishek = new Iter();
        Iter Atul = new Iter();
        Iter Satya = new Iter();
        Iter Ankit = new Iter();

        Abhishek.sno = 18;
        Atul.sno = 18;
        Satya.sno = 17;
        Ankit.sno = 17;

        Abhishek.name = "Abhishek";
        Atul.name = "Atul";
        Satya.name = "Satya";
        Ankit.name = "Ankit";

        Abhishek.uid = 286;
        Satya.uid= 230;
        Ankit.uid= 340;
        Atul.uid= 829;

        System.out.println("\tStudent name : \t\t\t  Section:  \t\t\t UniqueId:");
        System.out.println("\t---------------\t\t\t ----------\t\t\t\t----------");
        System.out.println("");
        System.out.println("1.  " + Abhishek.name + "\t\t\t\t  " + Abhishek.sno + "\t\t\t\t\t" + Abhishek.uid);
        System.out.println("1.  " + Atul.name + "\t\t\t\t\t  " + Atul.sno + "\t\t\t\t\t " + Atul.uid);
        System.out.println("1.  " + Ankit.name + "\t\t\t\t\t  " + Ankit.sno + "\t\t\t\t\t" + Ankit.uid);
        System.out.println("1.  " + Satya.name + "\t\t\t\t\t  " + Satya.sno + "\t\t\t\t\t" + Satya.uid);


    }
}
