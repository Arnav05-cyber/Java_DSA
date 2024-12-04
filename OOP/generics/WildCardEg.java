package OOP.generics;


import java.util.Arrays;

public class WildCardEg<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCardEg(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(this.isfull()){
            resize();
        }

        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isfull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        System.out.println(data[index]);
        return (T)(data[index]);
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public static void main(String[] args) {
        WildCardEg<Integer> list = new WildCardEg<>();


        System.out.println(list);
    }

}
