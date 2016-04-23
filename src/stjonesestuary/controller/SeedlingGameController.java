package stjonesestuary.controller;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Timer;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.sun.java.swing.plaf.windows.resources.windows;

import stjonesestuary.model.screenitems.ScreenItem;
import stjonesestuary.view.gameviews.MainGameView;
import stjonesestuary.view.gameviews.SeedlingGameView;
import stjonesestuary.view.gameviews.Viewable;


public class SeedlingGameController extends JFrame implements MouseListener, MouseMotionListener {
	private SeedlingGameView view;
	private MainGameView window;
	private BufferedImage backgroundImage;
	// added
	private CardLayout cardlayout = new CardLayout();
	private JPanel cardHolder = new JPanel(cardlayout);
	JPanel cards;
	
//	public SeedlingGameController(MainGameView window){
//		this.window = window;
//	}
	
	
	
	public SeedlingGameController(){
		JLabel cardLabel1 = new JLabel("Seedling Game", SwingConstants.CENTER);
		cardHolder.add(cardLabel1, "seedling");
        setLayout(new BorderLayout());
        add(cardHolder, BorderLayout.CENTER);

        setSize(810, 510); //Set the size of the JFrame
        setTitle("Estuary Game"); //Put Title on top of JFrame

        // ADDED
        try {
            backgroundImage = ImageIO.read(new File("imageBank/SeedlingGame/seedlingGameBackGround.png"));
        } catch (IOException ex) {
            ex.printStackTrace(System.err);
        }
        
        cards = new JPanel(new CardLayout());
        add(cards, BorderLayout.SOUTH);
        getContentPane().add(cards); 
        cards.setVisible(true);

        setVisible(true); //Make JFrame visible
        repaint();
	}
	
	
    public void paint(Graphics g) {
    	super.paint(g);
    	//Graphics2D g2d = (Graphics2D) g.create();
        g.drawImage(backgroundImage, 0, 0, this.getWidth(), this.getHeight(), null);
    }
	
	
	
	
	
	
	
	public void run(){
		//new instance of timer
		//user timer to call onTick()
		//render
		ArrayList<ScreenItem> screenitems = new ArrayList<ScreenItem>();
		view = new SeedlingGameView(window);
		view.render(screenitems);
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

}
