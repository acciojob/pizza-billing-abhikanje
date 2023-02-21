package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheese;
    private int toppings;

    boolean isCheeseAdded;
    boolean isTakeAway;
    boolean isToppingAdded;
    boolean isBilled;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.isBilled =false;
        this.isCheeseAdded =false;
        this.isToppingAdded =false;
        this.isTakeAway = false;
        this.bill = "";

        if(isVeg){
            this.price = 300;
            this.toppings = 70;

        }else{
            this.price = 400;
            this.toppings = 120;
        }

        this.cheese = 80;
        this.bill += "Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
            // your code goes here
            if (!isCheeseAdded) {
                this.price = this.price + cheese;
                isCheeseAdded = true;
            }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppingAdded){
            this.price = this.price + toppings;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeAway){
            this.price = this.price + 20 ;
            isTakeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(!isBilled){
            if(isCheeseAdded)
                this.bill += "Extra Cheese Added: "+this.cheese+"\n";
            if(isToppingAdded)
                this.bill += "Extra Toppings Added: "+this.toppings+"\n";
            if(isTakeAway)
                this.bill += "Paperbag Added: "+"20"+"\n";

            this.bill += "Total Price: "+this.price+"\n";
            isBilled = true;

        }
        return this.bill;
    }
}
