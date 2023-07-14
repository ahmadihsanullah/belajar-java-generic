package programmer.zaman.now.application;

import programmer.zaman.now.MyData;

public class ContravariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Ahmad");
        objectMyData.setData(1000);
        MyData<? super String> stringMyData = objectMyData;

        System.out.println(stringMyData.getData());

        process(objectMyData);
        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData){
        Object value = myData.getData();
        myData.setData("ihsan");
        System.out.println(value);
    }

}
