
import javax.swing.JFrame;


public class Display1Frame extends JFrame{

	private static final long serialVersionUID = 1L;

	private Display1Panel panel;

	public Display1Frame(Main m){
		this.setTitle("Display 1");
    	this.setSize(800, 600);
    	this.setLocationRelativeTo(null);               
    	this.setVisible(true);
    	panel=new Display1Panel(m);
    	this.setContentPane(panel);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}