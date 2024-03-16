package ModTwoReflectionAPI;

public class MyCustomClass {
    public MyCustomClass() {
    }

    public MyCustomClass(String value) {
        this.value = value;
    }

    private String value = "Init";

    public String getValue() {
        return value;
    }

    public void showInfo() {
        System.out.println("Info");
    }

    private void showPrivetInfo() {
        System.out.println("PrivetInfo");
    }
}
