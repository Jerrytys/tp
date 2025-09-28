package seedu.address.logic.commands;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

import seedu.address.commons.core.index.Index;
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

    public static final String MESSAGE_ARGUMENTS = "Index: %1$d, Remark: %2$s";

    private final Index index;
    private final String remark;

    /**
     * Creates a RemarkCommand to add a remark to the specified {@code Person}
     * @param index of the person in the filtered person list to edit
     * @param remark of the person
     */
    public RemarkCommand(Index index, String remark) {
        requireAllNonNull(index, remark);
        this.index = index;
        this.remark = remark;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        // Implementation for adding a remark to a person
        throw new CommandException(String.format(MESSAGE_ARGUMENTS, index.getOneBased(), remark));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof RemarkCommand)) {
            return false;
        }

        RemarkCommand e = (RemarkCommand) other;
        return index.equals(e.index)
                && remark.equals(e.remark);
    }
}
