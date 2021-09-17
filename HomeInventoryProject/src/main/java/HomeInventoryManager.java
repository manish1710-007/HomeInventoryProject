/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeinventory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author manish
 */
public class HomeInventory extends JFrame {
    
      public static void main(String[] args) {
        new HomeInventory().show();
    }
    public HomeInventory(){
        setTitle("Home Inventory Management");
        setResizable(true);
        setVisible(true);
       
        addWindowListener(new WindowAdapter(){
           
            public void windowClosing(WindowEvent evt){
                exitForm(evt);
            }
        });
       
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints;
       
        pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(20,500);
       
       //Create Tool Bar
        JToolBar inventoryToolBar = new JToolBar();
       
       // ImageIcon newIcon = new ImageIcon("new.png");
        JButton newButton = new JButton(new ImageIcon("new.png"));
        add(newButton);
       
        ImageIcon deleteIcon = new ImageIcon("delete.png");
        JButton deleteButton = new JButton("delete",deleteIcon);
        add(deleteButton);
       
        ImageIcon saveIcon = new ImageIcon("save.png");
        JButton saveButton = new JButton("save",saveIcon);
        add(saveButton);
       
        ImageIcon previousIcon = new ImageIcon("previous.png");
        JButton previousButton = new JButton("previous",previousIcon);
        add(previousButton);
       
        ImageIcon nextIcon = new ImageIcon("next.png");
        JButton nextButton = new JButton("next",nextIcon);
        add(nextButton);
       
        ImageIcon printIcon = new ImageIcon("print.png");
        JButton printButton = new JButton("print",printIcon);
        add(printButton);
       
        JButton exitButton = new JButton("exit");
        add(exitButton);
       
        //set our buttons in Tool bar
        inventoryToolBar.setFloatable(false);
        inventoryToolBar.setBackground(Color.BLUE);
        inventoryToolBar.setOrientation(SwingConstants.VERTICAL);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridheight = 8;
        gridConstraints.fill = GridBagConstraints.VERTICAL;
        getContentPane().add(inventoryToolBar,gridConstraints);
        inventoryToolBar.addSeparator();
       
        //adding buttons in tool bar
       
        Dimension bSize = new Dimension(70,50);
        sizeButton(newButton,bSize);
        newButton.setToolTipText("Add New Item");
        newButton.setHorizontalTextPosition(SwingConstants.CENTER);
        newButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        inventoryToolBar.add(newButton);
       
        newButton.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                newButtonActionPerformed(e);
            }
        });
       
       
        sizeButton(deleteButton,bSize);
        deleteButton.setToolTipText("Delete Current Item");
        deleteButton.setHorizontalTextPosition(SwingConstants.CENTER);
        deleteButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        inventoryToolBar.add(deleteButton);
       
        deleteButton.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteButtonActionPerformed(e);
            }
        });
        sizeButton(saveButton,bSize);
        saveButton.setToolTipText("Save Current Item");
        saveButton.setHorizontalTextPosition(SwingConstants.CENTER);
        saveButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        inventoryToolBar.add(saveButton);
       
        saveButton.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                saveButtonActionPerformed(e);
            }
        });
       
        inventoryToolBar.addSeparator();
       
        sizeButton(previousButton,bSize);
        previousButton.setToolTipText("Display Previous Item");
        previousButton.setHorizontalTextPosition(SwingConstants.CENTER);
        previousButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        inventoryToolBar.add(previousButton);
       
        previousButton.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                previousButtonActionPerforment(e);
            }
        });
       
       
        sizeButton(nextButton,bSize);
        nextButton.setToolTipText("Display Next Item");
        nextButton.setHorizontalTextPosition(SwingConstants.CENTER);
        nextButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        inventoryToolBar.add(nextButton);
       
        nextButton.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
                nextButtonActionPerforment(e);
            }
        });
       
        inventoryToolBar.addSeparator();
       
        sizeButton(printButton,bSize);
        printButton.setToolTipText("Print Inventory List");
        printButton.setHorizontalTextPosition(SwingConstants.CENTER);
        printButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        inventoryToolBar.add(printButton);
       
        printButton.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
              printButtonActionPerformed(e);
            }
        });
       
        sizeButton(exitButton,bSize);
        exitButton.setToolTipText("Exit Program");
        inventoryToolBar.add(exitButton);
       
        exitButton.addActionListener(new ActionListener(){
 
            @Override
            public void actionPerformed(ActionEvent e) {
             exitButtonActionPerformed(e);
            }
        });
       
    }
    private void exitForm(WindowEvent evt) {
                System.exit(0);
   }
 
    private void sizeButton(JButton b, Dimension d) {
        b.setPreferredSize(d);
        b.setMinimumSize(d);
        b.setMaximumSize(d);
    }
     private void newButtonActionPerformed(ActionEvent e) {
               
   }
   
    private void deleteButtonActionPerformed(ActionEvent e) {
       
     }
   
    private void saveButtonActionPerformed(ActionEvent e) {
       
    }
     private void previousButtonActionPerforment(ActionEvent e) {
             
    }
     private void nextButtonActionPerforment(ActionEvent e) {
             
   }
   
   private void printButtonActionPerformed(ActionEvent e) {
     
   }
   
   private void exitButtonActionPerformed(ActionEvent e) {
     
  }
       
}
