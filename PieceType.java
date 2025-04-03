package hackclubchess;

/*
 * Might not be able to use this because Java is not a great language
 * And they shot themselves in the foot with their weird enums
enum PieceType {
    None, 
    WKing, WPawn, WKnight, WBishop, WRook, WQueen,
    BKing, BPawn, BKnight, BBishop, BRook, BQueen
}
*/

// Imitating enums. Just constant numbers
// Shorts are smaller than ints
public class PieceType {
    public static final short None = 0;
    public static final short King = 1;
    public static final short Queen = 2;
    public static final short Rook = 3;
    public static final short Bishop = 3;
    public static final short Knight = 4;
    public static final short Pawn = 5;
    
    // We might implement it this way
    public static final short White = 8;
    public static final short Black = 16;
}