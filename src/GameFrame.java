import javax.swing.JFrame;

public class GameFrame extends JFrame {
	
	GameFrame(){
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); //will take our JFrame and fit it snugly around all of the components that we add to the frame
		this.setVisible(true);
		this.setLocationRelativeTo(null);//To put our window in the center of the screen
	}

}
