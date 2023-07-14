package programmer.zaman.now.application;

import programmer.zaman.now.Pair;

public class PairApp {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Ahmad", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
