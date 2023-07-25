public class Car {
    public static String company = "Tesla";
    private String owner;
    public String name;
    public int weight;
    public String color;

    Car(String owner, String name, int weight, String color){
        this.owner = owner;
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public void printInfo(){
        System.out.println("Company: " + company + "\nOwner: " + owner + "\nName: "+ name + "\nWeight: "+ weight+ "\nColor: "+ color + "\n");
    }

    public void setOwnerName(String name){
        this.owner = name;
    }

    public void getOwnerName(){
        System.out.println(name);
    }
}
