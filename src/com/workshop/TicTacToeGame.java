package com.workshop;

public class TicTacToeGame {
    
    char[] board = new char[10];

    void createBoard(){
        for (int i = 10; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game ");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.createBoard();
    }
}
