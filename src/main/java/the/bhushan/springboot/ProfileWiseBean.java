package the.bhushan.springboot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import the.bhushan.springboot.beans.CustomConditionalBean;
import the.bhushan.springboot.beans.MongoBeanTest;

@Component
public class ProfileWiseBean {

	@Bean
    @Profile("dev")
    public MongoBeanTest getDevMongoBean() {
        return new MongoBeanTest("dev mango bean");
    }

    @Bean
    @Profile("marathi")
    public MongoBeanTest getMarathiMongoBean() {
        return new MongoBeanTest("मँगो बीन");
    }

    @Bean
    @ConditionalOnClass(name="the.bhushan.springboot.Application")
    public CustomConditionalBean getCustomConditionalBean() {
    	return new CustomConditionalBean("hey buddy");
    }
}
