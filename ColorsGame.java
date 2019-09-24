package cs245.project;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author S. Renee Eller
 */
public class ColorsGame extends JFrame {
     private ImageIcon color1 = new ImageIcon("cs245/project/color_images/blueCircle.png");
     private ImageIcon color2 = new ImageIcon("cs245/project/color_images/greenCircle.png");
     private ImageIcon color3 = new ImageIcon("cs245/project/color_images/yellowCircle.png");
     private ImageIcon color4 = new ImageIcon("cs245/project/color_images/purpleCircle.png");
     private ImageIcon color5 = new ImageIcon("cs245/project/color_images/redCircle.png");
     private final ArrayList<ImageIcon> ICON_LIST = new ArrayList<ImageIcon>(
             Arrays.asList(color1, color2, color3, color4, color5));
     private final ArrayList<String> COLOR_LIST = new ArrayList<String>(
             Arrays.asList("blue", "green", "purple", "yellow", "red"));
     private final ArrayList<Color> FONT_COLOR_LIST = new ArrayList<Color>(
             Arrays.asList(Color.blue, Color.green, Color.magenta, Color.yellow, Color.red));
     private boolean running;
     private int attempt;
     private String color; 
     private Thread t;
     private String threadName = "colors game";
     private final int rounds = 5;
     
     public ColorsGame(){
         super("Colors Game");
     }
     
     protected void initGame() {
        running = true;
        //insert code here to get score from Hangman game
    }
         
     private void initComponents(){
        setLayout(new GridBagLayout());
        Collections.shuffle(COLOR_LIST);
        JLabel colorText = new JLabel(COLOR_LIST.get(1));
        Collections.shuffle(FONT_COLOR_LIST);
        colorText.setForeground(FONT_COLOR_LIST.get(1));
        add(colorText);
        Collections.shuffle(ICON_LIST);
        for(int j =0; j < 5; j++){
            JButton jb = new JButton(ICON_LIST.get(j));
            jb.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    jb.setBackground(Color.gray);
                }
                @Override
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    jb.setBackground(UIManager.getColor("this.background"));
                }
            });            
            add(jb);
        }
    }
    

}