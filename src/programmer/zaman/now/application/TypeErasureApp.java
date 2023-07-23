package programmer.zaman.now.application;

import programmer.zaman.now.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        //type erasure => menghilangkan info genericnya
//        mydata yg tidak ada genericnya
        MyData myData = new MyData("ahmad");
        // lalu paksa menjadi integer
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        //ketika running, error
        Integer integer =  integerMyData.getData();
    }
}
