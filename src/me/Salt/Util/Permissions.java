package me.Salt.Util;

public enum Permissions { //Also used for Restrictions, as permission-states are neutral before being analysed for a prefix in the config file
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

/**
Admin -- Private VoiceChannel

**/

//Permission editing
//User config editing
//Guild config editing
//System config editing
//Admin abilities
//General commands
//Logging permissions
}
