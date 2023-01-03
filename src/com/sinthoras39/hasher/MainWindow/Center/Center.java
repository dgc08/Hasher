package com.sinthoras39.hasher.MainWindow.Center;


import com.sinthoras39.hasher.MainWindow.MainFrame;

import java.awt.*;

public class Center {

    public static void initCenter() {
        Container barParent = new Container();
        barParent.setLayout(new GridLayout(1, 2));

        barParent.add(new Text());
        barParent.add(new LeftSite());

        MainFrame.mainPane.add(barParent, BorderLayout.CENTER);
    }




}
