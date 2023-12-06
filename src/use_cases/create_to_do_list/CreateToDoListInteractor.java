package use_cases.create_to_do_list;

public class CreateToDoListInteractor implements CreateToDoListInputBoundary {
    @Override
    public void execute(String listName) {
        CreateToDoListInputData createToDoListInputData =
                new CreateToDoListInputData(listName);

    }
}
