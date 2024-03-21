public class LogLine {

    private final LogLevel logLevel;
    private final String message;

    public LogLine(String logLine) {
        var splitIndex = logLine.indexOf(":");
        var shortLevel = logLine.substring(1, splitIndex - 1).trim().toUpperCase();
        logLevel = switch (shortLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
        message = logLine.substring(splitIndex + 1).trim();
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public String getOutputForShortLog() {
        return String.format("%d:%s", logLevel.value, message);
    }
}
