package com.example.project;

public class ListTester {
        public static <T> void circularLeftShift(List <T> list, int n)
    {
        for(int i=0;i<n;i++){
        if(!list.last()){
        list.findFirst();
        T temp=null; 
        temp=list.retrieve();
        list.remove();
        list.insert(temp);
            }list.findFirst();
        }

            
        }
    
    public static <T> void reverseCopy(DLL<T> l1, DLL<T> l2)
    {
        while(!l1.last()){
            l1.findNext();
        }
        l1.findNext();
        while(!l1.last()){
            l2.findFirst();
            l2.update(l1.retrieve());
            l2.findNext();
            l1.findPrevious();
        }

    }
}
