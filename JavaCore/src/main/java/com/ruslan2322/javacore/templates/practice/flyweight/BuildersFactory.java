package com.company.practice.flyWeight;

import java.util.HashMap;
import java.util.Map;

public class BuildersFactory {
    public static final Map<String, Builder> builders = new HashMap<>();

    public Builder getBuilderBySpeciality(String speciality){
        Builder builder = builders.get(speciality);

        if (builder == null){
            switch (speciality){
                case "stonemason":
                    System.out.println("Hiring Stonemason builder...");
                    builder = new Stonemasson();
                    break;
                case "tile":
                    System.out.println("Hiring tile builder...");
                    builder = new Tiles();
                case "electrician":
                    System.out.println("Hiring electrician builder...");
                    builder = new Electrician();
                case "engineer":
                    System.out.println("Hiring engineer...");
                    builder = new Engineer();
                case "constructor":
                    System.out.println("Hiring constructor...");
                    builder = new Constructor();
            }
            builders.put(speciality,builder);
        }
        return builder;
    }
}
