package com.workshop;

import java.util.Map;
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
        String first = ticTacToeGame.checkWhoStartsGame();
        System.out.println(first + " will play First");
        ticTacToeGame.showBoard();
        ticTacToeGame.playerMakeMove(scanner, playerLetter);
        ticTacToeGame.playerMakeMove(scanner, computerSymbol);
        ticTacToeGame.showBoard();
    }

    private String checkWhoStartsGame() {
        int toss = (int) ((Math.random() * 10) % 2);
        if(toss == 0) {
            return "Player is First";
        } else if(toss == 1)
            return "Computer is First";
        return null;
    }

    private void playerMakeMove(Scanner input, char playerLetter) {
        boolean isLocationFree;
        int boardPosition;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter the position you want");
            boardPosition = scanner.nextInt();
            isLocationFree = false;
            if (boardPosition >= 1 && boardPosition <= 9) {
                if (board[boardPosition] == ' ') {
                    board[boardPosition] = playerLetter;
                    showBoard();
                } else {
                    System.out.println("Position is Already Occupied");
                }
            }
        } while (!isLocationFree);
        board[boardPosition] = playerLetter;
        showBoard();
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
