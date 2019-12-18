package com.company;

import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfWriter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.*;

public class CreateWindow extends Frame implements ActionListener {

    JButton jButton;
    JLabel textLabel;



    public void createWindow(){
        PersonalPrinter personalPrinter = new PersonalPrinter();
        personalPrinter.setCopies(3);
        //Create and set up the new window
        JFrame frame = new JFrame("simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        textLabel = new JLabel("I'm a Label in the window", SwingConstants.CENTER);
        textLabel.setPreferredSize(new Dimension(300,100));
        jButton = new JButton("Print");
        jButton.setBounds(500,300,100,300);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==jButton)  {
                    if(e.getSource()==jButton)  {
                        Document document = new Document();
                        try {
                            PdfWriter.getInstance(document, new FileOutputStream("PRINTAT.pdf"));
                        } catch (DocumentException ex) {
                            ex.printStackTrace();
                        } catch (FileNotFoundException ex) {
                            ex.printStackTrace();
                        }
                        document.open();
                        Font font = FontFactory.getFont(FontFactory.HELVETICA, 26, BaseColor.BLACK);
                        Chunk chunk = new Chunk(textLabel.getText(),font);
                        try {
                            document.add(chunk);
                        } catch (DocumentException ex) {
                            ex.printStackTrace();
                        }
                        document.close();
                    }
                }
            }
        });
        frame.getContentPane().add(textLabel,BorderLayout.CENTER);
        frame.getContentPane().add(jButton,BorderLayout.AFTER_LAST_LINE);


        //Display the window
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

