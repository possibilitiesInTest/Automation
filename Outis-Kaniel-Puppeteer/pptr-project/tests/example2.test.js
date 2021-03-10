const puppeteer = require("puppeteer");

describe("second puppeteer test", () => {
  it("should launch the browser", async function () {
    const browser = await puppeteer.launch({
      headless: false,
      slowMo: 10,
      devtools: false,
    });

    const page = await browser.newPage();
    await page.goto("https://devexpress.github.io/testcafe/example");
    await page.type("#developer-name", "Mike", { delay: 0 });
    await page.waitForTimeout(5000);
    await browser.close();
  });
});
