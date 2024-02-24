package parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;
    private int capacity;
    private List<Parrot> data;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Parrot parrot){
        if(this.capacity>this.data.size()){
            this.data.add(parrot);
        }
    }

    public Parrot sellParrot(String name){
        Parrot parrot = null;
        for (Parrot p:this.data) {
            if(p.getName().equals(name)){
                p.setAvailable(false);
                parrot = p;
            }
        }
        return parrot;
    }

    public List<Parrot> sellParrotBySpecies(String species){
        List<Parrot> parrotList = new ArrayList<>();
        for (Parrot p : this.data) {
            if(p.getSpecies().equals(species)){
                parrotList.add(p);
            }
        }
        return parrotList;
    }

    public int count(){
        return this.data.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Parrots available at " + getName() + ":\n");
        for (Parrot p:this.data) {
            if(p.isAvailable()){
                sb.append(p + "\n");
            }
        }
        return sb.toString();
    }

    public boolean remove(String name){
        for (Parrot p:this.data) {
            if(p.getName().equals(name)){
                this.data.remove(p);
                return true;
            }
        }
        return false;
    }
}
