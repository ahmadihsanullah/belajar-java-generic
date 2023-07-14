package programmer.zaman.now.application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> numberData = new NumberData<>(1000);
        //NumberData<String> stringNumberData = new NumberData<String>("ahmad"); //ERROR
    }

    public static class NumberData<T extends  Number>{
        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

}
