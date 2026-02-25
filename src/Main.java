public class Main {

    public static void main(String[] args){
        double season1 = 144.5;
        double season2 = 122.5;
        double season3 = 223.5;
        double season4 = 122.5;

        double yearlyCost = season1 + season2 + season3 + season4;

        System.out.println("Seasonal Maintenance Costs:");
        System.out.println("Season 1: $" + season1);
        System.out.println("Season 2: $" + season2);
        System.out.println("Season 3: $" + season3);
        System.out.println("Season 4: $" + season4);
        System.out.println("Total Yearly Maintenance Cost: $" + yearlyCost);

    }
}