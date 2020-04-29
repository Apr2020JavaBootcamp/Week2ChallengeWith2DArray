import java.util.Arrays;
import java.util.Random;

public class ChipotlePlus {
    public static void main(String[] args) {
        double cost = 3.00;
        double totalCost = 0;
        String[] item;
        String[] burritoNum = {"1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", "9th", "10th", "11th", "12th", "13th", "14th", "15th", "16th", "17th", "18th", "19th", "20th", "21st", "22nd", "23rd", "24th", "25th"};
        String[][] toppings = {
                {"white", "brown", "none", "all"}, // rice [0]
                {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "none", "all"}, //meat [1]
                {"pinto", "black", "none", "all"}, // beans [2]
                {"mild", "medium", "hot", "none", "all"}, // salsa [3]
                {"lettuce", "fajita veggies", "none", "all"}, // veggies [4]
                {"yes", "no"}, // cheese [5]
                {"yes", "no"}, //guacamole [6]
                {"yes", "no"}, //queso [7]
                {"yes", "no"}, //sour scream [8]
        };

        for (int i = 0; i < burritoNum.length; i++) {
            System.out.printf("Your %s burrito costs $%.2f, and has: ", burritoNum[i], cost+3.00);

            for (int j = 0; j < toppings.length; j++) {
                item = toppings[j];
                double index = (double) (Math.random() * item.length);
                double all = index * 0.5;
                double none = 0;
                if (toppings.equals("all")) {
                    cost = all;
                } else if (toppings.equals("none")) {
                    cost = none;
                } else {
                    cost = index + 3;
                }

                System.out.print(item[(int)index] + ", ");

            }

            System.out.println("\n");

        }

    }
}