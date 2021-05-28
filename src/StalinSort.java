

public class StalinSort {

    public StalinSort() {

    }

    public sortList(List<Integer> toSort) {

    }
    public sortArrayList(ArrayList<Integer> toSort) {

    }
    public int[] sortArray(int[] toSort) {
        for (int i = 1; i < toSort.length; i++) {
            if (toSort[i-1] > toSort[i]) {
                toSort[i] = null;
            }
        }
        return toSort;
    }
}