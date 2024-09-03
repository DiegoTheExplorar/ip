package Commands;

import Main.Storage;
import Main.Ui;
import Tasks.TaskList;

/**
 * Represents a command to find tasks that contain a specific keyword.
 */
public class FindCommand implements Command {
    private String keyword;

    /**
     * Constructs a new FindCommand.
     *
     * @param keyword The keyword to search for in the task descriptions.
     */
    public FindCommand(String keyword) {
        this.keyword = keyword;
    }

    /**
     * Executes the command to find tasks containing the keyword.
     *
     * @param tasks   The task list to search within.
     * @param ui      The UI component that handles user interaction.
     * @param storage The storage component (not used in this command).
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        TaskList matchingTasks = tasks.findTasks(keyword);
        return ui.showFoundTasks(matchingTasks);
    }
}
