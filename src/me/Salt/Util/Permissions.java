package me.Salt.Util;

public enum Permissions { 
  //Also used for Restrictions, as permission-states are neutral before being analysed for a prefix in the config file
  
//User banning
  BAN_USER_TEMP,
  BAN_USER_PERM,
  BAN_USER_BY_NAME,
  BAN_USER_BY_ID,
  BAN_MULTIPLE_USERS_BY_NAME,
  BAN_MULTIPLE_USERS_BY_ID,
  BAN_USER_CROSSGUILD,
  BAN_USER_BY_ROLE,

//User muting
  MUTE_USER_TEMP,
  MUTE_USER_PERM,
  MUTE_USER_BY_NAME,
  MUTE_USER_BY_ID,
  MUTE_MULTIPLE_USERS_BY_NAME,
  MUTE_MULTIPLE_USERS_BY_ID,
  MUTE_USER_CROSSGUILD,
  MUTE_USER_BY_ROLE,
    
//User deafening
  DEAFEN_USER_TEMP,
  DEAFEN_USER_PERM,
  DEAFEN_USER_BY_NAME,
  DEAFEN_USER_BY_ID,
  DEAFEN_MULTIPLE_USERS_BY_NAME,
  DEAFEN_MULTIPLE_USERS_BY_ID,
  DEAFEN_USER_CROSSGUILD,
  DEAFEN_USER_BY_ROLE,

//VoiceChannel Banning
  BAN_CHANNEL_TEMP,
  BAN_CHANNEL_PERM,
  BAN_CHANNEL_BY_NAME,
  BAN_CHANNEL_BY_ID,
  BAN_MULTIPLE_CHANNELS_BY_NAME,
  BAN_MULTIPLE_CHANNELS_BY_ID,
  BAN_CHANNEL_CROSSGUILD,

//VoiceChannel Muting
  MUTE_CHANNEL_TEMP,
  MUTE_CHANNEL_PERM,
  MUTE_CHANNEL_BY_NAME,
  MUTE_CHANNEL_BY_ID,
  MUTE_MULTIPLE_CHANNELS_BY_NAME,
  MUTE_MULTIPLE_CHANNELS_BY_ID,
  MUTE_CHANNEL_CROSSGUILD,


//VoiceChannel deafening
  DEAFEN_CHANNEL_TEMP,
  DEAFEN_CHANNEL_PERM,
  DEAFEN_CHANNEL_BY_NAME,
  DEAFEN_CHANNEL_BY_ID,

//User VoiceChannel kicking -- Kicks a user from their current VoiceChannel

  KICK_USER_BY_NAME,
  KICK_USER_BY_ID,
  KICK_MULTIPLE_USERS_BY_NAME,
  KICK_MULTIPLE_USERS_BY_ID,
  KICK_USER_BY_ROLE,

/*
Admin -- Private VoiceChannel

A private VoiceChannel kicks all users out of the VoiceChannel of the executor. 
An optional Whitelist can be provided, which prevents specific users from being kicked. 
Users attempting to join the VoiceChannel will also be kicked. 
A config whitelist can also be integrated, to allow default whitelist members. Ideal for quick-setup meetings. 
A duration and reason can be provided, as well as a temporary new VoiceChannel name. 
Private VoiceChannel's can be disabled by an alternate command. 
After the disable command's execution, the private VoiceChannel owner cannot create new private VoiceChannel's for 30 seconds. 
This prevents admin abuse.  
*/

  CREATE_PRIVATE_VOICECHANNEL,
  DELETE_PRIVATE_VOICECHANNEL,
  EDIT_PRIVATE_VOICECHANNEL_WHITELIST_CONFIG,
  EDIT_PRIVATE_VOICECHANNEL_WHITELIST_CMD,
  SET_PRIVATE_VOICECHANNEL_DURATION,
  SET_PRIVATE_VOICECHANNEL_REASON,
  SET_PRIVATE_VOICECHANNEL_TEMP_NAME,
  SET_PRIVATE_VOICECHANNEL_LOBBY_VOICECHANNEL_BY_NAME,
  SET_PRIVATE_VOICECHANNEL_LOBBY_BY_ID,
  BYPASS_PRIVATE_CHANNEL_COOLDOWN,
  BYPASS_PRIVATE_CHANNEL_WHITELIST,

//Help command
    USE_HELP_COMMAND,
    VIEW_ALL_COMMANDS,
    VIEW_PERSONAL_COMMANDS, //Overriden by VIEW_ALL_COMMANDS
    VIEW_OTHERS_COMMANDS, //View the available commands of other people. Good for debugging purposes
    ADD_CUSTOM_HELP, //Allowed to add a custom help command?

/*
Custom Help command

*/
    CREATE_CUSTOM_HELP_COMMAND,
    VIEW_CUSTOM_HELP_COMMANDS_COMMAND, //The command, I.E., .help rules, would show 'rules'. 
    VIEW_CUSTOM_HELP_COMMANDS_DESCRIPTION, //The command's description (if applicable)
    VIEW_CUSTOM_HELP_COMMANDS_AUTHOR, //The creator of the command
    VIEW_CUSTOM_HELP_COMMANDS_TASK, //The task of the command, such as the message to send
    EDIT_CUSTOM_COMMAND_COMMAND,
    EDIT_CUSTOM_COMMAND_DESCRIPTION,
    EDIT_CUSTOM_COMMAND_AUTHOR,
    EDIT_CUSTOM_COMMAND_TASK,
    DELETE_CUSTOM_HELP_COMMAND,
    
//Redirect commands
    CREATE_REDIRECT_COMMAND, 
    /*
    Commands that perform another command. Useful for abbreviations of common commands or long text.
    */
    CREATE_REDIRECT_COMMAND_TEXT, //Allow command to send messages, rather than commands. 
    VIEW_REDIRECT_COMMANDS_COMMANDHEADER,
    VIEW_REDIRECT_COMMANDS_DESCRIPTION,
    VIEW_REDIRECT_COMMANDS_AUTHOR,
    VIEW_REDIRECT_COMMANDS_COMMAND,
    EDIT_REDIRECT_COMMAND_COMMANDHEADER, //The command name itself
    EDIT_REDIRECT_COMMAND_DESCRIPTION,
    EDIT_REDIRECT_COMMAND_AUTHOR,
    EDIT_REDIRECT_COMMAND_COMMAND, //The command the redirect-command performs
    DELETE_REDIRECT_COMMAND,
    
//Bot commands
    SET_COMMAND_PREFIX, 
    VIEW_COMMAND_PREFIX,
    VIEW_BOT_PERMISSIONS
//Permission editing
//User config editing
//Guild config editing
//System config editing
//Admin abilities
//General commands
//Logging permissions
}
