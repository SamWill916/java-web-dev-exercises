package exercises.ControlFlowAndCollections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String [] args){
//        Integer nums[] = {7, 4, 9, 8, 4, 7, 8, 2, 4, 5, 2, 1, 4, 2, 5};
//        ArrayList<Integer> numList = Arrays.asList(nums);
//        Collections.adAll(numList)
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(4);
        numList.add(8);
        numList.add(9);
        numList.add(2);
        numList.add(4);
        numList.add(2);
        numList.add(8);
        numList.add(7);
        int answer = sumEven(numList);
        System.out.println(answer);
    }
    public static int sumEven(ArrayList<Integer> numList) {
        int total = 0;
        for(int num: numList) {
            if(num % 2 ==0) {
                total += num;
            }
        }
        return total;
    }
        }
