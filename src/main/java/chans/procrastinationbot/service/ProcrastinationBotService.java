package chans.procrastinationbot.service;

import chans.procrastinationbot.domain.dto.UserInfoDto;

public interface ProcrastinationBotService {

    void registerNewUser(UserInfoDto userInfoDto) throws Exception;

    void loginUser(UserInfoDto userInfoDto) throws Exception;

    boolean addUserInfo(UserInfoDto userInfoDto);

}
