package aquarium;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishInPool;
    private String name;
    private int capacity;
    private int size;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new ArrayList<>();
    }

    public int getFishInPool() {
        return this.fishInPool.size();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
    //Method remove(String name) - removes a fish from the pool with the given name,
    // if such exists, and returns a boolean if the deletion is successful.

    //Method findFish(String name) - returns a fish with the given name, it doesn't exist return null.


    //"Aquarium: {name} ^ Size: {size}
    //{Fish1}
    //{Fish2}
    //…"
    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Aquarium: %s ^ Size: %d%n",this.name,this.size));
        for (Fish fishy:this.fishInPool) {
            sb.append(fishy.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public Fish findFish(String name){
        for (Fish fishy:this.fishInPool) {
            if(fishy.getName().equals(name)){
                return fishy;
            }
        }
        return null;
    }

    public boolean remove(String name){
        for (Fish fishy:this.fishInPool) {
            if(fishy.getName().equals(name)){
                this.fishInPool.remove(fishy);
                return true;
            }
        }
        return false;
    }

    public void add(Fish fish){
        if(this.capacity>this.fishInPool.size()){
            //if(fishInPool.contains(fish.getName()) == fish.getName()){
            boolean added = true;
            for (Fish fishy:this.fishInPool) {
                if(fishy.getName().equals(fish.getName())){
                    added = false;
                }
            }
            if(added){
                this.fishInPool.add(fish);
            }
        }
    }
}
