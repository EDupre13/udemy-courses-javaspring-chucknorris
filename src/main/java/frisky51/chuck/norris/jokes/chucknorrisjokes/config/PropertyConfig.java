package frisky51.chuck.norris.jokes.chucknorrisjokes.config;

import frisky51.chuck.norris.jokes.chucknorrisjokes.examplebeans.FakeDataSourse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Value("${frisky51.username}")
    public String user;
    @Value("${frisky51.password}")
    public String password;
    @Value("${frisky51.dburl}")
    public String url;

    @Bean
    public FakeDataSourse fakeDataSourse() {
        FakeDataSourse fakeDataSourse = new FakeDataSourse();
        fakeDataSourse.setUser(user);
        fakeDataSourse.setPassword(password);
        fakeDataSourse.setUrl(url);
        return fakeDataSourse;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer
                = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }
}
