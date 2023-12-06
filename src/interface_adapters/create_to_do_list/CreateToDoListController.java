package interface_adapters.create_to_do_list;

import use_cases.create_to_do_list.CreateToDoListInputBoundary;
import use_cases.create_to_do_list.CreateToDoListOutputBoundary;

public class CreateToDoListController {
    final CreateToDoListInputBoundary createToDoListInteractor;

    public CreateToDoListController(CreateToDoListInputBoundary createToDoListInteractor) {
        this.createToDoListInteractor = createToDoListInteractor;
    }

    public void execute(String listName) {
        createToDoListInteractor.execute(listName);
    }
}
