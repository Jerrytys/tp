package seedu.address.logic.commands;

import org.junit.jupiter.api.Test;
import seedu.address.logic.parser.AddressBookParser;
import seedu.address.model.Model;
import seedu.address.model.ModelManager;
import seedu.address.model.UserPrefs;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.logic.commands.CommandTestUtil.assertCommandFailure;
import static seedu.address.testutil.TypicalPersons.getTypicalAddressBook;

public class RemarkCommandTest {

    private static final String MESSAGE_NOT_IMPLEMENTED_YET = "This feature is not implemented yet.";
    private final Model model = new ModelManager(getTypicalAddressBook(), new UserPrefs());
    private final AddressBookParser parser = new AddressBookParser();

    @Test
    public void execute() {
        assertCommandFailure(new RemarkCommand(), model, MESSAGE_NOT_IMPLEMENTED_YET);
    }

    @Test
    public void parseCommand_remark() throws Exception {
        assertTrue(parser.parseCommand(RemarkCommand.COMMAND_WORD) instanceof RemarkCommand);
    }

}
