import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("컴퓨터가 숫자를 생성하였습니다. 답을 맞춰보세요!");
        String gameNumber = "";

        Set<Integer> set = new HashSet<>();

        while (true) {
            int number = (int) (Math.random() * 10);
            set.add(number);
            if (set.size() == 3) {
                for (int item : set) {
                    String numberStr = Integer.toString(item);
                    gameNumber += numberStr;
                }
                break;
            }
        }
    }
}