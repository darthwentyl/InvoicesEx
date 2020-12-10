
public class Item {
    private int _count;
    private String _name;
    private double _cost;

    public void setCount(int count) {
        _count = count;
    }

    public void setName(String name) {
        _name = name;
    }

    public void setCost(double cost) {
        _cost = cost;
    }

    public int getCount() {
        return _count;
    }

    public String getName() {
        return _name;
    }


    public double getCost() {
        return _cost;
    }

    public String toString() {
        return new String("\tProduct: " + _name + "\n\tCount: " + _count + "\n\tCost: " + _count * _cost);
    }
}
