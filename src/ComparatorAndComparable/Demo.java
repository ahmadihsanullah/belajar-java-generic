package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    //jika ob1 lebih besar dari o2 maka dia akan beradi di belakang objek 2
                    return 1;
                } else{
                    //jika ob1 lebih kecil dari o2 maka dia akan beradi di depan objek 2
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<>();

        nums.add(31);
        nums.add(45);
        nums.add(72);
        nums.add(97);

        Collections.sort(nums,comparator);

        System.out.println(nums);
    }


}
