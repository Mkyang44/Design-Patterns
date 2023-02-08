public class FisherPriceStore extends ToyStore{
    @Override
    public Puzzle createPuzzle(String type){
        switch(type){
            case "animal":
                return new PlasticAnimalPuzzle();
            case "Color":
                return new PlasticColorPuzzle();
            default:
                return null;
        }
    }
}