package chans.procrastinationbot.controller;


import chans.procrastinationbot.domain.api.ProcrastinationBotApi;
import chans.procrastinationbot.domain.dto.UserInfoDto;
import chans.procrastinationbot.service.ProcrastinationBotService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/procrastinationBotServer")
public class ProcrastinationBotController implements ProcrastinationBotApi {

    @Autowired
    protected ProcrastinationBotService procrastinationBotService;

    public void registerUser(UserInfoDto dto) {
        System.out.println("hit Register User");
    }

    public UserInfoDto getUserInfo(UserInfoDto dto) {
        System.out.println("hit getUserInfo");
        return null;
    }

    public void postUserInfo(UserInfoDto dto) {
        System.out.println("hit postUserInfo");
        procrastinationBotService.addUserInfo(dto);
    }

}
