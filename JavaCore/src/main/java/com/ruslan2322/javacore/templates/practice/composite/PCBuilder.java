package com.company.practice.composite;

/**
 * Эмулятор сборщика ПК
 * */

public class PCBuilder {
    public static void main(String[] args) {

        PC pc = new PC();
        PC pc1 = new PC();

        Processor processor = new Ryzen5();
        Processor processor1 = new InelI7();
        RAM ram = new RAM();
        VideoCard videoCard = new NVidiaCard();
        VideoCard videoCard1 = new AMDCard();
        PowerSupply powerSupply = new PowerSupply();
        HDD hdd = new HDD();
        MotherBoard motherBoard = new MotherBoard();

        pc.addPart(ram);
        pc.addPart((SpareParts) videoCard);
        pc.addPart((SpareParts) processor);
        pc.addPart(powerSupply);
        pc.addPart(hdd);
        pc.addPart(motherBoard);

        pc1.addPart(ram);
        pc1.addPart(motherBoard);
        pc1.addPart(powerSupply);
        pc1.addPart(hdd);
        pc1.addPart((SpareParts) videoCard1);
        pc1.addPart((SpareParts) processor1);

        pc.buildPC();
        pc1.buildPC();

    }
}
