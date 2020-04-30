import java.util.Arrays;
import java.util.Random;

public class ChipotlePlus {
    public static void main(String[] args) {
        double cost = 3.00;
        //double totalCost = 0;
        String[] item;
        String[] burritoNum = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th"};
        String[][] toppings = {
                {"white rice", "brown rice", "no rice", "all rice"}, // rice [0]
                {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "no meat", "all meat"}, //meat [1]
                {"pinto beans", "black beans", "no beans", "all beans"}, // beans [2]
                {"mild salsa", "medium salsa", "hot salsa", "no salsa", "all salsa"}, // salsa [3]
                {"lettuce", "fajita veggies", "no veggies", "all"}, // veggies [4]
                {"cheese", "no cheese"}, // cheese [5]
                {"guac", "no guac"}, //guacamole [6]
                {"queso", "no queso"}, //queso [7]
                {"sour cream", "no sour cream"}, //sour scream [8]
        };

        for (int i = 0; i < burritoNum.length; i++) {
           System.out.printf("Your %s burrito contains: ", burritoNum[i]);

            for (int j = 0; j < toppings.length; j++) {
                item = toppings[j];
                int index = (int) (Math.random() * item.length);
               // double all = index * 0.5;
                double none = 0;

                if (item[index].contains("no")) {
                    cost += 0;
                } else {
                    cost += 0.5;
                }

               System.out.print((item[index]) + ", ");

            }
            System.out.printf("Cost: $%.2f",cost);
            System.out.println("\n");
            cost = 3;
        }
    }
}