import java.util.Calendar;

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

        //doctor[] d = new doctor[25];

        //patient[] p = new patient[100];

    }

}