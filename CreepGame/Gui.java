package CreepGame;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui {
	private static JFrame window = new JFrame("CrEEp");
   
    public static void openGUI() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); 
            }
        });
    }
    
    public static void repaint(){
    	window.repaint();
    }

    private static void createAndShowGUI() {
    	
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setMinimumSize(new Dimension(1000, 700));
       
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        PaintPanel paintPanel  = new PaintPanel();
        JPanel buttonPanel     = new JPanel();
        
        JButton button1 = new JButton("Card 1");
        button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActionHandler.buttonPressed(1);
			}
		});
        
    	JButton button2 = new JButton("Card 2");
    	button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActionHandler.buttonPressed(2);
			}
		});
    	
    	JButton button3 = new JButton("Card 3");
    	button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ActionHandler.buttonPressed(3);
			}
		});
    
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        
        mainPanel.add(paintPanel);
        mainPanel.add(buttonPanel);
        
        window.add(mainPanel);
        
        window.pack();
        window.setVisible(true);
        
    }
    class PaintPanel extends JPanel {
    	
    	private static final long serialVersionUID = 1L;
    	
    	static final int WINDOW_WIDTH    = 1000;
    	static final int WINDOW_HEIGHT   = 600;
    	static final int CARD_WIDTH      = 175;
    	static final int CARD_HEIGHT     = 224;
    	static final int BUTTON_WIDTH    = 150;
    	static final int BUTTON_HEIGHT   = 60;

        public PaintPanel() {
            setBorder(BorderFactory.createLineBorder(Color.black));
        }

        public Dimension getPreferredSize() {
            return new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT);
        }
    }
}

