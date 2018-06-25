import javax.swing.*;

public class Fields extends JTextField {
    private int x;
    private int y;
    private int width;
    private int height;

    public Fields(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width  = width;
        this.height = height;
        setBounds(x,y,width,height);
    }


}
