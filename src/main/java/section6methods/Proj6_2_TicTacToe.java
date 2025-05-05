package section6methods;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Proj6_2_TicTacToe {

    public static void main(String[] args) {

        runGame();
    }

    // the game loop
    public static void runGame() {
        final int ROWS = 3;
        final int COLS = 3;
        // Initializes the winner as a string that is empty, since no one has one yet
        String winner = "";

        // create the gameboard array of dimensions ROWS x COLS in this method
        String[][] gameBoardTicTacToe = new String[ROWS][COLS];

        // fill the game board 2D array with spaces
        initializeGameBoard(gameBoardTicTacToe);

        // prints the board, including the lines
        // and the contents of the 2D array cells
        printCurrentBoard(gameBoardTicTacToe);

        // go into a game loop that continues as long as the winner has not been
        // found yet
        // game loop must keep track of whose turn it is
        boolean xTurn = true;
        while (winner.isEmpty()) {
            // obtain the user's input and
            // modify the game board if they select a valid move, and tell them to pick
            // another cell if they select an invalid move
            getUserInput(xTurn, gameBoardTicTacToe);

            // the game board is re-printed with
            // printCurrentBoard since the board has been updated
            printCurrentBoard(gameBoardTicTacToe);

            // set the winner variable to whatever is
            // returned by getWinner
            winner = getWinner(gameBoardTicTacToe);

            // flip whose turn it is to prepare for the next round
            xTurn = !xTurn;

            // check if the board is full and a winner
            // hasn't been selected yet, in which case we set winner equal to C, which
            // means it's the cat's game
            if (isBoardFull(gameBoardTicTacToe) && winner.isEmpty()) {
                winner = "C";
            }
        }

        // tell the user if the cat has won
        if (winner.equals("C")) {
            System.out.println("It was a Cat's  game. No winner. :(");
        } else {
            System.out.println("The winner is " + winner);
        }
    }

    // sets the cells of the 2D array to spaces
    public static void initializeGameBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = " ";
            }
        }
    }

    // prints whatever is in the current board
//    public static void printCurrentBoard(String[][] gameBoard) {
    //TODO fix the board to print vertical lines in the same place
