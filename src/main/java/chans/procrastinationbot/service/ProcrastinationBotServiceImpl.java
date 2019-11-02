package chans.procrastinationbot.service;

import chans.procrastinationbot.domain.dto.UserInfoDto;
import chans.procrastinationbot.repository.UserCredentialsRepository;
import chans.procrastinationbot.repository.UserUsageRepository;
import chans.procrastinationbot.repository.entinties.UserUsageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcrastinationBotServiceImpl implements ProcrastinationBotService {
    @Autowired
    private UserCredentialsRepository userCredentialsRepository;
    @Autowired
    private UserUsageRepository userUsageRepository;

    public void registerNewUser(UserInfoDto userInfoDto) throws Exception {

    }

    public void loginUser(UserInfoDto userInfoDto) throws Exception {

    }

    public boolean addUserInfo(UserInfoDto userInfoDto) {
        if( userCredentialsRepository.userCredentialsExistById(userInfoDto.getUserUniqueId()) )
            System.out.println("Found a credential");
        else
            System.out.println("No user found");

        //userUsageRepository.save(new UserUsageEntity());
        return false;
    }
}
