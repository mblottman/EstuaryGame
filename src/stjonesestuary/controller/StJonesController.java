package stjonesestuary.controller;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.sun.medialib.mlib.Image;

import stjonesestuary.view.gameviews.MainGameView;

public class StJonesController extends JFrame implements MouseListener, MouseMotionListener,ActionListener{
	protected JButton sButton, rButton, aButton;
	private RecycleGameController recyclecontrol;
	private SeedlingGameController seedlingcontrol;
	private AnimalGameController animalcontrol;
	private BufferedImage backgroundImage;
	
	
	// added
	//private CardLayout cardlayout = new CardLayout();
	//private JPanel cardHolder = new JPanel(cardlayout);
	
	
	
	JFrame frame = new JFrame("Estuary Game");

//	JPanel panelCont = new JPanel();
//    JPanel panel1 = new JPanel(),
//	//JPanel panel2 = new JPanel(){};
//
//    rButton = new JButton("switch to recycle game"),
//	sButton = new JButton("switch to seedling game");
	
	private CardLayout cardlayout = new CardLayout(){};
	// adding
	JPanel cards;

	
	// adding
	public StJonesController(){
		////VIDEO
//		panelCont.setLayout(cardlayout);
//		
//		panel1.add(rButton);
//		
//		
//		panel2.add(sButton);
//		
//		panel1.setBackground(Color.GREEN);
//		
//		panelCont.add(panel1, "1");
//		panelCont.add(panel2, "2");
//		
//		cardlayout.show(panelCont,"1");
//		
//		rButton.addActionListener(this);
//		sButton.addActionListener(this);
//		
//		frame.add(panelCont);
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//		frame.pack();
//		frame.setVisible(true);
		
//		///// REALLY NEW
//		JFrame frame = new JFrame("Card Layout Test");
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setLocationRelativeTo(null);
//        final JPanel contentPane = new JPanel();
//        contentPane.setLayout(new CardLayout(20, 20));
//		
//        JPanel buttonPanel = new JPanel(); 
//		
//        ImageIcon recycleButton = new ImageIcon("imageBank/RecycleGame/applecore.png");
//		ImageIcon seedlingButton = new ImageIcon("imageBank/SeedlingGame/seed.png");
//		ImageIcon animalButton = new ImageIcon("imageBank/AnimalGame/mallard.png");
//		rButton = new JButton(recycleButton);
//		sButton = new JButton(seedlingButton);
//		aButton = new JButton(animalButton);
//
//		rButton.addActionListener(this);
//		sButton.addActionListener(this);
//		aButton.addActionListener(this);
//		
//		buttonPanel.add(rButton);
//		buttonPanel.add(sButton);
//		buttonPanel.add(aButton);
//		
//        frame.add(contentPane, BorderLayout.CENTER);
//        frame.add(buttonPanel, BorderLayout.PAGE_END);
//
//        frame.pack();
//        frame.setVisible(true);
		
		
		JLabel cardLabel1 = new JLabel("", SwingConstants.RIGHT);
		JLabel cardLabel2 = new JLabel("card 2", SwingConstants.CENTER);
		JLabel cardLabel3 = new JLabel("card 3", SwingConstants.CENTER);
        //cardHolder.add(cardLabel1, "recycle");
        //cardHolder.add(cardLabel2, "seedling");
        //cardHolder.add(cardLabel3, "animal");

        setLayout(new BorderLayout());
        //add(cardHolder, BorderLayout.CENTER);

		
		//setLayout(new FlowLayout()); //Use this for now.
        setSize(810, 510); //Set the size of the JFrame
        setTitle("Estuary Game"); //Put Title on top of JFrame
        //setBackground(Color.yellow);
        //setResizable(false);

        
        ImageIcon recycleButton = new ImageIcon("imageBank/RecycleGame/applecore.png");
		ImageIcon seedlingButton = new ImageIcon("imageBank/SeedlingGame/seed.png");
		ImageIcon animalButton = new ImageIcon("imageBank/AnimalGame/mallard.png");
		rButton = new JButton(recycleButton);
		sButton = new JButton(seedlingButton);
		aButton = new JButton(animalButton);

        rButton.addActionListener(this);
        sButton.addActionListener(this);
        aButton.addActionListener(this);    

        
        // ADDED
        try {
            backgroundImage = ImageIO.read(new File("imageBank/StJonesMain/StJonesMap.png"));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        
        //Create the cards
        JPanel card1 = new JPanel();
        
        card1.add(rButton);

        //JPanel card2 = new JPanel();
        card1.add(sButton);

        //JPanel card3 = new JPanel();
        card1.add(aButton);

        //Create the panel that contains the "cards".

        cards = new JPanel(new CardLayout());

        cards.add(card1,"card 1");
        //cards.add(card2,"card 2");
       // cards.add(card3,"card 3");
        add(cards, BorderLayout.SOUTH);
        getContentPane().add(cards); 
        cards.setVisible(true);
        //cards.setOpaque(false);
        setVisible(true); //Make JFrame visible
        repaint();
	}
	
	
    public void paint(Graphics g) {
    	super.paint(g);
    	//Graphics2D g2d = (Graphics2D) g.create();
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
    }
	
	// ADDED
//	private JPanel createRecyclePanel(){
//		
//		return 
//	}
	
	
	
	// ADDED
    public void actionPerformed (ActionEvent e)
    {    
        if (e.getSource() == rButton){    
        	System.out.print("Recycle Button Clicked ");
        	//CardLayout cardLayout = (CardLayout) cards.getLayout();
        	//cardLayout.show(cards, "card 1");
        	//cardLayout.next(cards);
        	recyclecontrol = new RecycleGameController();
        	//cardlayout.show(panelCont,"2");
        }
        if (e.getSource() == sButton){    
        	System.out.print("Seedling Button Clicked ");
        	//CardLayout cardLayout = (CardLayout) cards.getLayout();
        	//cardLayout.show(cards, "card 2");
        	//seedlingcontrol = new SeedlingGameController();
        	//cardlayout.show(panelCont,"1");
        }
        if (e.getSource() == aButton){    
        	System.out.print("Animal Button Clicked ");
        	//CardLayout cardLayout = (CardLayout) cards.getLayout();
        	//cardLayout.show(cards, "card 3");
        	//animalcontrol = new AnimalGameController();
        }
    }
    
    
	public void run(){
		//will save current main game 
		
	}
	
	
	
	
	
	
	
	/**
	 * Will pull up the start up screen 
	 * @param args
	 * @throws InterruptedException 
	 */
	
	public static void main(String[] args) throws InterruptedException{
		//init main game
		//wait for signal from main game to tell it what game to play
		//run the specific game controller dependent on that
		//wait for a new game		
		
		StJonesController game = new StJonesController();

//		JFrame frame = new JFrame("Testing");
//        frame.setContentPane(game);
		// NEED game.window = new MainGameView();
		// NEED game.recyclecontrol = new RecycleGameController(game.window);
		
		//game.seedlingcontrol = new SeedlingGameController(game.window);
		//game.animalcontrol = new AnimalGameController(game.window);
		//game.window.render();
		//game.window.render();
		
		// NEEEd game.renderButtons();//*/
		
		
		//game.recyclecontrol.run();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
//	public void renderButtons(){
//		ImageIcon recycleButton = new ImageIcon("imageBank/RecycleGame/applecore.png");
//		ImageIcon seedlingButton = new ImageIcon("imageBank/SeedlingGame/seed.png");
//		ImageIcon animalButton = new ImageIcon("imageBank/AnimalGame/mallard.png");
//		final StJonesController game = this;
//		rButton = new JButton(recycleButton);
//		sButton = new JButton(seedlingButton);
//		aButton = new JButton(animalButton);
//		game.window.setLayout(new FlowLayout());	  
//		rButton.addActionListener(new ActionListener(){
//			public void actionPerformed(ActionEvent e) {
//				Thread thread = new Thread() {
//			        public void run() {
//			        	game.recyclecontrol.run();			        }
//			    };
//			    thread.start();
//			}
//		}
//		);
//		sButton.addActionListener(this);
//		aButton.addActionListener(this);
//		
//		sButton.setActionCommand("seedling");
//		aButton.setActionCommand("animal");
//		
//		window.add(rButton);
//		window.add(sButton);
//		window.add(aButton);	
//		window.setVisible(true);
//	}
}

