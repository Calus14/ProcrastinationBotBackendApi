package chans.procrastinationbot.controller;


import chans.procrastinationbot.domain.api.ProcrastinationBotApi;
import chans.procrastinationbot.domain.dto.UserInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/procrastinationBotServer")
public class ProcrastinationBotController implements ProcrastinationBotApi {
    public void registerUser(UserInfoDto dto) {
        System.out.println("hit Register User");
    }

    public UserInfoDto getUserInfo(UserInfoDto dto) {
        System.out.println("hit getUserInfo");
        return null;
    }

    public void postUserInfo(UserInfoDto dto) {
        System.out.println("hit postUserInfo");
    }

}
