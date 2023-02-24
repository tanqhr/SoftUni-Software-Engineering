package CollectionHierarchy_07;

public class MyListImpl extends Collection implements MyList{
    @Override
    public String remove() {
        return super.items.remove(0);
    }

    @Override
    public int add(String item) {
        items.add(0,item);
        return 0;
    }

    @Override
    public int getUsed() {
        return items.size();
    }
}
