package net.ddns.freakyvicky.tmserv.util;

public enum Property {
    SERVICE_PORT("service.port"),

    ALPHA("alpha"),
    LEARNING_RATE("learningRate"),
    EPOCHS("epochs"),
    XMAX("xMax"),
    BATCH_SIZE("batchSize"),
    SHUFFLE("shuffle"),
    SYMMETRIC("symmetric"),
    ;

    private String name;
    private Class type;

    Property(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
