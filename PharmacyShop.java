public class PharmacyShop {

    private  Address address;
    private  Medicine medicines;
    private   int medicineCount;
    private   Person owner;
    PharmacyShop(Person owner,Address address,int medicineCount){
        this.owner = owner;
        this.address = address;
        this.medicineCount = medicineCount;
    }

}
    //{

        //non static block add values of 10 medicines
//        medicines[0]=new Medicine("Paracetmol","M001","B123","PharmaCorp",100,50.0,new Date(2025,12,8));
//        medicines[1]=new Medicine("Ibuprofen","M002","B124","HealthMed",80,75.0,new Date(2024,12,10));
//        medicines[0]=new Medicine("Paracetmol","M003","B125","BioPharma",50,120.0,new Date(2026,11,20));
//        medicines[1]=new Medicine("Ibuprofen","M004","B126","MedLife",60,150.0,new Date(2025,11,30));
//    }
//    public Medicine searchMedicineById(String medicineId){
//        int i;
//        for(i=0;i<medicineCount;i++){
//            //if(medicineId==medicineId[i]);
////            {return medicines[i];
////                break;}
//        }
//    }

//    public void updateMedicine(String medicineId){
//        int i;
//        for(i=0;i<medicineCount;i++){
//            //if(medicineId==medicineId[i]);
//
//        }
//    }

//}