//        int size =3;
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                System.out.printf("%s", gameBoard[i][j]);
//                if (j < size - 1) {
//                    System.out.print("|");
//                }
//            }
//            System.out.println();
//            if (i < size - 1) {
//                for (int k = 0; k < size * 4 - 1; k++) {
//                    System.out.print("-");
//                }
//                System.out.println();
//            }
//        }
//    }

    // prints whatever is in the current board
    public static void printCurrentBoard(String[][] gameBoard) {
        System.out.println("   0   1   2");
        for (int i = 0; i < gameBoard.length; i++) {
            System.out.printf("%d  %2s | %2s | %2s%n", i, gameBoard[i][0], gameBoard[i][1], gameBoard[i][2]);
            if (i < gameBoard.length - 1) {
                System.out.println("  ---+---+---");
            }
        }
    }

    // gets the user input, and if valid, sets the game board appropriately
    public static void getUserInput(boolean xTurn, String[][] gameBoard) {
        Scanner keyboard = new Scanner(System.in);
        final String INSTRUCTIONS = "Please enter the row THEN the column, each " +
                "from 0, 1, or 2, separated by a space";

        if (xTurn) {
            System.out.println("It's X's turn\n" + INSTRUCTIONS);
        } else {
            System.out.println("It's O's turn\n" + INSTRUCTIONS);
        }

        int row = -1, col = -1;
        boolean validInput = false;

        while (!validInput) {
            try {
                row = keyboard.nextInt();
                col = keyboard.nextInt();

                if ((row < 0 || row > 2) || (col < 0 || col > 2)) {
                    System.out.println("Invalid input. " + INSTRUCTIONS);
                } else if (cellAlreadyOccupied(row, col, gameBoard)) {
                    System.out.println("That cell is already occupied! " + INSTRUCTIONS);
                } else {
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only. " + INSTRUCTIONS);
                keyboard.nextLine(); // Clear invalid input
            }
        }

        // Goes into a loop to determine if the input has been valid yet or not
        // Valid selections include values for rows and cols >= 0, and <= 2
        do {
            if ((row < 0 || row > 2) || (col < 0 || col > 2)) {
                System.out.println(INSTRUCTIONS);
                row = keyboard.nextInt();
                col = keyboard.nextInt();
            } else {
                if (cellAlreadyOccupied(row, col, gameBoard)) {
                    System.out.println("That cell is already occupied!");
                    System.out.println(INSTRUCTIONS);
                    row = keyboard.nextInt();
                    col = keyboard.nextInt();
                }
            }
        } while (((row < 0 || row > 2) || (col < 0 || col > 2)) ||
                cellAlreadyOccupied(row, col, gameBoard));

        // put an X or an O inside the gameboard at the
        // row or the column
        if (xTurn) {
            gameBoard[row][col] = "X";
        } else {
            gameBoard[row][col] = "O";
        }
    }

    // returns true if a given cell (by row and column) is already occupied
    public static boolean cellAlreadyOccupied(
            int row,
            int col,
            String[][] gameBoard) {
        return !gameBoard[row][col].equals(" ");
    }

    // returns "X", "O" if there is a clear winner, or an empty string if there is
    // no
    // winner yet
    public static String getWinner(String[][] gameBoard) {
        int rowTally = 1;
        int col0Tally = 1;
        int col1Tally = 1;
        int col2Tally = 1;
        int lastSpace = gameBoard.length - 1;

        ArrayList<String> xDiagTopLToBotR = new ArrayList<>();
        ArrayList<String> oDiagTopLToBotR = new ArrayList<>();
        ArrayList<String> xDiagBotLToTopR = new ArrayList<>();
        ArrayList<String> oDiagBotLToTopR = new ArrayList<>();

        for (int row = 0; row < gameBoard.length; row++) {
            for (int col = 0; col < gameBoard[row].length; col++) {
                if (!gameBoard[row][col].equals(" ")) {
                    // check the winning conditions for rows
                    if (col != lastSpace &&
                            gameBoard[row][col].equals(gameBoard[row][lastSpace])) {
                        rowTally++;

                        if (rowTally == 3) {
                            return gameBoard[row][col];
                        }
                    }

                    // check winning conditions for columns
                    if (row != lastSpace &&
                            gameBoard[row][col].equals(gameBoard[lastSpace][col])) {
                        if (col == 0) {
                            col0Tally++;
                        }
                        if (col == 1) {
                            col1Tally++;
                        }
                        if (col == 2) {
                            col2Tally++;
                        }
                        if (col0Tally == 3 || col1Tally == 3 || col2Tally == 3) {
                            return gameBoard[row][col];
                        }
                    }

                    // check for top-left to bottom-right winners
                    if (row == col) {
                        if (gameBoard[row][col].equals("X")) {
                            xDiagTopLToBotR.add("X");
                            if (xDiagTopLToBotR.size() == 3) {
                                return "X";
                            }
                        }

                        if (gameBoard[row][col].equals("O")) {
                            oDiagTopLToBotR.add("O");
                            if (oDiagTopLToBotR.size() == 3) {
                                return "O";
                            }
                        }
                    }

                    // check for bottom-left to top-right winners
                    if (row == 2 && col == 0) {

                        if (gameBoard[row][col].equals("X")) {
                            xDiagBotLToTopR.add("X");
                        }

                        if (gameBoard[row][col].equals("O")) {
                            oDiagBotLToTopR.add("O");
                        }
                    }

                    if (row == 1 && col == 1) {
                        if (gameBoard[row][col].equals("X")) {
                            xDiagBotLToTopR.add("X");
                        }

                        if (gameBoard[row][col].equals("O")) {
                            oDiagBotLToTopR.add("O");
                        }
                    }

                    if (row == 0 && col == 2) {
                        if (gameBoard[row][col].equals("X")) {
                            xDiagBotLToTopR.add("X");
                        }

                        if (gameBoard[row][col].equals("O")) {
                            oDiagBotLToTopR.add("O");
                        }
                    }

                    if (xDiagBotLToTopR.size() == 3) {
                        return "X";
                    }

                    if (oDiagBotLToTopR.size() == 3) {
                        return "O";
                    }
                }
            }

            rowTally = 1;
        }
        return "";
    }

    // returns if the board is full or not
    public static boolean isBoardFull(String[][] gameBoard) {
        int count = 0;
        for (String[] gameSpace : gameBoard) {
            for (String entry : gameSpace) {
                if (!entry.equals(" ")) {
                    count++;
                }
            }
        }

        return count == 9;
    }
}
