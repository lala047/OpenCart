import { Given, When, Then } from '@cucumber/cucumber'

//Given(/^I am on practice page "([^"]*)"$/, async (args1) => {
Given(/^I am on practice page "([^"]*)"$/, async (appurl) => {
    await browser.maximizeWindow()
    await browser.url(appurl)



});

Then(/^I validat page header "([^"]*)"$/, async (headertext) => {
    const header = $('.heading')
    //await assertions.toHaveText(header, headertext)
    await expect(header).toHaveText(headertext)
   


});

//When(/^I enter firstname <fname> and lastname <lname>$/, async(fname,lname) => {
When(/^I enter firstname (.+) and lastname (.+)$/, async () => {

});

//When(/^I select gender <gender> years <yrs> favorite chai <favchai> and reason <reason>$/, async () => {
When(/^I select gender (.+) years (.+) favorite chai (.+) and reason (.+)$/, async () => {
});

//When(/^I select continent <continent> and commands <command>$/, async () => {
When(/^I select continent (.+) and commands (.+)$/, async () => {
});

When(/^I click on submit button$/, async () => {

});

Then(/^I validat page header "([^"]*)"$/, async (args1) => {


});
