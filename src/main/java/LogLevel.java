public enum LogLevel {
    TRACE(1), DEBUG(2), INFO(4), WARNING(5), ERROR(6), FATAL(42), UNKNOWN(0);

    public final int value;

    LogLevel(int value) {
        this.value = value;
    }


}
