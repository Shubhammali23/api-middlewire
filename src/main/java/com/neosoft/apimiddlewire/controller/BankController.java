package com.neosoft.apimiddlewire.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mock-server")
public class BankController {
    @GetMapping("/getRouteConfig")
    public String getRouteConfig(){
        return "{\\\"BankServices\\\":[{\\\"instanceId\\\":\\\"BankServices\\\",\\\"serviceId\\\":\\\"BankServices\\\",\\\"host\\\":\\\"localhost\\\",\\\"port\\\":8090,\n" +
                "\\\"secure\\\":false,\\\"metadata\\\":{\\\"management.context-path\\\":\\\"/\\\",\\\"management.context-path2\\\":\\\"/\\\"}},{\\\"instanceId\\\":\n" +
                "\\\"BankServices\\\",\\\"serviceId\\\":\\\"BankServices\\\",\\\"host\\\":\\\"localhost\\\",\\\"port\\\":8089,\\\"secure\\\":false,\\\"metadata\\\":\n" +
                "{\\\"management.context-path\\\":\\\"/\\\",\\\"management.context-path2\\\":\\\"/\\\"}}]}" ;
    }
    @GetMapping("/getInstanceConfig")
    public String getInstanceConfig(){
        return "[{\\\"id\\\":2,\\\"uriPattern\\\":\\\"/mock-server/cbs/handler\\\",\\\"uri\\\":\\\"lb://BankServices\\\",\\\"predicates\\\":null,\\\"filters\\\":\n" +
                "[{\\\"name\\\":\\\"AlterRequest\\\",\\\"args\\\":{\\\"proxy\\\":false,\\\"encrypted\\\":true,\\\"audit\\\":true,\\\"encryptionDetails.cryptName\\\"\n" +
                ":\\\"aes\\\",\\\"encryptionDetails.associatedData\\\":\\\"i am some data\\\",\\\"encryptionDetails.iterationCount\\\":10000,\n" +
                "\\\"encryptionDetails.keySize\\\":124,\\\"encryptionDetails.password\\\":\\\"123456\\\"}},{\\\"name\\\":\\\"AlterResponse\\\",\\\"args\\\":\n" +
                "{\\\"proxy\\\":false,\\\"encrypted\\\":true,\\\"audit\\\":true,\\\"encryptionDetails.cryptName\\\":\\\"aes\\\",\\\"encryptionDetails\n" +
                ".associatedData\\\":\\\"i am some data\\\",\\\"encryptionDetails.iterationCount\\\":10000,\\\"encryptionDetails.keySize\\\":128,\n" +
                "\\\"encryptionDetails.password\\\":\\\"123456\\\"}},{\\\"name\\\":\\\"RequestRateLimiter\\\",\\\"args\\\":{\\\"denyEmptyKey\\\":true,\n" +
                "\\\"emptyKeyStatusCode\\\":\\\"400\\\",\\\"redis-rate-limiter.requestedTokens\\\":1,\\\"redis-rate-limiter.replenishRate\\\":1,\n" +
                "\\\"redis-rate-limiter.burstCapacity\\\":2}}],\\\"bodyMassagerBean\\\":null,\\\"stringFilters\\\":[\\\"auditLogFilter\\\",\n" +
                "\\\"preserveHostHeader\\\"],\\\"serviceId\\\":\\\"BankServices\\\",\\\"customRouteDefinition\\\":null,\\\"metadata\\\":{\\\"response-timeout\\\"\n" +
                ":10000,\\\"connect-timeout\\\":200},\\\"instancesForLoadBalance\\\":[{\\\"instanceId\\\":null,\\\"url\\\":\\\"http://localhost:8089\\\",\n" +
                "\\\"host\\\":null,\\\"port\\\":null,\\\"secure\\\":false,\\\"metadata\\\":{\\\"management.context-path\\\":\\\"/\\\",\\\"management.context-path2\\\"\n" +
                ":\\\"/\\\"}},{\\\"instanceId\\\":null,\\\"url\\\":\\\"http://localhost:8089\\\",\\\"host\\\":null,\\\"port\\\":null,\\\"secure\\\":false,\\\"metadata\\\":\n" +
                "{\\\"management.context-path\\\":\\\"/\\\",\\\"management.context-path2\\\":\\\"/\\\"}}]}]";
    }

}
