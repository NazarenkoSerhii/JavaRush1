package ModTwoObjectClass;

import java.util.Objects;

public class ExampleClass implements Cloneable {

    private String value;
    private String code;

    public ExampleClass() {
    }

    public ExampleClass(String value, String code) {
        this.value = value;
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {                           // deprecated
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ExampleClass that = (ExampleClass) o;

        if (!Objects.equals(value, that.value)) return false;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (code != null ? code.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExampleClass{");
        sb.append('}');
        return sb.toString();
    }
}
