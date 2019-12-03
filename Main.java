import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;


public class Main {

	// Write the path to your image file
	public static String PATH="";
	
	///////////////////////////////////////////////////
	// variables of the class Main
	
	// image as BufferedImage
	public BufferedImage image=null;

	// image as matrix
	public int[][][] img;
	
	public int size_x=-1;
	public int size_y=-1;
	
	// two display panels; use them wisely
	public Display1Frame display1;
	public Display2Frame display2;
	
	// Here is how you can create a dynamic list
	// you can also use Float, String, tables or any object you defined
	public ArrayList<Integer> list;
	
	//***********************************************
	
	
	
	///////////////////////////////////////////////////
	// Main class constructor. Initialize variables here,
	// then execute your main program
	public Main(){
		
		// load the image
		try {
			image = ImageIO.read(new File(PATH+"outdoorMap.png"));
		} catch (IOException e) {System.out.print(e);}
		
		// get and store image dimensions
		size_x=image.getWidth();
		size_y=image.getHeight();
		
		// initialize matrix (then you have to convert image)
		img=new int[size_x][size_y][3];
		
		
		// this is how you can initialize and manipulate dynamic lists 
		list=new ArrayList<Integer>();
		
		list.add(4);
		list.add(8);
		System.out.println("Size: "+list.size());
		for (int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		// initialize two different display panels, with a pointer to this current object Main,
		// so the panels can directly access to elements of this object, such as image and img
		display1=new Display1Frame(this);
		display2=new Display2Frame(this);
		
		
		
		
		

		// update display panels
		display1.repaint();
		display2.repaint();
		
		// function to wait the given amount of milliseconds
		try{ Thread.sleep(500);
		}catch(InterruptedException ex){ Thread.currentThread().interrupt();}
	}
	//***********************************************
	
	
	
	
	///////////////////////////////////////////////////
	// You can write your functions and procedures here
	

	
	//***********************************************
	
	
	
	
	
	
	//////////////////////////////////////////////////
	// main program (do not edit this)
	public static void main(String[] args) {
		Main main=new Main(); // create a Main object instance
	}
	//***********************************************
}
