package io.codelex.mysecondspringapp.time;

import org.springframework.stereotype.Repository;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Repository
public class TimeRepository {

    public String getTime(){
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
    }
}
