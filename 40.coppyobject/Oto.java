public class Oto {
    private String make;
    private String model;
    private int year;

    Oto(String make, String model, int year){
        this.setMake(make); //this.make = make;
        this.setModel(model); //this.model =model;
        this.setYear(year); //this.year = year;
    }
    Oto(Oto x){//ham coppy
        this.coppy(x);
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    // set gia tri
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void coppy(Oto x){
        this.setMake(x.getMake());
        this.setModel(x.getModel());

        this.setYear(x.getYear());

    }
}