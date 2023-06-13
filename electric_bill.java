import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.*;

public class electric_bill {

    public static void main(String[] args) throws IOException {
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter units:");
        int units = Sc.nextInt();
        double amount = 0;
        if (units <= 100) {
            amount = units * 1.5;
        } else if (units >= 200 && units <= 299) {
            amount = 100 * 1.5 + (units - 200) * 2.0;
        } else if (units >= 300 && units <= 399) {
            amount = 100 * 1.5 + (units - 200) * 2.0 + (units - 300) * 2.5;
        } else if (units >= 400 && units <= 499) {
            amount = 100 * 1.5 + (units - 200) * 2.0 + (units - 300) * 2.5 + (units - 400) * 3.0;
        } else if (units >= 500 && units <= 599) {
            amount = 100 * 1.5 + (units - 200) * 2.0 + (units - 300) * 2.5 + (units - 400) * 3.0 + (units - 500) * 3.5;
        }
        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.print("Date: ");
        System.out.println(dt.format(now));
        System.out.println("The Units you have Consumed are:  " + units);
        System.out.println("The Amount You need to pay is:  " + amount);

    }
}
