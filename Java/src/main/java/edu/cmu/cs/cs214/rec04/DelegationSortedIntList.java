package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private IntegerList myList = new SortedIntList();
    private int totalAddCnt = 0;

    public boolean add(int num) {
        boolean success = myList.add(num);
        totalAddCnt += 1;
        return success;
    }

    public boolean addAll(IntegerList list) {
        boolean success = myList.addAll(list);
        totalAddCnt += list.size();
        return success;
    }

    public int get(int index) {
        return myList.get(index);
    }

    public boolean remove(int num) {
        return myList.remove(num);
    }

    public boolean removeAll(IntegerList list) {
        return myList.removeAll(list);
    }

    public int size() {
        return myList.size();
    }

    public int getTotalAdded() {
        return totalAddCnt;
    }

}