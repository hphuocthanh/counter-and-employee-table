package com.example.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO implements Serializable {

    private List<EmployeeDTO> empList;


    public EmployeeDTO get(int id) {
        return empList.get(id);
    }

    public List<EmployeeDTO> getAll() {
        empList = new ArrayList<>();
        empList.add(new EmployeeDTO(1, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(2, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(3, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(4, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(5, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(6, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(7, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(8, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(9, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(10, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(11, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(12, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(13, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(14, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(15, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(16, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(17, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(18, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(19, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(20, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(21, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(22, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(23, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(24, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(25, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(26, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(27, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(28, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(29, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(30, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(31, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(32, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(33, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(34, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(35, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(36, "David", "hiimdavid@fram.com", "Director of David"));
        empList.add(new EmployeeDTO(37, "John", "johnfram@fram.com", "Head of Johns"));
        empList.add(new EmployeeDTO(38, "Mary", "marryhappy@wearefram.com", "Executive of Mary"));
        empList.add(new EmployeeDTO(39, "David", "hiimdavid@fram.com", "Director of David"));
        return empList;
    }

    public void save (EmployeeDTO dto) {
        dto.setId(empList.size());
        empList.add(dto);
    }

    public void update (EmployeeDTO dto) {
        empList.set(dto.getId(), dto);
    }

    public void delete (int id) {
        empList.set(id, null);
    }
}
