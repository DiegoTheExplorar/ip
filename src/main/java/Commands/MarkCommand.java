package Commands;

import Main.Storage;
import Main.Ui;
import Tasks.Task;
import Tasks.TaskList;

/**
 * Represents a command to mark a task as done in the task list.
 */
public class MarkCommand implements Command {
    private int index;

    /**
     * Constructs a new MarkCommand.
     *
     * @param index The index of the task to be marked as done.
     */
    public MarkCommand(int index) {
        this.index = index;
    }

    /**
     * Executes the command to mark a task as done in the task list.
     *
     * @param tasks   The task list containing the task to be marked.
     * @param ui      The UI component that handles user interaction.
     * @param storage The storage component to save the task list.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        Task task = tasks.get(index);
        task.mark();
        storage.save(tasks);
        return ui.showTaskMarked(task);
    }
}
