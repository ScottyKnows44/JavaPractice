package Model;

import Repositories.IMatterRepository;
import Services.MatterService;

public class Solid implements IMatterRepository {

    @Override
    public void printState(MatterService ctx) {
        System.out.println("I am a solid...");
    }
}
