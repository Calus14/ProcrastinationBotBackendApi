package com.chans.procrastinationbot.config.client;

import com.chans.procrastinationbot.domain.api.ProcrastinationBotApi;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Feign client for submission service by Data Ingestion Team
 * They do not have any schema for Request Body
 */
@FeignClient(
        name = "procrastination-user-entryPoint",
        serviceId = "procrastinationUserClient"
)
public interface ProcrastinationBotClient extends ProcrastinationBotApi {
}
