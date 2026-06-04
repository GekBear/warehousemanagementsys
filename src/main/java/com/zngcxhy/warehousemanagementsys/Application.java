package com.zngcxhy.warehousemanagementsys;

import com.zngcxhy.warehousemanagementsys.config.ImportModuleConfiguration;
import com.zngcxhy.warehousemanagementsys.config.LcpProperties;
import com.zngcxhy.warehousemanagementsys.util.CommonFunctionUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.FullyQualifiedAnnotationBeanNameGenerator;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.boot.web.servlet.ServletComponentScan;


@SpringBootApplication(exclude = {QuartzAutoConfiguration.class, LiquibaseAutoConfiguration.class},
        scanBasePackages = {ImportModuleConfiguration.AUTH_MODULE_PACKAGE},
        scanBasePackageClasses = Application.class)
@EnableConfigurationProperties({LcpProperties.class})
@MapperScan(basePackages = "com.zngcxhy.warehousemanagementsys.repository", nameGenerator = FullyQualifiedAnnotationBeanNameGenerator.class)
@EnableTransactionManagement
@ServletComponentScan
public class Application {
    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Application.class);
        CommonFunctionUtil.registerEnv(app.run(args).getEnvironment());
    }
}
