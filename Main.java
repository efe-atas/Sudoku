import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;

public class Main {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {


        Scanner scanner = new Scanner(System.in);
        Welcome.hello();
        int level = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the Level Number: ");
                level = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
            }
        }
        Sudoku su = new Sudoku();
        su.start(level);
        su.show();

        while(!su.sucontrol()){
            su.change();
        }
        if(su.sucontrol()){
           su.show();
           System.out.println("                                                        You finished this level succesfully!");
           System.out.println("                                                        ( ͡° ͜ʖ ͡°)");
        }







    }
}
