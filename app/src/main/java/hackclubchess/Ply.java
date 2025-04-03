package hackclubchess;

// A MOVE in chess is both white and black taking their turns
// A Ply is a half-move, either white or black taking their turn
public class Ply {
    // We should implement these first
    public short pieceType;
    public short fromPos;
    public short endPos;

    // These are for later
    public short captureType;
    public short promotionType;
}