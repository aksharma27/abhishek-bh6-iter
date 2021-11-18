package calc;

import java.util.Scanner;

class  Itr<str> {
    int sno;
    String name;
    int uid;

    public static String generateOTP()
    {
        int randomPin   =(int) (Math.random()*9000)+1000;
        String otp  = String.valueOf(randomPin);
        return otp;
    }

    public static void main(String... arg) {
        Itr Abhishek = new Itr();
        Itr Atuul = new Itr();
        Itr Satya = new Itr();
        Itr Ankit = new Itr();

        Abhishek.sno = 18;
        Atuul.sno = 18;
        Satya.sno = 17;
        Ankit.sno = 17;

        Abhishek.name = "Abhishek";
        Atuul.name = "Atul";
        Satya.name = "Satya";
        Ankit.name = "Ankit";

        Abhishek.uid = 9286;
        Satya.uid = 6072;
        Ankit.uid = 6074;
        Atuul.uid = 8029;


        System.out.println(" ");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t ITER BH-6");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("For Student login enter 'S'\t\t and for hostel room allocation enter 'H' ");
        Scanner in = new Scanner(System.in);
        char str = in.next().trim().charAt(0);
        if (str == 'S') {
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t LOGIN");

            System.out.println("");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t LOGIN");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t\t\t\t\t\t\tEnter your uId ");
            Scanner lo = new Scanner(System.in);
            int id = lo.nextInt();
            System.out.println("Enter Password");
            Scanner pas = new Scanner(System.in);
            String pass = pas.nextLine();
            String otpSting = generateOTP();//function calling
            System.out.println("Captcha : " + otpSting);
            System.out.println("Enter captcha ");
            Scanner cap = new Scanner(System.in);
            String captcha = cap.next().trim();
            if (captcha.equals(otpSting)) {
                if (id == 8029 && pass.equals("bh6")) {
                    System.out.println("\tStudent name : \t\t\t  Section:  \t\t\t UniqueId:");
                    System.out.println("\t---------------\t\t\t ----------\t\t\t\t----------");
                    System.out.println("");
                    System.out.println("1.  " + Atuul.name + "\t\t\t\t\t  " + Atuul.sno + "\t\t\t\t\t " + Atuul.uid);


                }

//                    System.out.println("Incorrect login credentials");
//                }
                if (id == 9286 && pass.equals("bh6")) {

                    System.out.println("\tStudent name : \t\t\t  Section:  \t\t\t UniqueId:");
                    System.out.println("\t---------------\t\t\t ----------\t\t\t\t----------");
                    System.out.println("");
                    System.out.println("1.  " + Abhishek.name + "\t\t\t\t\t  " + Abhishek.sno + "\t\t\t\t\t " + Abhishek.uid);
                }
//                else {
//                System.out.println("Incorrect login credentials");
//
                if (id == 6074 && pass.equals("bh6")) {

                    System.out.println("\tStudent name : \t\t\t  Section:  \t\t\t UniqueId:");
                    System.out.println("\t---------------\t\t\t ----------\t\t\t\t----------");
                    System.out.println("");
                    System.out.println("1.  " + Ankit.name + "\t\t\t\t\t  " + Ankit.sno + "\t\t\t\t\t " + Ankit.uid);
                }

                if (id == 6072 && pass.equals("bh6")) {
                    System.out.println("\tStudent name : \t\t\t  Section:  \t\t\t UniqueId:");
                    System.out.println("\t---------------\t\t\t ----------\t\t\t\t----------");
                    System.out.println("");
                    System.out.println("1.  " + Satya.name + "\t\t\t\t\t  " + Satya.sno + "\t\t\t\t\t " + Satya.uid);
                } else {
                    System.out.println("Incorrect login credentials, try again later");

                }
            }



            else{
                        System.out.println("Incorrect Captcha, try again later");
                    }

        }
            if (str == 'H') {
                System.out.println("Enter unique Id ");
                Scanner ui = new Scanner(System.in);
                int idd = ui.nextInt();
                if (idd == 9286) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t BH-6");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Name : Abhishek Kr Sharma \t\t Room No. : 106 \t\t Floor : 1st");

                }
                if (idd == 8029) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t BH-6");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Name : Atul Raj \t\t Room No. : 106 \t\t Floor : 1st");
                }
                if (idd == 6072) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t BH-6");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Name : Satyadev  \t\t Room No. : 106 \t\t Floor : 1st");
                }
                if (idd == 6074) {
                    System.out.println("\t\t\t\t\t\t\t\t\t\t BH-6");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Name : Ankit Panda  \t\t Room No. : 106 \t\t Floor : 1st");
                }
            }

    }}
