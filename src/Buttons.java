import javax.swing.*;
import java.awt.event.ActionListener;

public class Buttons extends JButton {
    private int x;
    private int y;
    private int width;
    private int height;
    private String label;

    public Buttons(int x, int y, int width, int height, String label){
        this.x = x;
        this.y = y;
        this.width  = width;
        this.height = height;
        this.label = label;
        setBounds(x,y,width,height);
        setText(label);
    }

    public void setListener(ActionListener listener){
        addActionListener(listener);
    }
}