import java.util.*;

public class calorie_counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxCalories = 0;
        int currentCalories = 0;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals("")) {
                maxCalories = Math.max(maxCalories, currentCalories);
                currentCalories = 0;
            } else {
                currentCalories += Integer.parseInt(line);
            }
        }
        maxCalories = Math.max(maxCalories, currentCalories);
        System.out.println("Elf carrying the most calories: " + maxCalories);
    }
}
