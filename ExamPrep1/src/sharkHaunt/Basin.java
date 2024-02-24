package sharkHaunt;

import java.util.ArrayList;
import java.util.List;

public class Basin {
    private String name;
    private int capacity;
    private List<Shark> sharks;

    public Basin(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.sharks = new ArrayList<>();
    }

    public void addShark(Shark shark){
        if(capacity>this.sharks.size()){
            this.sharks.add(shark);
        } else {
            System.out.println("This basin is at full capacity!");
        }
    }

    public boolean removeShark(String kind){
        for (Shark sh:sharks) {
            if(sh.getKind().equals(kind)){
                return sharks.remove(sh);
            }
        }
        return false;
    }

    public Shark getLargestShark(){
        Shark a = new Shark("a",0,"a","a");
        for (Shark sh:sharks) {
            if(sh.getLength()>a.getLength()){
                a = sh;
            }
        }
        return a;
    }

    public Shark getShark(String kind){
        for (Shark sh:sharks) {
            if(sh.getKind().equals(kind)){
                return sh;
            }
        }
        return null;
    }

    public int getCount(){
        return this.sharks.size();
    }

    public int getAverageLength(){
        int sum = 0;
        for (Shark sh:sharks) {
            sum+=sh.getLength();
        }
        return sum/sharks.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Sharks in %s:%n",this.name));
        for (Shark sh:sharks) {
            sb.append(sh + "\n");
        }
        return sb.toString();
    }
}
