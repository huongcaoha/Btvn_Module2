package bai3.service;

import bai3.IInterface.ICRUD;
import bai3.entity.Department;

import java.util.List;

public class DepartmentService implements ICRUD<Department> {
    @Override
    public void displayList(List<Department> list) {
        
    }

    @Override
    public boolean add() {
        return false;
    }

    @Override
    public boolean update() {
        return false;
    }

    @Override
    public boolean delete() {
        return false;
    }
}
