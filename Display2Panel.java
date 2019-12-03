
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Display2Panel extends JPanel implements MouseListener{
	
	private static final long serialVersionUID = 1L;

	// pointer to the Main object that will be displayed
	public Main main;
	

	
	
	public Display2Panel(Main m){
		main=m;
		addMouseListener(this);
	}
	
	///////////////////////////////////////////////////////
	// function that draw the panel content
	public void paintComponent(Graphics g){
		
		// this draws a white background
		g.setColor(Color.white);
		g.fillRect(0,0, this.getWidth(), this.getHeight());
		

		// draw a Buffered image. Here, we display the image of the linked Main object
		if (main.image!=null){
			g.drawImage(main.image, 0, 0, this);
		}
		
	}
	//******************************************************

	
	
	///////////////////////////////////////////////////////
	// this function is called when a click is detected
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Display 2 "+e.getX()+" , "+e.getY());
		
		this.repaint();
	}
	//******************************************************
	
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}

	
	

}