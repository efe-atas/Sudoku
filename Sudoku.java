import java.util.*;

public class Sudoku {
    int[][] game = new int[9][9];
    Scanner scanner = new Scanner(System.in);


    Sudoku(){

    }

    public void start(int level){
        if (level == 1) {
            game = new int[][]{
                    {2, 0, 0, 0, 9, 3, 5, 0, 0},
                    {1, 0, 0, 0, 0, 0, 3, 4, 0},
                    {8, 0, 0, 5, 2, 0, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0, 3},
                    {0, 9, 0, 2, 7, 0, 8, 0, 0},
                    {7, 1, 8, 0, 3, 5, 9, 0, 6},
                    {9, 8, 5, 6, 1, 0, 0, 3, 4},
                    {0, 2, 0, 7, 4, 0, 6, 0, 0},
                    {6, 0, 7, 3, 5, 8, 0, 0, 0},
            };
        }
        else if(level == 2){
            game = new int[][]{
                    {8, 3, 0, 2, 5, 0, 0, 0, 4},
                    {0, 0, 5, 8, 4, 2, 1, 0, 0},
                    {0, 5, 3, 4, 0, 7, 4, 2, 6},
                    {6, 4, 4, 1, 2, 3, 1, 1, 8},
                    {3, 7, 7, 6, 8, 2, 5, 6, 3},
                    {5, 3, 6, 6, 3, 3, 7, 8, 8},
                    {2, 8, 5, 4, 0, 4, 5, 1, 2},
                    {1, 2, 1, 7, 2, 8, 5, 5, 6},
                    {4, 3, 1, 1, 4, 2, 4, 4, 7},
            };

        }
        else if(level == 3){
            game = new int[][]{
                    {8, 3, 0, 2, 5, 0, 0, 0, 4},
                    {0, 0, 5, 8, 4, 2, 1, 0, 0},
                    {0, 5, 3, 4, 0, 7, 4, 2, 6},
                    {6, 4, 4, 1, 2, 3, 1, 1, 8},
                    {3, 7, 7, 6, 8, 2, 5, 6, 3},
                    {5, 3, 6, 6, 3, 3, 7, 8, 8},
                    {2, 8, 5, 4, 0, 4, 5, 1, 2},
                    {1, 2, 1, 7, 2, 8, 5, 5, 6},
                    {4, 3, 1, 1, 4, 2, 4, 4, 7},
            };

        }
        else if(level == 4){
            game = new int[][]{
                    {8, 3, 0, 2, 5, 0, 0, 0, 4},
                    {0, 0, 5, 8, 4, 2, 1, 0, 0},
                    {0, 5, 3, 4, 0, 7, 4, 2, 6},
                    {6, 4, 4, 1, 2, 3, 1, 1, 8},
                    {3, 7, 7, 6, 8, 2, 5, 6, 3},
                    {5, 3, 6, 6, 3, 3, 7, 8, 8},
                    {2, 8, 5, 4, 0, 4, 5, 1, 2},
                    {1, 2, 1, 7, 2, 8, 5, 5, 6},
                    {4, 3, 1, 1, 4, 2, 4, 4, 7},
            };

        }
        else if(level == 5){
            game = new int[][]{
                    {8, 3, 0, 2, 5, 0, 0, 0, 4},
                    {0, 0, 5, 8, 4, 2, 1, 0, 0},
                    {0, 5, 3, 4, 0, 7, 4, 2, 6},
                    {6, 4, 4, 1, 2, 3, 1, 1, 8},
                    {3, 7, 7, 6, 8, 2, 5, 6, 3},
                    {5, 3, 6, 6, 3, 3, 7, 8, 8},
                    {2, 8, 5, 4, 0, 4, 5, 1, 2},
                    {1, 2, 1, 7, 2, 8, 5, 5, 6},
                    {4, 3, 1, 1, 4, 2, 4, 4, 7},
            };

        }


    }



    public void show(){
        for(int i = 0;i<9;i++){
            System.out.print("                                                        ");
            for(int j=0;j<9;j++){
                System.out.print(game[i][j] + " ");
                if((j+1)%3==0 && j!=8){
                    System.out.print("| ");
                }
            }
            System.out.println();
            if((i+1)%3==0 && i!=8){
                System.out.println("                                                        ----------------------");
            }
        }
    }

    public void level(){

    }

    public void change(){

        int row = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the Row Number: ");
                row = scanner.nextInt()-1;
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        }

        int column = 0;
        boolean valid_Input = false;
        while (!valid_Input) {
            try {
                System.out.print("Enter the Column Number: ");
                column = scanner.nextInt()-1;
                valid_Input = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        }


        int value = 0;
        boolean valid__Input = false;
        while (!valid__Input) {
            try {
                System.out.print("Enter the Value: ");
                value = scanner.nextInt();
                valid__Input = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        }

        if(game[row][column]==0){
            game[row][column] = value;
            show();
        }
        else {
            System.out.println("You can not change this value");
            change();

        }



    }


    public boolean sucontrol(){


        return false;

    }



}
