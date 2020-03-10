Browser("Google").Maximize
Browser("Google").Page("Google").WebEdit("Search").Set "MSN"
Browser("Google").Page("Google").WebButton("Google Search").Click
Browser("MSN - Google Search").Page("MSN - Google Search").WebElement("MSN | Outlook, Office,").Click
Browser("Google").Page("MSN.com - Hotmail, Outlook,").Link("back to msn home").Check CheckPoint("back to msn home")
Browser("Google").Page("MSN.com - Hotmail, Outlook,").Sync @@ script infofile_;_ZIP::ssf1.xml_;_
Browser("Google").Close

