package Model;

/**
 *
 * @author Steven.Cardona
 */
public enum Figure {

    X("X"), O("O");

    private final String figure;

    private Figure(final String figureName){
        figure = figureName;
    }

    @Override
    public String toString() {
        return figure;
    }
}
