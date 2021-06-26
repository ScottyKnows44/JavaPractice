package Model;

import Repositories.IMobileAlertState;
import Services.AlertStateContext;

public class Silent implements IMobileAlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("silent...");
    }
}
