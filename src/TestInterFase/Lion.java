package TestInterFase;

public class Lion extends Animal implements Run{
    private String primeName;

    public Lion(String name, int weight,String primeName) {
        super(name, weight);
        this.primeName=primeName;
    }

    public String getPrimeName() {
        return primeName;
    }

    public void setPrimeName(String primeName) {
        this.primeName = primeName;
    }

    @Override
    public void run() {
        System.out.println(getName()+ " беги!");
    }


}
