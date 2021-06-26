package Services;

import Model.Gas;
import Repositories.IMatterRepository;

public class MatterService {

    private IMatterRepository service;

    public MatterService(){
        service = new Gas();
    }

    public void setService(IMatterRepository service) {
        this.service = service;
    }

    public void printState(){
        service.printState(this);
    }

}
