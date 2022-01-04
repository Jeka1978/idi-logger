package com.idi.idilogger;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Evgeny Borisov
 */
public class IdiLoggerImpl implements IdiLogger {

    @Autowired
    private IdiLoggerHelper helper;

    @Setter
    private boolean isInfoEnabled;

    @Override
    public void info(String text) {
        if (isInfoEnabled) {
            System.out.println("info: " + text);
        }
    }

    @Override
    public void debug(String text) {
        String debugInfo = helper.getDebugInfo();
        System.out.println("debug: " + text+" "+debugInfo);
    }

}
