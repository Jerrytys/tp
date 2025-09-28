package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

/**
 * Adds a remark to an existing person in the address book.
 */
public class RemarkCommand extends Command {
    public static final String COMMAND_WORD = "remark";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a remark to the person identified "
            + "by the index number used in the last person listing. "
            + "Existing remarks will be overwritten by the input.\n"
            + "Parameters: INDEX (must be a positive integer) "
            + "[REMARK]\n"
            + "Example: " + COMMAND_WORD + " 1 "
            + "Likes hiking and outdoor activities";
    public static final String MESSAGE_NOT_IMPLEMENTED_YET = "This feature is not implemented yet.";

    @Override
    public CommandResult execute(Model model) throws CommandException {
        // Implementation for adding a remark to a person
        throw new CommandException(MESSAGE_NOT_IMPLEMENTED_YET);
    }
}
