package main.java.com.djrapitops.plan.command.commands.manage;

import com.djrapitops.plugin.command.CommandType;
import com.djrapitops.plugin.command.ISender;
import com.djrapitops.plugin.command.SubCommand;
import main.java.com.djrapitops.plan.Permissions;
import main.java.com.djrapitops.plan.Phrase;
import main.java.com.djrapitops.plan.Plan;

/**
 * This manage subcommand is used to check the status of the database.
 *
 * @author Rsl1122
 */
public class ManageStatusCommand extends SubCommand {

    private final Plan plugin;

    /**
     * Class Constructor.
     *
     * @param plugin Current instance of Plan
     */
    public ManageStatusCommand(Plan plugin) {
        super("status", CommandType.CONSOLE, Permissions.MANAGE.getPermission(), Phrase.CMD_USG_MANAGE_STATUS.toString());

        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(ISender sender, String commandLabel, String[] args) {
        String[] messages = new String[]{
                Phrase.CMD_MANAGE_STATUS_HEADER.toString(),
                Phrase.CMD_MANAGE_STATUS_ACTIVE_DB.parse(plugin.getDB().getConfigName()),
                Phrase.CMD_MANAGE_STATUS_QUEUE_PROCESS.parse("" + plugin.getHandler().getProcessTask().size()),
                Phrase.CMD_MANAGE_STATUS_QUEUE_SAVE.parse("" + plugin.getHandler().getSaveTask().size()),
                Phrase.CMD_MANAGE_STATUS_QUEUE_GET.parse("" + plugin.getHandler().getGetTask().size()),
                Phrase.CMD_MANAGE_STATUS_QUEUE_CLEAR.parse("" + plugin.getHandler().getClearTask().size()),
                Phrase.CMD_FOOTER.toString()
        };

        sender.sendMessage(messages);
        return true;
    }
}
