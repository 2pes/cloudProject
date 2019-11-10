package com.company.project.config;

import com.company.project.weather.job.WeatherDataSyncJob;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class QuartzConfiguration {
    // 更新频率
    private static final int TIME = 1800;

    @Bean
    public JobDetail weatherDataSyncJobDetail() {
        return JobBuilder.newJob(WeatherDataSyncJob.class).withIdentity("weatherDataSyncJob")
                .storeDurably().build();
    }

    @Bean
    public Trigger weatherDataSyncTrigger() {

        SimpleScheduleBuilder schedBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(TIME).repeatForever();

        return TriggerBuilder.newTrigger().forJob(weatherDataSyncJobDetail())
                .withIdentity("weatherDataSyncTrigger").withSchedule(schedBuilder).build();
    }
}
