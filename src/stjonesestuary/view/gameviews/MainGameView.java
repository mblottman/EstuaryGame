package stjonesestuary.view.gameviews;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class MainGameView extends JPanel{
	
	private ActionListener action;
	private ViewManager viewmgr;
	
	public MainGameView(ViewManager viewmgr){
		this.viewmgr = viewmgr;
		init();
	}
	
	private void init(){
		this.makeBackground();
		this.makeButtons();
	}
	
	
	private void makeBackground(){
//		try {
//	           BufferedImage backgroundImage = ImageIO.read(new File("imageBank/StJonesMain/StJonesMap.png"));
//	       } catch (IOException ex) {
//	           ex.printStackTrace(System.err);
//	       }
		
		JPanel temppane = this.getViewmgr().getContentPane();
		//temppane.setBackground(Color.cyan);
		this.getViewmgr().setContentPane(temppane);		
	}

	
	private void makeButtons(){
		final JPanel temppane = this.getViewmgr().getContentPane();
		final JFrame tempframe = this.getViewmgr().getFrame();
		final ViewManager tempviewmgr = this.getViewmgr();
		
		ImageIcon rIcon = new ImageIcon("imageBank/RecycleGame/applecore.png");
		ImageIcon sIcon = new ImageIcon("imageBank/SeedlingGame/seed.png");
		ImageIcon aIcon = new ImageIcon("imageBank/AnimalGame/mallard.png");		
		final JButton rButton = new JButton(rIcon);
		final JButton sButton = new JButton(sIcon);
		final JButton aButton = new JButton(aIcon);
		
		ActionListener tempaction = new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                if (ae.getSource() == rButton){
                	((CardLayout) temppane.getLayout()).show(temppane, ViewManager.CARD_RECYCLEVIEW);
                	//JLabel rBackgroundIcon = new JLabel( new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.PNG"));
                	//ImageIcon rBackgroundicon =  new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.PNG");
                	//temppane.setBackground(rBackgroundIcon);
                	//temppane.setBackground(Color.green);
                	//temppane.remove(sButton);
                	//temppane.remove(aButton);
                	//temppane.remove(rButton);
                	temppane.repaint();
                	System.out.println("recycle button pushed");
                	//tempviewmgr.getrView().repaint();//temppane.repaint();
                }
                else if (ae.getSource() == sButton){
                	((CardLayout) temppane.getLayout()).show(temppane, ViewManager.CARD_SEEDLINGVIEW);
                	//JLabel rBackgroundIcon = new JLabel( new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.PNG"));
                	//ImageIcon rBackgroundicon =  new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.PNG");
                	//temppane.setBackground(rBackgroundIcon);
                	System.out.println("seedling button pushed");
                	//temppane.setBackground(Color.magenta);
                	//temppane.remove(sButton);
                	//temppane.remove(aButton);
                	//temppane.remove(rButton);
                	temppane.repaint();

                }
                else if (ae.getSource() == aButton){
                	((CardLayout) temppane.getLayout()).show(temppane, ViewManager.CARD_ANIMALVIEW);
                	//JLabel rBackgroundIcon = new JLabel( new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.PNG"));
                	//ImageIcon rBackgroundicon =  new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.PNG");
                	//temppane.setBackground(rBackgroundIcon);
                	System.out.println("animal button pushed");
                	//temppane.remove(sButton);
                	//temppane.remove(aButton);
                	//temppane.remove(rButton);
                	//temppane.setBackground(Color.yellow);
                	temppane.repaint();

                } 
            }
        };
        
        this.setAction(tempaction);
        rButton.addActionListener(this.getAction());
        sButton.addActionListener(this.getAction());
        aButton.addActionListener(this.getAction());
        
        this.add(rButton);
        this.add(sButton);
        this.add(aButton);
        
		this.getViewmgr().setContentPane(temppane);
		this.getViewmgr().setFrame(tempframe);
    }
	
	
	private ViewManager getViewmgr() {
		return viewmgr;
	}

	private void setViewmgr(ViewManager viewmgr) {
		this.viewmgr = viewmgr;
	}
	
	private ActionListener getAction() {
		return action;
	}

	private void setAction(ActionListener action) {
		this.action = action;
	}

	
	
//	private static final long serialVersionUID = 1L;
//
//    JLabel recycleGameLabel = new JLabel(new ImageIcon("imageBank/ReycleGame/applecore.PNG"));
//    JLabel seedlingGameLabel = new JLabel(new ImageIcon("imageBank/SeedlingGame/seed.PNG"));
//    JLabel animalGameLabel = new JLabel(new ImageIcon("imageBank/AnimalGame/mallard.PNG"));
//    
//	public MainGameView(){
//		setTitle("EstuaryExplorer!");
//        setSize(1000, 500);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//	}
//	
//	public void render (){
//        setVisible(true);
//	}
//	
//	public void renderScreenItems(){
//		
//
//	}
//	/**
//	 * renderButtons() puts the initial buttons to go to the subgames on the board.
//	 * An ImageIcon is made using the appropriate icons in the image bank, a button is 
//	 * made from these ImageIcons, and they are displayed on the screen. 
//	 * ActionListeners are added to each button to listen to clicks. When a button is clicked
//	 * it takes the user to the appropriate subgame.
//	 */
//	
//	public void renderButtons(){
//		ImageIcon recycleButton = new ImageIcon("imageBank/RecycleGame/applecore.png");
//		ImageIcon seedlingButton = new ImageIcon("imageBank/SeedlingGame/seed.png");
//		ImageIcon animalButton = new ImageIcon("imageBank/AnimalGame/mallard.png");
//		
//		JButton rButton = new JButton(recycleButton);
//		JButton sButton = new JButton(seedlingButton);
//		JButton aButton = new JButton(animalButton);
//		
//		add(rButton);
//		add(sButton);
//		add(aButton);
//		
//		rButton.addActionListener(new ActionListener(){
//			public void actionPerformed (ActionEvent r){
//					setLayout(new BorderLayout());
//				    setContentPane(new JLabel(new ImageIcon("imageBank/RecycleGame/recycleGameBackGround.PNG")));
//				    setLayout(new FlowLayout());
//				    System.out.println("recycle background printed");
//
//			}
//		});
//		
//		sButton.addActionListener(new ActionListener(){
//			public void actionPerformed (ActionEvent s){
//					setLayout(new BorderLayout());
//					setContentPane(new JLabel(new ImageIcon("imageBank/SeedlingGame/seedlingGameBackground.png")));
//					System.out.println("seedling background printed");
//					setLayout(new FlowLayout());
//
//			}
//		});
//		
//		aButton.addActionListener(new ActionListener(){
//			public void actionPerformed (ActionEvent a){
//					setLayout(new BorderLayout());
//					setContentPane(new JLabel(new ImageIcon("imageBank/AnimalGame/animalgameBackground.png")));
//					setLayout(new FlowLayout());
//					System.out.println("animal abackground printed");
//			}
//		});
//
//	}
//	
//	/**
//	 * renderBackground() makes the background image the map of StJones.
//	 * 
//	 */
//	
//
//	public void renderBackground(){
//		setLayout(new BorderLayout());
//	    setContentPane(new JLabel(new ImageIcon("imageBank/StJonesMap.PNG")));
//	    setLayout(new FlowLayout());
//	    renderButtons();
//	    
//
//	}
//	
//	public void renderDialogueBox(){
//		
//	}

	

}
