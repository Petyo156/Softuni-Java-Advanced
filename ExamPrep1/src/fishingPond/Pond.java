package fishingPond;

import java.util.ArrayList;
import java.util.List;

public class Pond {
    private int capacity;
    private List<Fish> fishes;

    public Pond(int capacity) {
        this.capacity = capacity;
        this.fishes = new ArrayList<>();
    }

    public void addFish(Fish fish){
        if(this.capacity> this.fishes.size()){
            this.fishes.add(fish);
        }
    }

    public boolean removeFish(String species){
        for (Fish fishy:this.fishes) {
            if(fishy.getSpecies().equals(species)){
                this.fishes.remove(fishy);
                return true;
            }
        }
        return false;
    }

    public Fish getOldestFish(){
        Fish dummyFish = new Fish("a",0,"a");
        int max = Integer.MIN_VALUE;
        for (Fish fishy:this.fishes) {
            if(fishy.getAge()>max){
                max = fishy.getAge();
                dummyFish = fishy;
            }
        }
        return dummyFish;
    }

    public Fish getFish(String species){
        for (Fish fishy:this.fishes) {
            if(fishy.getSpecies().equals(species)){
                return fishy;
            }
        }
        return null;
    }

    public int getCount(){
        return this.fishes.size();
    }

    public int getVacancies(){
        return this.capacity - this.fishes.size();
    }

    public String report(){
        /*⦁	"Fishes in the pond:
This {species} is {age} years old and reproduces through {matingSeason}.
This {species} is {age} years old and reproduces through {matingSeason}.
(…)"
*/      StringBuilder sb = new StringBuilder();
        sb.append("Fishes in the pond:\n");
        for (Fish fishy:this.fishes) {
            sb.append(fishy);
        }
        return sb.toString();
    }
}
