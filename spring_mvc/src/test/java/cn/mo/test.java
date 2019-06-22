package cn.mo;

import com.itheima.domain.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class test {
    @Test
    public void test1(){
        List<User> userList = new ArrayList<User>();
        User user1 = new User();
        user1.setUsername("zhanhg");
        user1.setAge(23);
        User user2 = new User();
        user2.setUsername("li");
        user2.setAge(235);
        userList.add(user1);
        userList.add(user2);
        System.out.println(userList.toString());

    }
}
