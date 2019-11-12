package com.tellyouiam.logging;

import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

class GeeksforGeeks {
    public static void main(String[] args) {
        DemoLogger obj = new DemoLogger();
        obj.makeSomeLog();

        // Generating some log messages through the
        // function defined above
        LogManager lgmngr = LogManager.getLogManager();

        // lgmngr now contains a reference to the log manager.
        Logger log = lgmngr.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // Getting the global application level logger
        // from the Java Log Manager
        log.log(Level.INFO, "This is a log message");

        // Create a log message to be displayed
        // The message has a level of Info
    }
}
