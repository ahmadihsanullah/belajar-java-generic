package programmer.zaman.now.application;

import programmer.zaman.now.MyData;

public class TypeErasureApp {
    public static void main(String[] args) {
        MyData myData = new MyData("ahmad");
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
