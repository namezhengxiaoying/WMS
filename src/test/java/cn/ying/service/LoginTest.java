package cn.ying.service;

import cn.ying.exception.DuplicateAccountException;
import cn.ying.exception.NullUserException;
import cn.ying.exception.WrongNameException;
import cn.ying.exception.WrongPasswordException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationcontext.xml")
public class LoginTest {
    @Autowired
    ILoginService loginService;

    @Test
    public void loginTest(){
        try {
            if (loginService.login("", "066311")){
                System.out.println("��½�ɹ�");
            }
        } catch (NullUserException e) {
            System.out.println("�˺Ż�����Ϊ��");
        } catch (WrongNameException e) {
            System.out.println("�˻�������");
        } catch (WrongPasswordException e) {
            System.out.println("�������");
        }
    }

    @Test
    public void enrollTest(){
        try {
            loginService.enroll("3314290", "066311");
        } catch (DuplicateAccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
