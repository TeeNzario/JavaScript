package program.program.file.hgjj;

import program.program.file.hgjj.helper.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
    public static void main(String[] args){
        //create frame
        JFrame frame = new JFrame("Harn gun jon jer");
        frame.setSize(640,480);
        frame.setLayout(null);

        //create input
        JTextField inpouTextField = new JTextField();
        inpouTextField.setBounds(20,20,500,60);
        frame.add(inpouTextField);

        //create output
        JLabel outputLabel = new JLabel();
        outputLabel.setBounds(20,100,500,60);
        frame.add(outputLabel);

        //create button
        JButton button = new JButton("OK");
        button.setBounds(20,160,250,60);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = inpouTextField.getText();
                outputLabel.setText(inputText);
            }
            
        });
        frame.add(button);

        //show
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
