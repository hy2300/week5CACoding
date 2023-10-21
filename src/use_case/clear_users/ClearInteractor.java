package use_case.clear_users;

// TODO Complete me

import entity.User;

import java.util.ArrayList;

public class ClearInteractor implements ClearInputBoundary {
    ClearOutputBoundary clearPresenter;
    ClearUserDataAccessInterface clearuserDataAccessObject;

    public ClearInteractor(ClearOutputBoundary clearOutputBoundary,ClearUserDataAccessInterface clearUserDataAccessInterface){
        this.clearPresenter = clearOutputBoundary;
        this.clearuserDataAccessObject = clearUserDataAccessInterface;
    }

    @Override
    public void execute() {
        ArrayList<User> users = clearuserDataAccessObject.deleteAll();
        ArrayList<String> usernames = new ArrayList<>();
        for (User user : users){
            usernames.add(user.getName());
        }
        ClearOutputData clearoutputdata = new ClearOutputData(usernames);
        clearPresenter.prepareSuccessView(clearoutputdata);
    }
}
