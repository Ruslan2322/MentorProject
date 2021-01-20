package com.company.practice.flyWeight;

import java.util.ArrayList;
import java.util.List;

/**
 * Симулятор строительства дома
 * */

public class BuildingRunner {
    public static void main(String[] args) {

        BuildersFactory buildersFactory = new BuildersFactory();

        List<Builder> builders = new ArrayList<>();

        builders.add(buildersFactory.getBuilderBySpeciality("constructor"));
        builders.add(buildersFactory.getBuilderBySpeciality("stonemason"));
        builders.add(buildersFactory.getBuilderBySpeciality("stonemason"));
        builders.add(buildersFactory.getBuilderBySpeciality("stonemason"));
        builders.add(buildersFactory.getBuilderBySpeciality("tile"));
        builders.add(buildersFactory.getBuilderBySpeciality("tile"));
        builders.add(buildersFactory.getBuilderBySpeciality("engineer"));
        builders.add(buildersFactory.getBuilderBySpeciality("electrician"));
        builders.add(buildersFactory.getBuilderBySpeciality("electrician"));
        builders.add(buildersFactory.getBuilderBySpeciality("electrician"));

        for (Builder builder : builders) {
            builder.doJob();
        }
    }
}
