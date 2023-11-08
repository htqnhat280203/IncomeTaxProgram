/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author DiepTCNN
 */
public class Children extends Dependent{
    protected int Status;

    public Children(int Status, int age) {
        super(age);
        this.Status = Status;
    }

    public int getWorkingStatus() {
        return Status;
    }

    public void setWorkingStatus(int WorkingStatus) {
        this.Status = WorkingStatus;
    }

    public int getDeductionAmount() {
        if (Status == 2) {
            return 0;
        } else {
            if (age <= 18) {
                return 4400000;
            } else {
                return 6000000;
            }
        }
    }
}
