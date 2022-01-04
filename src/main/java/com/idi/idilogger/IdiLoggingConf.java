package com.idi.idilogger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Evgeny Borisov
 */
@Configuration
public class IdiLoggingConf {

    @Bean
    public IdiLogger idiLogger() {
        return new IdiLoggerImpl();
    }

    @Bean
    public IdiLoggerHelper idiLoggerHelper() {
        return new IdiLoggerHelper();
    }

 /*   @Autowired
    private ApplicationContext context;

    @Bean(name = "abc")
    @Qualifier("book")
    public IdiLogger idiLogger(IdiLoggerHelper idiLoggerHelper){
        return new IdiLoggerImpl(idiLoggerHelper);
    }

    @Bean(name = "abc2")
    @Qualifier("idi")
    public IdiLogger idiLogger2(){
        return new IdiLoggerImpl(idiLoggerHelper());
    }

    @Bean
    public IdiLoggerHelper idiLoggerHelper() {
        return new IdiLoggerHelper();
    }*/
}
