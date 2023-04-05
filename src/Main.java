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


    int chance = 1 ;

        while(true){

                int strike = 0;
                int ball = 0;

                System.out.print(chance+ "번째 시도 : ");

                String answer = scanner.nextLine();

                for(int i=0;i<3;i++){
        if(gameNumber.charAt(i)==answer.charAt(i)){
        strike+=1;
        }else{
        if(answer.indexOf(gameNumber.charAt(i))!=-1){
        ball+=1;
        }
        }
        }

        if(strike==3){
        System.out.println(chance+ "번만에 맞히셨습니다.");
        System.out.println("게임을 종료합니다.");
        break;
        }else{
        System.out.println(+ball+"B"+strike+"S");
        }

        chance+=1;
        }
        }
        }