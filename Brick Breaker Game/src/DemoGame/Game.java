package DemoGame;

import javax.swing.*;

public class Game {
    public static void main(String[] args) {

        JFrame f = new JFrame();    // create a JFrame object

        GamePlay gameplay = new GamePlay();

        f.setTitle("Welcome To Brick Breaker"); // set title for our frame
        f.setBounds(100, 100, 712, 636);    // set coordinates & size of our frame
        f.setResizable(false);  // we do not want that anybody should resize out frame
        f.setVisible(true); // set visibility of the frame
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // as soon as we hit the close button our program should end

        f.add(gameplay);
    }
}
