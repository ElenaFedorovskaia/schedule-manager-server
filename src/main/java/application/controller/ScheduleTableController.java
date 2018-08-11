package application.controller;

import application.model.ScheduleTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import application.service.ScheduleTableService;

@Controller
@RequestMapping("/")
public class ScheduleTableController {

    @Autowired
    private ScheduleTableService scheduleTableService;

    @RequestMapping(value = "/scheduleTable/{id}", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody ScheduleTable getScheduleTableDTO(@PathVariable String id){
        return scheduleTableService.getScheduleTable(Long.parseLong(id, 10));
    }
}
