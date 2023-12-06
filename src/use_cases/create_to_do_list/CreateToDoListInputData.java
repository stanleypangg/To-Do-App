package use_cases.create_to_do_list;

public class CreateToDoListInputData {
    private final String listName;

    public CreateToDoListInputData(String listName) {
        this.listName = listName;
    }

    public String getListName() {
        return listName;
    }
}
