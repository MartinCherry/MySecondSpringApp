package io.codelex.mysecondspringapp.time;

import org.springframework.stereotype.Service;

@Service
public class TimeService {

    TimeRepository repository;

    public TimeService(TimeRepository repository) {
        this.repository = repository;
    }

    public String getTime(){
        return repository.getTime();
    }
}
