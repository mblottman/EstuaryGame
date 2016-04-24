package stjonesestuary.view.gameviews;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewManager {
	protected static final String CARD_ANIMALVIEW =  "Card Animal Game View";
	protected static final String CARD_SEEDLINGVIEW = "Card Seedling Game View";    
	protected static final String CARD_RECYCLEVIEW = "Card Recycle Game View";
	protected static final String CARD_STJONESVIEW  = "Card St Jones Home Screen View";
    protected JPanel contentPane;
   	protected JFrame frame;
    
     
    
    public ViewManager(){
    	init();
    }
    
    private void init(){
    	this.makeFrame();
    	this.makeViews();
    	this.makeButtons();
    	this.getFrame().pack();
        this.getFrame().setVisible(true);
    }
    
    private void makeFrame(){
    	JFrame tempframe = new JFrame("Explore the St Jones Estuary!");
        tempframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempframe.setLocationRelativeTo(null);

    	JPanel temppane = new JPanel();
    	temppane.setLayout(new CardLayout(400,200));
    	
    	this.setContentPane(temppane);
    	this.setFrame(tempframe);
    	this.getFrame().add(this.getContentPane(), BorderLayout.CENTER);
    }
    
    private void makeViews(){
    	JPanel temppane = this.getContentPane();
    	
    	AnimalGameView av = new AnimalGameView(this);
    	SeedlingGameView sv = new SeedlingGameView(this);
    	RecycleGameView rv = new RecycleGameView(this);
    	MainGameView mv = new MainGameView(this);
    	
    	temppane.add(av, CARD_ANIMALVIEW);
    	temppane.add(sv, CARD_SEEDLINGVIEW);
    	temppane.add(rv, CARD_RECYCLEVIEW);
    	temppane.add(mv, CARD_STJONESVIEW);
    	
    	((CardLayout) temppane.getLayout()).show(temppane, CARD_STJONESVIEW);
    	temppane.setBackground(Color.cyan);
    	this.setContentPane(temppane);
    }
    
    private void makeButtons(){
    	final JPanel temppane = this.getContentPane();
    	final JFrame tempframe = this.getFrame();

    	JPanel buttonPanel = new JPanel();
    	final JButton backToMainButton = new JButton("return to main screen");
    	
    	
    	backToMainButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                CardLayout cardLayout = (CardLayout) temppane.getLayout();
                cardLayout.show(temppane, CARD_STJONESVIEW);
            	temppane.setBackground(Color.cyan);
            	// ***Stop run of each subgame controller
            }
        });
    	
    	buttonPanel.add(backToMainButton);
    	tempframe.add(buttonPanel, BorderLayout.PAGE_END);
    	this.setContentPane(temppane);
    	this.setFrame(tempframe);
    }
    
    
    public JPanel getContentPane() {
		return contentPane;
	}

	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
