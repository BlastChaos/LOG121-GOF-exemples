package Strategie.LayoutManager;

import javax.swing.*;
// référence: Cay Horstmann chapitre 5

public class FormLayoutDemo
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      frame.setLayout(new FormLayout());
      frame.add(new JLabel("Name"));
      frame.add(new JTextField(15));
      frame.add(new JLabel("Address"));
      frame.add(new JTextField(20));
      frame.add(new JLabel("City"));
      frame.add(new JTextField(10));
      frame.add(new JLabel("State"));
      frame.add(new JTextField(2));
      frame.add(new JLabel("ZIP"));
      frame.add(new JTextField(5));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);
   }
}



