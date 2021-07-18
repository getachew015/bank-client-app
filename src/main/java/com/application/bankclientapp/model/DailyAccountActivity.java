package com.application.bankclientapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("mydemo-app")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DailyAccountActivity {

  private Double maxDailyCash;
  private Double maxDailyWire;
  private Double maxDailyDeposit;

}
