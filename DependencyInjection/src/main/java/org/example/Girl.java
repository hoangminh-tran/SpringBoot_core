package org.example;

public class Girl {
    private Outfit outfit; // assume that one girl have only one bikini

    public Girl(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public void showOutFit(){
        outfit.wear();
    }
}
