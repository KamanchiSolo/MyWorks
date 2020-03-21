package sample.Classwork.ClassworkLesson5.chess.interfaces;

public abstract class ChessItem implements Element {

    int x, y, value;

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }
}