Browser("Browser").Page("Page").Sync
Browser("Browser").Navigate "http://advantageonlineshopping.com/#/"
Browser("Browser").Page("Advantage Shopping").WebElement("SpeakersImg").Click
Browser("Browser").Page("Advantage Shopping_2").Image("fetchImage?image_id=4600").Click
Browser("Browser").Page("Advantage Shopping_3").WebElement("WebElement").Click
Browser("Browser").Page("Advantage Shopping_3").WebElement("WebElement_2").Click
Browser("Browser").Page("Advantage Shopping_3").WebButton("ADD TO CART").Click
Browser("Browser").Page("Advantage Shopping_3").WebButton("CHECKOUT  ($89.98)").Click
Browser("Browser").Page("Advantage Shopping_4").Link("REGISTRATION").Check CheckPoint("REGISTRATION")
Browser("Browser").Page("Advantage Shopping_4").WebElement("$89.98").Check CheckPoint("$89.98")
Browser("Browser").Page("Advantage Shopping_4").Link("dvantage DEMO").Click
