
public class ItemImpl extends Item {
    int _count;
    String _name;
    double _cost;
    
    ItemImpl(int count, String name, double cost) {
        _count = count;
        _name = name;
        _cost = cost;
    }
    
    @Override
    int getCount() {
        return _count;
    }

    @Override
    String getName() {
        return _name;
    }

    @Override
    double getCost() {
        return _cost;
    }
    

}
