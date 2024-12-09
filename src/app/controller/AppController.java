package app.controller;

import app.data.DataHandler;
import app.data.DataRepository;
import app.ui.UIOperator;

public class AppController {
    public void run() {
        DataRepository repository = new DataRepository();
        DataHandler handler = new DataHandler();
        UIOperator uiOperator = new UIOperator();
        uiOperator.getOutput(handler.formListOutput(repository.getData()));
        uiOperator.getOutput(handler.formOutput(repository.getData(), 2));
    }
}
