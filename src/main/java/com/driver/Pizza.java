package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int topping;
    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isbagAdded;
    boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isbagAdded = false;
        this.isCheeseAdded = false;
        this.isBillGenerated = false;
        this.isToppingAdded = false;
        this.bill = "";
        if(isVeg){
            this.price = 300;
            this.topping = 70;
        }
        else{
            this.price = 400;
            this.topping = 120;
        }
        this.cheese = 80;
        this.bill = "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            this.price  += this.cheese;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingAdded){
            this.price += this.topping;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!isbagAdded){
            this.price += 20;
            isbagAdded = true;
        }
    }

    public String getBill(){
        if(!isBillGenerated){
            if(isToppingAdded){
                this.bill = "Extra Toppings Added: " + this.topping + "\n";
            }
            if(isCheeseAdded){
                this.bill = "Extra Cheese Added: " + this.cheese + "\n";
            }
            if(isbagAdded){
                this.bill = "Bag is Added: 20"  + "\n";
            }
            this.bill = "Total price: "+getPrice()+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
