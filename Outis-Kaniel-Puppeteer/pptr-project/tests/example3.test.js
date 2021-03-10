const { expect } = require("chai");
const puppeteer = require("puppeteer");

describe("My third puppeteer test", () => {
  it("testing the browser", async function () {
    const browser = await puppeteer.launch({
      headless: true,
      slowMo: 10,
      devtools: false,
    });
    const page = await browser.newPage();
    await page.setDefaultTimeout(10000);
    await page.setDefaultNavigationTimeout(20000);

    await page.goto("https://example.com/");
    const title = await page.title();
    const url = await page.url();
    const text = await page.$eval("h1", (element) => element.textContent);
    const count = await page.$$eval("p", (elm) => elm.length);
    console.log("Text in the H1:" + text);
    console.log("Number of p tags: " + count);

    expect(title).to.be.a("string", "Example Domain");
    expect(url).to.include("example.com");
    expect(text).to.be.a("string", "Example Domain");
    expect(count).to.be.equal(2);
    await browser.close();
  });
});
