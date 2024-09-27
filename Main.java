//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p=new Person();
        p.displayInformation();
    Medicine m=new Medicine("Paracetamol","M001","B123","Pharma",50,50.0,new Date(2022,11,1));
        m.displayInformation();
        System.out.println("===Adress===");
        Address a= new Address("S-1","Lahore","L-1");
        a.displayAddress();
    }
}