public abstract class ToyStore{
    public abstract Puzzle createPuzzle(String type);
    public String orderPuzzle(String type){
        Puzzle p = createPuzzle(type);
        if(p == null){
            return null;
        }
        return p.assemble() + p.boxPuzzle();
    }
}

