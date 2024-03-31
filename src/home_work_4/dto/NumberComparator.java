package home_work_4.dto;

import home_work_4.api.IComparator;

public class NumberComparator implements IComparator {
    private IComparator comparator;
    private Integer[] data;
     /*public NumberComparator(IComparator somecomparator) {
         this.comparator = somecomparator;
     }*/

     public void sort () {
         for (int i = 0; i < data.length - 1; i++) {
             for (int j = (data.length - 1); j > i; j--) {
                 if (data[j - 1] > data[j]) {
                     int temp = data[j - 1];
                     data[j - 1] = data[j];
                     data[j] = temp;
                 }
             }
         }
     }


}
