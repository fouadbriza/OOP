public class Tattoo {
    public static int counter;
    private String tattoo;

    public Tattoo(String name) {
        this.tattoo = name + counter;
        counter++;
    }

    public String getTattoo() {
        return(tattoo);
    }


}
