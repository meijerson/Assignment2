
/**
 * A class that calculates the prices of the desks for Mr. Rick Hammer's customers.
 * 
 * @Mackenzie Bloswick 
 * @01.31.2017
 */

public class RickHammer
{
    private int length;
    private int width;
    private int price;
    private int orderNum;
    private int drawers;
    private int sqInches;
    private String name;
    private String woodType;   

    public RickHammer(int orderNumber, int deskLength, int deskWidth, String customerName)
    {
        int baseCharge = 200;
        orderNum = orderNumber;
        length = deskLength;
        width = deskWidth;
        price = baseCharge;
        name = customerName;
    }

    public void setSizePrice()
    {
        int maxInches = 750;
        sqInches = length * width;
        if (sqInches >= maxInches) {
            price = price + 50;
        }
    }
    
    public void setWoodType(String typeOfWood)
    {
        woodType = typeOfWood;
        int mahoganyPrice = 150;
        int oakPrice = 125;
        int pinePrice = 0;
        if (woodType == "mahogany" || woodType == "Mahogany") {
            price = price + mahoganyPrice;
        }
        else if  (woodType == "oak" || woodType == "Oak") {
            price = price + oakPrice;
        }
        else if (woodType == "pine" || woodType == "Pine") {
            price = price;
        }
        else {
            woodType = null;
            System.out.println("Try again and please input correct wood type. Mahogany, Oak, or Pine.");
    }
}
    
    public void setNumberOfDrawers(int numberOfDrawers) {
        int pricePerDrawer = 30;
        drawers = numberOfDrawers;
        price = price + drawers * pricePerDrawer;
    }
    
    public void printPrice()
    {
        if (woodType == null) {
            System.out.println("Please call setWoodType function and enter Mahogany, Oak, or Pine.");
        }
        else if (sqInches == 0) {
            System.out.println("Please call setSizePrice function before printing the price.");
        }
        else if (drawers == 0) {
            System.out.println("Please call setNumberOfDrawers function before printing the price.");
        }
        else {
            System.out.println("Thank you for choosing Rick Hammer's Desk Service, " + name + 
            ".\nYour price: $" + price + "\nOrder Number: " + orderNum + "\nDesk Length: " + length +
            "\nDesk Width: " + width + "\nDrawers: " + drawers + "\nWood Type: " + woodType +
            "\n\nThank you, have a nice day!");
        }
    }
}
