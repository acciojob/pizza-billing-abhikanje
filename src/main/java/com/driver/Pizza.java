package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
   private int toppings;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isBillCreated;
    boolean isTakeAway;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
       this.bill="Base Price Of The Pizza:"+this.price;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        // your code goes here
    }

    public void addExtraToppings(){
        if(!isExtraToppingAdded){
            this.price+=this.toppings;
            isExtraToppingAdded=true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(!isTakeAway){
            this.price+=20;
            isTakeAway=true;
        }
        // your code goes here
    }

    public String getBill(){
        if(!isBillCreated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: 80" + "\n";
            }
            if (isExtraToppingAdded) {
                this.bill += "Extra Toppings Added:";
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + "\n";
            }
            this.bill += "Total Price:" + this.price;
            // your code goes here
            return this.bill;
        }
        return "";
    }

}
