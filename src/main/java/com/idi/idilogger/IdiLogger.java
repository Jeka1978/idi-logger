package com.idi.idilogger;

/**
 * @author Evgeny Borisov
 */
public interface IdiLogger {
    void info(String text);

    void debug(String text);

    void setInfoEnabled(boolean isInfoEnabled);
}
