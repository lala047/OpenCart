import { Given, When,Then } from '@cucumber/cucumber'
import LoginPage from '../../features/pageobjects/rlogin.page'

Given(/^User Opens appurl$/, async() => {
    await browser.url('/')

	
});

When(/^user enters (.+) and (.+)$/, async (username,password) => {
    await LoginPage.login(username,password)
	
});

When(/^Clock on the Sign in Button$/, async () => {
	await LoginPage.btnSubmit
});

Then(/^I should see a message saying <message>$/, () => {
	
});
