package org.jobrunr.examples;

import org.jobrunr.storage.StorageProvider;
import org.jobrunr.storage.sql.mariadb.MariaDbStorageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Paths;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackageClasses = JobRunrStorageConfiguration.class)
public class JobRunrStorageConfiguration {

    /*@Bean
    public SQLiteDataSource dataSource() {
        final SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:" + Paths.get(System.getProperty("java.io.tmpdir"), "jobrunr-example.db"));
        return dataSource;
    }*/
}
