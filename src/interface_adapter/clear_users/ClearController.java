package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

// TODO Complete me
public class ClearController {
    final ClearInputBoundary clearinteractor;

    public ClearController(ClearInputBoundary clearinteractor){
        this.clearinteractor = clearinteractor;
    }

    public void execute(){
        clearinteractor.execute();
    }
}
