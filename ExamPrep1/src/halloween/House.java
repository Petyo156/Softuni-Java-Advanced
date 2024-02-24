package halloween;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class House {
    private int capacity;
    private List<Kid> data;

    public House(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addKid(Kid kid){
        if(capacity>data.size()){
            this.data.add(kid);
        }
    }

    public boolean removeKid(String name){
        for (Kid k:data) {
            if(k.getName().equals(name)){
                return data.remove(k);
            }
        }
        return false;
    }

    public Kid getKid(String street){
        for (Kid k:data) {
            if(k.getStreet().equals(street)){
                return k;
            }
        }
        return null;
    }

    public int getAllKids(){
        return data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("Children who visited a house for candy:\n");
        for (Kid k:data) {
            sb.append(String.format("%s from %s street\n", k.getName(),k.getStreet()));
        }
        return sb.toString();
    }
}
