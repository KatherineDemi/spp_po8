package Task1;

import java.util.ArrayList;

public class IntegerSet {
    private ArrayList<Integer> setOfIntegers;

    public IntegerSet() {
        this.setOfIntegers = new ArrayList<>();
    }

    public IntegerSet(ArrayList<Integer> setOfIntegers) {
        this.setOfIntegers = new ArrayList<>();
        for (Integer el : setOfIntegers) {
            if (!this.setOfIntegers.contains(el)) {
                this.setOfIntegers.add(el);
            }
        }
    }

    public ArrayList<Integer> intersections(IntegerSet set) {
        ArrayList<Integer> list = new ArrayList<>(set.getSetOfIntegers());
        list.retainAll(this.setOfIntegers);
        return list;
    }

    public boolean contains(int item) {
        return this.setOfIntegers.contains(item);
    }

    public int getItemById(int id) {
        --id;
        return this.setOfIntegers.get(id);
    }

    public void addItem(int item) {
        this.setOfIntegers.add(item);
    }

    public void deleteItemById(int id) {
        this.setOfIntegers.remove(id);
    }

    public ArrayList<Integer> getSetOfIntegers() {
        return this.setOfIntegers;
    }

    public void setSetOfIntegers(ArrayList<Integer> setOfIntegers) {
        this.setOfIntegers = setOfIntegers;
    }

    @Override
    public String toString() {
        return "IntegerSet = " + this.setOfIntegers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        IntegerSet that = (IntegerSet) o;

        return setOfIntegers != null ? setOfIntegers.equals(that.setOfIntegers) : that.setOfIntegers == null;
    }

    @Override
    public int hashCode() {
        return setOfIntegers != null ? setOfIntegers.hashCode() : 0;
    }
}

