import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Advent_Exercise1 {
    public static void main(String[] args){
        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            ArrayList<Integer> depths = new ArrayList();
            String num;
            int dIncrease = 0;
            int previous = 0;

            while ((num = br.readLine()) != null) {
                depths.add(Integer.parseInt(num));
            }

            previous = depths.get(0);
            for(int n:depths) {
                if(n > previous) {
                    dIncrease++;
                }
                previous = n;
            };
        System.out.println("Number of depth increases: " + dIncrease);

        } catch(Exception e) {
            System.out.println(e);
            return;
        }
    }
}
