import java.util.*;

public class calorie_counting2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> elfCalories = new TreeMap<>(Collections.reverseOrder());
        int currentCalories = 0;
        int currentElf = 1;
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.equals("")) {
                elfCalories.put(currentCalories, currentElf);
                currentCalories = 0;
                currentElf++;
            } else {
                currentCalories += Integer.parseInt(line);
            }
        }
        elfCalories.put(currentCalories, currentElf);
        int totalCalories = 0;
        int elvesCount = 0;
        for (Map.Entry<Integer, Integer> entry : elfCalories.entrySet()) {
            if (elvesCount == 3) {
                break;
            }
            totalCalories += entry.getKey();
            elvesCount++;
        }
        System.out.println("Total calories carried by top three Elves: " + totalCalories);
    }
}
