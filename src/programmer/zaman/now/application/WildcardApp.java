package programmer.zaman.now.application;

import programmer.zaman.now.MyData;

public class WildcardApp {
    public static void main(String[] args) {
        print(new MyData<Integer>(100));
        print(new MyData<String>("ahmad"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> data) {
        System.out.println(data.getData());
    }
}
