package com.application.bankclientapp.api;

import com.application.bankclientapp.model.DailyAccountActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/bank-client-app")
public class ClientApiController {

  @Autowired
  private DailyAccountActivity dailyAccountActivity;

  @Value("${mydemo-app.maxDailyCash}")
  private Double maxDailyCash;

  @GetMapping(path = "/withdraw-limit", produces = "application/json")
  public String getAccountMaxDailyCashLimit(){

    return "Withdraw Limit is " + dailyAccountActivity.getMaxDailyCash();
  }

  @GetMapping(path = "/daily-limits", produces = "application/json")
  public DailyAccountActivity getDailyAccountActivityDetail(){

    return dailyAccountActivity;
  }



}
