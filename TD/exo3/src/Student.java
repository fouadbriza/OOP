class Student {
    private String name;
    private String surname;
    private int idNumber;
    private int mod1;
    private int mod2;
    private int mode3;
    
    public void Student() {
        idNumber+=1;
        this.idNumber=idNumber;
    };

    public void display() {
        System.out.println("name: "+this.name+" surname: "+surname+" idNumber: "+this.idNumber);
    }

    public int calculateAverage(int mod1,int mod2,int mod3) {
        System.out.println("Average: ");
        return((mod1+mod2+mod3)/3);
    };
    
}