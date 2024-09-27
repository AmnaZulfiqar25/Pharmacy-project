public class Medicine {
    private String medicineId;
    private String batchNumber;
    private String manufacturer;
    private Date expiryDate;
    private int quantity;
    private String name;
    private double price;


    Medicine(String name,String medicineId, String batchNumber, String manufacturer,int quantity,double price, Date expiryDate){
        this.medicineId = medicineId;
        this.name=name;
        this.batchNumber = batchNumber;
        this.manufacturer = manufacturer;
        this.quantity = quantity;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    //setters
    public void setMedicineId(String medicineId) {
        this.medicineId=medicineId;
    }
    public void setBatchNumber(String batchNumber) {
        this.batchNumber=batchNumber;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer=manufacturer;
    }
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate=expiryDate;
    }
    public void setQuantity(int  quantity) {
        this.quantity=quantity;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setPrice(double price) {
        this.price=price;
    }


    //getters
    public String getBatchNumber() {
        return batchNumber;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public  Date getExpiryDate() {
        return expiryDate;
    }
    public int getQuantity() {
        return quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public  String getMedicineId() {
        return medicineId;
    }

    public void displayInformation(){
        System.out.println("=====INformation of medicine===");
        System.out.println("medicine ID:  "+medicineId);
        System.out.println("Batch Number:  "+batchNumber);
        System.out.println("Manufacturer:  "+manufacturer);
       expiryDate.display();
       //System.out.println("Expiry Date:  "+expiryDate);
       System.out.println("Quantity:  "+quantity);
       System.out.println("Name:  "+name);
       System.out.println("Price:  "+price);
        //expiryDate.display();
    }
}
