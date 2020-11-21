package datastructure.sort;

public class SortTester {
    public static void main(String[] args) {
        int[] record = {2,5,1,7,9,4,3,6,5,8};
        SortInterface sort = new Sort(record,record.length);
        sort.shellSort();
        sort.print();

    }

}
