package WarGame_final_class_Project_Sadik_M;

import javax.swing.*;

/**
 * Created by sadik
 * mussah on 4/24/14.
 * final class project
 */
public class WarDrive extends WarPlan{
    public static void main(String[] args) {
        WarPlan plan = new WarPlan();// warplan class inst

       plan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        plan.setSize(1020, 780);//main window size
        plan.setVisible(true);//
//plan.pack();



    }
}
