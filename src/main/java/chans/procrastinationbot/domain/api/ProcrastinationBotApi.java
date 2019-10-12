package chans.procrastinationbot.domain.api;

import chans.procrastinationbot.domain.dto.UserInfoDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

public interface ProcrastinationBotApi {

    // When the server is running new users will need to be able to register so we can add it too the DB
    @RequestMapping(value = "/registerUser",
                    method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    void registerUser(UserInfoDto dto);

    // Method that the client will send down the the running application querying for the historical process data
    //
    @RequestMapping(value = "/getUserInfo",
                    method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    UserInfoDto getUserInfo(UserInfoDto dto);

    // Users own computers can run the desktop application and have it send up to the main server
    @RequestMapping(value = "/postUserInfo",
                    method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.ACCEPTED)
    void postUserInfo( UserInfoDto dto );
}
