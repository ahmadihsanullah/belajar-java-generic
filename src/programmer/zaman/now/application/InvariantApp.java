package programmer.zaman.now.application;

import programmer.zaman.now.MyData;

public class InvariantApp {
    public static void main(String[] args) {
        //generic memiliki default sifat Invariant
        // artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
        // Dari child ke parent !bisa
        MyData<String> stringMyData = new MyData<>("Ahmad");
//      MyData<Object> objectMydata = stringMyData; // ERROR
//      doItObject(stringMyData); //ERROR

        //Dari parent ke child !bisa
        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData;


    }

    public static void doItObject(MyData<Object> objectMyData){
        //do nothing
    }

}
