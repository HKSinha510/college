import java.applet.Applet;
import java.awt.Graphics;

/*
<applet code="HelloApplet.class" width="300" height="200">
</applet>
*/

public class MyFirstApp extends Applet {

    public void paint(Graphics g) {
        g.drawString("Hello Java", 100, 100);
    }
}