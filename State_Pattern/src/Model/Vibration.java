package Model;

import Repositories.IMobileAlertState;
import Services.AlertStateContext;

public class Vibration implements IMobileAlertState {
    @Override
    public void alert(AlertStateContext ctx) {
        System.out.println("vibration...");
    }
}
