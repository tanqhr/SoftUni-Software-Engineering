package CollectionHierarchy_07;

import java.util.ArrayList;
import java.util.List;

public abstract class Collection {
    private int maxSize;
    protected List<String> items;


    public Collection() {
        maxSize = 100;
        items = new ArrayList<>();
    }

}
