package com.company.practice.composite;

import java.util.ArrayList;
import java.util.List;

public class PC {
    private List<SpareParts> partsList = new ArrayList<>();

    public void addPart(SpareParts part){
        partsList.add(part);
    }

    public void removePart(SpareParts part){
        partsList.remove(part);
    }

    public void buildPC(){
        System.out.println("Program build your order...\n");
        for (SpareParts part : partsList){
            part.doYourJob();
        }
        System.out.println("\n===============================\n");
    }
}
