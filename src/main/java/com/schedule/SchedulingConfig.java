package com.schedule;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by cola on 2017/1/23.
 */
@Component
public class SchedulingConfig {

    @Scheduled(cron = "0/20 * * * * ?")
    public void schedule() {
        System.out.println("Scheduling...");
    }
}
