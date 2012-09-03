package ss.linearlogic.homc;

import java.util.logging.Logger;

public class YeOldeLogger
{
  private static final Logger log = Logger.getLogger("Minecraft.HandsOffMyChest");

  public static void logInfo(String message)
  {
    log.info("[HandsOffMyChest] " + message);
  }

  public static void logWarning(String message) {
    log.warning("[HandsOffMyChest] " + message);
  }

  public static void logSevere(String message) {
    log.severe("[HandsOffMyChest] " + message);
  }
}