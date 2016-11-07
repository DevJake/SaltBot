package me.Salt.Util;
public enum Enforcements {

//User banning

  BAN_STATE_REASON,
  BAN_STATE_DURATION,
  MULTIBAN_STATE_REASON,
  MULTIBAN_STATE_DURATION,

//User muting
  MUTE_STATE_REASON,
  MUTE_STATE_DURATION,
  MULTIMUTE_STATE_REASON,
  MULTIMUTE_STATE_DURATION,
    
//User deafening
  DEAFEN_STATE_REASON,
  DEAFEN_STATE_DURATION,
  MULTIDEAFEN_STATE_REASON,
  MULTIDEAFEN_STATE_DURATION,

//VoiceChannel Banning
  VOICECHANNEL_BAN_STATE_REASON,
VOICECHANNEL_BAN_STATE_DURATION,
VOICECHANNEL_MULTIBAN_STATE_REASON, 
VOICECHANNEL_MULTIBAN_STATE_DURATION,

//VoiceChannel Muting
  VOICECHANNEL_MUTE_STATE_REASON,
VOICECHANNEL_MUTE_STATE_DURATION, 
VOICECHANNEL_MULTIMUTE_STATE_REASON,
VOICECHANNEL_MULTIMUTE_STATE_DURATION,


//VoiceChannel deafening
VOICECHANNEL_DEAFEN_STATE_REASON,
VOICECHANNEL_DEAFEN_STATE_DURATION,
VOICECHANNEL_MULTIDEAFEN_STATE_REASON, 
VOICECHANNEL_MULTIDEAFEN_STATE_DURATION,

//User VoiceChannel kicking -- Kicks a user from their current VoiceChannel

  KICK_STATE_REASON,
  MULTIKICK_STATE_REASON,

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

PRIVATECHANNEL_STATE_WHITELIST_CMD,
PRIVATECHANNEL_USE_WHITELIST_CONFIG, /*
Forces usage of guild config. Useful to ensure staff can never be restricted from a private VoiceChannel
*/

PRIVATECHANNEL_STATE_REASON,
PRIVATECHANNEL_STATE_DURATION,
PRIVATECHANNEL_STATE_TEMPNAME



//Permission editing
//User config editing
//Guild config editing
//System config editing
//Admin abilities
//General commands
//Logging permissions
}

}
