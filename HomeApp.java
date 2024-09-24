public class HomeApp{
    public static void main(String[] args) {
        HomeService ac  = new AirConditioning(); 
        HomeService light = new Light();
        HomeService tv = new TV();
        HomeInterface facade = new HomeInterface(ac, light, tv);

        facade.turnOnAll();
        System.out.println();
        facade.turnOffAll();
        

    }
}