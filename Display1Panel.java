
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Display1Panel extends JPanel implements MouseListener{
	
	private static final long serialVersionUID = 1L;

	// pointer to the Main object that will be displayed
	public Main main;
	

	
	
	public Display1Panel(Main m){
		main=m;
		addMouseListener(this);
	}
	
	///////////////////////////////////////////////////////
	// function that draw the panel content
	public void paintComponent(Graphics g){
		
		// this draws a white background
		g.setColor(Color.white);
		g.fillRect(0,0, this.getWidth(), this.getHeight());
		
		// change for a custom color
		g.setColor(new Color(50,50,200));
		
		g.drawRect(50, 50, 200, 100);
		
		// write text
		g.drawString("HELLO WORLD !!!", 100,105);
		
		g.setColor(Color.green);
		
		// draw circles
		g.drawOval(50, 400, 50, 50);
		g.fillOval(150, 400, 50, 50);
		
		// draw rectangles
		g.drawRect(250, 400, 50, 50);
		g.fillRect(350, 400, 50, 50);
		
		// line between points (x1,y1) and (x2,y2)
		g.drawLine(450, 400, 500, 450);
		
		// draw a single pixel
		g.drawLine(550, 400, 550, 400);
	}
	//******************************************************
	
	

	
	
	///////////////////////////////////////////////////////
	// this function is called when a click is detected
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Display 1 "+e.getX()+" , "+e.getY());
		
		this.repaint();
	}
	//******************************************************
	
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

	
	

}