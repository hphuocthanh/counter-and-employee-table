package com.example.services;

import com.example.models.EmployeeDAO;
import com.example.models.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeDAO dao = new EmployeeDAO();
    private EmployeeDTO dto = new EmployeeDTO();

    public List<EmployeeDTO> getAll() {

        return dao.getAll();
    }

    public EmployeeDTO getEmpById(int id) {
        return dao.get(id);
    }

    public void addNewProduct(EmployeeDTO dto) {
        dao.save(dto);
    }
}
