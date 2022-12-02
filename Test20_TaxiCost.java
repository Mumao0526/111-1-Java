import java.util.Scanner;

public class Test20_TaxiCost {
    public static void main(String[] args) {
        System.out.print("How many kilometers did you ride?\n");
        Scanner keyIn = new Scanner(System.in);

        // initialization
        float total_km = keyIn.nextFloat();
        float free_km = 7;
        float unit_km = 1;
        float cost_base = 85;
        float cost_unit_km = 5;
        float cost_sum;

        if(total_km == 0){         // it is end code
            System.out.println("Ending");
            return;
        } else if (total_km < 0) {     // to foolproof
            System.out.println("???\n");
        } else if(total_km <= free_km){       // base cost
            cost_sum = cost_base;
            System.out.println("It cost:"+cost_sum+"\n");
        }else {     // the cost by you ride more
            float other_mil = total_km - free_km;
            cost_sum = cost_base + (other_mil / unit_km * cost_unit_km);
            System.out.println("It cost:"+cost_sum+"\n");
        }

        // run again
        String[] a = {};
        main(a);
    }
}
