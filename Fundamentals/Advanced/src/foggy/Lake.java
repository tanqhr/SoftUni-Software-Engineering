package foggy;

import java.util.Iterator;
import java.util.List;

public class Lake implements Iterable<Integer>{
    public Lake(List<Integer> numbers) {
        this.numbers = numbers;
    }

    private List<Integer> numbers;

    @Override
    public Iterator<Integer> iterator() {
        return new Fog();
    }
    class Fog implements Iterator<Integer>{
private int index=0;
boolean firstRoundFinished=false;
        @Override
        public boolean hasNext() {
            return index< numbers.size();
        }

        @Override
        public Integer next() {
            int numberToReturn= numbers.get(index);
            index+=2;
            if(index>=numbers.size() && !firstRoundFinished){
                index=1;
                firstRoundFinished=true;

            }
            return numberToReturn;
        }
    }
}
