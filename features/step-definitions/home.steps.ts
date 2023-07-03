import { Given, Then } from '@cucumber/cucumber'


//Given(/^I open the browser and load the url <homepageurl>$/, async(homepageurl) => {
Given(/^I open the browser and load the url (.+)$/, async(homepageurl) => {
	await browser.url(homepageurl)
    

});

//Then(/^I should see a header with text <headertext>$/, async(headertext) => {
Then(/^I should see a header with text (.+)$/, async(headertext: string) => {
    const header = $('.heading')
    //await assertions.toHaveText(header, headertext)
   await expect(await header.getText()).toEqual(headertext)
	
});
