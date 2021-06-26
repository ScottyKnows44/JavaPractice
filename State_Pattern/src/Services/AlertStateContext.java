package Services;

import Model.Vibration;
import Repositories.IMobileAlertState;

public class AlertStateContext {
    private IMobileAlertState currentState;

    public AlertStateContext() {
        currentState = new Vibration();
    }

    public void setState(IMobileAlertState state){
        currentState = state;
    }

    public void alert(){
        currentState.alert(this);
    }

}
