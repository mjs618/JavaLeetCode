package datastructure.sort;

import java.util.Arrays;

public class Sort implements SortInterface {
    private int[] record;
    private int length;

    public Sort(int[] record, int length) {
        this.record = record;
        this.length = length;
    }

    @Override
    public void insertSort() {
        int temp,possition;
        for (int i = 1; i < length; i++) {
            temp = record[i];
            for (possition = i;possition > 0 && temp < record[possition - 1];possition --){
                record[possition] = record[possition - 1];
            }
            record[possition] = temp;
        }
    }

    @Override
    public void shellSort() {
        int position,temp;
        for (int d = length/2;d>=1;d=d/2){
            for (int i = d; i < length ; i++) {
                temp = record[i];
                for (position = i;position - d >=0 && temp < record[position - d];position = position-d){
                    record[position] = record[position -d ];
                }
                record[position] = temp;
            }
        }
    }

    @Override
    public void bubbleSort() {

    }

    @Override
    public void quickSort(int first, int end) {

    }

    @Override
    public void selectSort() {

    }

    @Override
    public void heapSort() {

    }

    @Override
    public void mergeSort(int first, int last) {

    }

    @Override
    public void mergeSort1() {

    }

    @Override
    public void print() {
        Arrays.stream(record).mapToObj(j -> j + " ").forEach(System.out::println);

    }
}
