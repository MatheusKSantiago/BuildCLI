package org.buildcli.commands.project;

import org.buildcli.commands.project.update.DependencyCommand;
import org.buildcli.commands.project.update.VersionCommand;
import picocli.CommandLine.Command;

@Command(name = "update", aliases = {"up"}, description = "", mixinStandardHelpOptions = true,
    subcommands = {VersionCommand.class, DependencyCommand.class}
)
public class UpdateCommand {
}
