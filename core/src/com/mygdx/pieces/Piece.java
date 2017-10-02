package com.mygdx.pieces;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.drawable.Drawable;
import com.mygdx.game.Square;

/**
 * Created by felipecosta on 10/2/17.
 */
public abstract class Piece extends Drawable{
    private PieceCode pieceCode;

    public Piece(PieceCode pieceCode, String pathToImage) {
        super(pathToImage);
        this.pieceCode = pieceCode;
    }

    public void drawAtSquare(SpriteBatch sb, Square sq) {
        this.setPosition(sq.getX(), sq.getY());
        this.draw(sb);
    }

    public PieceCode getPieceCode() { return this.pieceCode; }
}
