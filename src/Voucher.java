public class Voucher {
    static int quantity = 0;
    String country;
    int days;
    int price;
    private String agency;
    private String client;
    protected int date;
    protected String transportType;

    //--------------------------------

    Voucher(String country, int days, String agency, String client, int date, String transportType){
        this.country = country;
        this.days = days;
        this.agency = agency;
        this.client = client;
        this.date = date;
        this.transportType = transportType;
        quantity++; //кількість створених путівок

        calculatePrice();
    }
//виклик конструктора із конструктора
    Voucher(String country, int days, String agency, String client){
        this(country, days, agency, client,0 ,"");
    }

    Voucher(){
        this("", 0, "", "");
    }
    //--------------------------------

    public void calculatePrice(){
        // insert method here
        this.price = 0;
    }

    public void setCountry(String country){
       this.country = country;

       calculatePrice();
    }

    public void setDays(int days){
        this.days = days;

        calculatePrice();
    }

    public void setAgency(String agency){
        this.agency = agency;

        calculatePrice();
    }

    public void setClient(String client){ this.client = client; }

    public void setDate(int date){ this.date = date; }

    public void setTransportType(String transportType){
        this.transportType = transportType;

        calculatePrice();
    }

    //--------------

    public String getCountry(){ return country; }

    public int getDays(){ return days; }

    public String getAgency(){ return agency; }

    public String getClient(){ return client; }

    public int getDate(){ return date; }

    public String getTransportType(){ return transportType; }

    //----------------------

    public String toString(){
        return "Tourist's Voucher: \n Country: " + country + "\n Days: " + days + "\n Agency: " + agency + "\n Client: "
                + client + "\n Price: " + price + "\n Quantity: " + quantity;
    }

    static int printStaticQuantity(){
        return quantity;
    }

    public int printQuantity(){
        return quantity;
    }

    public void resetValues(String country, int days, String agency, String client, int date, String transportType){
        this.country = country;
        this.days = days;
        this.agency = agency;
        this.client = client;
        this.date = date;
        this.transportType = transportType;

        calculatePrice();
    }

}
