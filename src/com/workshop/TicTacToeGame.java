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
        ticTacToeGame.showBoard();
    }

    public void showBoard() {
        System.out.println("Current TicTacToe Game Board is ");
        System.out.println("| " + board[1] + " | "
                + board[2] + " | " + board[3]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | "
                + board[5] + " | " + board[6]
                + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[7] + " | "
                + board[8] + " | " + board[9]
                + " |");
    }


    public void createBoard() {
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
