import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Advent_Exercise1 {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            ArrayList<Integer> depths = new ArrayList();
            ArrayList<Integer> windows = new ArrayList();
            String num;
            int triplet = 0;
            int dIncrease = 0;
            int previous = 0;

            while ((num = br.readLine()) != null) {
                depths.add(Integer.parseInt(num));
            }
            /*
            previous = depths.get(0);
            for(int n:depths) {
                if(n > previous) {
                    dIncrease++;
                }
                previous = n;
            };
             */
            for(int i = 0; i < depths.size(); i++) {
                triplet = depths.get(i);
                if(i <= (depths.size() - 3)) {
                    triplet = triplet + depths.get(i + 1) + depths.get(i + 2);
                } else break;
                windows.add(triplet);
            }
            previous = windows.get(0);
            for(int n:windows) {
                if(n > previous) {
                    dIncrease++;
                }
                previous = n;
            }
        System.out.println("Number of depth increases: " + dIncrease);

        } catch(Exception e) {
            System.out.println(e);
            return;
        }
    }
}
