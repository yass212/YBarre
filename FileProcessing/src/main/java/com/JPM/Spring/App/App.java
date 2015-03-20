package com.JPM.Spring.App;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*@Auther: Y Barre
 *@Date: 18/03/15*/
public class App 
{
    public static void main( String[] args )
    {
    	String[] config = 
    		{
    			"file:src/main/java/com/JPM/yassinBarre/Beans/job.xml",
    			"file:src/main/java/com/JPM/yassinBarre/Beans/context.xml"
    		};
    	// spring bean container       // classPath will read the file from anywhere in the project 
    		ApplicationContext context = 
    			new ClassPathXmlApplicationContext(config);
    	 
    		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
    		Job job = (Job) context.getBean("job");
    	 
    		try {
    	 
    			JobExecution execution = jobLauncher.run(job, new JobParameters());
    			System.out.println("Exit Status : " + execution.getStatus());
    	 
    		} catch (Exception e) {
    			e.printStackTrace();
    		}

    		System.out.println("Done");
    		
    		// closing the file system application to prevent any resources leaks
    		((ClassPathXmlApplicationContext)context).close();
    }
}
