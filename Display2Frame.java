
import javax.swing.JFrame;


public class Display2Frame extends JFrame{

	private static final long serialVersionUID = 1L;

	private Display2Panel panel;

	public Display2Frame(Main m){
		this.setTitle("Display 2");
    	this.setSize(800, 650);
    	this.setLocationRelativeTo(null);               
    	this.setVisible(true);
    	panel=new Display2Panel(m);
    	this.setContentPane(panel);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}