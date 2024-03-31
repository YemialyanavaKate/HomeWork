package home_work_4.dto;

import home_work_4.api.IComparator;

public class StringLengthComparator {
    private IComparator comparator;
     public StringLengthComparator (IComparator somecomparator) {
         this.comparator = somecomparator;
     }

     /*public String sort () {
         return comparator.sorting();
     }*/
}
