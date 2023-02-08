public class MelissaAndDougStore extends ToyStore {
    @Override
    public Puzzle createPuzzle(String type){
        switch(type){
            case "animal":
                return new WoodAnimalPuzzle();
            case "color":
                return new WoodColorPuzzle();
            default:
                return null;
        }
    }
}
