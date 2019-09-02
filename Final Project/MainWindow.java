import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.EnumMap;

import javax.imageio.ImageIO;
import javax.swing.*;

// Bonus points: Create an icon (or find a public domain icon. Keep in mind federal Copyright law and TAMU's plagiarism policy and add it to the home screen window.
public class MainWindow extends JPanel{
  
  private final JFrame mainFrame = new JFrame(Config.APPLICATIONNAME);
  private final JDialog selectWorkout = new JDialog(mainFrame, "Select Workout");
  private final Workouts workouts;
  private final EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups;
  private JButton JBnum1 = new JButton("Upper Body Workout"); 
  private JButton JBnum2 = new JButton("Lower Body Workout"); 
  private JButton JBnum3 = new JButton("Whole Body Workout");
  
  void createIcon() {
	  //THIS FILE IS PUT IN THE DATA FOLDER
	  BufferedImage image = null;
	  try
      {
       image = ImageIO.read(new File("dumbbell.png"));
      }
      catch (Exception e)
      {
        e.printStackTrace();
        System.exit(1);
      }
	  ImageIcon imageIcon = new ImageIcon(image);
	  JLabel jLabel = new JLabel();
      jLabel.setIcon(imageIcon);
      mainFrame.setIconImage(image);
  }
  
  MainWindow(Workouts workouts, EnumMap<Config.MuscleGroup, ArrayList<Config.Muscle>> muscleGroups) {
    createIcon();
	
	this.muscleGroups = muscleGroups;
	this.workouts = workouts;
	
	mainFrame.setPreferredSize(new Dimension(600, 400));
	mainFrame.setLayout(new GridLayout(3,1));
	mainFrame.add(JBnum1); 
	mainFrame.add(JBnum2);
	mainFrame.add(JBnum3);
	
	JBnum1.addActionListener(new CustomActionListener());
	JBnum2.addActionListener(new CustomActionListener());
	JBnum3.addActionListener(new CustomActionListener());		

	launchHomeScreen();
  }
  
  //public enum MuscleGroup {UPPERBODY, LOWERBODY, WHOLEBODY} 
  
  //Making an Action Listener Class
  
  private class CustomActionListener implements ActionListener{
	  public void actionPerformed(ActionEvent e)
	  {
		String actionCommand = e.getActionCommand(); 
		if (actionCommand.equals("Upper Body Workout")) {
		  showWorkouts(muscleGroups.get(Config.MuscleGroup.UPPERBODY));
		}
		else if(actionCommand.equals("Lower Body Workout")) {
		  showWorkouts(muscleGroups.get(Config.MuscleGroup.LOWERBODY));
		}
		else if(actionCommand.equals("Whole Body Workout")) {
		  showWorkouts(muscleGroups.get(Config.MuscleGroup.WHOLEBODY));
		} 
	  }
  }
	  
  private void launchHomeScreen() {
	  mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  mainFrame.pack();
	  mainFrame.setVisible(true);

  }
  
  // This is the method your actionlistener should call. It should create and display a WorkoutsPanel.
  private void showWorkouts(ArrayList<Config.Muscle> muscles) {
    WorkoutsPanel panel = new WorkoutsPanel(muscles,workouts);
    mainFrame.remove(JBnum1);
    mainFrame.remove(JBnum2);
    mainFrame.remove(JBnum3);
    
    mainFrame.add(panel);
    mainFrame.setLayout(new GridLayout(1,1));
    mainFrame.setVisible(true);
  // Code goes here.
  }

}
