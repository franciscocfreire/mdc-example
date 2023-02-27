package br.com.fcf.mdc;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.slf4j.MDC;

public class MdcConverter extends ClassicConverter {

    @Override
    public String convert(ILoggingEvent event) {
        String idTransacao = MDC.get("idTransacao");
        if (idTransacao != null) {
            return "[" + idTransacao + "] ";
        } else {
            return "";
        }
    }
}