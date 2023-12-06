package interface_adapters.add_task;

import use_cases.add_task.AddTaskInputBoundary;

public class AddTaskController {
    final AddTaskInputBoundary createTaskInteractor;

    public AddTaskController(AddTaskInputBoundary createTaskInteractor) {
        this.createTaskInteractor = createTaskInteractor;
    }

    public void execute() {
        createTaskInteractor.execute();
    }
}
