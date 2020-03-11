' NOTE: You can install the AOS 2.0 app from C:\SampleMobileApps
' when in Record and Run Settings... click the plus (+) and select the APK file.
' then select to Install it in the Test Option > Actions
Device("Device").App("App").MobileLabel("LAPTOPS").Tap
Device("Device").App("App").MobileObject("com.Advantage.aShopping:").Tap
Device("Device").App("App").MobileButton("ADD TO CART").Tap
Device("Device").App("App").MobileObject("com.Advantage.aShopping:_2").Tap
Device("Device").App("App").MobileObject("com.Advantage.aShopping:_2").Tap
Device("Device").App("App").MobileObject("com.Advantage.aShopping:_3").Tap
Device("Device").App("App").MobileLabel("HOME").Tap
