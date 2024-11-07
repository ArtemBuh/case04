import java.util.ArrayList;

public class jSorter {
    private ArrayList<Integer> data;

    jSorter() {
        data=new ArrayList<>();
    }

    public void add(int x) { data.add(x); }

    public void sort() {
        if (data.size()<2) return;
        boolean sorted=false;
        int i=0,tmp;
        while (true)
        {
            if (data.get(i)>data.get(i+1)) {
                tmp = data.get(i);
                data.set(i, data.get(i + 1));
                data.set(i + 1, tmp);
                sorted = false;
            }
            i++;
            if (i==data.size()-1) {
                if (sorted) break; else sorted=true;
                i=0;
            }
        }
    }

    public int getCount() { return data.size(); }

    public Integer get(int i) { return data.get(i); }
}
