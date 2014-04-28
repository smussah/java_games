/**
 * Created by sadik
 * mussah on 4/22/14.
 * final class project
 */
package WarGame_final_class_Project_Sadik_M;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class WarPlan extends JFrame {
    //following lines hold panel objects
    private JPanel sadik_panel, computer_panel,
            topcontianer, middlePanel,
            topPane, bottomContianer, scorePanel, displayScoreContianer1,
            displayScoreContianer2, imagpan;
//hold label objects
    private JLabel sadik, computer, label,
            generalInf;

    private JTextArea sadik_Scores, computer_Scores, winner1S, winner2C, lastwinnerS, lastwinnerC;//hold text area object
    private JButton play, exit, startNew, changeB;//hold button objects
    private Container panes = null;
    private Color c = new Color(119, 175, 26);//hold main panels color
    private ActionEvent act = null;


    /**
     *these line creates lists from cardGame class for both players
     */
    List<CardGame> deck = null;
    LinkedList<CardGame> Sadiks_Cards = null;
    LinkedList<CardGame> Computers_Cards = null;
// main constructor
    public WarPlan() {
        super("War plan game!");//hold main window title
        setLayout(new BorderLayout());//main window layout
        this.setContentPane(new JLabel(new ImageIcon("")));//

        this.setLocationRelativeTo(null);
        setLayout(new FlowLayout());

//following lines call setter
        setButtons();
        setLabels();

        setSadikPanel();
        setMiddlePanel();
        setComputerPanel();
        //sadik_Scores = new JTextArea();
        this.getContentPane().add(imagpan);
        setDisplayScoreContianer1();
        setDisplayScoreContianer2();

        setTopPane();


//contianers
        //sadik_Scores = new JTextArea("____");

        topcontianer = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        topcontianer.add(sadik_panel, BorderLayout.LINE_START);
        topcontianer.add(middlePanel, BorderLayout.CENTER);
        topcontianer.add(computer_panel, BorderLayout.LINE_END);

        topcontianer.setLayout(new GridLayout());
        this.getContentPane().add(topcontianer, BorderLayout.CENTER);
        //setTextAreas();
        setScorePanel();
        setBottomcontainer();
        this.getContentPane().add(changeB, BorderLayout.PAGE_END);
/**
 *
 */



        /**
         * loops
         */
//public  void Loop() {
        // butNext ();
        Color textbackground =middlePanel.getBackground();
       // sadik_Scores = new JTextArea();

    }

    //public void setTextAreas(){
        //sadik_Scores = new JTextArea();
      //  computer_Scores = new JTextArea();

   // }

    // button setter method
    public void setButtons() {

        play = new JButton("Play");
        exit = new JButton("Quit");
        exit.setFont(new Font("default", Font.BOLD, 22));
        startNew = new JButton("Start New Game");
        startNew.setFont(new Font("default", Font.BOLD, 22));
        play.setFont(new Font("default", Font.BOLD, 22));
        play.setPreferredSize(new Dimension(160, 50));
        //new game button

play.addActionListener(new ButtonListener());
       startNew.setPreferredSize(new Dimension(160, 50));
        startNew.addActionListener(new ButtonListener());
        //eixt button
        JTabbedPane pane = new JTabbedPane();


        String label = "Tab Label";
        pane.addTab(label, exit);
        exit.setPreferredSize(new Dimension(160, 50));
     exit.addActionListener(new ButtonListener());
        changeB = new JButton("Change Background");
      // changeB .setBorder(BorderFactory.createLineBorder(Color.RED, 2));
       // changeB.setBackground(Color.black);
        changeB.setPreferredSize(new Dimension(170, 50));
       changeB .setFont(new Font("default", Font.BOLD, 15));
        changeB.addActionListener(new ButtonListener());
        imagpan = new JPanel(new FlowLayout(FlowLayout.LEFT));
      //imagpan = new JPanel(new FlowLayout(FlowLayout.TRAILING, 0, 0));
        imagpan.setPreferredSize(new Dimension(150, 100));
  imagpan.add(new JLabel(new ImageIcon("to1.gif")), LEFT_ALIGNMENT);
        this.add(imagpan, java.awt.BorderLayout.CENTER);
       // imagpan.setBackground();


    }

    /**
     * Label setter method
     */

    public void setLabels() {

        sadik = new JLabel("          Sadik");
        generalInf = new JLabel("       Display Board");
        computer = new JLabel("           Computer");


       computer.setFont(new Font("default", Font.BOLD, 20));
        generalInf.setFont(new Font("default", Font.BOLD, 20));
        sadik.setFont(new Font("default", Font.BOLD, 20));
       sadik. setBorder(BorderFactory.createLineBorder(Color.RED,2));
      computer.  setBorder(BorderFactory.createLineBorder(Color.RED,2));

    }

    /**
     * middle panel method
     */
    public void setMiddlePanel() {
        middlePanel = new JPanel();
        middlePanel.setPreferredSize(new Dimension(320, 380));
        winner1S = new JTextArea("");
        middlePanel.add(winner1S);
        winner2C = new JTextArea("");
        middlePanel.add(winner2C);

        lastwinnerC = new JTextArea("");
        middlePanel.add(lastwinnerC);
        lastwinnerC.setForeground(Color.BLUE);
        lastwinnerC.setFont(new Font("default", Font.BOLD, 20));
        lastwinnerS = new JTextArea("");
        lastwinnerS.setForeground(Color.BLUE);
        middlePanel.add(lastwinnerS);
        lastwinnerS.setFont(new Font("default", Font.BOLD, 20));


        middlePanel.setBackground(c);
        middlePanel.setBorder(BorderFactory.createLineBorder(c,2));
        winner1S.setFont(new Font("default", Font.BOLD, 15));
        winner2C.setFont(new Font("default", Font.BOLD, 14));
        winner1S.setForeground(Color.BLUE);


    }


    /**
     * computer panel/container
     *
     */
    public void setComputerPanel(){
        computer_panel = new JPanel();
        computer_panel .setPreferredSize(new Dimension(320, 380));
       computer_Scores = new JTextArea("");
       computer_Scores.setFont(new Font("default", Font.BOLD, 14));
        computer_panel.add(computer_Scores);
        computer_panel. setVisible(true);
        computer_panel .setBackground(c);
        computer_panel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));
        //computer_panel.setBorder(BorderFactory.createLineBorder(Color.black, 6));


    }


    /**
     * Sadik's Panel
     *
     */
    public void setSadikPanel() {
        sadik_panel = new JPanel();
        sadik_panel.setPreferredSize(new Dimension(320, 380));


        winner2C = new JTextArea("");


        sadik_Scores = new JTextArea("");
        sadik_Scores.setFont(new Font("default", Font.BOLD, 14));
      // sadik_panel. add(sadik_Scores);
        sadik_panel.setBackground(c);
       // sadik_panel.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
       sadik_panel.setBorder(BorderFactory.createLineBorder(Color.RED, 3));


    }

    /**
     * score display panel method
     */
    public void setScorePanel(){
        scorePanel = new JPanel(new FlowLayout(FlowLayout.TRAILING, 0, 0));
      scorePanel.setPreferredSize(new Dimension(960, 30));
        scorePanel.setBackground(c);

        scorePanel.add(displayScoreContianer1, BorderLayout.LINE_END);
        scorePanel.add(play, BorderLayout.CENTER);
        scorePanel.add(displayScoreContianer2, BorderLayout.LINE_END);

        scorePanel.setLayout(new GridLayout());
        this.getContentPane().add(scorePanel, BorderLayout.AFTER_LINE_ENDS);

    }
    public void setBottomcontainer(){
        bottomContianer = new JPanel(new FlowLayout(FlowLayout.TRAILING, 0, 0));
        bottomContianer.setPreferredSize(new Dimension(960, 80));
        bottomContianer.setBackground(c);
        bottomContianer.add(exit, BorderLayout.PAGE_START);

        bottomContianer.add(startNew,BorderLayout.PAGE_END);
        bottomContianer.setLayout(new GridLayout());
        this.getContentPane().add(bottomContianer, BorderLayout.PAGE_END);
    }
    public void setTopPane(){
        //imagpan = new JPanel();//(new FlowLayout(FlowLayout.CENTER,0,0));
        topPane = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));

        topPane.setLayout(new BoxLayout(topPane, BoxLayout.X_AXIS));

        topPane.setPreferredSize(new Dimension(960, 50));
       //imagpan .setPreferredSize(new Dimension(960, 50));
        topPane.setBackground(c);
       //topPane.setLayout(new GridLayout());
        topPane.setLayout(new GridLayout(1, 1, 1, 1));

        topPane.add(sadik, BorderLayout.LINE_START);
        topPane.add(generalInf, BorderLayout.CENTER);
       topPane .add(computer, BorderLayout.LINE_END);

        this.getContentPane().add(topPane, BorderLayout.PAGE_START);

    }

    public void setDisplayScoreContianer1() {
        displayScoreContianer1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        displayScoreContianer1.setPreferredSize(new Dimension(150, 14));
        displayScoreContianer1.setBackground(c);
        displayScoreContianer1.setBorder(BorderFactory.createLineBorder(Color.RED,2));
    }
    public void setDisplayScoreContianer2() {
        displayScoreContianer2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        displayScoreContianer2.setPreferredSize(new Dimension(260, 20));
        displayScoreContianer2.setBackground(c);
       displayScoreContianer2.setAlignmentX(Component.LEFT_ALIGNMENT);
       displayScoreContianer2.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
    }

    /**
     * Action listener class
     */
    public class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == exit) {
                String display = " Are you sure you want to Quit ? ";
                String title = "Quit";
                int reply = JOptionPane.showConfirmDialog(null, display, title, JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION)
                {

                    System.exit(0);
                }
            }

            if (e.getSource() == changeB) {
                imagpan.setBackground(c);

                setBackground(c);
            }
            if(e.getSource() == startNew){
                middlePanel.add(new JLabel(new ImageIcon("")));
               middlePanel.add(new JLabel(new ImageIcon("walking.gif")));
            }


            if(e.getSource() == play){

                deck = new ArrayList<CardGame>();

                for (int index1 = 0; index1 < 4; index1++) {
                    for (int index2 = 2; index2 < 15; index2++) {
                        deck.add(new CardGame(index1, index2));
                    }
                }

                /**
                 *
                 */


                Collections.shuffle(deck, new Random(System.nanoTime()));

                Sadiks_Cards = new LinkedList<CardGame>();
                Sadiks_Cards.addAll(deck.subList(0, 25));
                //System.out.println(Sadiks_Cards+ "tes________");
                Computers_Cards = new LinkedList<CardGame>();
                Computers_Cards.addAll(deck.subList(26, deck.size()));




                    CardGame sadik_hand = Sadiks_Cards.pop();
                    CardGame computer_hand = Computers_Cards.pop();


                sadik_Scores.setText(("Sadik" + sadik_hand.toString()));
                    sadik_Scores.removeAll();
                sadik_Scores.setBackground(c);
                displayScoreContianer1.add(sadik_Scores);

                  String p =  sadik_hand.toString().replaceAll("\\s+", "");
                sadik_panel.removeAll();
                 sadik_panel.add(new JLabel(new ImageIcon("cardPics/" + p + ".jpg")));

                  computer_Scores.setText("Computer " + computer_hand.toString());
                computer_Scores.setBackground(c);
                computer_Scores.removeAll();
                displayScoreContianer2.add(computer_Scores);


                    //this line strips white spaces for string in oder to match pic name
                    String co =  computer_hand.toString().replaceAll("\\s+", "");
                computer_panel.removeAll();
                    computer_panel.add( new JLabel(new ImageIcon("cardPics/"+co+".jpg")));


                if (sadik_hand.getCardS() > computer_hand.getCardS()) {
                        Sadiks_Cards.addLast(computer_hand);
                        Sadiks_Cards.addLast(sadik_hand);
                    } else if (sadik_hand.getCardS() < computer_hand.getCardS()) {
                        Computers_Cards.addLast(computer_hand);
                        Computers_Cards.addLast(sadik_hand);
                    } else {
                        //("Battle Plan");
                        List<CardGame> sadiks_battle = new ArrayList<CardGame>();
                        List<CardGame> computers_battle = new ArrayList<CardGame>();
                        for (int i = 0; i < 3; i++) {
                            if (Sadiks_Cards.size() == 0 || Computers_Cards.size() == 0) {
                                break;
                            }
                            sadiks_battle.add(Sadiks_Cards.pop());
                            computers_battle.add(Computers_Cards.pop());
                        }
                       // sadik_Scores = new JTextArea();
                        winner1S.setText("Sadik's battle ground: " + sadiks_battle.get(0).toString());
                    winner1S.setBackground(c);
                    middlePanel.add(winner1S);


                    winner2C.setText("Computer's battle ground: " + computers_battle.get(0).toString());
                    winner2C.setBackground(c);
                    middlePanel.add(winner2C);
                        if (sadiks_battle.get(0).getCardS() > computers_battle.get(0).getCardS()) {
                            Sadiks_Cards.addAll(computers_battle);
                            Sadiks_Cards.addAll(sadiks_battle);
                          lastwinnerS.setText("Sadik won");
                            middlePanel.add(lastwinnerS);
                        } else {
                            Computers_Cards.addAll(computers_battle);
                            Computers_Cards.addAll(sadiks_battle);
                            System.out.println("Computer won");

                        }
                    }
                System.out.println("______i"+Sadiks_Cards.size());
                    if (Sadiks_Cards.size() == 0) {

                        String sadik = "Sadik has won the battle (-_-)";
                        lastwinnerS.setText(sadik);
                        middlePanel.add(lastwinnerS);


                    } else if (Computers_Cards.size() == 0) {

                      winner1S.setText("Computer has won the battle :(");
                       // winner1S.removeAll();
                        middlePanel.add(winner1S);



                    }




            }

            }

        }
    }


