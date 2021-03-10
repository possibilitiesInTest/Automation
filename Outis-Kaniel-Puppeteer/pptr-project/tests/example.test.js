const puppeteer = require("puppeteer");

describe("my first puppeteer test", () => {
  it("should launch the browser", async function () {
    const browser = await puppeteer.launch({
      headless: false,
      slowMo: 50,
      devtools: false,
    });
    const page = await browser.newPage();
    await page.goto("http://example.com/");
    await page.waitForTimeout(3000);
    await page.waitForSelector("h1");
    await page.reload();
    await page.waitForTimeout(3000);
    await page.waitForSelector("h1");
    await browser.close();
  });
});
