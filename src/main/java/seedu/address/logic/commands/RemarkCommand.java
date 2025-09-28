package seedu.address.logic.commands;

import seedu.address.model.Model;

/**
 * Adds a remark to an existing person in the address book.
 */
public class RemarkCommand extends Command {
    public static final String COMMAND_WORD = "remark";

    @Override
    public CommandResult execute(Model model) {
        // Implementation for adding a remark to a person
        return new CommandResult("Hello from remark");
    }
}
