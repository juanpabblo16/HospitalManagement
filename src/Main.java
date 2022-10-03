import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String months[] = {

                "Jan",
                "Feb",
                "Mar",
                "Apr",

                "May",
                "Jun",
                "Jul",
                "Aug",

                "Sep",
                "Oct",
                "Nov",
                "Dec"

        };

        Calendar calendar = Calendar.getInstance();
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4, count3 = 4, count4 = 4, count5 = 4, count6 = 4;

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");

        System.out.print("Date: " + months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("\t\t\t\t\t\tTime: " + calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        doctor[] d = new doctor[25];

        patient[] p = new patient[100];

        int i;

        for (i = 0; i < 25; i++)

            d[i] = new doctor();

        for (i = 0; i < 100; i++)

            p[i] = new patient();

        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].specilist = "ENT";
        d[0].appoint = "5-11AM";
        d[0].doc_qual = "MBBS,MD";
        d[0].droom = 17;

        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].specilist = "Physician";
        d[1].appoint = "10-3AM";
        d[1].doc_qual = "MBBS,MD";
        d[1].droom = 45;

        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].specilist = "Surgeon";
        d[2].appoint = "8-2AM";
        d[2].doc_qual = "BDM";
        d[2].droom = 8;

        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].specilist = "Artho";
        d[3].appoint = "10-4PM";
        d[3].doc_qual = "MBBS,MS";
        d[3].droom = 40;


        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].disease = "Cancer";
        p[0].sex = "Male";
        p[0].admit_status = "y";
        p[0].age = 30;

        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].disease = "Cold";
        p[1].sex = "Male";
        p[1].admit_status = "y";
        p[1].age = 23;

        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].disease = "Maleriya";
        p[2].sex = "Male";
        p[2].admit_status = "y";
        p[2].age = 45;

        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].disease = "Diabetes";
        p[3].sex = "Male";
        p[3].admit_status = "y";
        p[3].age = 25;

        Scanner input = new Scanner(System.in);

        int choice, j, c1, status = 1, s1 = 1, s2 = 1;

        while (status == 1)

        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Admin. Doctors  2.Admin. Patients");
            System.out.println("-----------------------------------------------------------------------------------");

            choice = input.nextInt();
            switch (choice)

            {

                case 1:

                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                      **DOCTOR SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");

                    s1 = 1;

                    while (s1 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Doctors List");
                        c1 = input.nextInt();
                        switch (c1)

                        {
                            case 1:
                            {
                                d[count1].new_doctor();count1++;
                                break;
                            }
                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name\t Specilist \t Timing \t Qualification \t Room No.");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count1; j++)
                                {
                                    d[j].doctor_info();
                                }
                                break;
                            }
                        }
                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s1 = input.nextInt();
                    }
                    break;
                }

                case 2:

                {
                    System.out.println("--------------------------------------------------------------------------------");
                    System.out.println("                     **PATIENT SECTION**");
                    System.out.println("--------------------------------------------------------------------------------");

                    s2 = 1;

                    while (s2 == 1)
                    {
                        System.out.println("1.Add New Entry\n2.Existing Patients List");
                        c1 = input.nextInt();
                        switch (c1)
                        {
                            case 1:
                            {
                                p[count2].new_patient();count2++;
                                break;
                            }

                            case 2:
                            {
                                System.out.println("--------------------------------------------------------------------------------");
                                System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                System.out.println("--------------------------------------------------------------------------------");
                                for (j = 0; j < count2; j++) {
                                    p[j].patient_info();
                                }
                                break;
                            }
                        }

                        System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                        s2 = input.nextInt();
                    }
                    break;
                }

                default:
                {
                    System.out.println(" You Have Enter Wrong Choice!!!");
                }
            }

            System.out.println("\nReturn to MAIN MENU Press 1");

            status = input.nextInt();
        }

    }

}