package backtrack_gen;
import java.util.ArrayList;
public class Configuration extends ArrayList<Integer> {
    public Configuration() {
        super();
    }
    
    public Configuration(int size) {
        super(size);
    }
    
    public void update(int index, int val) {
        if (index>=0 && index<this.size()) this.set(index, val);
    }
}
