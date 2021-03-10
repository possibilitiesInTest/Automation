const puppeteer = require("puppeteer");

describe("My third puppeteer test", () => {
  it("testing the browser", async function () {
    const browser = await puppeteer.launch({
      headless: false,
      slowMo: 10,
      devtools: false,
    });
    const page = await browser.newPage();
    await page.goto("https://example.com/");
    const title = await page.title();
    const url = await page.url();
    const text = await page.$eval("h1", (element) => element.textContent);
    const count = await page.$$eval("p", (elm) => elm.length);
    console.log("Text in the H1:" + text);
    console.log("Number of p tags: " + count);
    await browser.close();
  });
});
