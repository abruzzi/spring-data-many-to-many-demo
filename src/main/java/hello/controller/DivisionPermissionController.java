package hello.controller;

import hello.model.Division;
import hello.model.DivisionPermission;
import hello.model.Task;
import hello.repository.DivisionRepository;
import hello.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/divisionPermissions")
public class DivisionPermissionController {
    @Autowired
    DivisionRepository divisionRepository;

    @Autowired
    TaskRepository taskRepository;

    @RequestMapping(method = RequestMethod.POST)
    public DivisionPermission create(@RequestBody DivisionPermission divisionPermission) {
        Task task = taskRepository.findOne(divisionPermission.getDivisionPermissionId().getTaskId());
        Division division = divisionRepository.findOne(divisionPermission.getDivisionPermissionId().getDivisionId());

        divisionPermission.setTask(task);
        divisionPermission.setDivision(division);

        division.getDivisionPermissions().add(divisionPermission);

        taskRepository.save(task);
        divisionRepository.save(division);

        return divisionPermission;
    }
}
