public class UnmarkCommand implements Command {
    private int index;

    public UnmarkCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        Task task = tasks.get(index);
        task.unMark();
        ui.showTaskUnmarked(task);
        storage.save(tasks);
    }
}