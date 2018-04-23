package Controller;
import Datamodel.DataModel;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "studentcontroller")


public class Controller {
    private DataModel student = new DataModel();

    public DataModel getStudent() {
        return student;
    }

    public void setStudent(DataModel student) {
        this.student = student;
    }

    public String isnextpage() {
        return "viewstudent";
    }
}
