package oop.animals;

public class AquaMammal extends MarineAnimal{


    private int maxTimeSubmerged;


    public AquaMammal(boolean canSwim, int length, int finCount,
                      boolean isSaltwater, String name,
                      boolean hasScales, int maxTimeSubmerged){

        super(canSwim, length, finCount, isSaltwater, name);
        this.maxTimeSubmerged = maxTimeSubmerged;

    }



    public AquaMammal(){}

    public int getMaxTimeSubmerged() {
        return maxTimeSubmerged;
    }

    public void setMaxTimeSubmerged(int maxTimeSubmerged) {
        this.maxTimeSubmerged = maxTimeSubmerged;
    }
}