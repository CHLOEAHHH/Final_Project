package main;

import javax.swing.JPanel;

public class GamePanel extends JPanel{
    
    //Screen settings

    final int ORIGINALTILESIZE = 16; //Temporary place holder til I figure out the ssize I want 
    final int SCALE = 3; //multiplier to make things large

    final int TILESIZE = ORIGINALTILESIZE * SCALE; //48x48 tile
    final int MAXSCREENCOL = 16;
    final int MAXSCREENROW = 12;
    // 16 hor. and 12 vertical tiles. Ratio 4/3 for window size
    final int SCREENWIDTH = TILESIZE * MAXSCREENCOL; // 768 pixels
    final int SCREENHEIGHT = TILESIZE * MAXSCREENROW; // 576 pixels

    public GamePanel() {

        this.setPreferredSize(new Dimension(SCREENWIDTH, SCREENHEIGHT));
        this.setDoubleBuffered(true);
    }
}
