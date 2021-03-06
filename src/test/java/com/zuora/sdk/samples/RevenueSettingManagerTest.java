package com.zuora.sdk.samples;

import org.junit.Test;

import com.zuora.sdk.lib.ZClient;

public class RevenueSettingManagerTest {

   @Test
   public void test_get_revenue_events(){
      // Create a z_client
      ZClient zClient = new ZClient();

      // create an revenue setting resource manager
      RevenueSettingManager settingManager = new RevenueSettingManager(zClient);

      if (new ConnectionManager().isConnected(zClient)) {
    	  settingManager.getRevenueAutomationDate();
      }
   }
}
