package TestEnum;

public enum Gender {
    MALE, FEMALE;
    private  String str;
    Gender(){                      // пустой конструктор

    }

    Gender(String str){

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return  '\''+ str + '\'';
    }
}
