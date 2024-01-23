package TestExceptionAndStackTraceAndError;

public class DesktopReader implements AutoCloseable {
    public DesktopReader() {
    }

    @Override
    public void close() throws Exception {
        System.out.println(" Buy  - buy  !!!");
    }
}
