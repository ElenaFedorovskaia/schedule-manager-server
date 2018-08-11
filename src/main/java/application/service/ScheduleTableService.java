package application.service;

import application.model.ScheduleTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import application.repository.ScheduleTableRepository;

import javax.persistence.EntityNotFoundException;

@Service
public class ScheduleTableService {

    @Autowired
    private ScheduleTableRepository scheduleTableRepository;

    public ScheduleTable getScheduleTable(Long id){
        return scheduleTableRepository.findById(id).orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
    }
}
