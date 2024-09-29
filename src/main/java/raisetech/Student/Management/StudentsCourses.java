package raisetech.Student.Management;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class StudentsCourses {

    private String studentID;
    private String courseName;
    private LocalDate startDate ;
    private LocalDate endExpectedDate;

}
