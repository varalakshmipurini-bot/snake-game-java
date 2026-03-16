package com.lacky.snakegame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame() {

        this.add(new GamePanel());
        this.setTitle("Snake Game - Lakhi");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}