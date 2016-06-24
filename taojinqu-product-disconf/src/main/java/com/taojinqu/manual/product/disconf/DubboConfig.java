package com.taojinqu.manual.product.disconf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.baidu.disconf.client.common.annotations.DisconfFile;

@Configuration
@Service
@Scope("singleton")
@DisconfFile(filename = "df-dubbo.properties")
public class DubboConfig {

}
