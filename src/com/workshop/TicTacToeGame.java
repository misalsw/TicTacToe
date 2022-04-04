package com.workshop;

import java.util.Scanner;

public class TicTacToeGame {

    char[] board = new char[10];

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe Game ");
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        ticTacToeGame.createBoard();
        System.out.println("Enter the Symbol X or O :");
        Scanner scanner = new Scanner(System.in);
        char playerLetter = scanner.next().charAt(0);
        char computerSymbol = ticTacToeGame.chooseSymbolForPlayer(playerLetter);
        System.out.println("Player Letter is :" + playerLetter);
        System.out.println("Computer Letter is : " + computerSymbol);
    }

    void createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    public char chooseSymbolForPlayer(char playerLetter) {
        char computerLetter = ' ';
        if (playerLetter == 'X') {
            computerLetter = 'O';
        } else if (playerLetter == 'O') {
            computerLetter = 'X';
        }
        return computerLetter;
    }
}
