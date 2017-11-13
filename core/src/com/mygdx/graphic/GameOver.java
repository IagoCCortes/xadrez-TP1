package com.mygdx.graphic;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.mygdx.game.ChessTable;
import com.mygdx.game.Util;

/**
 * Created by Iago on 11/12/2017.
 * Tela que aparece quando algum jogador
 * da checkmate
 */

public class GameOver implements Screen {

    private int winner;
    Chess game;
    Texture gameover;
    Texture gameoverw;
    Texture mmenuActive;
    Texture mmenuInactive;
    Texture exitGameActive;
    Texture exitGameInactive;

    public GameOver (Chess game, int whoseTurn) {
        this.game = game;
        this.winner = whoseTurn;
        gameover = new Texture("game_over.jpg");
        gameoverw = new Texture("gameoverw.jpg");
        mmenuActive = new Texture("button_main-menuA.png");
        mmenuInactive = new Texture("button_main-menuI.png");
        exitGameActive = new Texture("button_exitA.png");
        exitGameInactive = new Texture("button_exitI.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0f, 0f, 0f, 0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        game.sb.begin();
        if(winner == 1)
            game.sb.draw(gameover, 0, 0, 600, 600);
        else
            game.sb.draw(gameoverw, 0, 0, 600, 600);
        if(Gdx.input.getX() > 154 && Gdx.input.getX() < 446 && Gdx.input.getY() > 333 && Gdx.input.getY() < 400) {
            game.sb.draw(mmenuActive, Util.SCREEN_WIDTH / 2 - 146, 200, 292, 67);
            if(Gdx.input.isTouched()) {
                game.setScreen(new MainMenuScreen(game));
            }
        }else
            game.sb.draw(mmenuInactive, Util.SCREEN_WIDTH/2 - 146, 200, 292, 67);
        if(Gdx.input.getX() > 154 && Gdx.input.getX() < 446 && Gdx.input.getY() > 467 && Gdx.input.getY() < 534) {
            game.sb.draw(exitGameActive, Util.SCREEN_WIDTH / 2 - 146, 66, 292, 67);
            if(Gdx.input.isTouched())
                Gdx.app.exit();
        }else
            game.sb.draw(exitGameInactive, Util.SCREEN_WIDTH/2 - 146, 66, 292, 67);
        game.sb.end();


    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
