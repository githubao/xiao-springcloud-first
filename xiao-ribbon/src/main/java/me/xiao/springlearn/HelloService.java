package me.xiao.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * service 类
 *
 * @author pacman
 * @version 1.0
 * @date: 2017/8/15 18:23
 */

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
//        return restTemplate.getForObject("http://eureka-client-hi/hi?name=" + name, String.class);
        return restTemplate.getForObject("http://EUREKA-CLIENT-HI/hi?name=" + name, String.class);
    }

}
