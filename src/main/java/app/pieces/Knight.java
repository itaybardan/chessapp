package app.pieces;

import app.chess.Game;


public class Knight {
    public static final long[] KnightAllPossibleMoves = {
            0x0000000000020400L, 0x0000000000050800L, 0x00000000000A1100L, 0x0000000000142200L,
            0x0000000000284400L, 0x0000000000508800L, 0x0000000000A01000L, 0x0000000000402000L,
            0x0000000002040004L, 0x0000000005080008L, 0x000000000A110011L, 0x0000000014220022L,
            0x0000000028440044L, 0x0000000050880088L, 0x00000000A0100010L, 0x0000000040200020L,
            0x0000000204000402L, 0x0000000508000805L, 0x0000000A1100110AL, 0x0000001422002214L,
            0x0000002844004428L, 0x0000005088008850L, 0x000000A0100010A0L, 0x0000004020002040L,
            0x0000020400040200L, 0x0000050800080500L, 0x00000A1100110A00L, 0x0000142200221400L,
            0x0000284400442800L, 0x0000508800885000L, 0x0000A0100010A000L, 0x0000402000204000L,
            0x0002040004020000L, 0x0005080008050000L, 0x000A1100110A0000L, 0x0014220022140000L,
            0x0028440044280000L, 0x0050880088500000L, 0x00A0100010A00000L, 0x0040200020400000L,
            0x0204000402000000L, 0x0508000805000000L, 0x0A1100110A000000L, 0x1422002214000000L,
            0x2844004428000000L, 0x5088008850000000L, 0xA0100010A0000000L, 0x4020002040000000L,
            0x0400040200000000L, 0x0800080500000000L, 0x1100110A00000000L, 0x2200221400000000L,
            0x4400442800000000L, 0x8800885000000000L, 0x100010A000000000L, 0x2000204000000000L,
            0x0004020000000000L, 0x0008050000000000L, 0x00110A0000000000L, 0x0022140000000000L,
            0x0044280000000000L, 0x0088500000000000L, 0x0010A00000000000L, 0x0020400000000000L
    };

    public static long KnightPossibleMoves(int place, Game game) // place (0-63)
    {
        long bit = 0x1L << place;
        boolean isPlayerPiece = game.isPlayerPiece(bit);
        long AllPossibleMoves = KnightAllPossibleMoves[place];


        return isPlayerPiece ? AllPossibleMoves & (~game.AllOccupiedPlaces | game.ComputerOccupiedPlaces) :
                AllPossibleMoves & (~game.AllOccupiedPlaces | game.PlayerOccupiedPlaces);
    }
}
