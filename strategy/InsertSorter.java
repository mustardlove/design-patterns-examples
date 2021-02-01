package strategy;

public class InsertSorter implements Sorter {
    public void sort(Comparable[] data) {
        for (int i = 1; i < data.length; i++) {
            int pos = 0;
            for (int j = 0; j < i; j++) {
                if (data[j].compareTo(data[i]) <= 0) {
                    pos++;
                } else {
                    break;
                }
            }

            Comparable tmp = data[i];

            for (int j = i; j > pos; j--) {
                data[j] = data[j-1];
            }

            data[pos] = tmp;
        }
    }
}
