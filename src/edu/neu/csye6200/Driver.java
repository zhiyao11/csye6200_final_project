package edu.neu.csye6200;

import edu.neu.csye6200.controller.GenerateMainJFrame;
import edu.neu.csye6200.view.*;

public class Driver {
    public static void main(String[] args) {
        /**
         * running the whole project
         */
        GenerateMainJFrame frame = new GenerateMainJFrame();
        frame.init(new ParentPage());//test the view of page
    }
}
