package TestExceptionAndStackTraceAndError;

public class ReaderTryWithResourcesNew implements AutoCloseable{
    public ReaderTryWithResourcesNew() {
    }

    @Override
    public void close() throws Exception {
        System.out.println("Buy!!!");
    }
}
