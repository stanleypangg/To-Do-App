package app;

import interface_adapters.MainViewModel;
import interface_adapters.ViewManagerModel;
import view.MainView;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame application = new JFrame("To-Do List");
        application.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();

        JPanel views = new JPanel(cardLayout);
        application.add(views);

        ViewManagerModel viewManagerModel = new ViewManagerModel();

        MainViewModel mainViewModel = new MainViewModel();

        MainView mainView = new MainView(mainViewModel, viewManagerModel);
        views.add(mainView, mainView.getViewName());

        application.pack();
        application.setExtendedState(JFrame.MAXIMIZED_BOTH);
        application.setLocationRelativeTo(null);
        application.setVisible(true);
    }
}
