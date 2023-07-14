package programmer.zaman.now.application;

import programmer.zaman.now.MyData;

public class CovariantApp {
    //melakukan subtitusi subtype (child) dengan supertype (parent)

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Ahmad");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> myData){
        System.out.println(myData.getData());
        //covariant hanya read only tidak bisa set atau mengubah data
        //karena berbahaya, bisa menyebabkan data tidak konsisten
        //yang disebabkan diterimaya type data apapun diparameter

//        System.out.println(myData.setData("ikhsan")); //ERROR

    }

}
