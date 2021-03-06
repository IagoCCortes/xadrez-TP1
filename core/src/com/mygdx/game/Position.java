package com.mygdx.game;


/*
* Este é um tipo abstrato de dados que eu criei para auxiliar no jogo.
* Basicamente, uma posição é uma tupla com dois inteiros.
* Internamente, a classe position sempre armazena (0-?,0-7), que seriam os indexadores
* da matriz[8][8] que é o tabuleiro.
*
* Porém, como num tabuleiro de xadrez normal, as posições sao marcadas por
* A-H (no eixo horizontal) e 1-8 (no eixo vertical), a classe position também dá suporte a
* esse formato no seu contrutor e no método setPosition, porém, sempre salvando internamente como (0-?,0-7)
*
* */



public class Position {
    private int X;
    private int Y;

    public Position(){
    }

    public Position(Position p){
        this.X = p.X;
        this.Y = p.Y;
    }

    public Position(char X, int Y){
        this.X = X - 65;
        this.Y = Y-1;
    }
    public Position(int i, int j){
        this.X = i;
        this.Y = j;
    }

    public void setPosition(char X, int Y){
        this.X = X - 65;
        this.Y = Y - 1;
    }

    public void setPosition(int X, int Y){
        this.X = X;
        this.Y = Y;
    }
    public void setPosition(Position p){
        this.X = p.getX();
        this.Y = p.getY();
    }

    public Position toInverted(){
        this.invert();
        return this;
    }
    public void invert(){
        X = 7 - X;
        Y = 7 - Y;
        //X = 7 - X;
    }

    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }

    public char getCharX(){
        return (char)(X+65);
    }
    public int getCharY(){
        return (Y+1);
    }


    public void moveUp(){
        this.Y = this.Y+1;
    }
    public void moveDown(){
        this.Y = this.Y-1;
    }
    public void moveLeft(){
        this.X = this.X-1;
    }
    public void moveRight(){
        this.X = this.X+1;
    }
    public void moveUpLeft(){
        this.moveUp();
        this.moveLeft();
    }
    public void moveUpRight(){
        this.moveUp();
        this.moveRight();
    }
    public void moveDownLeft(){
        this.moveDown();
        this.moveLeft();
    }
    public void moveDownRight(){
        this.moveDown();
        this.moveRight();
    }
    public void moveUp(int i){
        this.Y = this.Y+i;
    }
    public void moveDown(int i){
        this.Y = this.Y-i;
    }
    public void moveLeft(int i){
        this.X = this.X-i;
    }
    public void moveRight(int i){
        this.X = this.X+i;
    }
    public void moveUpLeft(int i){
        this.moveUp(i);
        this.moveLeft(i);
    }
    public void moveUpRight(int i){
        this.moveUp( i);
        this.moveRight(i);
    }
    public void moveDownLeft(int i){
        this.moveDown(i);
        this.moveLeft(i);
    }
    public void moveDownRight(int i){
        this.moveDown(i);
        this.moveRight(i);
    }


    public boolean isValidPosition() {
        if (X < 0 || Y < 0 || X > 7 || Y > 7){
            return false;
        }
        return true;
    }


}
