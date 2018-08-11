package model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "schedule_table")
public class ScheduleTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long interval;

}
