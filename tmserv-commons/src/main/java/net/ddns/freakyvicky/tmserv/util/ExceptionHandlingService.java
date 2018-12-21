package net.ddns.freakyvicky.tmserv.util;

import org.springframework.stereotype.Service;

@Service
public class ExceptionHandlingService {

    private static final String EMPTY_VOCABULARY_OR_WEIGHT_LOOKUP_TABLE = "empty Vocabulary or WeightLookupTable";
    private static final String UNSUPPORTED_EXCEPTION = "Unsupported exception!";

    public ServerMessage getMessageFromException(Exception e) {

        if (e instanceof IllegalStateException) {

            if (e.getMessage().contains(EMPTY_VOCABULARY_OR_WEIGHT_LOOKUP_TABLE)) {
                return ServerMessage.BAD_TEXT;
            }

        }

        throw new IllegalArgumentException(UNSUPPORTED_EXCEPTION);
    }
}
