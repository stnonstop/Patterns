package com.gg.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * User: adurmaz
 * Date: 4/27/13
 * Time: 11:17 AM
 */
public class ProgramlanaBilirMenu extends JFrame {

    public ProgramlanaBilirMenu(int rows){
        setSize(200,300);
        setLayout(new GridLayout(rows,1));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public ProgramlanaBilirMenu addSiparisKomutu(final SiparisKomutu komut) {
        JButton btn = new JButton();
        btn.setText(komut.name());
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                komut.execute();
            }
        });
        add(btn);
        return this;
    }


    public static void main(String...strings){
        ProgramlanaBilirMenu menu = new ProgramlanaBilirMenu(2);
        //Chain için this i döndür...
        menu.addSiparisKomutu(new TarhanaSiparis())
            .addSiparisKomutu(new MantiSiparisi())
            .setVisible(true);
    }


}
