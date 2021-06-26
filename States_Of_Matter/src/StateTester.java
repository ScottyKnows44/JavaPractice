import Model.Liquid;
import Model.Solid;
import Services.MatterService;

public class StateTester {
    public static void main(String[] args) {
        MatterService service = new MatterService();
        service.printState();
        service.setService(new Liquid());
        service.printState();
        service.setService(new Solid());
        service.printState();
    }
}
