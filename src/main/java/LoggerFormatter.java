import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LoggerFormatter extends Formatter {



        @Override
        public String format(LogRecord record) {
            return "[" + new Date() + "]" + " [" + record.getLevel() + "] "
                    + record.getClass() + record.getMessage() + "\n";
        }

    }
