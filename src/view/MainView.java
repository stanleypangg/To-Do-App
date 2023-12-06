package view;

import interface_adapters.MainViewModel;
import interface_adapters.ViewManagerModel;

import javax.swing.*;

public class MainView extends JPanel {
    public final String viewName = "Main Menu";
    private final MainViewModel mainViewModel;
    private ViewManagerModel viewManagerModel;

    public MainView(MainViewModel mainViewModel, ViewManagerModel viewManagerModel) {
        this.mainViewModel = mainViewModel;
        this.viewManagerModel = viewManagerModel;
    }

    public String getViewName() {
        return viewName;
    }
}
