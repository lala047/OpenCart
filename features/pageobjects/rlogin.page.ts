//import { ChainablePromiseElement } from 'webdriverio';

import Page from '../pageobjects/page'


/**
 * sub page containing specific selectors and methods for a specific page
 */
class LoginPage extends Page {

    public get inputUsername () {
        return $('#username');
    }

    public get inputPassword () {
        return $('#password');
    }

    public get btnSubmit () {
        return $('#signInBtn');
    }

    
    public async login (username: string, password: string) {
        await this.inputUsername.setValue(username);
        await this.inputPassword.setValue(password);
        await this.btnSubmit.click();
    }

    
    public open () {
        return super.open('login');
    }
}

export default new LoginPage();
