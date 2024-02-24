package magazine;

import java.util.ArrayList;
import java.util.List;

public class Magazine {
    private String type;
    private int capacity;
    private List<Cloth> data;

    public Magazine(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    //addCloth(Cloth cloth)
    public void addCloth(Cloth cloth){
        if(this.capacity > data.size()){
            this.data.add(cloth);
        }
    }

    //removeCloth(String color)
    public boolean removeCloth(String color){
        for (Cloth cloth:data) {
            if(cloth.getColor().equals(color)){
                data.remove(cloth);
                return true;
            }
        }
        return false;
    }

    public Cloth getSmallestCloth(){
        int temp = Integer.MAX_VALUE;
        Cloth cloth = new Cloth("a",Integer.MAX_VALUE,"a");
        for (Cloth c:data) {
            if(c.getSize() < temp){
                temp = c.getSize();
                cloth = c; //!!!!
            }
        }
        return cloth;
    }

    public Cloth getCloth(String color){
        for (Cloth cloth:data) {
            if(cloth.getColor().equals(color)){
                return cloth;
            }
        }
        return null;
    }

    public int getCount(){
        int sum = 0;
        for (Cloth cloth:data) {
            sum++;
        }
        return sum;
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.type + " magazine contains:\n").trimToSize();
        for (Cloth cloth:this.data) {
            sb.append(cloth.toString() + "\n");
        }
        return sb.toString().trim();
    }
}
