package com.ignite.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

import static com.ignite.client.constants.IgniteConstant.IGNITE_CONFIG_PROPS_PREFIX;

@ConfigurationProperties(prefix = IGNITE_CONFIG_PROPS_PREFIX)
@Data
public class IgniteConfigProperties {
  private List<String> addresses;
  private Map<String, String> systemProperties;
  private Boolean logPerformance;
}
